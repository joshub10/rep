package controller.beans;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the clases database table.
 * 
 */
@Entity
@Table(name="clases")
@NamedQuery(name="Clas.findAll", query="SELECT c FROM Clas c")
public class Clas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nombre;

	//bi-directional many-to-many association to Categoria
	@JsonIgnore
	@ManyToMany
	@JoinTable(
		name="categorias_clase"
		, joinColumns={
			@JoinColumn(name="id_tipo")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_categoria")
			}
		)
	private List<Categoria> categorias;

	//bi-directional many-to-many association to Producto
	@JsonIgnore
	@ManyToMany(mappedBy="clases")
	private List<Producto> productos;

	public Clas() {
	}
	
	
	public Clas(int id, String nombre, List<Categoria> categorias, List<Producto> productos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categorias = categorias;
		this.productos = productos;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Categoria> getCategorias() {
		return this.categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}