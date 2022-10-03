package src.vehicle;

import src.helper.Color;

import java.util.UUID;

public abstract class Vehicle {

    public final String version = "v1.0.0";
    public UUID uuid;
    public String driverName;
    public Color color;

    @Override
    public String toString() {
        return "Vehicle{" +
                "uuid=" + uuid +
                ", driverName='" + driverName + '\'' +
                ", color=" + color +
                '}';
    }
}


