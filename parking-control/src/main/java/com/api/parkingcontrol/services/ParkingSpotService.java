package com.api.parkingcontrol.services;

import com.api.parkingcontrol.dtos.ParkingSpotDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
        return parkingSpotRepository.save(parkingSpotModel);
    }

}
