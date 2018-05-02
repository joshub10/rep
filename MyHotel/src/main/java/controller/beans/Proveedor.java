package controller.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="PROVEEDORES")
public class Proveedor {

	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nombre")
    private String nombre;
	
	@Column(name="web")
    private String web;
	
	
	public Proveedor() {
		super();
	}
    
    public Proveedor(Long id, String nombre, String web) {
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
    
    
    
}
