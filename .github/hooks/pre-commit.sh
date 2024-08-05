#!/bin/sh

# Ensure the SonarCloud token is set
if [ -z "$SONAR_TOKEN" ]; then
  echo "Error: SONAR_TOKEN is not set. Please set it before committing."
  exit 1
fi

# Run SonarLint analysis
mvn sonar:sonar -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=$SONAR_TOKEN

# Check the result and prevent commit if analysis fails
if [ $? -ne 0 ]; then
  echo "SonarLint analysis failed. Please fix the issues before committing."
  exit 1
fi
