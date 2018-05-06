package controller.beans;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class CompraT implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String descripcion;

	private Date fecha;

	private List<Producto> productos;

	public CompraT() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public Compra parseEntity() {
		// TODO Auto-generated method stub
		return new Compra(id, descripcion, fecha, productos);
	}

}