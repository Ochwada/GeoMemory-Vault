# 🗺️ GeoMemory Vault

**GeoMemory Vault** is a secure and mobile-first geospatial web application that allows users to log, store, and revisit 
personal memories tied to specific geographic locations. Each memory can include a title, description, geolocation 
(latitude & longitude), timestamp, and optional weather data or image.

The app leverages modern backend technologies and geospatial data structures to offer rich, location-aware experiences, 
with potential frontend mapping integrations.

## Json Structure:

```yaml
{
  "userId": "abc123",
  "title": "Climbed Mount Kenya",
  "description": "Amazing sunrise from Point Lenana!",
  "placeName": "Mount Kenya National Park, Kenya",
  "location": {
    "type": "Point",
    "coordinates": [37.3084, -0.1521]
  },
  "weather": {
    "summary": "Clear sky",
    "temp": "10°C"
  },
  "createdAt": "2025-07-24T10:00:00Z"
}


```

## Structure Explained
| **Package Name** | **Purpose**                                                                                                     |
|------------------|-----------------------------------------------------------------------------------------------------------------|
| `model`          | Holds **data models/entities** like `User`, `Role`, `Joke`, `GeoMemory`                                         |
| `repository`     | Contains **interfaces** that interact with the database (e.g., `UserRepository`)                                |
| `service`        | Contains **business logic** classes like `JokeService`, `UserDetailsServiceImpl`                                |
| `controller`     | Exposes **REST API endpoints** to the frontend (e.g., `AuthController`, `JokeController`)                       |
| `security`       | Holds **JWT and Spring Security logic**, like `JWTUtil`, `JWTFilter`                                            |
| `config`         | Stores **Spring configuration** classes (e.g., `SecurityConfig`)                                                |
| `dto`            | Contains **Data Transfer Objects**, used to structure API request/response bodies                               |
| `mapper`         | Responsible for converting between DTOs and models (e.g., `UserMapper`)                                         |
| `alias`          | Probably a helper or utility layer (in your case, `SecurityUser`) used to adapt Spring Security’s `UserDetails` |
