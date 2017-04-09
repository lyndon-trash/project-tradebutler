# Setup

## Lombok
- for IntelliJ users, install the [Lombok Plugin](https://plugins.jetbrains.com/plugin/6317-lombok-plugin)

## Database
```properties
url = localhost
port = 5432
database = tradebutler_data_core_dev
username = tradebutler
password = tradebutlersecret
```
- create user
```sql
-- postgres started using the term 'role' around version 9.x
CREATE ROLE tradebutler PASSWORD 'tradebutlersecret'
   VALID UNTIL 'infinity';
   
-- in case the default user create has no login permission
ALTER ROLE tradebutler WITH LOGIN;
```
- create database
```sql
CREATE DATABASE tradebutler_data_core_dev
  WITH ENCODING='UTF8'
       OWNER=tradebutler
       CONNECTION LIMIT=-1
       TABLESPACE=pg_default;
```

###### Resources
- [Create User](https://www.postgresql.org/docs/current/static/database-roles.html)
