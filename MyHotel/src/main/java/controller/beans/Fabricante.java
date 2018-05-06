package controller.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the fabricantes database table.
 * 
 */
@Entity
@Table(name="fabricantes")
@NamedQuery(name="Fabricante.findAll", query="SELECT f FROM Fabricante f")
public class Fabricante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String email;

	private String foto;

	private String nombre;

	//bi-directional many-to-many association to Proveedore
	@ManyToMany
	@JoinTable(
		name="proveedor_fabricante"
		, joinColumns={
			@JoinColumn(name="id_fabricante")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_proveedor")
			}
		)
	private List<Proveedore> proveedores;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="fabricante")
	private List<Producto> productos;

	public Fabricante() {
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

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setFabricante(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setFabricante(null);

		return producto;
	}

}