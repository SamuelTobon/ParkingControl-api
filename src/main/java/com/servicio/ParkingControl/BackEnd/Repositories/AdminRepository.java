package com.servicio.ParkingControl.BackEnd.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.ParkingControl.BackEnd.Entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Optional<Admin> findByUsername(String username);

    Optional<Admin> findByUsernameAndPassword(String username, String password);

}
