package Homeworks.Homework_1;

import java.util.Arrays;

/**
 * Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
public class Task_7 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) numbers[i] = 1;
            else numbers[i] = 0;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
