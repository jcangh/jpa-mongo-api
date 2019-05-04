package com.jca.data.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jca.data.dto.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	
	
	com.jca.data.entity.mongo.ProductEntity toMongoProductEntity(Product product);
	
	@Mapping(target = "id", ignore = true)
	com.jca.data.entity.jpa.ProductEntity toJpaProductEntity(Product product);
	
	Product toProduct(com.jca.data.entity.mongo.ProductEntity productEntity);
	
	Product toProduct(com.jca.data.entity.jpa.ProductEntity productEntity);

}
