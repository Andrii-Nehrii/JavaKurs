package Lesson27.Homework;

public class Processor extends Component {
   protected int cores;
   protected  double frequency;

    public Processor(String brand, String model, int cores, double frequency) {
        super(brand, model);
        this.cores = cores;
        this.frequency = frequency;
    }
  //  public String getInfo(){
  //      return super.getInfo() + ", " + "cores: " + cores + "frequency: " + frequency;
  //  }



}
