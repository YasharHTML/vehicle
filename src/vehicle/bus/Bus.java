package src.vehicle.bus;

import src.helper.Color;
import src.helper.Fuel;
import src.helper.Fuelable;
import src.vehicle.Vehicle;

import java.util.UUID;

public class Bus extends Vehicle implements Fuelable {

    public Bus(String driver, Color color) {
        this.uuid = UUID.randomUUID();
        this.driverName = driver;
        this.color = color;
    }

    public Bus() {}

    public static BusBuilder builder() {
        return new BusBuilder();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Fuel getFuelType() {
        return Fuel.DIESEL;
    }
}
