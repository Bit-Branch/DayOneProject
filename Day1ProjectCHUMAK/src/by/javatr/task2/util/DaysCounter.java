package by.javatr.task2.util;

import by.javatr.exception.InvalidArgumentException;

public class DaysCounter {
    public static int countDaysInMonth(int month,int year) throws InvalidArgumentException{
        if((month < 0 || month >12)) {
            throw new InvalidArgumentException("Incorrect month number was used");
        }
        if (year < 0){
            throw new InvalidArgumentException("Incorrect year number was used");
        }

        int [] months = {4,6,9,11};
        int daysCount = 31;
        if (month == 2) {
            if (isYearLeap(year)) {
                daysCount = 29;
            }
            else{
                daysCount = 28;
            }
        }
        for (int i : months)
        {
            if (month == i) {
                daysCount = 30;
                break;
            }
        }
        return daysCount;
    }

    private static boolean isYearMultiple(int year,int divider){
        return (year % divider == 0);
    }

    private static boolean isYearLeap(int year){
        boolean isLeap = false;
        if ((isYearMultiple(year,4) && !isYearMultiple(year,100))
                || isYearMultiple(year,400)){
            isLeap = true;
        }
        return isLeap;
    }
}
