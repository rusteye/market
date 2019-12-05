package com.tf.market;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "svc")
@Data
public class SvcUrlProperties {
    private String goods;
}