package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParkingLotService parkingLotService = new ParkingLotService();
        while(true){
            Scanner scan = new Scanner(System.in);
            String type = scan.next();
            switch (type){
                case "create_parking_lot":
                    System.out.println("Creating parking lot");
                    parkingLotService.createParkingLot(scan.nextInt(), scan.nextInt(), scan.nextInt());
                    parkingLotService.displayParkingLot();
                    break;
                case "park_vehicle":
                    System.out.println("Parking Vehicle");
                    parkingLotService.parkVehicle(Enum.valueOf(VehicleType.class,scan.next()),scan.next(),scan.next());
                    parkingLotService.displayParkingLot();
                    break;
                case "unpark_vehicle":
                    System.out.println("Unparking vehicle");
                    break;
                case "display":
                    System.out.println("Displaying parked vehicle");
                    break;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println("Done all task");
                    return;
            }

        }
    }
}