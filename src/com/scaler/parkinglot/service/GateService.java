package com.scaler.parkinglot.service;

import com.scaler.parkinglot.models.Gate;
import com.scaler.parkinglot.models.GateType;
import com.scaler.parkinglot.models.Operator;

public class GateService {

    public Gate getGate(Long id) {
        return null;
    }

    public Gate createGate(GateType type, Operator operator){

        Gate gate = new Gate();
        gate.setGateType(type);
        gate.setOperator(operator);

        return gate;

    }
}
