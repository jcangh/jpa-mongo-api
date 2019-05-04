package com.jca.data.entity;

import java.math.BigDecimal;
import java.util.Date;

public interface IProductEntity {
	
	String getId();
	
	void setId(String id);
	
	String getUsuarioRegistro();
	
	void setUsuarioRegistro(String string);
	
	BigDecimal getPrecioBr();
	
	void setPrecioBr(BigDecimal precio);
	
	BigDecimal getPrecioCol();
	
	void setPrecioCol(BigDecimal precio);
	
	Integer getCantidad();
	
	void setCantidad(Integer cantidad);
	
	Date getFechaRegistro();
	
	void setFechaRegistro(Date fecha);
	
	String getDescripcion();
	
	void setDescripcion(String descripcion);
	
	String getNombre();
	
	void setNombre(String nombre);
	
	Integer getMesRegistro();
	
	void setMesRegistro(Integer mes);

}
