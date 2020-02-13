package by.javatr.task5.util;

public class PerfectNumberChecker {

    public static boolean isPerfectNumber(int number){
        return number == calculateDividersSum(number);
    }

    private static int calculateDividersSum(int number){
        int dividersSum = 0;
        for (int i = 1;i < (number/2)+1;i++){
            if (number % i == 0){
                dividersSum += i;
            }
        }
        return dividersSum;
    }
}
