import speech_recognition as sr
import pyttsx3
import os
from dotenv import load_dotenv
import openai
import time


#Gets OPEN AI Key from env file
load_dotenv()
openai.api_key = os.getenv("OPENAI_KE")

#Function to convert text to speech
def SpeakText(command):
    engine = pyttsx3.init()
    engine.say(command)
    engine.runAndWait()

recognizer = sr.Recognizer()

#Allow's program to use computer microphone to listen for audio then take it and turn it into a string
def record_text():
    while(True):
        #Try and except for if the audio can be comprehended
        try:
            #Use microphone for source of input
            with sr.Microphone() as source:
                #Prepare recognizer to receive input
                print("I'm Listening")
                recognizer.adjust_for_ambient_noise(source, duration=0.2)

                #Listen for user audio
                audio = recognizer.listen(source)

                #Uses Google to recoginize audio
                text = recognizer.recognize_google(audio)
                print("Recognized: {text}")
                return text

        except sr.RequestError as e:
            print("Could not request results; {e}")
            #Delay before retrying
            time.sleep(1)

        except sr.UnknownValueError:
            print("Could not understand the audio")
            time.sleep(1)

#Function that will send messages in the array to ChatGPT
def send_to_chatGPT(messages, model="gpt-3.5-turbo"):

    response = openai.ChatCompletion.create(
        model = model,
        messages = messages,
        max_tokens = 100, #Lets ChatGPT know how long this message will be
        n = 1,
        stop = None,
        temperature = 0.5,
    )

    #Puts the message into a string to be later used in SpeakText that will use this string to say the message
    message = response.choices[0].message['content']
    messages.append(response.choices[0].message)
    return message

#Array to keep track of convo with ChatGPT
messages = [{"role": "user", "content": "Act like my personal assistant"}]

#Loop to come back to when loop is finished to continue conversation
while(True):
    #Runs record text function, records audio as text
    text = record_text()

    #Appends text just recieved, role is to tell ChatGPT who said what, once array is updated it will be sent to ChatGPT below
    messages.append({"role": "user", "content": text})
    response = send_to_chatGPT(messages)

    #ChatGPT will respond with response, it will say it
    SpeakText(response)

    print(response)
