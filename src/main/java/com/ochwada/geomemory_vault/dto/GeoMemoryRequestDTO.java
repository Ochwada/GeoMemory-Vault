package com.ochwada.geomemory_vault.dto;


import lombok.*;

import java.util.*;

/**
 * *******************************************************
 * Package: com.ochwada.geomemory_vault.dto
 * File: GeoMemoryRequestDTO.java
 * Author: Ochwada
 * Date: Thursday, 24.Jul.2025, 4:28 PM
 * Description: DTO used to receive memory creation requests from the client.
 * - Includes only the fields required from the user.
 * Objective:
 * *******************************************************
 */

@Data
public class GeoMemoryRequestDTO {
    private String title;

    private String description;

    private String userId;

    private List<Double> coordinates; // [longitude, latitude]

    private String summary;  // weather summary

    private String temp;     // weather temperature

    // Optional: the client could also send a placeName (but usually derived by server)
    private String placeName;

    private String country;

}
