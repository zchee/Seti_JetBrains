FROM java:openjdk-8u66-jdk
MAINTAINER zchee <zcheeee@gmail.com>

ENV JAVA_VERSION openjdk-8u66-jdk
ENV APP_NAME idea-eap
ENV VERSION 15
ENV BUILD 142.4675.3

RUN curl -LO https://download.jetbrains.com/idea/ideaIU-$BUILD.tar.gz
RUN tar xf ideaIU-$BUILD.tar.gz

RUN cp idea-IU-$BUILD/lib/idea.jar ./
RUN mkdir jar
WORKDIR jar
RUN jar xf ../idea.jar

RUN curl -L https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/properties/darcula.properties > ./com/intellij/ide/ui/laf/darcula/darcula.properties
RUN jar cf ../idea.jar .

WORKDIR /

CMD ["cat", "idea.jar"]
