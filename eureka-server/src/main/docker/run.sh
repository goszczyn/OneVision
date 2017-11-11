#!/bin/sh
echo "********************************************************"
echo "Starting the Eureka Server"
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom 					          \
     -Deureka.serviceUrl.defaultZone=$EUREKASERVER_URI            		  \
     -jar /usr/local/eureka-server/@project.build.finalName@.jar
	 
