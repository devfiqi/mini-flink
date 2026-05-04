package com.devfiqi.pipeline;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class AnomalyDetectionJob {

    public static void main(String[] args) throws Exception {

        // 1. Get the Flink execution environment
        StreamExecutionEnvironment env =
            StreamExecutionEnvironment.getExecutionEnvironment();

        // 2. TODO: add Kafka source
        // 3. TODO: add sliding window
        // 4. TODO: add anomaly detection
        // 5. TODO: add Kafka sink

        env.execute("AnomalyDetectionJob");
    }
}