package by.javatr.task2.runner;

import by.javatr.exception.InvalidArgumentException;
import by.javatr.scanner.DataScanner;
import by.javatr.task2.util.DaysCounter;

import java.util.InputMismatchException;

public class TaskTwo {

    public static void main(String[] args) {
        try {
            System.out.println("Enter the month number: ");
            int month = DataScanner.enterInt();
            System.out.println("Enter the year: ");
            int year = DataScanner.enterInt();
            System.out.println("Number of days in a month: "
                    + DaysCounter.countDaysInMonth(month, year));

        } catch (InvalidArgumentException ex) {
            System.out.println(ex);
        } catch (InputMismatchException ex){
            System.out.println("Not an integer was entered");
        }
    }
}
