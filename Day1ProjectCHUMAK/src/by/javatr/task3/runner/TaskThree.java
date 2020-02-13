package by.javatr.task3.runner;

import by.javatr.exception.InvalidArgumentException;
import by.javatr.scanner.DataScanner;
import by.javatr.task3.util.AreaCalculator;

import java.util.InputMismatchException;

public class TaskThree {

    public static void main(String[] args) {
        try {
            System.out.println("Enter the area of the described square:");
            double descArea = DataScanner.enterDouble();
            double inscArea = AreaCalculator.findInscribedSquareArea(descArea);
            System.out.println("Area of the inscribed square: " + inscArea);

            System.out.println("The area of the inscribed square is less than the " +
                    "area described at " + AreaCalculator.findRatio(descArea, inscArea) + " times");

        } catch (InvalidArgumentException ex) {
            System.out.println(ex);
        } catch (InputMismatchException ex){
            System.out.println("Not a number was entered");
        }
    }
}
