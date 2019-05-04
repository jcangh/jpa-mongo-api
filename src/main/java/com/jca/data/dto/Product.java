package com.jca.data.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Product {

	private String id;
	private String usuarioRegistro;
	private BigDecimal precioBr;
	private BigDecimal precioCol;
	private Integer cantidad;
	private Date fechaRegistro;
	private String descripcion;
	private String nombre;
	private Integer mesRegistro;
}
