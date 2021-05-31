# Mealy Service

## Start development dependencies with Docker / Docker Compose

1. In the CLI navigate to root folder of this project (where the file `docker-compose.yml` is located)
2. Run `docker-compose -f docker-compose.develop.yml up`

## Run on local machine

- Spring Boot should be started with active profile `development` to prevent CORS issues with the frontend
