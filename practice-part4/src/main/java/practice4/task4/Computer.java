package practice4.task4;

public class Computer {
    private final ComputerBrand brand;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return "Компьютер " + brand + "\n"
            + "Процессор: " + processor + "\n"
            + "Память: " + memory + "\n"
            + "Монитор: " + monitor;
    }
}
