package controller.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the compras_usuarios database table.
 * 
 */
@Embeddable
public class ComprasUsuarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_compra", insertable=false, updatable=false)
	private int idCompra;

	@Column(name="id_usuario", insertable=false, updatable=false)
	private int idUsuario;

	public ComprasUsuarioPK() {
	}
	public int getIdCompra() {
		return this.idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public int getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ComprasUsuarioPK)) {
			return false;
		}
		ComprasUsuarioPK castOther = (ComprasUsuarioPK)other;
		return 
			(this.idCompra == castOther.idCompra)
			&& (this.idUsuario == castOther.idUsuario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCompra;
		hash = hash * prime + this.idUsuario;
		
		return hash;
	}
}