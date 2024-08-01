package org.example;

import java.util.Scanner;

public class Calculator {
    public void printMyName() {
        System.out.println("Hello");
        System.out.println("Dorina");
    }

    public void sumOfMyNumbers() {
        int x = 7;
        int y = 4;
        int sum = x + y;
        System.out.println("Sum of the numbers is: " + sum);
    }

    public void divOfMyNumbers() {
        int x = 6;
        int y = 7;
        float div = (float) x / y;
        System.out.println("Division of numbers: " + div);
    }

    public void resultsOfOperations() {
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        float c = 20 + (float) (-3 * 5) / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("Result of a: " + a);
        System.out.println("Result of b: " + b);
        System.out.println("Result of c: " + c);
        System.out.println("Result of d: " + d);
    }

    public int addition(int firstNum, int secondNum) {
        int sumResult = firstNum + secondNum;
        return sumResult;
    }

    public int substraction(int firstNum, int secondNum) {
        int subResult = firstNum - secondNum;
        return subResult;
    }

    public int multiplication(int firstNum, int secondNum) {
        int multiResult = firstNum * secondNum;
        return multiResult;
    }

    public float division(int firstNum, int secondNum) {
        float divResult = (float) firstNum / secondNum;
        return divResult;
    }

    public int average(int num1, int num2, int num3) {
        int averageResult = (num1 + num2 + num3) / 3;
        return averageResult;
    }

    public int remainder(int num1, int num2) {
        int remainderResult = num1 % num2;
        return remainderResult;
    }

    public float temp(float tempF) {
        float tempC = (float) 5 / 9 * (tempF - 32);
        return tempC;
    }

    public double distance(double distInch) {
        double distMeter = distInch * 0.0254;
        return distMeter;

    }

    public void speed(float distance, float hours, float minutes, float seconds) {
        //convert time to seconds
        float minToSec = minutes * 60;
        float hourToSec = hours * 3600;
        float timeInSec = seconds + minToSec + hourToSec;
        //convert time to hours
        float minToH = minutes / 60;
        float secToH = seconds / 3600;
        float timeInH = hours + minToH + secToH;
        //calculate speed
        float speedMeterPerSec = distance / timeInSec;
        float speedKmPerH = (distance/1000) / timeInH;
        float speedMilesPerH = (distance / 1609) / timeInH;
        System.out.println("Speed in meters per second: " + speedMeterPerSec + " m/s");
        System.out.println("Speed in km per hour: " + speedKmPerH + " km/h");
        System.out.println("Speed in miles per hour: " + speedMilesPerH + " mph");

    }


    public void circleAreaAndPerim() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        int circleRadius = scanner.nextInt();

        // A = π * r²
        // P = 2 * π * r
        double circleArea = Math.PI * circleRadius * circleRadius;
        double circlePerimeter = 2 * Math.PI * circleRadius;

        System.out.println("Circle area is: " + circleArea);
        System.out.println("Circle perimeter is: " + circlePerimeter);
    }

    public void image() {
        System.out.println("  +\"\"\"\"\"+ ");
        System.out.println(" [| o o |]");
        System.out.println("  |  ^  | ");
        System.out.println("  | '-' | ");
        System.out.println("  +-----+ ");

    }
}
