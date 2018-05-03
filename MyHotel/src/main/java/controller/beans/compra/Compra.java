package controller.beans.compra;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import controller.beans.proveedor.Proveedor;



@Entity
@Table(name="compras")
public class Compra {

	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="cantidad")
	private BigDecimal cantidad;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="precio")
	private Long id_producto;
    
//	@OneToMany(fetch=FetchType.EAGER, mappedBy="idProducto", cascade=CascadeType.ALL)
//	private Set<Proveedor> idProducto;

	
	
	
	
	public Compra(Long id, BigDecimal cantidad, Date fecha, Long id_producto, Set<Proveedor> idProducto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.id_producto = id_producto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}
    
	
	
}
