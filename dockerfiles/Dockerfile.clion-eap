FROM java:openjdk-8u66-jdk
MAINTAINER zchee <zcheeee@gmail.com>

ENV JAVA_VERSION openjdk-8u66-jdk
ENV APP_NAME CLion
ENV VERSION 1.5
ENV BUILD 144.2608.6

RUN curl -LO http://download-cf.jetbrains.com/cpp/$APP_NAME-$BUILD.tar.gz
RUN tar xf $APP_NAME-$BUILD.tar.gz

RUN mkdir jar
WORKDIR jar
RUN jar xf ../clion-$BUILD/lib/clion.jar

RUN curl -L https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/properties/darcula.properties > ./com/intellij/ide/ui/laf/darcula/darcula.properties
RUN jar cf ../clion.jar .

WORKDIR /

CMD ["cat", "clion.jar"]
