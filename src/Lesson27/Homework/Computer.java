package Lesson27.Homework;

public class Computer {
    private Processor processor ;//= new Processor("Intel" ,"I7 12500f", 8 , 3.5 );
    private Memory memory ;//= new Memory("Samsung" , "53x750" ,16);
    private Storage storage; //= new Storage()

    public Computer(String processorBrand, String processorModel, int processorCores, double processorFrequency,
                   String memoryBrand, String memoryModel, int memoryCapacity, Storage storage) {
        // Композиция: создаем процессор и память внутри компьютера
        processor = new Processor(processorBrand, processorModel, processorCores, processorFrequency);
        memory = new Memory(memoryBrand, memoryModel, memoryCapacity);
        this.storage = storage; // Агрегация: накопитель передаётся в конструкторе
    }



    public void getInfo() {
        System.out.println("Компьютер:");
        System.out.println("  Процессор: " + processor.getInfo());
        System.out.println("  Память: " + memory.getInfo());
        System.out.println("  Накопитель: " + storage.getInfo());
    }
}
