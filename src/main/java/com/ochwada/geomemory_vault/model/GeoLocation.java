package com.ochwada.geomemory_vault.model;


import lombok.*;

import java.util.*;

/**
 * *******************************************************
 * Package: com.ochwada.geomemory_vault.model
 * File: GeoLocation.java
 * Author: Ochwada
 * Date: Thursday, 24.Jul.2025, 3:51 PM
 * Description: Represents a GeoJSON "Point" used to store geospatial data in MongoDB.
 * - This structure is compatible with MongoDB's 2dsphere geospatial index.
 * Objective:
 * *******************************************************
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeoLocation {
    /**
     * GeoJSON type — should always be "Point"
     */
    private String type;

    /**
     * Coordinates in GeoJSON format: [longitude, latitude]
     * Must be in this order for MongoDB to interpret correctly.
     */
    private List<Double> coordinates; // [longitude, latitude]

}
