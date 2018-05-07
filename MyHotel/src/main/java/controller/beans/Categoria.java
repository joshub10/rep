package controller.beans;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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
	@ManyToMany(mappedBy="categorias",fetch=FetchType.EAGER ,cascade=CascadeType.ALL)
	private Set<Clas> clases=new HashSet<>();

	//bi-directional many-to-many association to Proveedore
	@ManyToMany(mappedBy="categorias",fetch=FetchType.EAGER)
	private Set<Proveedore> proveedores=new HashSet<>();

	public Categoria() {
		clases=new HashSet<>();

		proveedores=new HashSet<>();
	}
	
	

	public Categoria(int id, String nombre, Collection<Clas> clases, Collection<Proveedore> proveedores) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clases = new HashSet<>(clases);
		this.proveedores = new HashSet<>(proveedores);
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

	public Set<Clas> getClases() {
		return clases == null ?  new  HashSet<>() : this.clases;
	}

	public void setClases(Set<Clas> clases) {
		this.clases = clases;
	}

	public Set<Proveedore> getProveedores() {
		return proveedores == null ?  new  HashSet<>() : this.proveedores;
	}

	public void setProveedores(Set<Proveedore> proveedores) {
		this.proveedores = proveedores;
	}

}