FROM java:openjdk-8u66-jdk
MAINTAINER zchee <zcheeee@gmail.com>

ENV JAVA_VERSION openjdk-8u66-jdk
ENV APP_NAME rubymine
ENV VERSION 7.1.4
ENV BUILD 141.1835

RUN curl -LO http://download.jetbrains.com/ruby/RubyMine-$VERSION.tar.gz
RUN tar xf RubyMine-$VERSION.tar.gz 

RUN mkdir jar
WORKDIR jar
RUN jar xf ../RubyMine-$VERSION/lib/rubymine.jar

RUN curl -L https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/properties/darcula.properties > ./com/intellij/ide/ui/laf/darcula/darcula.properties
RUN jar cf ../rubymine.jar .

WORKDIR /

CMD ["cat", "rubymine.jar"]
