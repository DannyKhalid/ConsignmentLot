package com.lot.service;

import com.lot.model.Owner;
import com.lot.model.Vehicle;

public interface OwnerService {

    Owner save(Owner owner);
    Owner findById(long id);
}
