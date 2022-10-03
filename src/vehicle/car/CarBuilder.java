package src.vehicle.car;

import src.helper.Color;

import java.util.UUID;

public class CarBuilder {

    private final Car car;

    public CarBuilder() {
        car = new Car();
    }

    public CarBuilder setUUID() {
        car.uuid = UUID.randomUUID();
        return this;
    }

    public CarBuilder setUUID(UUID uuid) {
        car.uuid = uuid;
        return this;
    }

    public CarBuilder setColor(Color color) {
        car.color = color;
        return this;
    }

    public CarBuilder setDriverName(String driverName) {
        car.driverName = driverName;
        return this;
    }

    public Car build() {
        return car;
    }
}
