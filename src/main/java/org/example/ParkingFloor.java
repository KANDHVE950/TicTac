package org.example;

import java.util.List;

public class ParkingFloor {
    private Integer floorNo;
    private List<ParkingSlot>  parkingSlots;
    private Integer carCount;
    private Integer bikeCount;
    private Integer truckCount;

    public Integer getCarCount() {
        return carCount;
    }

    public void setCarCount(Integer carCount) {
        this.carCount = carCount;
    }

    public Integer getBikeCount() {
        return bikeCount;
    }

    public void setBikeCount(Integer bikeCount) {
        this.bikeCount = bikeCount;
    }

    public Integer getTruckCount() {
        return truckCount;
    }

    public void setTruckCount(Integer truckCount) {
        this.truckCount = truckCount;
    }

    public ParkingFloor(Integer floorNo, List<ParkingSlot> parkingSlots) {
        this.floorNo = floorNo;
        this.parkingSlots = parkingSlots;
    }

    public Integer getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(Integer floorNo) {
        this.floorNo = floorNo;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    @Override
    public String toString() {
        return "ParkingFloor{" +
                "floorNo=" + floorNo +
                ", parkingSlots=" + parkingSlots +
                '}';
    }
}
