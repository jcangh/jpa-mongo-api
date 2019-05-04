package com.jca.data.dao.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jca.data.entity.mongo.ProductEntity;

@Repository
public interface ProductDao extends MongoRepository<ProductEntity, String>{

}
