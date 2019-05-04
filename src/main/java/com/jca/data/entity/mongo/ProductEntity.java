package com.jca.data.entity.mongo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.jca.data.entity.IProductEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "productos")
public class ProductEntity implements IProductEntity{
	
	@Id
	private String id;
	
	@Field(value="usuario_registro")
	private String usuarioRegistro;
	
	@Field(value = "precio_br")
	private BigDecimal precioBr;
	
	@Field(value = "precio_col")
	private BigDecimal precioCol;
	
	private Integer cantidad;
	
	@Field(value = "fecha_registro")
	private Date fechaRegistro;
	
	private String descripcion;
	private String nombre;
	
	@Field(value = "mes_registro")
	private Integer mesRegistro;

}
