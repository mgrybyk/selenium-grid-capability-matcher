#!/bin/bash

. ./setEnv.sh

curl -sLO https://selenium-release.storage.googleapis.com/$seleniumMajorVersion/$seleniumServerBinary-$seleniumVersion.jar
chmod +x $seleniumServerBinary*.jar
