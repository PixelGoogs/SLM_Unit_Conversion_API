package com.example.unitconversionapi.Service;

import com.example.unitconversionapi.strategies.ConversionStrategy;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanFactoryDynamicAutowireService {
    private static final String SERVICE_NAME_SUFFIX = "ConversionStrategy";
    private final BeanFactory beanFactory;

    @Autowired
    public BeanFactoryDynamicAutowireService(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public double convert(String conversionUnits, double fromValue) throws NoSuchBeanDefinitionException {
        ConversionStrategy strategy = beanFactory.getBean(getConversionStrategyBeanName(conversionUnits),
                ConversionStrategy.class);

        return strategy.convert(strategy.getFromType(), strategy.getToType(), fromValue);

    }

    private String getConversionStrategyBeanName(String conversionUnits) {
        return conversionUnits + SERVICE_NAME_SUFFIX;
    }
}