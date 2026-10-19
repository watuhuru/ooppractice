package practice4.task4;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer(
            ComputerBrand.LENOVO,
            new Processor("Intel Core i5", 10, 4.4),
            new Memory(16, "DDR5"),
            new Monitor(24, "1920 × 1080")
        );

        System.out.println(computer);
    }
}
