package com.microservices.demo.twitter.to.kafka.service.runner.impl;

import com.microservices.demo.twitter.to.kafka.service.runner.StreamRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "twitter-to-kafka-service.enable-mock-tweets", havingValue = "false")
public class TwitterKafkaStreamRunner implements StreamRunner {
    private static final Logger LOG = LoggerFactory.getLogger(TwitterKafkaStreamRunner.class);

    @Override
    public void start() {
        LOG.info("Implement TwitterKafkaStreamRunner!");
    }
}
