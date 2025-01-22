import speech_recognition as sr
import pyttsx3

recognizer = sr.Recognizer()

#Allow's program to use computer microphone to listen for audio then take it and turn it into a string
def record_text():
    while(1):
        #Try and except for if the audio can be comprehended
        try:
            #Use microphone for source of input
            with sr.Microphone() as source:
                #Prepare recognizer to receive input
                print("Listening...")
                recognizer.adjust_for_ambient_noise(source, duration=0.2)

                #Listen for user audio
                audio = recognizer.listen(source)

                #Uses Google to recoginize audio
                text = recognizer.recognize_google(audio)
                print("Recognized: {text}")
                return text

        except sr.RequestError as e:
            print("Could not request results; {e}")

        except sr.UnknownValueError:
            print("Could not understand the audio")

    return

def output_text(text):
    #Open text file and puts output in output file in the folder that this program is in
    if text:
        #Open the output file and add the text to it
        with open("output.txt", "a") as file:
            file.write(text + "\n")
        print("text saved to output.txt")

    return

#While loop will continue listening and turning it into text
if __name__ == "__main__":
    #Gets the text
    text = record_text()

    #If no text save it to the file
    if text:
        output_text(text)