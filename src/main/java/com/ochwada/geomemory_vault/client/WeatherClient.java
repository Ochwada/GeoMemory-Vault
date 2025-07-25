package com.ochwada.geomemory_vault.client;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * *******************************************************
 * Package: com.ochwada.geomemory_vault.client
 * File: WeatherClient.java
 * Author: Ochwada
 * Date: Thursday, 24.Jul.2025, 6:02 PM
 * Description: Client to fetch data from OpenWeather API
 * Objective:
 * *******************************************************
 */

@Component
@RequiredArgsConstructor
public class WeatherClient {
    /**
     * Spring's RestTemplate used to send HTTP requests to the weather API.
     */
    private final RestTemplate template;

    /**
     * Jackson ObjectMapper for converting JSON responses to Java objects.
     */
    private final ObjectMapper mapper;

    /**
     * The API key for accessing the OpenWeather API. Injected from application properties.
     */
    @Value("${openweather.api.key}")
    private String apiKey;

    /**
     * The base URL of the Open API. Injected from application properties.
     */
    @Value("${openweather.api.url}")
    private String apiUrl;

    // ======================WeatherData POJO =====================================
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class WeatherData {
        private String description;
        private double temperature;
    }
    // =============================================================================

    public WeatherData getWeatherForCity(String place){

        return null;
    }
}
