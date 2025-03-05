package Lesson27.Homework;

public class Storage extends Component {
    protected int capacity;

    public Storage(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    public String getInfo() {
        return super.getInfo() + ", capacity: " + capacity;
    }
}
