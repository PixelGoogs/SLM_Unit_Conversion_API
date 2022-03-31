package com.example.unitconversionapi.strategiesTest;

import com.example.unitconversionapi.strategies.CToFStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type C to f strategy test.
 */
public class CToFStrategyTest {

    /**
     * The constant C_TO_F_STRATEGY.
     */
    public static final CToFStrategy C_TO_F_STRATEGY = new CToFStrategy();

    /**
     * Convert 50 c to f.
     */
    @Test
    public void convert50CToF() {
        assertEquals(122, C_TO_F_STRATEGY.convert("c", "f", 50));
    }

    /**
     * Convert 0 c to f.
     */
    @Test
    public void convert0CToF() {
        assertEquals(32, C_TO_F_STRATEGY.convert("c", "f", 0));
    }

    /**
     * Convert minus 40 c to f.
     */
    @Test
    public void convertMinus40CToF() {
        assertEquals(-40, C_TO_F_STRATEGY.convert("c", "f", -40));
    }

    /**
     * Convert float c to f.
     */
    @Test
    public void convertFloatCToF() {
        assertEquals(50.9, C_TO_F_STRATEGY.convert("c", "f", 10.5));
    }
}
