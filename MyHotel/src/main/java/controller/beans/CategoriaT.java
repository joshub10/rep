package controller.beans;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.stereotype.Service;

import java.util.List;


/**
 * The persistent class for the categorias database table.
 * 
 */
@Service
public class CategoriaT implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String nombre;

	private List<Clas> clases;

	private List<Proveedore> proveedores;

	public CategoriaT() {
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
	public Categoria parseEntity() {
		return new Categoria(id, nombre, clases, proveedores);
	}

}