package Homeworks.Homework_1;

/**
 * Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */
public class Task_3 {
    public static void main(String[] args) {
        isPositive(0);
    }
    private static void isPositive(int number) {
        System.out.println(number >= 0 ? "+" : "-");
    }
}
