package by.javatr.task9.util;

import by.javatr.exception.InvalidArgumentException;

public class CirclePropsCalculator {

    public static double calculateCircleArea(double radius) throws InvalidArgumentException {
        if (radius < 0){
            throw new InvalidArgumentException("Negative radius used");
        }
        return Math.PI * radius * radius;
    }

    public static double calculateCircleLength(double radius) throws InvalidArgumentException{
        if (radius < 0){
            throw new InvalidArgumentException("Negative radius used");
        }
        return Math.PI * 2 * radius;
    }
}
