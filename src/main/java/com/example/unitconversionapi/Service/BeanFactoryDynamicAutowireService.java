package com.example.unitconversionapi.Service;

import com.example.unitconversionapi.strategies.ConversionStrategy;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This is our BeanFactory Service, it automatically chooses the required Conversion Method based on Name_suffix.
 */
@Service
public class BeanFactoryDynamicAutowireService {
    private static final String SERVICE_NAME_SUFFIX = "ConversionStrategy";
    private final BeanFactory beanFactory;

    /**
     * Instantiates a new Bean factory dynamic autowire service.
     *
     * @param beanFactory the bean factory
     */
    @Autowired
    public BeanFactoryDynamicAutowireService(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    /**
     * Convert double.
     *
     * @param conversionUnits the conversion units
     * @param fromValue       the from value
     * @return the double
     * @throws NoSuchBeanDefinitionException the no such bean definition exception
     */
    public double convert(String conversionUnits, double fromValue) throws NoSuchBeanDefinitionException {
        ConversionStrategy strategy = beanFactory.getBean(getConversionStrategyBeanName(conversionUnits),
                ConversionStrategy.class);

        return strategy.convert(strategy.getFromType(), strategy.getToType(), fromValue);

    }

    /**
     * @param conversionUnits the conversion units
     * @return the conversion strategy bean name which is used to get the correct conversion strategy
     */
    private String getConversionStrategyBeanName(String conversionUnits) {
        return conversionUnits + SERVICE_NAME_SUFFIX;
    }
}