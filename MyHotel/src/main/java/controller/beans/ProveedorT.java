package controller.beans;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Service;

import controller.beans.Proveedore;

@Service
public class ProveedorT {

	private int id;

	private String nombre;

	private String web;

	//bi-directional many-to-many association to Fabricante
	@ManyToMany(mappedBy="proveedores")
	private List<Fabricante> fabricantes;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="proveedore")
	private List<Producto> productos;

	//bi-directional many-to-many association to Categoria
	@ManyToMany
	@JoinTable(
		name="proveedores_categorias"
		, joinColumns={
			@JoinColumn(name="id_proveedor")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_categoria")
			}
		)
	private List<Categoria> categorias;

	public ProveedorT() {
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

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public List<Fabricante> getFabricantes() {
		return this.fabricantes;
	}

	public void setFabricantes(List<Fabricante> fabricantes) {
		this.fabricantes = fabricantes;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setProveedore(null);

		return producto;
	}

	public List<Categoria> getCategorias() {
		return this.categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Proveedore parseEntity() {
		// TODO Auto-generated method stub
		return new Proveedore(id, nombre, web, fabricantes, productos, categorias);
	}
}
