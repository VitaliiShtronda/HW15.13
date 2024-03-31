package org.example.postgresdb;

public class PostgresDBInitService {
    public PostgresDBInitService() {
        new FlywayMigration(
                PropertyReader.getDBURL(),
                PropertyReader.getDBUser(),
                PropertyReader.getDBPassword()
        );
    }
}
