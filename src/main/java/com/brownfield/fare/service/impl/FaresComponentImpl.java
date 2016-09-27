package com.brownfield.fare.service.impl;


import com.brownfield.fare.entity.Fare;
import com.brownfield.fare.repository.FaresRepository;
import com.brownfield.fare.service.FaresComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FaresComponentImpl implements FaresComponent {

    private FaresRepository faresRepository;

    @Autowired
    public FaresComponentImpl(FaresRepository faresRepository) {
        this.faresRepository = faresRepository;
    }

    @Override
    public Fare getFare(String flightNumber, String flightDate) {
        log.info("Looking for fares flightNumber " + flightNumber + " flightDate " + flightDate);
        return faresRepository.getFareByFlightNumberAndFlightDate(flightNumber, flightDate);
    }
}
