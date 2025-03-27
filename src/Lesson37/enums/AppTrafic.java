package Lesson37.enums;

public class AppTrafic {
    public static void main(String[] args) {
        Colors color = Colors.RED;
        System.out.println(color);

        Colors[] colors = Colors.values();
        for (Colors current : Colors.values()){
            System.out.println(current);
        }

        Colors red = Colors.valueOf("RED");



        TrafficLight trafficLight = new TrafficLight("SN-001" , "Berlin" , Colors.YELLOW);
        System.out.println(trafficLight);


    }
}
