A Benchmark for protobuf-java.

See https://github.com/protocolbuffers/protobuf/issues/6977

Demonstrates a regression in CodedOutputStream.writeInt32NoTag between 3.7.1 and 3.8.0.

Use `run.sh` to create CSV files for multiple protobuf versions.

To run for a single version:

    PB=3.7.1 sbt clean "jmh:run -i 5 -wi 5 -f1 -t1 -r 1 -w 1 -bm avgt -tu ns"
