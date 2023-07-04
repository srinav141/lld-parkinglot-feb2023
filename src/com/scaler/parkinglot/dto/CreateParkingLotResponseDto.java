package com.scaler.parkinglot.dto;

import com.scaler.parkinglot.models.ParkingLot;

public class CreateParkingLotResponseDto {
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    private ResponseStatus responseStatus;

    private ParkingLot parkingLot;

}
