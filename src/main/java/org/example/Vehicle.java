package org.example;

public class Vehicle {
    private VehicleType vehicleType;
    private String registrationNumber;
    private String color;

    public Vehicle(VehicleType vehicleType, String registrationNumber, String color) {
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.color = color;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType=" + vehicleType +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
