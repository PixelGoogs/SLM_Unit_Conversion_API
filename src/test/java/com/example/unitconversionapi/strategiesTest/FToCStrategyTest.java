package com.example.unitconversionapi.strategiesTest;

import com.example.unitconversionapi.strategies.FToCStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type F to c strategy test.
 */
public class FToCStrategyTest {

    /**
     * The constant F_TO_C_STRATEGY.
     */
    public static final FToCStrategy F_TO_C_STRATEGY = new FToCStrategy();

    /**
     * Convert 122 f to c.
     */
    @Test
    public void convert122FToC() {
        assertEquals(50, F_TO_C_STRATEGY.convert("f", "c", 122));
    }

    /**
     * Convert 68 f to c.
     */
    @Test
    public void convert68FToC() {
        assertEquals(20, F_TO_C_STRATEGY.convert("f", "c", 68));
    }

    /**
     * Convert minus 40 f to c.
     */
    @Test
    public void convertMinus40FToC() {
        assertEquals(-40, F_TO_C_STRATEGY.convert("f", "c", -40));
    }

    /**
     * Convert large f to c.
     */
    @Test
    public void convertLargeFToC() {
        assertEquals(11095, F_TO_C_STRATEGY.convert("f", "c", 20003));
    }

    /**
     * Convert float f to c.
     */
    @Test
    public void convertFloatFToC() {
        assertEquals(-16.5, F_TO_C_STRATEGY.convert("f", "c", 2.3));
    }
}
