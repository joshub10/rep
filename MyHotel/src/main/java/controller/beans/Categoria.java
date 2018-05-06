package controller.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categorias database table.
 * 
 */
@Entity
@Table(name="categorias")
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nombre;

	//bi-directional many-to-many association to Clas
	@ManyToMany(mappedBy="categorias")
	private List<Clas> clases;

	//bi-directional many-to-many association to Proveedore
	@ManyToMany(mappedBy="categorias")
	private List<Proveedore> proveedores;

	public Categoria() {
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

	public List<Clas> getClases() {
		return this.clases;
	}

	public void setClases(List<Clas> clases) {
		this.clases = clases;
	}

	public List<Proveedore> getProveedores() {
		return this.proveedores;
	}

	public void setProveedores(List<Proveedore> proveedores) {
		this.proveedores = proveedores;
	}

}