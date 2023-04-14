#!/bin/bash
echo 开始执行
./gradlew publishToMavenLocal -PflavorName=first

./gradlew publishToMavenLocal -PflavorName=second

echo 结束执行