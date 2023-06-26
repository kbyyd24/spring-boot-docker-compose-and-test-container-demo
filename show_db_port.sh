#!/bin/sh

docker-compose ps db | awk 'NR==2{print $11}' | cut -d':' -f2 | cut -d'-' -f1
