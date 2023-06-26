#!/bin/sh

db_port=$(./show_db_port.sh)
export DB_URL="jdbc:postgresql://localhost:$db_port/postgres"

export DB_USERNAME='postgres'
export DB_PASSWORD='password'
