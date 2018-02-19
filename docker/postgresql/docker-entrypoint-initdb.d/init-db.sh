#!/bin/bash

set -eu

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE DATABASE workmandb;
    GRANT ALL PRIVILEGES ON DATABASE workmandb TO workmanuser;
EOSQL
