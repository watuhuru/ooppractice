package practice1;

import java.util.Scanner;

public class Factorial {
    public static long factorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число от 0 до 20: ");
        int number = scanner.nextInt();
        while (number < 0 || number > 20) {
            System.out.print("Введите число в диапазоне от 0 до 20: ");
            number = scanner.nextInt();
        }

        System.out.println(number + "! = " + factorial(number));
    }
}

