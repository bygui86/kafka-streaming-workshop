package dev.daniellavoie.demo.kstream.topic;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("topics.transaction-request")
public class TransactionRequestConfiguration extends TopicConfiguration {

}
