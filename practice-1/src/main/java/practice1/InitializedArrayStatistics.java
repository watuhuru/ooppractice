package practice1;

public class InitializedArrayStatistics {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 4, 9, 18};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Элементы массива:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i < numbers.length - 1 ? " " : "\n"));
        }
        System.out.println("Сумма элементов: " + sum);
        System.out.printf("Среднее арифметическое: %.2f%n", average);
    }
}

