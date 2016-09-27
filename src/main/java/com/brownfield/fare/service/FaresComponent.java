package com.brownfield.fare.service;

import com.brownfield.fare.entity.Fare;

/**
 * Created by francisco.almeida on 21/10/16.
 */
public interface FaresComponent {
    Fare getFare(String flightNumber, String flightDate);
}
