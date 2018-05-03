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
    
    
    
}
