package src.vehicle.bus;

import src.helper.Color;

import java.util.UUID;

public class BusBuilder {
    private final Bus bus;

    public BusBuilder() {
        bus = new Bus();
    }

    public BusBuilder setUUID() {
        bus.uuid = UUID.randomUUID();
        return this;
    }

    public BusBuilder setUUID(UUID uuid) {
        bus.uuid = uuid;
        return this;
    }

    public BusBuilder setColor(Color color) {
        bus.color = color;
        return this;
    }

    public BusBuilder setDriverName(String driverName) {
        bus.driverName = driverName;
        return this;
    }

    public Bus build() {
        return bus;
    }
}
