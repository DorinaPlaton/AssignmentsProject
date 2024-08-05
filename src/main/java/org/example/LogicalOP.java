package org.example;

public class LogicalOP {

    //   Assignment 1 - if-else
    // 3.
    public int checkHigherNumber(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber;
        } else if (firstNumber == secondNumber) {
            return firstNumber;
        } else {
            return firstNumber;
        }
    }

    public int checkLowestNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return secondNumber;
        } else if (firstNumber == secondNumber) {
            return firstNumber;
        } else {
            return firstNumber;
        }
    }

    // 4.
    public String textCompare(String text) {
        if (text.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    // 5.
    public String textAndNumCompare(String text, int number) {
        if (text.equals("Evozon") && number <= 3) {
            return text + number;
        } else if ((!(text.equals("Evozon")) && number >= 4)) {
            return number + text;
        }
        else
            return "";
    }

    // 6.
    public String snowAmount(int cmOfSnow) {
        if (cmOfSnow > 8 || cmOfSnow == 6) {
            return "The amount of snow this winter was(cm): " + cmOfSnow;
        } else {
            return "The forecast snow is(cm): " + cmOfSnow;
        }
    }

    // 7.
    public String numberCompare(float number) {
        if (number > 3 && number != 4)
            return "The number is greater than 3 and not equal to 4";
        else if (number == 4)
            return "The number is equal to 4";
        else if (number < 3)
            return "The number is lower than 3";
        else
            return "I am confused, I think the number is 3";
    }

    // 8.
    public String numbersCase(int number) {

        switch (number) {
            case 1:
                return "The number is: 1!";
            case 5:
                return "The number is: 5!";
            case 10:
                return "The number is: 10!";
            case 25:
                return "The number is: 25!";
            case 34:
                return "The number is: 34!";
            case 43:
                return "The number is: 43!";
            case 77:
                return "The number is: 77!";
            case 87:
                return "The number is: 87!";
            case 91:
                return "The number is: 91!";
            case 101:
                return "The number is: 101!";
            default:
                return "Wrong number!";
        }
    }

    // 9.
    public boolean isNumberEven(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }

    // 10.
    public boolean isEligibleToVote(int age) {
        if (age >= 18)
            return true;
        else
            return false;
    }

    // 11.
    public int largestNumberOfThree(int firstNum, int secondNum, int thirdNum) {
        if (firstNum > secondNum && firstNum > thirdNum)
            return firstNum;
        else if (secondNum > firstNum && secondNum > thirdNum)
            return secondNum;
        else
            return thirdNum;
    }


    // Assignment 2 - for loops
    // 1.
    public void countToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // 2.
    public void countToMinusHundred(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    // 3.
    public void countBetweenNr(int startNr, int endNr) {
        for (int i = startNr; i <= endNr; i++) {
            System.out.println(i);
        }
    }


    // 4.
    public void countAscending(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            for (int i = secondNum; i <= firstNum; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = firstNum; i <= secondNum; i++) {
                System.out.println(i);
            }
        }
    }

    // 5.
    public void evenNumbersFrom1To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);

        }
    }

    // 6.
    public void oddNumbersFrom1To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    // 7.
    public int sumOfNumbers(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    // 8.
    public double averageOfNumbers(int number) {
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
            count++;
        }
        double average = (double) sum / count;
        return average;
    }

    // 9.
    public void asteriskPattern() {
        String symbol = "*";
        for (int i = 7; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    // Assignment 3 - while loop
// 1.
    public void countdownToHundred(int number) {
        while (number >= 100) {
            System.out.println(number);
            number--;
        }
    }

    // 2.
    public void countdownToNegativeHundred(int number) {
        while (number >= -100) {
            System.out.println(number);
            number--;
        }
    }

    // 3.
    public void countdownBetweenNumbers(int x, int y) {
        while (x >= y) {
            System.out.println(x);
            x--;
        }
    }

    // 4.
    public void ascendingCountdownBetweenNr(int x, int y) {
        int max = checkHigherNumber(x, y);
        int min = checkLowestNumber(x, y);
        while (min <= max) {
            System.out.println(min);
            min++;
        }


    }

    // 5.
    public void evenNumbers() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }

    // 6.
    public void oddNumbers() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
    }

    // 7.
    public void sumOfNumbersRange() {
        int sum = 0;
        int count = 0;
        int i = 111;
        while (i <= 8899) {
            sum += i;
            i++;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);
    }

    // 8.
    public double averageOfNumbersDivisibleBy7(int x, int y) {
        int min = checkLowestNumber(x, y);
        int max = checkHigherNumber(x, y);
        int sum = 0;
        int count = 0;
        while (min <= max) {
            if (min % 7 == 0) {
                sum += min;
                count++;
            }
            min++;
        }
        double average = (double) sum / count;
        return average;
    }

    // 9.
    public void fibonacciSequence() {
        int count = 0;
        int number1 = 0;
        int number2 = 1;
        System.out.println("First 20 numbers of the Fibonacci sequence: ");
        while (count < 20) {
            System.out.println(number1);
            int sumOfPrevious2Nr = number1 +number2;
            number1 = number2;
            number2 = sumOfPrevious2Nr;
            count++;
        }
    }


    // 10.
    public void cozaLozaWoza() {
        int i = 1;
        int numberPerLine = 11;
        while (i <= 110) {
            int count = 1;
            while (count <= numberPerLine && i <= 110) {
                if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
                    System.out.print("CozaLozaWoza");
                else if (i % 5 == 0 && i % 7 == 0)
                    System.out.print("WozaLoza");
                else if (i % 3 == 0 && i % 5 == 0)
                    System.out.print("CozaLoza");
                else if (i % 3 == 0 && i % 7 == 0)
                    System.out.print("CozaWoza");
                else if (i % 7 == 0)
                    System.out.print("Woza");
                else if   (i % 5 == 0)
                    System.out.print("Loza");
                else if (i % 3 == 0)
                System.out.print("Coza");
                else
                    System.out.print(i);
                System.out.print(" ");
                i++;
                count++;

            }
            System.out.println();
        }
    }

}