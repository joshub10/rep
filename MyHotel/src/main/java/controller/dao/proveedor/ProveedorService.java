package controller.dao.proveedor;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.beans.Proveedore;

@Service
public class ProveedorService {

	@Autowired
	private ProveedorRepository repository;

	public ProveedorService() {
		super();
	}
	
	public Iterable<Proveedore> getAll() {
		Iterable<Proveedore> Proveedores = new ArrayList<>();
		
		try {
			Proveedores=repository.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Proveedores;
	}

	public boolean create(Proveedore Proveedore) {
		Proveedore ob=null;
		
		try {
			ob=repository.save(Proveedore);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ob != null;
	}
	public boolean update(Proveedore Proveedore) {
		return create(Proveedore);
	}
	
}
