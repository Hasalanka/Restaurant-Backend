package com.backend.restaurantbackend.controller;

import com.backend.restaurantbackend.model.DelivaryDeets;
import com.backend.restaurantbackend.repository.DelivaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DelivaryController {
    @Autowired
    private DelivaryRepository delivaryRepository;

    @PostMapping("/deets")
    DelivaryDeets newDelivaryDeets(@RequestBody DelivaryDeets newDelivaryDeets){
        return delivaryRepository.save(newDelivaryDeets);
    }

    @GetMapping("/alldeets")
    List<DelivaryDeets> getAlldeets(){
        return delivaryRepository.findAll();

    }

    @GetMapping("/deets/{id}")
    Optional<DelivaryDeets> getDeetsbyId(@PathVariable Long id){
        return delivaryRepository.findById(id);
    }



}
