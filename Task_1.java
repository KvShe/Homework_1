package Homeworks.Homework_1;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class Task_1 {
    public static void main(String[] args) {
        System.out.println(findTriangularNumber(5));
        System.out.println(findFactorial(5));
    }
    private static int findTriangularNumber(int n) {
        return n * (n + 1) / 2;
    }
    private static int findFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) factorial *= i;
        return factorial;
    }
}
