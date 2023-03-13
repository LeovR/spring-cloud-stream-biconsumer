package com.example.springcloudstream.biconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.function.BiConsumer;

@Service
public class BodyConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(BodyConsumer.class);

    @Bean
    public BiConsumer<Body, Map<String, Object>> messageConsumer() {
        return (message, header) -> LOGGER.info("Message {}. Header {}.", message, header);
    }
}
