package com.scaler.parkinglot.service;

import com.scaler.parkinglot.models.*;
import com.scaler.parkinglot.repositories.ParkingLotRepository;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotService {
    private GateService gateService;
    private FloorService floorService;

    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(GateService gateService,FloorService floorService,ParkingLotRepository parkingLotRepository){

        this.parkingLotRepository = parkingLotRepository;
        this.floorService =floorService;
        this.gateService = gateService;
    }

    public void createParkingLot(String name , String address,List<ParkingFloor> parkingFloorList , List<Gate> gateList){
        List<ParkingFloor> parkingFloorsCreated = new ArrayList<>();
        List<Gate> gatesCreated = new ArrayList<>();
        for (ParkingFloor floor : parkingFloorList){
            ParkingFloor pfCreated = this.floorService.createParkingFLoor(floor.getParkingSpots(),floor.getNumber(),floor.getId());
            if (pfCreated !=null){
                parkingFloorsCreated.add(pfCreated);
            }
        }

        for (Gate gate : gateList){
            Gate gateCreated = this.gateService.createGate(gate.getGateType(),gate.getOperator());
            if (gateCreated!=null){
                gatesCreated.add(gateCreated);
            }
        }

        ParkingLot pl = new ParkingLot();
        pl.setParkingFloors(parkingFloorsCreated);
        pl.setGates(gatesCreated);
        pl.setAddress(address);
        pl.setName(name);
        pl.setParkingLotStatus(ParkingLotStatus.CLOSE);
        parkingLotRepository.save(pl);




    }


}
