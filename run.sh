#!/usr/bin/env bash

for pb in 3.1.0 3.3.1 3.5.1 3.7.1 3.8.0 3.9.2 3.11.0; do 
    export PB=$pb
    sbt clean "jmh:run -i 5 -wi 5 -f1 -t1 -r 1 -w 1 -bm avgt -tu ns -rff /tmp/$pb.csv"
done
