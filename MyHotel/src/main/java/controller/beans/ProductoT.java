package controller.beans;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

import controller.beans.Producto;
import controller.beans.proveedor.Proveedor;


@Service
public class ProductoT {

	private int id;

	private String nombre;

	private BigDecimal precio;

	private String web;

	private List<Compra> compras;

	private List<ComprasUsuario> comprasUsuarios;

	private List<Clas> clases;
	private List<Columna> columnas;

	private Fabricante fabricante;
	private Proveedore proveedore;

	private List<Usuario> usuarios;

	public ProductoT() {
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

	public Producto parseEntity() {
		// TODO Auto-generated method stub
		return new Producto(id, nombre, precio, web, compras, comprasUsuarios, clases, columnas, fabricante, proveedore, usuarios);
	}
    
}
