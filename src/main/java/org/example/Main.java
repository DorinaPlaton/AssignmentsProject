package org.example;

public class Main {
    public static void main(String[] args) {
        LogicalOP op = new LogicalOP();
        Calculator calculator = new Calculator();

        calculator.sumOfMyNumbers();
        calculator.divOfMyNumbers();
        calculator.resultsOfOperations();
        System.out.println("Addition: " + calculator.addition(3, 9));
        System.out.println("Substraction: " + calculator.substraction(345, 161));
        System.out.println("Multiplication: " + calculator.multiplication(12, 54));
        System.out.println("Division: " + calculator.division(234, 56));
        System.out.println("Average: " + calculator.average(123, 342, 12));
        System.out.println("Remainder: " + calculator.remainder(154, 34));
        System.out.println("Temperature in Celsius: " + calculator.temp(564));
        System.out.println("Distance in meters" + calculator.distance(1343));
        calculator.speed(9832, 0, 24, 33);
        calculator.circleAreaAndPerim();
        calculator.image();

        System.out.println("Bigger number is: " + op.checkHigherNumber(3, 7));
        System.out.println(op.textCompare("evozon"));
        System.out.println(op.textAndNumCompare("Evozon", 1));
        System.out.println(op.snowAmount(9));
        System.out.println(op.numberCompare(3.999999F));
        System.out.println(op.numbersCase(43));
        System.out.println("The number is even: " + op.isNumberEven(0));
        System.out.println("Is this person eligible to vote: " + op.isEligibleToVote(18));
        System.out.println("The largest of the numbers is: " + op.largestNumberOfThree(5, 12, 32));
        op.countToHundred(34);
        op.countToMinusHundred(10);
        op.countBetweenNr(13, 21);
        op.countAscending(35, 45);
        op.evenNumbersFrom1To100();
        op.oddNumbersFrom1To100();
        System.out.println(op.sumOfNumbers(67));
        System.out.println(op.averageOfNumbers(67));
        op.asteriskPattern();
        op.countdownToHundred(145);
        op.countdownToNegativeHundred(23);
        op.countdownBetweenNumbers(23, 12);
        op.ascendingCountdownBetweenNr(70, 6);
        op.evenNumbers();
        op.oddNumbers();
        op.sumOfNumbersRange();
        System.out.println("The average of numbers divisible by 7: " + op.averageOfNumbersDivisibleBy7(3, 28));
        op.fibonacciSequence();
        op.cozaLozaWoza();
    }

}

