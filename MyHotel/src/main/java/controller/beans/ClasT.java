package controller.beans;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import java.util.List;


/**
 * The persistent class for the clases database table.
 * 
 */
@Service
public class ClasT implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String nombre;

	private List<Categoria> categorias;

	private List<Producto> productos;

	public ClasT() {
	}
	

	public ClasT(int id, String nombre, List<Categoria> categorias, List<Producto> productos) {
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

	public Clas parseEntity() {
		return new Clas(id, nombre, categorias, productos);
	}
}