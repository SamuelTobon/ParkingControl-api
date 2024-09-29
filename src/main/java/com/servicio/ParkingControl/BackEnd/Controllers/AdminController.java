package com.servicio.ParkingControl.BackEnd.Controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.ParkingControl.BackEnd.Entities.Admin;
import com.servicio.ParkingControl.BackEnd.Services.Interfaces.AdminInt;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/administradores")
public class AdminController {

    @Autowired
    @Qualifier("adminImp")
    private AdminInt adminService;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> listarAdmin() {
        return ResponseEntity.ok(adminService.findAll());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public ResponseEntity<?> listarAdminById(@PathVariable(value = "id") Integer id) {
        Optional<Admin> admin = adminService.findById(id);
        if (admin.isPresent()) {
            return ResponseEntity.ok(admin);
        }
        return ResponseEntity.notFound().build();
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> crearAdmin(@RequestBody Admin admin) {

        return ResponseEntity.ok(adminService.save(admin));

    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public ResponseEntity<?> editarAdmin(@RequestBody Admin admin) {
        return ResponseEntity.ok(adminService.save(admin));
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarAdmin(@PathVariable(value = "id") Integer id) {
        Optional<Admin> admin = adminService.findById(id);
        if (admin.isPresent()) {
            adminService.delete(id);
            return ResponseEntity.ok(admin);
        }
        return ResponseEntity.ok().build();
    }

}