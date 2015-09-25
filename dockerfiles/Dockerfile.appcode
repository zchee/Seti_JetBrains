FROM java:openjdk-8u66-jdk
MAINTAINER zchee <zcheeee@gmail.com>

RUN java -version
ENV JAVA_VERSION oracle-java8
ENV APPCODE_VERSION 142.4859.15

RUN apt-get update && apt-get -y install p7zip-full
RUN curl -LO http://download.jetbrains.com/objc/AppCode-$APPCODE_VERSION-custom-jdk-bundled.dmg
RUN 7z x AppCode-$APPCODE_VERSION-custom-jdk-bundled.dmg
RUN 7z x 4.hfs

RUN mkdir jar
WORKDIR jar
RUN ls -la ../
RUN jar xf ../AppCode\ EAP/AppCode\ EAP.app/Contents/lib/appcode.jar 

RUN curl -L https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/properties/darcula.properties > ./com/intellij/ide/ui/laf/darcula/darcula.properties
RUN jar cf ../appcode.jar .

WORKDIR /

CMD ["cat", "appcode.jar"]
