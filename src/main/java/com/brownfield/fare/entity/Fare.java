package com.brownfield.fare.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Fare {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private String flightNumber;
    private String flightDate;
    private String fare;

}
