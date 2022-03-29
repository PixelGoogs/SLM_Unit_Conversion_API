package com.example.unitconversionapi.strategiesTest;

import com.example.unitconversionapi.strategies.KgToGStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * The type Kg to g strategy test.
 */
public class KgToGStrategyTest {

    /**
     * The constant KG_TO_G_STRATEGY.
     */
    public static final KgToGStrategy KG_TO_G_STRATEGY = new KgToGStrategy();

    /**
     * Convert 10 kg to g.
     */
    @Test
    public void convert10KgToG() {
        assertEquals(10000, KG_TO_G_STRATEGY.convert("kg", "g", 10));
    }

    /**
     * Convert 0 kg to g.
     */
    @Test
    public void convert0KgToG() {
        assertEquals(0, KG_TO_G_STRATEGY.convert("kg", "g", 0));
    }

    /**
     * Convert max large number kg to g.
     */
    @Test
    public void convertMaxLargeNumberKgToG() {
        assertEquals(100000000, KG_TO_G_STRATEGY.convert("kg", "g", 100000));
    }

    /**
     * Convert negative kg to g then throws exception.
     */
    @Test
    public void convertNegativeKgToG_thenThrowsException() {
        assertThrows(ArithmeticException.class, () -> KG_TO_G_STRATEGY.convert("kg", "g", -10));
    }
}
