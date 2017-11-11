1. Build docker image
mvn docker:build
2. Rund docker image
docker-compose -f config-server-compose.yml up

---------------------------------------------------------------------------
--- Config Server
---------------------------------------------------------------------------
1. Oracle JCE
2. Generate key
keytool -genkeypair -alias cfgServerKey -keyalg RSA -dname "CN=Config Server,OU=Unit,O=Goszczynofabryka,L=Dziekanow,S=Mazowieckie,C=PL" -keypass 1qaz2wsx -keystore server.jks -storepass passwor123 -validity 365


docker exec -t -i docker_eurekaserver_1 sh