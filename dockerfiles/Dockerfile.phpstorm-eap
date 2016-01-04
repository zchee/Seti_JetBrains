FROM java:openjdk-8u66-jdk
MAINTAINER zchee <zcheeee@gmail.com>

ENV JAVA_VERSION openjdk-8u66-jdk
ENV APP_NAME phpstorm-eap
ENV VERSION 10.0.2
ENV BUILD 143.1480

RUN curl -LO "http://download.jetbrains.com/webide/PhpStorm-EAP-$BUILD.tar.gz" && \
	tar xf PhpStorm-EAP-$BUILD.tar.gz && \
	mkdir jar && \
	cd jar && \
	jar xf ../PhpStorm-$BUILD/lib/phpstorm.jar && \
	curl -L "https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/properties/darcula.properties" > ./com/intellij/ide/ui/laf/darcula/darcula.properties && \
	jar cf ../phpstorm.jar .

CMD ["cat", "phpstorm.jar"]
