package com.module.sales.broker;

import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

public class BrokerConfig {
	
	 @Bean 
	  public KafkaAdmin admin() {
	    return new KafkaAdmin(Map.of(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"));
	  }

	  @Bean
	  public NewTopic topic1() {
	    return TopicBuilder.name("record_processor")
	        .partitions(5)
	        .replicas(1)
	        .compact()
	        .build();
	  }
	  

}
