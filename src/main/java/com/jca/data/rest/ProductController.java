package com.jca.data.rest;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jca.data.entity.mongo.ProductEntity;
import com.jca.data.service.ProductService;

@RestController
@RequestMapping("v1/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping(path = "/{product-id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ProductEntity> getProduct(@PathVariable("product-id") String productId){
		return ResponseEntity.ok(service.getById(productId));
	}
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ProductEntity> create(@RequestBody ProductEntity product){
		String productId = service.create(product);
		ProductEntity created = service.getById(productId);
		URI location  = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(created.getId()).toUri();
		return ResponseEntity.created(location).body(created);
	}

}
