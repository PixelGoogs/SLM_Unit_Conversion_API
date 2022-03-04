package com.example.unitconversionapi.strategies;

import org.springframework.stereotype.Service;

@Service("kgToGConversionStrategy")
public class KgToGStrategy implements ConversionStrategy {
    public String fromType = "kg";
    public String toType = "g";


    @Override
    public double convert(String fromType, String toType, double fromValue) {
        return fromValue * 1000;
    }

    @Override
    public boolean isConversionValid() {
        return true;
    }

    @Override
    public String getFromType() {
        return fromType;
    }

    @Override
    public String getToType() {
        return toType;
    }
}
