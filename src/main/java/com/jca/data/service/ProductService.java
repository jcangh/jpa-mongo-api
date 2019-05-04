package com.jca.data.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jca.data.dao.mongo.ProductDao;
import com.jca.data.entity.mongo.ProductEntity;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDaoMongo;
	
	public ProductEntity getById(String id) {
		ProductEntity mongoEntity = 
				productDaoMongo
				.findById(id).get();
				
		return mongoEntity;
	}
	
	public String create(ProductEntity product) {
		productDaoMongo.save(product);
		return product.getId();
	}

}
