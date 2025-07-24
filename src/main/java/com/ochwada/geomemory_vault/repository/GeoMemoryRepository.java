package com.ochwada.geomemory_vault.repository;


import com.ochwada.geomemory_vault.model.GeoMemory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * *******************************************************
 * Package: com.ochwada.geomemory_vault.repository
 * File: GeoMemoryRepository.java
 * Author: Ochwada
 * Date: Thursday, 24.Jul.2025, 5:33 PM
 * Description: {@code GeoMemoryRepository} provides CRUD operations for the {@link GeoMemory} entity
 *  * by extending {@link MongoRepository}.
 * *******************************************************
 */

public interface GeoMemoryRepository extends MongoRepository<GeoMemory, String> {
    /** -----------------------------------------------------------
     * Inherits all basic CRUD methods from MongoRepository, like:
     * save(User user)
     * findById(String id)
     * findAll()
     * deleteById(String id)
     ----------------------------------------------------------- */

    // ==================== Custom methods =========================/

    /**
     * Retrieves all memories associated with a specific place name.
     *
     * @param placeName the name of the place to filter memories by
     * @return a list of {@link GeoMemory} entries matching the given place name
     */
    List<GeoMemory> findByPlaceName(String placeName);
}

