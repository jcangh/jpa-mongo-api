package com.jca.data.entity.mongo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.jca.data.entity.IProductEntity;

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

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getUsuarioRegistro() {
		return this.usuarioRegistro;
	}

	@Override
	public void setUsuarioRegistro(String string) {
		this.usuarioRegistro = string;
	}

	@Override
	public BigDecimal getPrecioBr() {
		return this.precioBr;
	}

	@Override
	public void setPrecioBr(BigDecimal precio) {
		this.precioBr = precio;
	}

	@Override
	public BigDecimal getPrecioCol() {
		return this.precioCol;
	}

	@Override
	public void setPrecioCol(BigDecimal precio) {
		this.precioCol = precio;
	}

	@Override
	public Integer getCantidad() {
		return this.cantidad;
	}

	@Override
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	@Override
	public void setFechaRegistro(Date fecha) {
		this.fechaRegistro = fecha;
	}

	@Override
	public String getDescripcion() {
		return this.descripcion;
	}

	@Override
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Integer getMesRegistro() {
		return this.mesRegistro;
	}

	@Override
	public void setMesRegistro(Integer mes) {
		this.mesRegistro = mes;
	}

}
