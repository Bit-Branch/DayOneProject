package by.javatr.task8.runner;

import by.javatr.exception.InvalidArgumentException;
import by.javatr.scanner.DataScanner;
import by.javatr.task8.util.ValueCalculator;

import java.util.InputMismatchException;

public class TaskEight {

    public static void main(String[] args) {
        try {
            System.out.println("Enter x:");
            double x = DataScanner.enterDouble();
            System.out.println("Function value: "
                    + ValueCalculator.findFunctionValue(x));
        } catch (InvalidArgumentException ex) {
            System.out.println(ex);
        } catch (InputMismatchException ex) {
            System.out.println("Not a number was entered");
        }
    }
}
