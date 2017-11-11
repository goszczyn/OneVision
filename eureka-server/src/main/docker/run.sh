#!/bin/sh
echo "********************************************************"
echo "Starting the Eureka Server"
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom 					          \
     -Deureka.serviceUrl.defaultZone=$EUREKASERVER_URI            		  \
     -Dgraylog.host=$GRAYLOG_HOST                                         \
     -Dgraylog.port=$GRAYLOG_PORT                                         \
     -jar /usr/local/eureka-server/@project.build.finalName@.jar
	 
