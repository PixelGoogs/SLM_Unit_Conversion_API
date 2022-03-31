package com.example.unitconversionapi.strategies;


/**
 * This is our conversion strategy interface.
 * boolean isConversionValid(); is currently not in use, could be used for further validation.
 * All strategies need to implement the following methods, and can override them to their needs.
 */
public interface ConversionStrategy {
    /**
     * Convert double.
     *
     * @param fromType  the from type
     * @param toType    the to type
     * @param fromValue the from value
     * @return the double
     */
    double convert(String fromType, String toType, double fromValue);

    /**
     * Is conversion valid boolean. Currently not used.
     *
     * @return the boolean
     */
    boolean isConversionValid();

    /**
     * Gets from type.
     *
     * @return the from type
     */
    String getFromType();

    /**
     * Gets to type.
     *
     * @return the to type
     */
    String getToType();

}
