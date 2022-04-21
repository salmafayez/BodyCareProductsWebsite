FROM tomcat:10.1.0-jdk11-temurin

MAINTAINER "Salma Fayez Himida"

EXPOSE 8080

# RUN rm -rf /usr/local/tomcat/webapps
#
# RUN mv  /usr/local/tomcat/webapps.dist  /usr/local/tomcat/webapps
#
# RUN rm -rf /usr/local/tomcat/webapps/*

COPY ./target/BodyCareProducts-1.0-SNAPSHOT.war   /usr/local/tomcat/webapps/docker

CMD ["catalina.sh","run"]