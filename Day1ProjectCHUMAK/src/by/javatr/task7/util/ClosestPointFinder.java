package by.javatr.task7.util;

import by.javatr.exception.NullArgumentException;

public class ClosestPointFinder {

    private static double calculateLength(Point point){
        return Math.sqrt(Math.pow(point.getX(),2) +
                Math.pow(point.getY(),2));
    }

    public static Point findClosestPoint(Point first, Point second) throws NullArgumentException{
        if(first == null || second == null){
            throw new NullArgumentException("One of the arguments was null");
        }
        Point closestPoint;
        Double fpLength = calculateLength(first);
        Double spLength = calculateLength(second);
        if(fpLength.compareTo(spLength) > 0){
            closestPoint = second;
        }
        else{
            closestPoint = first;
        }
        return closestPoint;
    }
}
