package Homeworks.Homework_1;

import java.util.Arrays;

/**
 * Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */
public class Task_8 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) numbers[i] = i + 1;
        System.out.println(Arrays.toString(numbers));
    }
}
