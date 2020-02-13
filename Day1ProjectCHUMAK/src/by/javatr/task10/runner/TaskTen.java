package by.javatr.task10.runner;

import by.javatr.exception.InvalidArgumentException;
import by.javatr.scanner.DataScanner;
import by.javatr.task10.util.ValuesCalculator;

import java.util.Formatter;
import java.util.InputMismatchException;

public class TaskTen {

    private static void printValuesArray(double[][] array) {
        System.out.println( "|-------------|-------------|");
        System.out.println( "|      X      |    tg(X)    |");
        System.out.println( "|-------------|-------------|");

        for (int i = 0; i< array[0].length; i++) {
            System.out.println(new Formatter().format("| %+10.3f  | %+10.3f  |",
                               array[0][i], array[1][i]));
            System.out.println( "|-------------|-------------|");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Enter left border value:");
            int a = DataScanner.enterInt();
            System.out.println("Enter right border value:");
            int b = DataScanner.enterInt();
            System.out.println("Enter step value:");
            int h = DataScanner.enterInt();
            double[][] valuesArr = ValuesCalculator.getArrayWithAllValues(a, b, h);
            printValuesArray(valuesArr);
        } catch(InvalidArgumentException ex) {
            System.out.println(ex);
        } catch (InputMismatchException ex) {
            System.out.println("Not an integer was entered");
        }
    }
}
