package src.vehicle.car;

import src.helper.Color;
import src.helper.Fuel;
import src.helper.Fuelable;
import src.vehicle.Vehicle;

import java.util.UUID;

public class Car extends Vehicle implements Fuelable {

    public Car(String driver, Color color) {
        this.uuid = UUID.randomUUID();
        this.driverName = driver;
        this.color = color;
    }

    public Car() {}

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Fuel getFuelType() {
        return Fuel.GASOLINE;
    }
}
