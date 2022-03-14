package com.example.unitconversionapi.strategiesTest;

import com.example.unitconversionapi.strategies.KgToGStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class KgToGStrategyTest {

    public static final KgToGStrategy KG_TO_G_STRATEGY = new KgToGStrategy();

    @Test
    public void convert10KgToG() {
        assertEquals(10000, KG_TO_G_STRATEGY.convert("kg", "g", 10));
    }

    @Test
    public void convert0KgToG() {
        assertEquals(0, KG_TO_G_STRATEGY.convert("kg", "g", 0));
    }

    @Test
    public void convertMaxLargeNumberKgToG() {
        assertEquals(100000000, KG_TO_G_STRATEGY.convert("kg", "g", 100000));
    }

    @Test
    public void convertNegativeKgToG_thenThrowsException() {
        assertThrows(ArithmeticException.class, () -> KG_TO_G_STRATEGY.convert("kg", "g", -10));
    }
}
