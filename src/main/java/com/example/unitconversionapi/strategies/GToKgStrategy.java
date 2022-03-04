package com.example.unitconversionapi.strategies;

import org.springframework.stereotype.Service;

@Service("gToKgConversionStrategy")
public class GToKgStrategy implements ConversionStrategy {

    public String fromType = "g";
    public String toType = "kg";


    @Override
    public double convert(String fromType, String toType, double fromValue) {
        return fromValue / 1000;
    }

    @Override
    public boolean isConversionValid() {
        return true;
    }

//    @Override
//    public String getConversionUnits() {
//        return "gToKg";
//    }

    @Override
    public String getFromType() {
        return fromType;
    }

    @Override
    public String getToType() {
        return toType;
    }

}
