package com.servicio.ParkingControl.BackEnd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.ParkingControl.BackEnd.Entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
