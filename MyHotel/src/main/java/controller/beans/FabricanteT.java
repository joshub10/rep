package controller.beans;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.stereotype.Service;

import java.util.List;


/**
 * The persistent class for the fabricantes database table.
 * 
 */
@Service
public class FabricanteT implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String email;

	private String foto;

	private String nombre;

	private List<Proveedore> proveedores;

	private List<Producto> productos;

	public FabricanteT() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Proveedore> getProveedores() {
		return this.proveedores;
	}

	public void setProveedores(List<Proveedore> proveedores) {
		this.proveedores = proveedores;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setFabricante(null);

		return producto;
	}
	public Fabricante parseEntity() {
		// TODO Auto-generated method stub
		return new Fabricante(id, email, foto, nombre, proveedores, productos);
	}

}