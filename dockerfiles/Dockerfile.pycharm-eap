FROM java:openjdk-8u66-jdk
MAINTAINER zchee <zcheeee@gmail.com>

ENV JAVA_VERSION openjdk-8u66-jdk
ENV APP_NAME pycharm-eap
ENV VERSION 4.5.4
ENV BUILD 141.2569

RUN curl -LO http://download.jetbrains.com/python/pycharm-professional-$BUILD.tar.gz
RUN tar xf pycharm-professional-$BUILD.tar.gz

RUN mkdir jar
WORKDIR jar
RUN jar xf ../pycharm-$VERSION/lib/pycharm.jar

RUN curl -L https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/properties/darcula.properties > ./com/intellij/ide/ui/laf/darcula/darcula.properties
RUN jar cf ../pycharm.jar .

WORKDIR /

CMD ["cat", "pycharm.jar"]
