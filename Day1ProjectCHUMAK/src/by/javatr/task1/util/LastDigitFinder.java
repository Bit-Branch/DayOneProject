package by.javatr.task1.util;

public class LastDigitFinder {

    private static int findLastDigit(int number){
        return number % 10;
    }

    private static int squareNumber(int number){
        return number*number;
    }

    public static int findLastDigitOfSquare(int number){
        int lastDigit = findLastDigit(number);
        int square = squareNumber(lastDigit);
        return findLastDigit(square);
    }
}
