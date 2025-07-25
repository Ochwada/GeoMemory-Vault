package com.ochwada.geomemory_vault.dto;


import lombok.*;

import java.time.*;
import java.util.*;

/**
 * *******************************************************
 * Package: com.ochwada.geomemory_vault.dto
 * File: GeoMemoryResponseDTO.java
 * Author: Ochwada
 * Date: Thursday, 24.Jul.2025, 4:31 PM
 * Description: DTO for sending memory data back to the client.
 * -  Mirrors the structure of GeoMemory but flattens nested fields for clarity.
 * Objective:
 * *******************************************************
 */

@Data
public class GeoMemoryResponseDTO {
    private String id;

    private String userId;

    private String title;

    private String description;

    private String placeName;

    private String country;

    private List<Double> coordinates;

    private String summary;

    private String temp;

    private LocalDateTime createdAt;
}
