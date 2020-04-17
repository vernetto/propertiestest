package org.pierre.propertiestest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
public class MyConfig {
    @Bean
    public ConversionService conversionService() {
        return new DefaultConversionService();
    }
}
