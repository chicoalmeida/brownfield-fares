package com.brownfield.fare.controller;

import com.brownfield.fare.entity.Fare;
import com.brownfield.fare.service.FaresComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(FaresController.FARE_ENDPOINT)
public class FaresController {

    public static final String FARE_ENDPOINT = "/fares";

    private final FaresComponent faresComponent;

    @Autowired
    FaresController(FaresComponent faresComponent) {
        this.faresComponent = faresComponent;
    }

    @RequestMapping("/get")
    public ResponseEntity<Fare> getFare(@RequestParam(value = "flightNumber") String flightNumber, @RequestParam(value = "flightDate") String flightDate) {
        return new ResponseEntity<>(faresComponent.getFare(flightNumber, flightDate), HttpStatus.OK);
    }
}
