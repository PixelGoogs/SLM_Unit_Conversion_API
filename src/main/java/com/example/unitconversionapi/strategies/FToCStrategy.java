package com.example.unitconversionapi.strategies;

import org.springframework.stereotype.Service;

@Service("fToCConversionStrategy")
public class FToCStrategy implements ConversionStrategy {
    public String fromType = "c";
    public String toType = "f";

    @Override
    public double convert(String fromType, String toType, double fromValue) {
        return (5.0 / 9 * (fromValue - 32));
    }

    @Override
    public boolean isConversionValid() {
        return false;
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
