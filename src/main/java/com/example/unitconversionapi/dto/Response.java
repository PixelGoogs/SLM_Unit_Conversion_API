package com.example.unitconversionapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Response DTO per API
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Response {
    private double inputValue;
    private String conversionUnits;
    private double result;

}
