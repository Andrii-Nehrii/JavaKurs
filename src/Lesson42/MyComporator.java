package Lesson42;

import java.util.Arrays;
import java.util.Comparator;

public class MyComporator {
    public static void main(String[] args) {
        int[] ints = new int[]{9, 5, 1, 2, 4, 11, 0};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 198);
        cars[2] = new Car("CITROEN", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2025, 300);
        cars[5] = new Car("Ferrari", 2021, Integer.MIN_VALUE);
        printCars(cars);
        Arrays.sort(cars);
        printCars(cars);

        CarSpeedComparator speedComparator = new CarSpeedComparator();
        Arrays.sort(cars, speedComparator);
        printCars(cars);
        Arrays.sort(cars, new CarModelComparator());
        printCars(cars);
        System.out.println("=========================\n");

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getModel().compareTo(c2.getModel());
            }
        });
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                //  return (c1.getYear() - c2.getYear()) * (-1);
                return c2.getYear() - c1.getYear();
            }
        });
        printCars(cars);

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();
                if (yearCompare != 0) {
                    return yearCompare;
                }
                return c2.getModel().compareTo(c1.getModel());
            }
        });
        printCars(cars);
        Arrays.sort(cars, (car1, car2) -> {
            return car2.getYear() - car1.getYear();
        });
        printCars(cars);

        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());
        Comparator<Car> carComparator = (c1, c2) -> {
         //int speedCompare = c1.getMaxSpeed() - c2.getMaxSpeed();
         int speedCompare = Integer.compare(c1.getMaxSpeed(), c2.getMaxSpeed());
         if (speedCompare == 0 ){
             return c1.getYear() - c2.getYear();
         }
         return speedCompare;
        };
        Arrays.sort(cars, carComparator);
        printCars(cars);
        //по модели в нормальном порядке
        Comparator<Car> bymodel = Comparator.comparing(car-> car.getModel());
        Arrays.sort(cars , bymodel);
        printCars(cars);

        //Ссылка на метод - скоращенная запись лямбды
        Arrays.sort(cars, Comparator.comparing(Car :: getModel));
        printCars(cars);

        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));
        //отсортировать ао году выпуска в обратном порядке
        Arrays.sort(cars , Comparator.comparing(Car :: getYear , Comparator.reverseOrder()));
        printCars(cars);
        Arrays.sort(cars,Comparator.comparing(Car ::getModel).thenComparing(Car :: getYear,Comparator.reverseOrder()));
        printCars(cars);
        Arrays.sort(cars ,Comparator.comparing(Car :: getYear).thenComparing(Car :: getModel , Comparator.reverseOrder() ));
        printCars(cars);
        Arrays.sort(cars , Comparator.comparing(Car :: getYear , Comparator.reverseOrder()).thenComparing(Car :: getMaxSpeed));
        printCars(cars);












    }

    public static void printCars(Car[] cars) {
        System.out.println("============");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("=========================\n");
    }
}
