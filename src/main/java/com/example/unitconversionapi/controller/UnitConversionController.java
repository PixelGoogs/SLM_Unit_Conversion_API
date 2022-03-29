package com.example.unitconversionapi.controller;

import com.example.unitconversionapi.Service.BeanFactoryDynamicAutowireService;
import com.example.unitconversionapi.dto.Request;
import com.example.unitconversionapi.dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * This is the main Controller of the API
 */
@RestController
@RequestMapping("api")
public class UnitConversionController {

    private final BeanFactoryDynamicAutowireService beanFactoryDynamicAutowireService;

    /**
     * Instantiates a new Unit conversion controller.
     *
     * @param beanFactoryDynamicAutowireService the bean factory dynamic autowire service
     */
    public UnitConversionController(BeanFactoryDynamicAutowireService beanFactoryDynamicAutowireService) {
        this.beanFactoryDynamicAutowireService = beanFactoryDynamicAutowireService;
    }

    /**
     * "/convert" ist our converter Route which automatically chooses the necessary strategy based on RequestBody
     * If request fails send Bad_request (example: non existing strategy)
     *
     * @param request the request
     * @return the response entity
     */
    @PostMapping("/convert")
    public ResponseEntity<Response> convertUnits(@RequestBody Request request) {
        double result = beanFactoryDynamicAutowireService.convert(request.getConversionUnits(), request.getInputValue());

        Response response = new Response(request.getInputValue(), request.getConversionUnits(), result);

        return ResponseEntity.ok(response);
    }

    /**
     * Arithmetic exception handler response entity.
     *
     * @param e the e
     * @return the response entity
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> arithmeticExceptionHandler(ArithmeticException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(e.getMessage());
    }
}
