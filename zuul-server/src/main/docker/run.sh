#!/bin/sh

echo "********************************************************"
echo "Waiting for the eureka server to start on port $EUREKASERVER_PORT"
echo "********************************************************"
while ! `nc -z eurekaserver  $EUREKASERVER_PORT`; do sleep 3; done
echo "******* Eureka Server has started"

echo "********************************************************"
echo "Waiting for the configuration server to start on port $CONFIGSERVER_PORT"
echo "********************************************************"
while ! `nc -z configserver $CONFIGSERVER_PORT`; do sleep 3; done
echo "*******  Configuration Server has started"

echo "********************************************************"
echo "Starting Zuul Service with Eureka $EUREKASERVER_URI"
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom                            \
     -Deureka.client.serviceUrl.defaultZone=$EUREKASERVER_URI           \
     -Deureka.instance.ip-address=$DOCKER_IP                            \
     -Dgraylog.host=$GRAYLOG_HOST                                       \
     -Dgraylog.port=$GRAYLOG_PORT                                       \
     -jar /usr/local/zuul-server/@project.build.finalName@.jar
