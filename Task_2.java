package Homeworks.Homework_1;

/**
 * Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
public class Task_2 {
    public static void main(String[] args) {
        System.out.println(checkAmountRange(5, 5));
    }

    private static boolean checkAmountRange(int number1, int number2) {
        return number1 + number2 >= 10 && number1 + number2 <= 20;
    }
}
