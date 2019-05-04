package com.jca.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jca.data.entity.jpa.ProductEntity;

@Repository
public interface ProductJpaDao extends JpaRepository<ProductEntity, String>{

}
