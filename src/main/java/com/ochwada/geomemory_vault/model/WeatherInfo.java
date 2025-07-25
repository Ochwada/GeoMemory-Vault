package com.ochwada.geomemory_vault.model;


import lombok.*;

/**
 * *******************************************************
 * Package: com.ochwada.geomemory_vault.model
 * File: WeatherInfo.java
 * Author: Ochwada
 * Date: Thursday, 24.Jul.2025, 4:09 PM
 * Description:{@code  WeatherInfo} Represents the weather conditions at the time and place a memory was created.
 * - This is an optional embedded object within a {@link GeoMemory} document.
 * *******************************************************
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherInfo {

    /**
     * A short weather description, e.g., "Clear sky", "Light rain", "Overcast clouds"
     */
    private String description;

    /**
     * Temperature at the memory location and time (can include unit, e.g., "10°C")
     */
    private String temp;

}
