package com.lot.service;

import com.lot.model.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAllVehicle();

    Vehicle save(Vehicle vehicle);
}

