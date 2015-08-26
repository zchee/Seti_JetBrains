#!/bin/bash
set -x

echo "Parse git log..."
APP=`git log --oneline -1 --grep="\[" | awk '{print$2}' | sed 's/^\[\(.\+\)\/\(.\+\)\]/\1/g'`
VERSION=`git log --oneline -1 --grep="\[" | awk '{print$2}' | sed 's/^\[\(.\+\)\/\(.\+\)\]/\2/g'`

echo "Init github env..."
git config --global user.name "zchee"
git config --global user.email "zcheeee@gmail.com"

echo "Push jar..."
git add theme/$APP/$APP.jar
git commit -m "Push $APP build $VERSION jar by CircleCI [ci skip]"
git push origin circleci
