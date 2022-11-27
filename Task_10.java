package Homeworks.Homework_1;

/**
 * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
 * заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу:
 * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */
public class Task_10 {
    public static void main(String[] args) {
        int size = 5;
        int[][] numbers = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) numbers[i][j] = 1;
                if (j == size - 1 - i) numbers[i][j] = 1;
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
