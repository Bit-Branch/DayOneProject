package by.javatr.task9.runner;

import by.javatr.exception.InvalidArgumentException;
import by.javatr.scanner.DataScanner;
import by.javatr.task9.util.CirclePropsCalculator;

import java.util.InputMismatchException;

public class TaskNine {

    public static void main(String[] args) {
        try {
            System.out.println("Enter radius of the circle:");
            double radius = DataScanner.enterDouble();
            System.out.println("Area of the circle: "
                    + CirclePropsCalculator.calculateCircleArea(radius));
            System.out.println("Length of the circle: "
                    + CirclePropsCalculator.calculateCircleLength(radius));
        } catch (InvalidArgumentException ex) {
            System.out.println(ex);
        } catch (InputMismatchException ex) {
            System.out.println("Not a number was entered");
        }
    }
}
