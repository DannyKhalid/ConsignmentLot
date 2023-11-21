package com.lot.service;

import com.lot.model.Vehicle;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class VehicleServiceImpl implements VehicleService {


    @Override
    public List<Vehicle> findAllVehicle() {
        List<Vehicle> vehicles = new ArrayList<>();
        Iterable<Vehicle> vehiclesItr = vehicleRepository.findAll();
        vehiclesItr.forEach(vehicles::add);
        return vehicles;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
