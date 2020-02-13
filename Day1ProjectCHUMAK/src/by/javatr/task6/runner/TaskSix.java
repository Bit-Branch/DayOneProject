package by.javatr.task6.runner;

import by.javatr.exception.InvalidArgumentException;
import by.javatr.scanner.DataScanner;
import by.javatr.task6.util.TimeCounter;

import java.util.InputMismatchException;

public class TaskSix {

    public static void main(String[] args) {
        try {
            System.out.println("Enter the number of seconds:");
            int seconds = DataScanner.enterInt();
            System.out.println("Time has passed: "
                    + TimeCounter.countTimeFromSeconds(seconds));
        } catch (InvalidArgumentException ex) {
            System.out.println(ex);
        } catch (InputMismatchException ex){
            System.out.println("Not an integer was entered");
        }
    }
}
