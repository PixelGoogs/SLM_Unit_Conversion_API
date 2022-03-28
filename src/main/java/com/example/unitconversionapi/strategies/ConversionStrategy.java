package com.example.unitconversionapi.strategies;

/**
 * This is our conversion strategy interface.
 * boolean isConversionValid(); is currently not in use, could be used for further validation.
 * All strategies need to implement the following methods, and can override them to their needs.
 */
public interface ConversionStrategy {
    double convert(String fromType, String toType, double fromValue);

    boolean isConversionValid();

    String getFromType();

    String getToType();

}
