package com.example.unitconversionapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Requested DTO per API
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    private String conversionUnits;
    private double inputValue;

}
