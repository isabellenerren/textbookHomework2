/**
 * Class: Paint
 * @author: Isabelle Nerren
 * Course: ITEC 2140 - 04 Spring 2023
 * Written: February 2, 2023
 *
 * Description: This class calculates the amount of paint in gallons and quarts that will be needed to paint a room given
 * the length, width, height, number of windows, and number of doors that the user provides.
 */

import java.util.Scanner;
public class Paint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter length of room: ");
        double length = input.nextDouble();
        System.out.print("Enter width of room: ");
        double width = input.nextDouble();
        System.out.print("Enter height of room: ");
        double height = input.nextDouble();
        System.out.print("Enter number of windows: ");
        double windows = input.nextDouble();
        System.out.print("Enter number of doors: ");
        double doors = input.nextDouble();


        double wallAreaOne = height * length;
        double wallAreaTwo = height * width;
        double ceilingArea = length * width;
        double surfaceArea = (wallAreaOne * 2) + (wallAreaTwo * 2) + ceilingArea; //calculates the total surface area of the room
        double excludedArea = (doors * 21) + (windows * 15); //calculates how many square feet will be deducted for doors and windows
        surfaceArea -= excludedArea; //subtracts the area of doors and windows from the total surface area
        int gallons = (int) (surfaceArea / 350); //calculates number of gallons needed if one gallon covers 350 square feet.
        double quarts = (surfaceArea / 350) * 4; //calculates the total amount of paint needed in quarts
        quarts -= (gallons * 4); //subtracts the amount of paint already included in the gallons to get the remainder




        System.out.println("This room will need " + gallons + " gallons and " + quarts + " quarts of paint.");




    }
}
