package controller.beans.producto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

import controller.beans.proveedor.Proveedor;


@Service
public class ProductoT {

	
	private Long id;
	
    private String nombre;
	
    private BigDecimal peso;
	
	private String sabor;
	
	private String web;
	
	private BigDecimal precio;
	
	private Proveedor idProveedor;
	
	public ProductoT() {
		super();
	}

	

	public ProductoT(Long id, String nombre, BigDecimal peso, String sabor, String web, BigDecimal precio,
			Proveedor idProveedor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.peso = peso;
		this.sabor = sabor;
		this.web = web;
		this.precio = precio;
		this.idProveedor = idProveedor;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public BigDecimal getPeso() {
		return peso;
	}



	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}



	public String getSabor() {
		return sabor;
	}



	public void setSabor(String sabor) {
		this.sabor = sabor;
	}



	public String getWeb() {
		return web;
	}



	public void setWeb(String web) {
		this.web = web;
	}



	public BigDecimal getPrecio() {
		return precio;
	}



	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}



	public Proveedor getIdProveedor() {
		return idProveedor;
	}



	public void setIdProveedor(Proveedor idProveedor) {
		this.idProveedor = idProveedor;
	}
	
	public Producto parseEntity() {
		return new Producto(id, nombre, peso, sabor, web, precio, idProveedor);
	}
    

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoT other = (ProductoT) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
    
    
    
    
}
