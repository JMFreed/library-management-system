# Library Management System

## Setup

```bash
# Pull postgres Docker image
export POSTGRES_VERSION=14.5
docker pull postgres:${POSTGRES_VERSION}
# Run postgres instance
docker run --detach --restart=always --name postgres -e POSTGRES_PASSWORD=password -p 5432:5432 postgres:${POSTGRES_VERSION}
# Enter container
docker exec -ti postgres psql -U postgres
# create database and user
CREATE DATABASE library;
CREATE USER library WITH PASSWORD 'password123';
# Grant permissions
GRANT CONNECT ON DATABASE library TO library;
GRANT ALL PRIVILEGES ON DATABASE library TO library;
# Run application
mvn spring-boot:run
```
