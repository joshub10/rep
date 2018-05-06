package controller.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the columnas database table.
 * 
 */
@Entity
@Table(name="columnas")
@NamedQuery(name="Columna.findAll", query="SELECT c FROM Columna c")
public class Columna implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nombre;

	//bi-directional many-to-many association to Producto
	@ManyToMany(mappedBy="columnas")
	private List<Producto> productos;

	public Columna() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}