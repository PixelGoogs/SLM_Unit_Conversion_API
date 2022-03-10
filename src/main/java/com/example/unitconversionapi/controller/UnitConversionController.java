package com.example.unitconversionapi.controller;

import com.example.unitconversionapi.Service.BeanFactoryDynamicAutowireService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class UnitConversionController {

    private final BeanFactoryDynamicAutowireService beanFactoryDynamicAutowireService;

    public UnitConversionController(BeanFactoryDynamicAutowireService beanFactoryDynamicAutowireService) {
        this.beanFactoryDynamicAutowireService = beanFactoryDynamicAutowireService;
    }

    @PostMapping("/convert")
    public double convertUnits(
            @RequestParam(name = "conversionUnits") String conversionUnits,
            @RequestParam(name = "value") double value
    ) {
        return beanFactoryDynamicAutowireService.convert(conversionUnits, value);
    }
}
