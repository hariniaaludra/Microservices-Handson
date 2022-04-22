package com.module2.sales.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.module2.sales.consumer.model.SalesOrder;
@Repository
public interface MongodbRepo extends MongoRepository<SalesOrder,Long> {

}
