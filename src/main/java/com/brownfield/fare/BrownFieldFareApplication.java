package com.brownfield.fare;

import com.brownfield.fare.entity.Fare;
import com.brownfield.fare.repository.FaresRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

import static java.util.Arrays.asList;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@Slf4j
public class BrownFieldFareApplication implements CommandLineRunner {


    @Autowired
    private FaresRepository faresRepository;

    public static void main(String[] args) {
        SpringApplication.run(BrownFieldFareApplication.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        List<Fare> fares = asList(
                Fare.builder().flightNumber("BF100").flightDate("22-JAN-16").fare("101").build(),
                Fare.builder().flightNumber("BF101").flightDate("22-JAN-16").fare("101").build(),
                Fare.builder().flightNumber("BF102").flightDate("22-JAN-16").fare("102").build(),
                Fare.builder().flightNumber("BF103").flightDate("22-JAN-16").fare("103").build(),
                Fare.builder().flightNumber("BF104").flightDate("22-JAN-16").fare("104").build(),
                Fare.builder().flightNumber("BF105").flightDate("22-JAN-16").fare("105").build(),
                Fare.builder().flightNumber("BF106").flightDate("22-JAN-16").fare("106").build());

        faresRepository.save(fares);

        log.info("Result: " + faresRepository.getFareByFlightNumberAndFlightDate("BF101", "22-JAN-16"));

    }
}

