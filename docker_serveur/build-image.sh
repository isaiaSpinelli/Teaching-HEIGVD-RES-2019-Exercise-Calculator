#!/bin/bash


# Copy the executable jar file in the current directory
cp ../Calculator_serveur/src/MultiThreadedServer.java .

# Build the Docker image locally
docker build --tag java-server-calculator .