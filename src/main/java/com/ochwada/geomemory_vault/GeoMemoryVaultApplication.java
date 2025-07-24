package com.ochwada.geomemory_vault;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 🌍 GeoMemoryVaultApplication
 * *
 * Entry point for the GeoMemory Vault Spring Boot application.
 * - This class initializes the application, loads environment variables from a `.env` file, and sets them as system
 * properties for use throughout the app.
 * *
 * Features:
 * - Starts Spring Boot context using {@link SpringApplication}
 * - Loads configuration from `.env` file using {@link Dotenv}
 * - Sets environment variables such as database URL, JWT secret, and weather API keys
 *
 * @author Ochwada
 */
@SpringBootApplication
public class GeoMemoryVaultApplication {

    /**
     * Main method to start the Spring Boot application.
     *
     * @param args command-line arguments passed to Spring Boot
     */
    public static void main(String[] args) {
        SpringApplication.run(GeoMemoryVaultApplication.class, args);
    }

    // Static block to load and set environment variables before the app fully starts
    static {
        // Load environment variables from .env file
        // Ignores file if missing (useful for production environments like Heroku)
        Dotenv dotenv = Dotenv.configure()
                .ignoreIfMissing()
                .load();

        // List of expected keys to load from the .env file
        String[] envVars = {
                "MONGODB_URI",
                "MONGODB_DATABASE",
                "PORT",
                "JWT_SECRET",
                "OPENWEATHER_API",
                "OPENWEATHER_API_URL"
        };

        // Iterate through keys and set them as JVM system properties if found
        for (String key : envVars) {
            String value = dotenv.get(key);

            if (value != null) {
                System.setProperty(key, value);  // Makes it accessible via System.getProperty
                System.out.println("✅ " + key + " loaded and set.");
            } else {
                System.out.println("⚠️" + key + " not found in .env file. Skipping System.");
            }
        }
    }

}
