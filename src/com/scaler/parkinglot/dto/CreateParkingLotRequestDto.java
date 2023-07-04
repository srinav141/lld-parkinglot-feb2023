package com.scaler.parkinglot.dto;

import com.scaler.parkinglot.models.Gate;
import com.scaler.parkinglot.models.ParkingFloor;

import java.util.List;

public class CreateParkingLotRequestDto {
    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    private List<ParkingFloor> parkingFloors;

    private List<Gate> gates;

}
