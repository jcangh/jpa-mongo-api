package com.jca.data.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jca.data.entity.mongo.ProductEntity;

@Repository
public interface ProducMongotDao extends MongoRepository<ProductEntity, String>{

}
