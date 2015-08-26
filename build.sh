#!/bin/bash
set -x

APP=`git log --oneline -1 --grep="\[" | awk '{print$2}' | sed 's/^\[\(.\+\)\/\(.\+\)\]/\1/g'`
VERSION=`git log --oneline -1 --grep="\[" | awk '{print$2}' | sed 's/^\[\(.\+\)\/\(.\+\)\]/\2/g'`

echo $APP
echo $VERSION

docker build -t $APP -f Dockerfile.$APP .
docker run $APP:latest > theme/$APP/$APP.jar

