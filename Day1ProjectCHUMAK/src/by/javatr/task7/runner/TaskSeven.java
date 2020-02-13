package by.javatr.task7.runner;

import by.javatr.exception.NullArgumentException;
import by.javatr.scanner.DataScanner;
import by.javatr.task7.util.ClosestPointFinder;
import by.javatr.task7.util.Point;
import java.util.InputMismatchException;


public class TaskSeven {

    private static Point enterPointCoordinates() throws InputMismatchException {
        Point point = new Point();
        System.out.println("Enter X:");
        point.setX(DataScanner.enterInt());
        System.out.println("Enter Y:");
        point.setY(DataScanner.enterInt());
        return point;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Enter coordinates of the first point:");
            Point firstPoint = enterPointCoordinates();
            System.out.println("Enter coordinates of the second point:");
            Point secondPoint = enterPointCoordinates();
            System.out.println("Coordinates of the closest point: "
                    + ClosestPointFinder.findClosestPoint(firstPoint, secondPoint));
        } catch (NullArgumentException ex) {
            System.out.println(ex);
        } catch (InputMismatchException ex){
            System.out.println("Not an integer was entered");
        }
    }
}
