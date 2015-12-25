FROM java:openjdk-8u66-jdk
MAINTAINER zchee <zcheeee@gmail.com>

ENV JAVA_VERSION openjdk-8u66-jdk
ENV APP_NAME webstorm
ENV VERSION 11
ENV BUILD 143.1183.13

RUN curl -LO http://download.jetbrains.com/webstorm/WebStorm-EAP-$BUILD.tar.gz
RUN tar xf WebStorm-EAP-$BUILD.tar.gz

RUN mkdir jar
WORKDIR jar
RUN jar xf ../WebStorm-$BUILD/lib/webstorm.jar

RUN curl -L https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/properties/darcula.properties > ./com/intellij/ide/ui/laf/darcula/darcula.properties
RUN jar cf ../webstorm.jar .

WORKDIR /

CMD ["cat", "webstorm.jar"]
