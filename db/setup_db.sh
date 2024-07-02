#!/bin/bash

MYSQL_HOST="localhost"
MYSQL_PORT="3306"
MYSQL_USER="root"
MYSQL_PASSWORD=""
DATABASE_NAME="northwind"

SQL_SCRIPT_1="northwind.sql"
SQL_SCRIPT_2="northwind-data.sql"

# Create database if it doesn't exist
mysql -h $MYSQL_HOST -P $MYSQL_PORT -u $MYSQL_USER -p$MYSQL_PASSWORD -e "CREATE DATABASE IF NOT EXISTS $DATABASE_NAME;"

mysql -h $MYSQL_HOST -P $MYSQL_PORT -u $MYSQL_USER -p$MYSQL_PASSWORD $DATABASE_NAME < $SQL_SCRIPT_1
mysql -h $MYSQL_HOST -P $MYSQL_PORT -u $MYSQL_USER -p$MYSQL_PASSWORD $DATABASE_NAME < $SQL_SCRIPT_2

echo "Database setup complete."
