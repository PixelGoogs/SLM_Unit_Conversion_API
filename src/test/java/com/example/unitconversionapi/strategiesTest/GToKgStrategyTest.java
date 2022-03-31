package com.example.unitconversionapi.strategiesTest;

import com.example.unitconversionapi.strategies.GToKgStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * The type G to kg strategy test.
 */
public class GToKgStrategyTest {

    /**
     * The constant G_TO_KG_STRATEGY.
     */
    public final static GToKgStrategy G_TO_KG_STRATEGY = new GToKgStrategy();

    /**
     * Convert 1000 g to kg.
     */
    @Test
    public void convert1000GToKg() {
        assertEquals(1, G_TO_KG_STRATEGY.convert("g", "kg", 1000));
    }

    /**
     * Convert 0 g to kg.
     */
    @Test
    public void convert0GToKg() {
        assertEquals(0, G_TO_KG_STRATEGY.convert("g", "kg", 0));
    }

    /**
     * Convert negative g to kg then throws exception.
     */
    @Test
    public void convertNegativeGToKg_thenThrowsException() {
        assertThrows(ArithmeticException.class, () -> G_TO_KG_STRATEGY.convert("g", "kg", -100));
    }

    /**
     * Convert max integer g to kg.
     */
    @Test
    public void convertMaxIntegerGToKG() {
        assertEquals(2147483.647, G_TO_KG_STRATEGY.convert("g", "kg", Integer.MAX_VALUE));
    }
}
