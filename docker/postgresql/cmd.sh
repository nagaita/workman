#!/bin/bash

set -eu

readonly IMAGE_NAME="workman/postgres"
readonly CONTAINER_NAME="workmanpg"
readonly DB_USER="workmanuser"
readonly DB_NAME="workmandb"
readonly PORT="5432"

case $1 in
    "build")
        docker build -t "$IMAGE_NAME" . ;;
    "run")
        docker run --name "$CONTAINER_NAME" -e POSTGRES_PASSWORD="mysecretpassword" -e POSTGRES_USER="${DB_USER}" -p $PORT:$PORT -d "$IMAGE_NAME" ;;
    "runnd")
        docker run --name "$CONTAINER_NAME" -p $PORT:$PORT "$IMAGE_NAME" ;;
    "psql")
        docker exec -it "$CONTAINER_NAME" psql -h localhost -U postgres ;;
    "bash")
        docker exec -it "$CONTAINER_NAME" bash ;;
    "stop")
        docker stop "$CONTAINER_NAME" ;;
    "rm")
        docker rm "$CONTAINER_NAME" ;;
    *)
        echo "[ERROR] Given argument '$1' does not support."; exit 1 ;;
esac
