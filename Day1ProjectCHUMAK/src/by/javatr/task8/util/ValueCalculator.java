package by.javatr.task8.util;

import by.javatr.exception.InvalidArgumentException;

public class ValueCalculator {
    private static double solveFirstEquation(double x){
        return 3*x + 9 - (x*x);
    }

    private static double solveSecondEquation(double x) throws InvalidArgumentException {
        if ((Math.pow(x,3) - 6) == 0){
            throw new InvalidArgumentException("Division by zero exception");
        }
        return 1/(Math.pow(x,3) - 6);
    }

    public static double findFunctionValue(double x) throws InvalidArgumentException{
        double answer;
        if (x < 3){
            answer = solveSecondEquation(x);
        }
        else {
            answer = solveFirstEquation(x);
        }
        return answer;
    }
}
