/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto.controller;

import Reto.entity.Reservation;
import Reto.service.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/Reservation")
/**
 *
 * @author Har
 */
public class ReservationController {
    @Autowired
    private ReservationService service;
    
    @GetMapping("/all")
    public List<Reservation> findAllReservation(){
        return service.getReservationAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity addReservation(@RequestBody Reservation reservation){
        service.saveReservationAll(reservation);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/update")
    public ResponseEntity updateReservation(@RequestBody Reservation reservation){
        service.updateReservation(reservation);
        return ResponseEntity.status(201).build();
    }    

    @DeleteMapping("/delete")    
        public ResponseEntity deleteReservation(@RequestBody Reservation reservation){
        service.deleteReservation(reservation.getIdReservation());
        return ResponseEntity.status(204).build();
    }
}
