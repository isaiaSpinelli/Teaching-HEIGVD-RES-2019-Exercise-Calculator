#!/bin/bash

# Ask maven to build the executable jar file from the source files
cp ../Calculator/src/client.java .

# Copy the executable jar file in the current directory


# Build the Docker image locally
docker build --tag java-streaming-client .