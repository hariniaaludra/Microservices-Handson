package com.module2.sales.configuration;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig  {

  @Value("${spring.data.mongodb.uri}")
  private String server;

   

 
    public MongoClient mongoClient() {
        final ConnectionString connectionString = new ConnectionString("server");
        final MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
        return MongoClients.create(mongoClientSettings);
    }

}
