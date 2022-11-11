FROM openjdk:8-jdk-alpine
MAINTAINER andre1442 <andremm73@gmail.com>
RUN mkdir -p /app
WORKDIR /app

COPY diskon.java /app

#compile file java
RUN javac diskon.java

#running java
CMD ["java","diskon"]
