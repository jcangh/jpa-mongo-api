package com.jca.data.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jca.data.dao.ProducMongotDao;
import com.jca.data.dao.ProductJpaDao;
import com.jca.data.dto.Product;
import com.jca.data.entity.mongo.ProductEntity;
import com.jca.data.mapper.ProductMapper;

@Service
public class ProductService {
	
	@Autowired
	private ProducMongotDao productDaoMongo;
	
	@Autowired
	private ProductJpaDao productDaoJpa;
	
	
	@Autowired
	private ProductMapper mapper;
	
	public ProductEntity getById(String id) {
		ProductEntity mongoEntity = 
				productDaoMongo
				.findById(id).get();
				
		return mongoEntity;
	}
	
	@Transactional
	public void create(Product product) {
		
		com.jca.data.entity.jpa.ProductEntity jpaEntity = mapper.toJpaProductEntity(product);
		com.jca.data.entity.mongo.ProductEntity mongoEntity = mapper.toMongoProductEntity(product);
		
		productDaoMongo.save(mongoEntity);
		productDaoJpa.save(jpaEntity);
	}

}
