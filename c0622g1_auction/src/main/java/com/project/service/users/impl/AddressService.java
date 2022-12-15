package com.project.service.users.impl;


import com.project.model.users.Address;
import com.project.repository.users.IAddressRepository;
import com.project.service.users.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements IAddressService {
    @Autowired
    private IAddressRepository addressRepository;

    @Override
    public Address saveAddress(Address address) {
        addressRepository.save(address);
        return address;
    }

}
