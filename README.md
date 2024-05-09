# Library Management System

## Setup

```bash
# Pull postgres Docker image
export POSTGRES_VERSION=14.5
docker pull postgres:${POSTGRES_VERSION}
# Run postgres instance
docker run --detach --name postgres -e POSTGRES_PASSWORD=password -p 5432:5432 postgres:${POSTGRES_VERSION}
# Check
docker exec -ti postgres psql -U postgres
# Run application
mvn spring-boot:run
```
