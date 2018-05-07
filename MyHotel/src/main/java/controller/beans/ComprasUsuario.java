package controller.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the compras_usuarios database table.
 * 
 */
@Entity
@Table(name="compras_usuarios")
@NamedQuery(name="ComprasUsuario.findAll", query="SELECT c FROM ComprasUsuario c")
public class ComprasUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ComprasUsuarioPK id;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="id_compra", insertable=false, updatable=false)
	private Producto producto;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_usuario", insertable=false, updatable=false)
	private Usuario usuario;

	public ComprasUsuario() {
	}

	public ComprasUsuarioPK getId() {
		return this.id;
	}

	public void setId(ComprasUsuarioPK id) {
		this.id = id;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}