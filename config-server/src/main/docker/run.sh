#!/bin/sh

echo "********************************************************"
echo "Waiting for the eureka server to start on port $EUREKASERVER_PORT"
echo "********************************************************"
while ! `nc -z eurekaserver $EUREKASERVER_PORT`; do sleep 3; done
echo ">>>>>>>>>>>> Eureka Server has started"

echo "********************************************************"
echo "Starting Configuration Service with Eureka Endpoint:  $EUREKASERVER_URI";
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom                                    \
     -Deureka.client.serviceUrl.defaultZone=$EUREKASERVER_URI                   \
     -Deureka.instance.ip-address=$DOCKER_IP									\
     -Dgraylog.host=$GRAYLOG_HOST                                         		\
     -Dgraylog.port=$GRAYLOG_PORT                                         		\
     -jar /usr/local/config-server/@project.build.finalName@.jar