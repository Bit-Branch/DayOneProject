package by.javatr.task3.util;

import by.javatr.exception.InvalidArgumentException;

public class AreaCalculator {
    private static double calculateRadiusOfCircle(double squareArea){
        return Math.sqrt(squareArea)/2;
    }

    private static double calculateAreaOfSquare(double circleRadius){
        return circleRadius*circleRadius*2;
    }

    public static double findRatio(double numerator,double denominator){
        return numerator/denominator;
    }

    public static double findInscribedSquareArea(double describedSquareArea) throws InvalidArgumentException{
        if (describedSquareArea < 0){
            throw new InvalidArgumentException("Negative area was used");
        }
        double circleRadius =
                AreaCalculator.calculateRadiusOfCircle(describedSquareArea);
        return calculateAreaOfSquare(circleRadius);
    }
}
