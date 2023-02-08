/**
 * Class: SecondConversion
 * @author: Isabelle Nerren
 * Course: ITEC 2140 - 04 Spring 2023
 * Written: February 2, 2023
 *
 * Description: This class takes the number of seconds a user provides and converts it into hours, minutes, and seconds.
 */

import java.util.Scanner;
public class SecondConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter total number of seconds: ");
        int seconds = (int) input.nextDouble();
        int minutes = seconds / 60; //calculates the amount of minutes in the number of seconds provided
        int extraSeconds = seconds % 60; //adds the remainder of the last step as seconds
        int hours = minutes / 60; //calculates the amount of hours in the minutes
        if (hours != 0) //excludes answers that don't have a full hour
        {
            int extraMinutes = minutes % 60; //calculates the remainder of minutes after calculating the number of hours
            minutes = extraMinutes; //assigns the remainder of minutes to the number of minutes shown
        }
        System.out.println("If the total number of seconds is " + seconds + ", it is " + hours + " hours, " + minutes + " minutes, and " + extraSeconds + " seconds.");




    }
}
