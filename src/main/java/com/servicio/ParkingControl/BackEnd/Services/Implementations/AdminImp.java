package com.servicio.ParkingControl.BackEnd.Services.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.servicio.ParkingControl.BackEnd.Entities.Admin;
import com.servicio.ParkingControl.BackEnd.Repositories.AdminRepository;
import com.servicio.ParkingControl.BackEnd.Services.Interfaces.AdminInt;

@Service

public class AdminImp implements AdminInt {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();

    }

    @Override
    public Optional<Admin> findById(Integer id) {
        return adminRepository.findById(id);
    }

    @Override
    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void delete(Integer id) {
        adminRepository.deleteById(id);

    }

}