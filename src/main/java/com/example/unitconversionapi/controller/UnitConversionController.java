package com.example.unitconversionapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UnitConversionController {

    //@Getmapping("/convert")
    //public

    @PostMapping("/convert")
    public double convertUnits(
            @RequestParam(name = "from") String convertFrom,
            @RequestParam(name = "to") String convertTo,
            @RequestParam(name = "fromValue") double value
    ) {
        System.out.printf("Converting %f %s to %s", value, convertFrom, convertTo);
        return 0;
    }


}
