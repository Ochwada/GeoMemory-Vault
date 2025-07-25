package com.ochwada.geomemory_vault.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.*;

/**
 * *******************************************************
 * Package: com.ochwada.geomemory_vault.model
 * File: Memory.java
 * Author: Ochwada
 * Date: Thursday, 24.Jul.2025, 3:41 PM
 * Description: GeoMemory: Represents a Memory in the Geo-memory Vault System
 * *******************************************************
 */

/**
 * A MongoDB document representing a personal memory tagged to a geographic location.
 * Each memory contains metadata such as title, description, place name, weather,
 * and a creation timestamp. Designed for use in the GeoMemory Vault application.
 * The `location` field follows the GeoJSON standard for 2dsphere geospatial indexing in MongoDB.
 */
@Document(collection = "memories")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GeoMemory {
    /**
     * MongoDB document ID
     */
    @Id
    private String id;

    /**
     * MongoDB User ID from the 'users' collection
     */
    private String userId;

    /**
     * Title of the memory (e.g., "Climbed Mount Kenya")
     * Must not be blank and must contain between 10 and 50 characters.
     */
    @NotBlank(message = "Title is required")
    @Size(min = 5, max = 50, message = "Should be between 10 and 40 charectors")
    private String title;

    /**
     * Detailed description of the memory
     */
    private String description;

    /**
     * Human-readable place name derived from coordinates
     * (e.g., "Mount Kenya National Park, Kenya")
     */
    private String placeName;

    /**
     * Human-readable country name derived from coordinates
     */
    private String country;

    /**
     * Geospatial location (GeoJSON format with type "Point")
     */
    private GeoLocation location;

    /**
     * Optional weather information at the time of memory creation
     */
    private WeatherInfo weather;

    /**
     * Date when the memory was created or recorded
     */
    private LocalDateTime createdAt;
}
