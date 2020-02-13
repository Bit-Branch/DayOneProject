package by.javatr.task6.util;

import by.javatr.exception.InvalidArgumentException;

public class TimeCounter {
    private static int countHours(int second){
        return second/3600;
    }

    private static int countMinutes(int second){
        return (second-countHours(second)*3600)/60;
    }

    private static int countSeconds(int second){
        return (second - countHours(second)*3600 - countMinutes(second)*60);
    }

    public static Time countTimeFromSeconds(int second) throws InvalidArgumentException {
        if (second < 0){
            throw new InvalidArgumentException("Negative time used");
        }
        int hours = countHours(second);
        int minutes = countMinutes(second);
        int seconds = countSeconds(second);
        return new Time(hours,minutes,seconds);
    }
}
