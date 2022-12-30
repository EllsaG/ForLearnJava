package Lesson30Chapter2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Car {

    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Our Car is " + model + ", color is " + color + " and engine = " + engine;
    }
}

class Test10 {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> a1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a1.add(carSupplier.get());
        }
        return a1;
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "silver metalic", 1.6));
        System.out.println("ourCars: " + ourCars);

//        changeCar(ourCars.get(0), car -> {
//            car.color = "red";
//            car.engine = 2.4;
//            System.out.println("updated car: " + car);
//        });
        Consumer<Car> consumer = car -> {

            car.color = "red";
            car.engine = 2.4;
            System.out.println("updated car: " + car);
        };
        consumer.accept(ourCars.get(0));
        System.out.println("ourCars: " + ourCars);
    }
}
