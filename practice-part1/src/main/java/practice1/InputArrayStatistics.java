package practice1;

import java.util.Scanner;

public class InputArrayStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();
        while (size <= 0) {
            System.out.print("Размер должен быть больше нуля. Введите размер ещё раз: ");
            size = scanner.nextInt();
        }

        int[] numbers = new int[size];
        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumWithDoWhile = 0;
        int i = 0;
        do {
            sumWithDoWhile += numbers[i];
            i++;
        } while (i < numbers.length);

        int sumWithWhile = 0;
        i = 0;
        while (i < numbers.length) {
            sumWithWhile += numbers[i];
            i++;
        }

        int minimum = numbers[0];
        int maximum = numbers[0];
        i = 1;
        while (i < numbers.length) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
            i++;
        }

        System.out.println("Сумма (цикл do while): " + sumWithDoWhile);
        System.out.println("Сумма (цикл while): " + sumWithWhile);
        System.out.println("Минимальный элемент: " + minimum);
        System.out.println("Максимальный элемент: " + maximum);
    }
}

