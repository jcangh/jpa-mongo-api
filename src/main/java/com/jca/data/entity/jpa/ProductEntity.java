package com.jca.data.entity.jpa;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jca.data.entity.IProductEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity implements IProductEntity {

	@Id
	private String id;
	private String usuarioRegistro;
	private BigDecimal precioBr;
	private BigDecimal precioCol;
	private Integer cantidad;
	private Date fechaRegistro;
	private String descripcion;
	private String nombre;
	private Integer mesRegistro;
	
	public ProductEntity() {
		this.id = UUID.randomUUID().toString();
	}
	
}
