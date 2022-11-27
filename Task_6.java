package Homeworks.Homework_1;

/**
 * Написать метод, который определяет, является ли год високосным, и возвращает boolean
 * (високосный - true, не високосный - false).
 * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class Task_6 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(4));
        System.out.println(isLeapYear(100));
        System.out.println(isLeapYear(400));
    }

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}
