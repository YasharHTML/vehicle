package src;

import src.helper.Color;
import src.vehicle.bus.Bus;
import src.vehicle.car.Car;

public class Main {
    public static void main(String[] args) {
        Car car = Car.builder().setUUID().setColor(Color.BLACK).setDriverName("Yashar").build();
        System.out.println(car.toString());
        System.out.println(car.getFuelType());

        Bus bus = new Bus("Yashar", Color.RED);
        System.out.println(bus.toString());
        System.out.println(bus.getFuelType());
    }
}
