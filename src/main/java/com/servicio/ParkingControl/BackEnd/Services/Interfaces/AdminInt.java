package com.servicio.ParkingControl.BackEnd.Services.Interfaces;

import java.util.List;
import java.util.Optional;

import com.servicio.ParkingControl.BackEnd.Entities.Admin;

public interface AdminInt {
    public List<Admin> findAll();

    public Optional<Admin> findById(Integer id);

    public Admin save(Admin admin);

    public void delete(Integer id);

    public Optional<Admin> login(String username, String password);

}
