package com.brownfield.fare.repository;

import com.brownfield.fare.entity.Fare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaresRepository extends JpaRepository<Fare, Long> {
    Fare getFareByFlightNumberAndFlightDate(String flightNumber, String flightDate);
}
