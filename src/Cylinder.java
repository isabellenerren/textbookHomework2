/**
 * Class: Cylinder
 * @author: Isabelle Nerren
 * Course: ITEC 2140 - 04 Spring 2023
 * Written: February 2, 2023
 *
 * Description: This class calculates the area of the base and volume of a cylinder based on the
 * radius of the base circle and the length of the cylinder that the user provides.
 */

import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Radius of Base Circle: ");


        double radius = input.nextDouble();


        System.out.print("Enter Length of Cylinder: ");


        double length = input.nextDouble();


        double areaOfBaseCircle = 3.1416 * radius * radius;
        System.out.println("Area of the base circle is: " + areaOfBaseCircle);
        double volume = areaOfBaseCircle * length;
        System.out.println("Volume of cylinder is: " + volume);
    }
}

