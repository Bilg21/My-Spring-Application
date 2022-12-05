#!/bin/bash

./mvnw package && docker build -t bilg/my-spring-application ../
