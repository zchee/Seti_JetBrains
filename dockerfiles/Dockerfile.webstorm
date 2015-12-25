FROM java:openjdk-8u66-jdk
MAINTAINER zchee <zcheeee@gmail.com>

ENV APP_NAME webstorm
ENV VERSION 11.0.3
ENV BUILD 143.1559.5

RUN curl -LO https://download.jetbrains.com/webstorm/WebStorm-$VERSION.tar.gz && \
	tar xf WebStorm-$VERSION.tar.gz

RUN mkdir jar && cd jar && \
	jar xf ../WebStorm-$BUILD/lib/webstorm.jar && \
	curl -L "https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/properties/darcula.properties" > ./com/intellij/ide/ui/laf/darcula/darcula.properties && \
	jar c0f ../webstorm.jar .

CMD ["cat", "webstorm.jar"]
