package com.example.unitconversionapi.strategies;

public interface ConversionStrategy {
    double convert(String fromType, String toType, double fromValue);

    boolean isConversionValid();

    String getFromType();
    String getToType();

}
