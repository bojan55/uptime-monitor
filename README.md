# Uptime Monitor

REST API for monitoring the availability of websites and services.
Periodically checks configured URLs, stores the results and reports when a target goes down.

> Work in progress — built step by step as a learning and portfolio project.

## Tech stack
- Java 21
- Spring Boot 4 (Web, Data JPA, Validation)
- PostgreSQL 17
- Flyway (database migrations)
- Docker
- Maven

## Running locally

**Prerequisites:** Java 21, Docker

1. Start the database:
   ```bash
   docker run --name uptime-db -e POSTGRES_USER=uptime -e POSTGRES_PASSWORD=uptime -e POSTGRES_DB=uptime -p 5432:5432 -v uptime-db-data:/var/lib/postgresql/data -d postgres:17
   ```
2. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
The API runs on `http://localhost:8080`. Flyway creates the database schema on startup.

## Roadmap
- [x] Project setup, PostgreSQL, Flyway migrations
- [ ] CRUD REST API for monitors
- [ ] Scheduled HTTP checks and check history
- [ ] Alerts when a monitor goes down
- [ ] Spring Security + JWT
- [ ] Unit and integration tests (JUnit 5, Mockito, Testcontainers)
- [ ] Docker Compose
- [ ] CI with GitHub Actions