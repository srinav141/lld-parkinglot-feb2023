package com.scaler.parkinglot.service;

import com.scaler.parkinglot.models.ParkingFloor;
import com.scaler.parkinglot.models.ParkingSpot;

import java.util.List;

public class FloorService {

    public ParkingFloor getFloor(int id){
        return null;
    }

    public ParkingFloor createParkingFLoor(List<ParkingSpot> parkingSpots , int number , Long parkingFloorID){

        ParkingFloor pf = new ParkingFloor();
        pf.setParkingSpots(parkingSpots);
        pf.setNumber(number);
        pf.setId(parkingFloorID);

        return pf;

    }
}
