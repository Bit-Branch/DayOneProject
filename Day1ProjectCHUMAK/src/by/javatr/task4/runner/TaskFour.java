package by.javatr.task4.runner;

import by.javatr.exception.NullArgumentException;
import by.javatr.scanner.DataScanner;
import by.javatr.task4.util.EvenNumbersSearcher;

import java.util.InputMismatchException;

public class TaskFour {

    public static void main(String[] args) {
        try {
            System.out.println("Enter four numbers:");
            int[] numbers = DataScanner.enterIntArray(4);
            System.out.println(EvenNumbersSearcher.hasTwoOrMoreEvenNumbers(numbers));
        } catch (InputMismatchException ex){
            System.out.println("Not an integer entered");
        } catch (NullArgumentException ex){
            System.out.println(ex);
        }
    }
}
