# Flyway

Flyway is a database migration tool that helps manage version control for your database schema. It allows you to define database changes as scripts and automatically apply them in a controlled manner when your application starts.

2️⃣ How Flyway Works in Spring Boot
Flyway automatically looks for SQL migration scripts in src/main/resources/db/migration/ when your application starts.
Scripts follow a naming convention like V1**init.sql, V2**add_users.sql, etc.
Flyway tracks which migrations have been applied using a table called flyway_schema_history in your database.

5️⃣ Key Features of Flyway
✅ Version Control – Keeps track of applied migrations.
✅ Auto-Migration – Runs scripts automatically when the app starts.
✅ Rollback Support – Manages schema versions efficiently.
✅ Database Support – Works with PostgreSQL, MySQL, Oracle, etc.
