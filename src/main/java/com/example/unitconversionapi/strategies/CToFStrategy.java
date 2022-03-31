package com.example.unitconversionapi.strategies;

import org.springframework.stereotype.Service;

/**
 * implements ConversionStrategy Interface.
 * Gets automatically chosen based on BeanFactory
 */
@Service("cToFConversionStrategy")
public class CToFStrategy implements ConversionStrategy {
    public String fromType = "c";
    public String toType = "f";

    @Override
    public double convert(String fromType, String toType, double fromValue) {
        return (fromValue * 9/5.0 + 32);
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
