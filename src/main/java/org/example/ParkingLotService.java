package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ParkingLotService {
    private ParkingLot parkingLot;

    public void createParkingLot(Integer lotId, Integer noOfFloors, Integer noOfSlotPerFloor){
        parkingLot = new ParkingLot();
        parkingLot.setId(lotId);
        parkingLot.setFloorCount(noOfFloors);
        List<ParkingFloor> parkingFloorList = new ArrayList<>();
        System.out.println(noOfFloors);
        for(int i=0; i<noOfFloors; i++){
            List<ParkingSlot> parkingSlotList = new ArrayList<>();
            for(int j=0; j<noOfSlotPerFloor; j++){
                ParkingSlot parkingSlot = new ParkingSlot(j+1,null);
                parkingSlotList.add(parkingSlot);
            }
            ParkingFloor parkingFloor = new ParkingFloor(i+1,parkingSlotList);
            parkingFloorList.add(parkingFloor);
        }
        parkingLot.setParkingFloors(parkingFloorList);
    }

    public void displayParkingLot(){
        System.out.println(parkingLot.getId());
        System.out.println(parkingLot.getFloorCount());
        parkingLot.getParkingFloors().forEach(System.out::println);
    }
    public void parkVehicle(VehicleType vehicleType, String regisNo, String color){
        System.out.println("PARKING Vehicle");
        Integer floorPosition = getFreeSlot(vehicleType).get(0);
        Integer slotPosition = getFreeSlot(vehicleType).get(1);
        String vehicleName = vehicleType.toString();
        if(slotPosition.equals(-1)){
            System.out.println("No slot Available for Vehicle: "+vehicleName);
            return;
        }
//        if(vehicleName.equals("CAR")){
//        }
//        else if(vehicleName.equals("BIKE")){
//
//        }
//        else{
//
//        }
        Vehicle vehicle = new Vehicle(vehicleType,regisNo,color);
        parkingLot.getParkingFloors().get(floorPosition).getParkingSlots().get(slotPosition).setVehicle(vehicle);
    }

    public void displayCount(){

    }
    private List<Integer> getFreeSlot(VehicleType vehicleType){
        Integer noOfFloors = parkingLot.getFloorCount();
        Integer noOfSlotPerFloor = parkingLot.getParkingFloors().get(0).getParkingSlots().size();
        Integer floorPosition = -1;
        Integer slotPosition = -1;
        if(vehicleType.toString().equals("TRUCK")){
            for(int i=0; i<noOfFloors; i++){
                if(Objects.isNull(parkingLot.getParkingFloors().get(i).getParkingSlots().get(0).getVehicle())){
                    floorPosition = i;
                    slotPosition=0;
                    break;
                }
            }
        }
        else if(vehicleType.toString().equals("BIKE")){
            for(int i=0; i<noOfFloors; i++){
                for(int j=1; j<3; j++){
                    if(Objects.isNull(parkingLot.getParkingFloors().get(i).getParkingSlots().get(j).getVehicle())){
                        floorPosition = i;
                        slotPosition = j;
                        break;
                    }
//                System.out.println(parkingLot.getParkingFloors().get(i).getParkingSlots().get(j).getVehicle());
                }
                if(!floorPosition.equals(-1)){
                    break;
                }
            }
        }
        else{
            for(int i=0; i<noOfFloors; i++){
                for(int j=3; j<noOfSlotPerFloor; j++){
                    if(Objects.isNull(parkingLot.getParkingFloors().get(i).getParkingSlots().get(j).getVehicle())){
                        floorPosition = i;
                        slotPosition = j;
                        break;
                    }
//                System.out.println(parkingLot.getParkingFloors().get(i).getParkingSlots().get(j).getVehicle());
                }
                if(!floorPosition.equals(-1)){
                    break;
                }
            }
        }
        return Arrays.asList(floorPosition,slotPosition);
    }

}
