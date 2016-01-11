FROM java:openjdk-8u66-jdk
MAINTAINER zchee <zcheeee@gmail.com>

ENV JAVA_VERSION openjdk-8u66-jdk
ENV APP_NAME clion
ENV VERSION 1.2.4
ENV BUILD 143.1186.2

RUN curl -LO https://download.jetbrains.com/cpp/$APP_NAME-$VERSION.tar.gz
RUN tar xf $APP_NAME-$VERSION.tar.gz

RUN mkdir jar
WORKDIR jar
RUN jar xf ../clion-$VERSION/lib/clion.jar

RUN curl -L https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/properties/darcula.properties > ./com/intellij/ide/ui/laf/darcula/darcula.properties
RUN jar cf ../clion.jar .

WORKDIR /

CMD ["cat", "clion.jar"]
