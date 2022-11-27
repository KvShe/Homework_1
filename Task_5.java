package Homeworks.Homework_1;

/**
 * Написать метод, которому в качестве аргументов передается строка и число,
 * метод должен отпечатать в консоль указанную строку, указанное количество раз;
 */
public class Task_5 {
    public static void main(String[] args) {
        printString("Java", 2);
    }
    private static void printString(String string, int number) {
        for (int i = 0; i < number; i++) System.out.println(string);
    }
}
