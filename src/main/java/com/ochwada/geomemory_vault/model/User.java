package com.ochwada.geomemory_vault.model;


import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

/**
 * *******************************************************
 * Package: com.ochwada.geomemory_vault.model
 * File: User.java
 * Author: Ochwada
 * Date: Thursday, 24.Jul.2025, 4:20 PM
 * Description: Represents a registered user in the Secure Joke Vault system. Stored as a document in the "users" collection
 * Objective:
 * *******************************************************
 */

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**
     * The unique identifier for the user (MongoDB User ID).
     * {@code @Id}: Declares the user's unique identifier.
     */
    @Id
    private String id;

    /**
     * The user's unique username.
     * *
     * This field is required and must not be blank.
     * {@code @Indexed(unique = true)}: Ensures the {@code name} field is unique across all user memeory.
     * {@code @NotBlank}: Validates that the {@code name} is not null or empty during input.
     */
    @Indexed(unique = true)
    @NotBlank(message = "Username is required")
    private String username;

    /**
     * The user's password.
     * {@code @NotBlank}: Validates that the {@code name} is not null or empty during input.
     * This field is required and should be stored in a hashed format.
     */
    @NotBlank(message = "password is required")
    private String password;

    /**
     * The list of roles assigned to the user.
     * Used by Spring Security for access control -  injected from enum
     */
    private List<Role> roles;


}
