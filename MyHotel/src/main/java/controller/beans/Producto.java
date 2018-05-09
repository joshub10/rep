package controller.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the productos database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", web=" + web + ", compras="
				+ compras + ", comprasUsuarios=" + comprasUsuarios + ", clases=" + clases + ", columnas=" + columnas
				+ ", fabricante=" + fabricante + ", proveedore=" + proveedore + ", usuarios=" + usuarios + "]";
	}

	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nombre;

	private BigDecimal precio;

	private String web;

	//bi-directional many-to-many association to Compra
	@ManyToMany(mappedBy="productos")
	private List<Compra> compras;

	//bi-directional many-to-one association to ComprasUsuario
	@OneToMany(mappedBy="producto")
	private List<ComprasUsuario> comprasUsuarios;

	//bi-directional many-to-many association to Clas
	@ManyToMany
	@JoinTable(
		name="productos_clases"
		, joinColumns={
			@JoinColumn(name="id_producto")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_clase")
			}
		)
	private List<Clas> clases;

	//bi-directional many-to-many association to Columna
	@ManyToMany
	@JoinTable(
		name="productos_columnas"
		, joinColumns={
			@JoinColumn(name="id_producto")
			}
		, inverseJoinColumns={
			@JoinColumn(name="nombre_columna")
			}
		)
	private List<Columna> columnas;

	//bi-directional many-to-one association to Fabricante
	@ManyToOne
	@JoinColumn(name="id_fabricante")
	private Fabricante fabricante;

	//bi-directional many-to-one association to Proveedore
	@ManyToOne
	@JoinColumn(name="id_proveedor")
	private Proveedore proveedore;

	//bi-directional many-to-many association to Usuario
	@ManyToMany(mappedBy="productos")
	private List<Usuario> usuarios;

	public Producto() {
	}

	public Producto(int id, String nombre, BigDecimal precio, String web, List<Compra> compras,
			List<ComprasUsuario> comprasUsuarios, List<Clas> clases, List<Columna> columnas, Fabricante fabricante,
			Proveedore proveedore, List<Usuario> usuarios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.web = web;
		this.compras = compras;
		this.comprasUsuarios = comprasUsuarios;
		this.clases = clases;
		this.columnas = columnas;
		this.fabricante = fabricante;
		this.proveedore = proveedore;
		this.usuarios = usuarios;
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

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public List<Compra> getCompras() {
		return this.compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public List<ComprasUsuario> getComprasUsuarios() {
		return this.comprasUsuarios;
	}

	public void setComprasUsuarios(List<ComprasUsuario> comprasUsuarios) {
		this.comprasUsuarios = comprasUsuarios;
	}

	public ComprasUsuario addComprasUsuario(ComprasUsuario comprasUsuario) {
		getComprasUsuarios().add(comprasUsuario);
		comprasUsuario.setProducto(this);

		return comprasUsuario;
	}

	public ComprasUsuario removeComprasUsuario(ComprasUsuario comprasUsuario) {
		getComprasUsuarios().remove(comprasUsuario);
		comprasUsuario.setProducto(null);

		return comprasUsuario;
	}

	public List<Clas> getClases() {
		return this.clases;
	}

	public void setClases(List<Clas> clases) {
		this.clases = clases;
	}

	public List<Columna> getColumnas() {
		return this.columnas;
	}

	public void setColumnas(List<Columna> columnas) {
		this.columnas = columnas;
	}

	public Fabricante getFabricante() {
		return this.fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Proveedore getProveedore() {
		return this.proveedore;
	}

	public void setProveedore(Proveedore proveedore) {
		this.proveedore = proveedore;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}