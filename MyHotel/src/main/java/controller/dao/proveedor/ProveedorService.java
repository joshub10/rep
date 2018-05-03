package controller.dao.proveedor;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.beans.proveedor.Proveedor;

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

	public boolean create(Proveedor proveedor) {
		Proveedor ob=null;
		
		try {
			ob=repository.save(proveedor);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ob != null;
	}
	public boolean update(Proveedor proveedor) {
		return create(proveedor);
	}
	
}
