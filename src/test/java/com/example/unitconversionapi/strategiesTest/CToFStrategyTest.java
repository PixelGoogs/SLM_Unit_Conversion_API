package com.example.unitconversionapi.strategiesTest;

import com.example.unitconversionapi.strategies.CToFStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CToFStrategyTest {

    public static final CToFStrategy C_TO_F_STRATEGY = new CToFStrategy();

    @Test
    public void convert50CToF() {
        assertEquals(122, C_TO_F_STRATEGY.convert("c", "f", 50));
    }

    @Test
    public void convert0CToF() {
        assertEquals(32, C_TO_F_STRATEGY.convert("c", "f", 0));
    }

    @Test
    public void convertMinus40CToF() {
        assertEquals(-40, C_TO_F_STRATEGY.convert("c", "f", -40));
    }

    @Test
    public void convertFloatCToF() {
        assertEquals(50.9, C_TO_F_STRATEGY.convert("c", "f", 10.5));
    }
}
