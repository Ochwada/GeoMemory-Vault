package com.ochwada.geomemory_vault.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * *******************************************************
 * Package: com.ochwada.geomemory_vault.config
 * File: RestTemplateConfig.java
 * Author: Ochwada
 * Date: Thursday, 24.Jul.2025, 5:43 PM
 * Description: {@code RestTemplateConfig} is a configuration class that defines application-wide Spring beans related
 * to REST communication.
 * *******************************************************
 */

@Configuration
public class RestTemplateConfig {
    /**
     * Creates and exposes a {@link RestTemplate} bean for making HTTP requests.
     *
     * @return a default RestTemplate instance
     */

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
