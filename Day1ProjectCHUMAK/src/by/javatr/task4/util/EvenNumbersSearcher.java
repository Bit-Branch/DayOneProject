package by.javatr.task4.util;

import by.javatr.exception.NullArgumentException;

public class EvenNumbersSearcher {
    public static boolean hasTwoOrMoreEvenNumbers(int[] numbers) throws NullArgumentException{
        if (numbers == null){
            throw new NullArgumentException("Null argument used");
        }
        int counter = 0;
        for (int number : numbers) {
            if (isEven(number)) {
                counter++;
            }
        }
        return counter>1;
    }

    private static boolean isEven(int number){
        return (number % 2) == 0;
    }
}
