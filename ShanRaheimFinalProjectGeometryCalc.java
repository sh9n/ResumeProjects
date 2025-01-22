import java.io.*;
import java.util.*;
import java.lang.Math;

/*
 * Shan Raheim 
 * APCSA
 * 4/25/2021
 * 
 * Description: This program is a geometru calculator that calculates common geomtry areas/volumes
 * 
 * What I Learned: I did not learn anything new 
 * 
 * Difficulties: None
 * 
 */
public class ShanRaheimFinalProjectGeometryCalc
{
    public static void geometryCalc(int menuSelection)
    {
        //The following array holds all of the menu options which will decide what calculation will be used 
            System.out.println("Welcome to the Geometry Calculator! Please select an option:");
            System.out.println("1: Area of Square");
            System.out.println("2: Area of Rectangle");
            System.out.println("3: Area of Parallelogram");
            System.out.println("4: Area of Trapezoid");
            System.out.println("5: Area of Triangle");
            System.out.println("6: Area of Circle");
            System.out.println("7: Circumference of Circle");
            System.out.println("8: Volume of Rectangular Prism");
            System.out.println("9: Surface Area of Rectangular Prism");
            System.out.println("10: Volume of Cube");
            System.out.println("11: Surface Area of Cube");
            System.out.println("12: Volume of Cylinder");
            System.out.println("13: Surface Area of Cylinder");
            System.out.println("14: Volume of Sphere");
            System.out.println("15: Surface Area of Sphere");
            System.out.println("16: Volume of Cone");
            System.out.println("17: Surface Area of Cone");
            System.out.println("18: Volume of Pyramid");
            System.out.println("0: Exit");

        //Following if statements perform calculations for respected menu options based on user input
        if(menuSelection == 0)
        {
            System.out.println("\nThank you for using my app, have a good day ＼（＾▽＾）／");
        }
        
        if(menuSelection == 1)
        {
            System.out.println("\nYou have selected the area of a square, enter the side length");

            Scanner l = new Scanner(System.in);
            double squareSide = l.nextDouble();

            System.out.println("The area of the square is "+(squareSide * squareSide));
        }

        if(menuSelection == 2)
        {
            System.out.println("\nYou have selected the area of a rectangle, enter the length and width");

            Scanner l = new Scanner(System.in);
            double recLength = l.nextDouble();

            Scanner w = new Scanner(System.in);
            double recWidth = w.nextDouble();

            System.out.println("The area of the rectangle is " +(recWidth * recLength));
        }

        if(menuSelection == 3)
        {
            System.out.println("\nYou have selected the area of a parallelogram, enter the length and height");

            Scanner l = new Scanner(System.in);
            double parLength = l.nextDouble();

            Scanner h = new Scanner(System.in);
            double parHeight = h.nextDouble();

            System.out.println("The area of the rectangle is " +(parLength * parHeight));
        }

        if(menuSelection == 4)
        {
            System.out.println("\nYou have selected the area of a trapezoid, enter the height, base length one, and base length two");

            Scanner h = new Scanner(System.in);
            double trapHeight = h.nextDouble();

            Scanner b1 = new Scanner(System.in);
            double trapB1 = b1.nextDouble();

            Scanner b2 = new Scanner(System.in);
            double trapB2 = b2.nextDouble();

            System.out.println("The area of the trapezoid is " +((.5 * trapHeight)*(trapB1 + trapB2)));
        }

        if(menuSelection == 5)
        {
            System.out.println("\nYou have selected the area of a triangle, enter the base length and height");

            Scanner l = new Scanner(System.in);
            double triBase = l.nextDouble();

            Scanner h = new Scanner(System.in);
            double triHeight = h.nextDouble();

            System.out.println("The area of the triangle is " +(.5 * (triBase * triHeight)));
        }

        if(menuSelection == 6)
        {
            System.out.println("\nYou have selected the area of a circle, enter the radius");

            Scanner r = new Scanner(System.in);
            double cirRadius = r.nextDouble();

            System.out.println("The area of the circle is " +(3.14*(cirRadius  *cirRadius)));
        }

        if(menuSelection == 7)
        {
            System.out.println("\nYou have selected the circumference of a circle, enter the radius");

            Scanner r = new Scanner(System.in);
            double cirRadius = r.nextDouble();

            System.out.println("The circumference of the circle is " +((3.14 * 2)*(cirRadius)));
        }

        if(menuSelection == 8)
        {
            System.out.println("\nYou have selected the volume of a rectangular prism, enter the length, width, and height");

            Scanner l = new Scanner(System.in);
            double recPriLength = l.nextDouble();

            Scanner w = new Scanner(System.in);
            double recPriWidth = w.nextDouble();

            Scanner h = new Scanner(System.in);
            double recPriHeight = h.nextDouble();

            System.out.println("The volume of the rectangular prism is " +(recPriLength * recPriWidth * recPriHeight));
        }

        if(menuSelection == 9)
        {
            System.out.println("\nYou have selected the surface area of a rectangular prism, enter the length, width, and height");

            Scanner l = new Scanner(System.in);
            double recPriLength = l.nextDouble();

            Scanner w = new Scanner(System.in);
            double recPriWidth = w.nextDouble();

            Scanner h = new Scanner(System.in);
            double recPriHeight = h.nextDouble();

            System.out.println("The surface area of the rectangular prism is " +(recPriLength * recPriWidth * recPriHeight));
        }

        if(menuSelection == 10)
        {
            System.out.println("\nYou have selected the volume of a cube, enter the side length");

            Scanner l = new Scanner(System.in);
            double cubeSideLength = l.nextDouble();

            System.out.println("The volume of the cube is " +(cubeSideLength * cubeSideLength * cubeSideLength));
        }

        if(menuSelection == 11)
        {
            System.out.println("\nYou have selected the surface area of a cube, enter the side length");

            Scanner l = new Scanner(System.in);
            double cubeSideLength = l.nextDouble();

            System.out.println("The volume of the cube is " +(6*(cubeSideLength * cubeSideLength)));
        }

        if(menuSelection == 12)
        {
            System.out.println("\nYou have selected the volume of a cylinder, enter the radius and height");

            Scanner r = new Scanner(System.in);
            double cylRadius = r.nextDouble();
            Scanner h = new Scanner(System.in);
            double cylHeight = h.nextDouble();

            System.out.println("The volume of the cylinder is " +(3.14 * (cylRadius * cylRadius) * cylHeight));
        }

        if(menuSelection == 13)
        {
            System.out.println("\nYou have selected the surface area of a cylinder, enter the radius and height");

            Scanner r = new Scanner(System.in);
            double cylRadius = r.nextDouble();
            Scanner h = new Scanner(System.in);
            double cylHeight = h.nextDouble();

            System.out.println("The surface area of the cylinder is " +(((2 * 3.14) * (cylRadius * cylHeight)) + ((2 * 3.14) * (cylRadius * cylRadius))));
        }

        if(menuSelection == 14)
        {
            System.out.println("\nYou have selected the volume of a sphere, enter the radius");

            Scanner r = new Scanner(System.in);
            double sphRadius = r.nextDouble();

            System.out.println("The volume of the sphere is " +(((1.33 * 3.14) * (sphRadius * sphRadius * sphRadius))));
        }

        if(menuSelection == 15)
        {
            System.out.println("\nYou have selected the surface area of a sphere, enter the radius");

            Scanner r = new Scanner(System.in);
            double sphRadius = r.nextDouble();
            
            System.out.println("The surface area of the sphere is " + ((4 * 3.14) * (sphRadius * sphRadius)));
        }

        if(menuSelection == 16)
        {
            System.out.println("\nYou have selected the volume of a cone, enter the radius and height");
            
            Scanner r = new Scanner(System.in);
            double coneRadius = r.nextDouble();
            Scanner h = new Scanner(System.in);
            double coneHeight = h.nextDouble(); 
            
            System.out.println("The volume of the cone is " +((.33 * 3.14) * (coneRadius * coneRadius) * (coneHeight)));
        }

        if(menuSelection == 17)
        {
            System.out.println("\nYou have selected the surface area of a cone, enter the radius and height");
            
            Scanner r = new Scanner(System.in);
            double coneRadius = r.nextDouble();
            Scanner h = new Scanner(System.in);
            double coneHeight = h.nextDouble(); 
            
            System.out.println("The surface area of the cone is " +(3.14 * (coneRadius * Math.sqrt((coneRadius * coneRadius) + (coneHeight * coneHeight)))));
        }

        if(menuSelection == 18)
        {
            System.out.println("\nYou have selected the volume of a square/rectangular pyramid, enter the length, width, and height");
            
            Scanner l = new Scanner(System.in);
            double pyrLength = l.nextDouble();
            Scanner w = new Scanner(System.in);
            double pyrWidth = w.nextDouble();
            Scanner h = new Scanner(System.in);
            double pyrHeight = h.nextDouble();
            
            System.out.println("The volume of the pyramid is " +(.33 * pyrLength * pyrWidth * pyrHeight));
        }

    }
}