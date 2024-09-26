package com.servicio.ParkingControl.BackEnd.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.ParkingControl.BackEnd.Entities.Admin;
import com.servicio.ParkingControl.BackEnd.Services.Interfaces.AdminInt;

@RestController
public class RegistrationController {

    @Autowired
    private AdminInt adminService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "/req/signup", consumes = "application/json")
    public Admin createUser(@RequestBody Admin user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return adminService.save(user);
    }

}
