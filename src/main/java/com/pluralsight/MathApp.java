package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        /*Use comments and line spacing to visually separate each question.
Take your time to think of and use meaningful variable names (don't just use num1)
Print meaningful messages to the screen so that the reader has all of the context
information for what you are
         */

        //shows the Larger of two variables
       int bobSalary = 102000;
       int garySalary = 185000;
       int highestSalary = Math.max(bobSalary, garySalary);

       //prints out a message using a string and the "highestSalary" Variable
        System.out.println("Gary has a higher salary at $" + highestSalary);

        //shows the Smaller of two variables
        int carPrice = 49000;
        int truckPrice = 66000;
        int lowestPrice = Math.min(carPrice, truckPrice);

        //prints out a message using a string and the "highestSalary" Variable
        System.out.println("the average car in the U.S. is cheaper than a truck at $" + lowestPrice);

        //Find the area of a circle
        double circleRadius = 7.25;
        double circleArea = Math.pow(circleRadius, 2) * Math.PI;

        // Formats the area to only print first 2 decimals (0.00)
        System.out.println("The Area of the circle is " + String.format("%.2f", circleArea));

        //Find and display the square root a variable after it is set to 5.0

        //Find and display the distance between the points (5, 10) and (85, 50)
        //Find and display the absolute (positive) value of a variable after it is set to -3.8
        //Find and display a random number between 0 and 1
        //Calculate how many minutes are in 24 days, use a variable for each value
        //BONUS: How many milliseconds?




    }
}
