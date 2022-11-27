package Homeworks.Homework_1;

import java.util.Arrays;

/**
 * Написать метод, принимающий на вход два аргумента: len и initialValue,
 * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
 */
public class Task_11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(7, 7)));
    }
    private static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) array[i] = initialValue;
        return array;
    }
}
