package by.javatr.task10.util;

import by.javatr.exception.InvalidArgumentException;

public class ValuesCalculator {
    public static double[][] getArrayWithAllValues(double a, double b, double h) throws InvalidArgumentException{
        if(a > b){
            throw new InvalidArgumentException("Left border is more than right");
        }
        if(h < 1){
            throw new InvalidArgumentException("Step value is less than one");
        }
        double argumentValue = a;
        double[][] valuesArray = createValuesArray(a,b,h);
        for (int j =0; j < valuesArray[0].length; j++)
        {
            valuesArray[0][j]= argumentValue;
            valuesArray[1][j]= Math.tan(argumentValue);
            argumentValue += h;
        }
        return valuesArray;
    }

    private static double[][] createValuesArray(double a, double b, double h){
        int size = (int)((b-a)/(Math.abs(h)))+1;
        return new double[2][size];
    }
}
