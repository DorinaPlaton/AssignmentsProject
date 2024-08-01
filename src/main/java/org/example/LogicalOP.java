package org.example;

public class LogicalOP {

    //if-else
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


    public String textCompare(String text) {
        if (text.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String textAndNumCompare(String text, int number) {
        if (text.equals("Evozon") && number <= 3) {
            return text + number;
        } else {
            return number + text;
        }
    }

    public String snowAmount(int cmOfSnow) {
        if (cmOfSnow > 8 || cmOfSnow == 6) {
            return "The amount of snow this winter was(cm): " + cmOfSnow;
        } else {
            return "The forecast snow is(cm): " + cmOfSnow;
        }
    }


    public String numberCompare(float number) {
        if (number > 3 && number != 4)
            return "The number is greater than 3 and not equal to 4";
        else if (number == 4)
            return "The number is equal to 4";
        else if (number < 3)
            return "The number is lower than 3";
        else
            return "";
    }


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

    public boolean isNumberEven(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean isEligibleToVote(int age) {
        if (age >= 18)
            return true;
        else
            return false;
    }

    public int largestNumberOfThree(int firstNum, int secondNum, int thirdNum) {
        if (firstNum > secondNum && firstNum > thirdNum)
            return firstNum;
        else if (secondNum > firstNum && secondNum > thirdNum)
            return secondNum;
        else
            return thirdNum;
    }


    //for loops
    public void countToMinusHundred(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void countBetweenNr(int startNr, int endNr) {
        for (int i = startNr; i <= endNr; i++) {
            System.out.println(i);
        }
    }

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


    public void evenNumbersFrom1To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);

        }
    }

    public void oddNumbersFrom1To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

//    public int averageNr(int number){



    //while loop

}