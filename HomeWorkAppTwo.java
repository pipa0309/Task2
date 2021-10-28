package HomeTaskTwo;

public class HomeWorkAppTwo {
    public static void main(String[] args) {
        boolean flagForCheckRange = checkRangeNumber(1, 8);
        printFlagForCheckRange(flagForCheckRange);
        printPositiveOrNegativeNum(0);
        boolean flagSignNum = positiveOrNegativeNum(-2);
        printPositiveOrNegativeNum(flagSignNum);
        printStrAndNumOfTimes("Hello!", 5);
        boolean flagOfLeapYear = determineLeapYear(400);
        printFlagOfLeapYear(flagOfLeapYear);
    }

    public static boolean checkRangeNumber(int numOne, int nunTwo) {
        int sumResult = numOne + nunTwo;
        if ((sumResult >= 10) && (sumResult <=20)) {
            return true;
        } else return false;
    }
    public static void printFlagForCheckRange(boolean flagForCheckRange) {
        System.out.println(flagForCheckRange);
    }

    public static void printPositiveOrNegativeNum(int numForPrintDetermineSign) {
        if (numForPrintDetermineSign >= 0) {
            System.out.println("Number positive");
        } else {
            System.out.println("Number negative");
        }
    }

    public static boolean positiveOrNegativeNum(int numForDetermineSign) {
        if (numForDetermineSign >= 0) {
            return true;
        } else return false;
    }
    public static void printPositiveOrNegativeNum(boolean flagSignNum) {
        System.out.println(flagSignNum);
    }

    public static void printStrAndNumOfTimes(String text, int numOfTimes) {
        for (int i = 0; i < numOfTimes; i++) {
            System.out.println(text);
        }
    }

    public static boolean determineLeapYear(int numOfYear) {
        if ((numOfYear % 4 == 0) && (numOfYear % 100 != 0)
                || (numOfYear % 400 == 0) ) {
            return true;
        } else return false;
    }
    public static void printFlagOfLeapYear(boolean flagOfLeapYear) {
        System.out.println(flagOfLeapYear);
    }
}
