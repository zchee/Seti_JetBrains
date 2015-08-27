FROM java:openjdk-8u66-jdk
MAINTAINER zchee <zcheeee@gmail.com>

ENV JAVA_VERSION openjdk-8u66-jdk
ENV APP_NAME android-studio-ide
ENV VERSION 1.3.2.0
ENV BUILD 141.2178183
ENV JAR idea
ENV EXTRACT_DIR android-studio

RUN curl -LO https://dl.google.com/dl/android/studio/ide-zips/$VERSION/$APP_NAME-$BUILD-linux.zip
RUN unzip $APP_NAME-$BUILD-linux.zip

RUN mkdir jar
WORKDIR jar
RUN jar xf ../$EXTRACT_DIR/lib/$JAR.jar

RUN curl -L https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/properties/darcula.properties > ./com/intellij/ide/ui/laf/darcula/darcula.properties
RUN jar cf ../androidstudio.jar .

WORKDIR /

CMD ["cat", "androidstudio.jar"]
