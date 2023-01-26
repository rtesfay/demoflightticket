package com.example.demo.controller;

import com.example.demo.model.Flight;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
    @GetMapping("/search")
    public Flight searchFlight(){
        return  null;
    }
@GetMapping("/flight")
    public  Flight reserveFlight(){
        return  null;
    }

}
