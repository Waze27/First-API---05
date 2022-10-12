package com.FirstAPI.Api_05.controller;

import com.FirstAPI.Api_05.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping(value = "")
    public CarDTO getCar(){
        return new CarDTO("2", "Mercedes", 13.500);
    }

    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.CREATED)
    public String createdCar(@Valid @RequestBody(required = false) CarDTO car){
        return car.toString();
    }
}
