#!/bin/bash

. ./setEnv.sh

javaClasses="$seleniumServerJar:$capabilityMatcherJar"

java -cp $javaClasses org.openqa.grid.selenium.GridLauncherV3 -role hub -hubConfig hubconfig.json

# Debug config
# java -Dselenium.LOGGER.level=ALL -jar ./$seleniumServerJar -role hub
# java -Dselenium.LOGGER.level=ALL -cp $javaClasses org.openqa.grid.selenium.GridLauncherV3 -role hub -hubConfig hubconfig.json
