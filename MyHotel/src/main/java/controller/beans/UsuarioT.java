package controller.beans;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import java.util.List;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Service
public class UsuarioT implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String email;

	private String foto;

	private String nombre;

	private String pass;

	private List<ComprasUsuario> comprasUsuarios;

	
	private List<Producto> productos;

	public UsuarioT() {
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

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public List<ComprasUsuario> getComprasUsuarios() {
		return this.comprasUsuarios;
	}

	public void setComprasUsuarios(List<ComprasUsuario> comprasUsuarios) {
		this.comprasUsuarios = comprasUsuarios;
	}


	public ComprasUsuario removeComprasUsuario(ComprasUsuario comprasUsuario) {
		getComprasUsuarios().remove(comprasUsuario);
		comprasUsuario.setUsuario(null);

		return comprasUsuario;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}