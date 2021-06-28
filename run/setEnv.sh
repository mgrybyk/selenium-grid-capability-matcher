#!/bin/bash

# 3.141.59
seleniumMajorVersion=3.141
seleniumMinorVersion=59
seleniumVersion=$seleniumMajorVersion.$seleniumMinorVersion

seleniumServerBinary=selenium-server-standalone
seleniumServerJar=$seleniumServerBinary-$seleniumVersion.jar

capabilityMatcherJar=grid-capability-matcher-$seleniumVersion.jar
