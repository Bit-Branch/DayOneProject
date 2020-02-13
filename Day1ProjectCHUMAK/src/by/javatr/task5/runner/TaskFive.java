package by.javatr.task5.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task5.util.PerfectNumberChecker;

import java.util.InputMismatchException;

public class TaskFive {

    public static void main(String[] args) {
        try {
            System.out.println("Enter the number:");
            int number = DataScanner.enterInt();
            System.out.println("Is the entered number perfect? "
                    + PerfectNumberChecker.isPerfectNumber(number));
        } catch (InputMismatchException ex) {
            System.out.println("Not an integer was entered");
        }
    }
}
