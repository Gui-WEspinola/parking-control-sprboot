package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    /* O controller acionará o service, que por sua vez aciona o repository
    Por isso é importante criar um ponto de injeção de dependência
    O @Autowired serve para criar esse ponto de injeção e
    O código final ficaria assim:
    @Autowired
     ParkingSpotRepository ParkingSpotRepository;
    */
    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(com.api.parkingcontrol.repositories.ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }


}
