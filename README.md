# OceanFleet

## Overview

OceanFleet is a console-based Java application designed to manage cargo vessel performance records.

The application stores vessel details, retrieves vessels using their unique IDs, and identifies vessels with the highest average speed.

## Technologies Used

- Java 17
- Maven
- JUnit 5
- Java Collections Framework
- Git and GitHub

## Features

- Store vessel performance records
- Retrieve a vessel using its unique ID
- Identify all vessels with the highest average speed

## Concepts Demonstrated

- Object-Oriented Programming
- Encapsulation
- Java Collections
- List Traversal
- Linear Search
- Maximum Value Identification
- Separation of Concerns

## Project Structure

The application follows a modular Java project structure.

```
Bridgelabz_OceanFleet
├── src
│   ├── main
│   │   └── java/org/example
│   │       ├── Vessel.java
│   │       └── VesselUtils.java
│   └── test
│       └── java/org/example
│           ├── VesselUtilsTest.java
│           └── VesselUtilHighPerformanceTest.java
├── pom.xml
└── README.md
```

## How to Run Tests

```bash
mvn test
```

## Project Development

The project follows a use-case-driven development approach. Each use case is implemented in a separate feature branch and merged into the `develop` branch after testing.

### Branch Structure

| Branch | Purpose |
|--------|---------|
| `main` | Project documentation |
| `develop` | Integrated development branch |
| `feature/UC1-...` | Use case branches (one per use case) |
