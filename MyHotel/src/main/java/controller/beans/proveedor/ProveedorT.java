package controller.beans.proveedor;

import org.springframework.stereotype.Service;

@Service
public class ProveedorT {

	private Long id;
	
    private String nombre;
	
    private String web;
	
	
	public ProveedorT() {
		super();
	}
    
    public ProveedorT(Long id, String nombre, String web) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.web = web;
	}
	
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}

	public Proveedor parseEntity() {
		return new Proveedor(id, nombre, web);
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProveedorT other = (ProveedorT) obj;
		if (id == null) {
			if (other.getId() != null)
				return false;
		} else if (!id.equals(other.getId()))
			return false;
		return true;
	}
    
}
