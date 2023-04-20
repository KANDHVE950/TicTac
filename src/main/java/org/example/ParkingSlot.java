package org.example;

public class ParkingSlot {
    private Integer id;
    private Vehicle vehicle;

    public ParkingSlot(Integer id, Vehicle vehicle) {
        this.id = id;
        this.vehicle = vehicle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "id=" + id +
                ", vehicle=" + vehicle +
                '}';
    }
}
