package Homeworks.Homework_1;

/**
 * Написать метод, которому в качестве параметра передается целое число.
 * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 */
public class Task_4 {
    public static void main(String[] args) {
        System.out.println(isNegative(1));
    }
    private static boolean isNegative(int number) {
        return number < 0;
    }
}
