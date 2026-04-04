# menu

## PostgreSQL connection

The project is configured to use PostgreSQL via Spring Data JPA.

Default values in configuration:

- `DB_URL=jdbc:postgresql://localhost:5432/menu_db`
- `DB_USERNAME=postgres`
- `DB_PASSWORD=postgres`

You can override them with environment variables before starting the app.

Example:

```bash
export DB_URL=jdbc:postgresql://localhost:5432/menu_db
export DB_USERNAME=postgres
export DB_PASSWORD=postgres
./mvnw spring-boot:run
```