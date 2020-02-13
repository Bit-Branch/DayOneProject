package by.javatr.task1.runner;
import by.javatr.scanner.DataScanner;
import by.javatr.task1.util.LastDigitFinder;

import java.util.InputMismatchException;

public class TaskOne {

    public static void main(String[] args) {
        try {
            System.out.println("Enter a number:");
            int number = DataScanner.enterInt();
            System.out.println("The last digit of the square of the number: "
                    + LastDigitFinder.findLastDigitOfSquare(number));
        } catch (InputMismatchException ex){
            System.out.println("Not an integer was entered");
        }
    }
}
