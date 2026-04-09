package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

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

        //Set area of the circle to 5 then calculate the Square root of it
        circleArea = 5;
        double circleRoot = Math.sqrt(circleArea);

        //Square root of circle formated
        System.out.println("The Square Root of " + circleArea + " is " + String.format("%.2f", circleRoot));

        //Math.pow() takes a value and adds an exponent to it in this case im doing √((x2-x1)² + (y2-y1)²)
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double pointDis = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        //Formatting pointDis
        System.out.println("The distance between " + x1 + "," + y1 + " and " + x2 + "," + y2
                + " is " + String.format("%.2f", pointDis));
        //Find and display the absolute (positive) value of a variable after it is set to -3.8

        //Find and display a random number between 0 and 1
        //Calculate how many minutes are in 24 days, use a variable for each value
        //BONUS: How many milliseconds?




    }
}
