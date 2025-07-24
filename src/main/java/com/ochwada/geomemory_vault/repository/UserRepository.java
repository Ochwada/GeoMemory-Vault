package com.ochwada.geomemory_vault.repository;

import com.ochwada.geomemory_vault.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.*;

/**
 * *******************************************************
 * Package: com.ochwada.geomemory_vault.repository
 * File: UserRepository.java
 * Author: Ochwada
 * Date: Thursday, 24.Jul.2025, 5:30 PM
 * Description:  {@code UserRepository} provides CRUD operations for the {@link User} entity
 * by extending {@link MongoRepository}.
 * *******************************************************
 */


public interface UserRepository extends MongoRepository<User, String> {
    /** -----------------------------------------------------------
     * Inherits all basic CRUD methods from MongoRepository, like:
     * save(User user)
     * findById(String id)
     * findAll()
     * deleteById(String id)
     ----------------------------------------------------------- */

    // ==================== Custom methods =========================

    /**
     * Retrieves a user by their username.
     *
     * @param username the username of the user to be retrieved
     * @return an {@link Optional} containing the user if found, or empty if not found
     * MongoDB query equivalent: {@code db.users.find({ "username": "some_value" })}
     */
    Optional<User> findByUsername(String username);

    /**
     * Checks if a user with the given username exists in the database.
     *
     * @param username the username to check for existence
     * @return {@code true} if a user with the specified username exists, {@code false} otherwise
     * MongoDB query equivalent: {@code db.users.find({ "username": "some_value" })}
     */
    boolean existsByUsername(String username);
}
