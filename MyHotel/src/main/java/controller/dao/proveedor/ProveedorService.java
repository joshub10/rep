package controller.dao.proveedor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import controller.beans.Proveedor;

@Service
public class ProveedorService {

	@Autowired
	private ProveedorRepository repository;

	public ProveedorService() {
		super();
	}
	
	public Iterable<Proveedor> getAll() {
		Iterable<Proveedor> proveedors = new ArrayList<>();
		
		try {
			proveedors=repository.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return proveedors;
	}
	
}
