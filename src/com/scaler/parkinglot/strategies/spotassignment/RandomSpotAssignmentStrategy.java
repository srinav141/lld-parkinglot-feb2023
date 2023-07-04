package com.scaler.parkinglot.strategies.spotassignment;

import com.scaler.parkinglot.models.*;
import com.scaler.parkinglot.repositories.ParkingLotRepository;

import java.util.ArrayList;
import java.util.List;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {
    private ParkingLotRepository parkingLotRepository;

    public RandomSpotAssignmentStrategy(ParkingLotRepository parkingLotRepository){
        this.parkingLotRepository = parkingLotRepository;
    }


    @Override
    public ParkingSpot assignSpot(VehicleType vehicleType, Gate gate) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotWithGate(gate);
        List<ParkingSpot> parkingSpotList =new ArrayList<>();

        for(ParkingFloor floor : parkingLot.getParkingFloors()){
            parkingSpotList.addAll(floor.getParkingSpots());
        }

        for(ParkingSpot parkingSpot: parkingSpotList){
            if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)
                    && parkingSpot.getSupportedVehicleTypes().contains(vehicleType)){
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
                return parkingSpot;
            }
        }

        return null;

    }
}
