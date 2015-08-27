#!/bin/bash
set -x

echo "Parse git log..."
APP=`git log --oneline -1 | grep "\[" | awk '{print$2}' | sed 's/^\[\(.\+\)\/\(.\+\)\]/\1/g'`
VERSION=`git log --oneline -1 | grep "\[" | awk '{print$2}' | sed 's/^\[\(.\+\)\/\(.\+\)\]/\2/g'`
MESSAGE=`git log --oneline -1 | grep "\[" | awk '{$1="";$2="";$3="";$5="";print $0}' | sed 's/^   //g' | sed 's/  / /g'`

if [ $APP ]; then
  JAVA_VERSION=`sudo docker run -ti java java -version | awk 'NR==1 {print$0}'`
  github-release release -u zchee -r Seti_JetBrains -t "$APP/$VERSION" -n "$MESSAGE" -d "Build in Docker container with $JAVA_VERSION"
  github-release upload -u zchee -r Seti_JetBrains -t "$APP/$VERSION" -n "$APP.jar" -f $APP.jar
fi
