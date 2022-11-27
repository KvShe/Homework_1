package Homeworks.Homework_1;

import java.util.Arrays;

/**
 * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */
public class Task_9 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) if (numbers[i] < 6) numbers[i] *= 2;
        System.out.println(Arrays.toString(numbers));
    }
}
