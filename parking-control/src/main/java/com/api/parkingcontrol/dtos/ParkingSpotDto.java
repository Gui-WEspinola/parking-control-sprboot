package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDto {


    /*Essa classe sera a responsável por fazer as validações. Por isso que foi criada a
    dependência spring-boot-starter-validation
    Essa são anotações default da string validation, mas podem ser criadas personalizadas
    essas constraints
    */
    @NotBlank
    private String parkingSpotNumber;
    @NotBlank
    @Size(max = 7)
    private String licensePlateCar;
    @NotBlank
    private String brandCar;
    @NotBlank
    private String modelCar;
    @NotBlank
    private String colorCar;
    @NotBlank
    private String responsibleName;
    @NotBlank
    private String apartment;
    @NotBlank
    private String block;
}
