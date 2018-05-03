package controller.dao.producto;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.beans.producto.Producto;
import controller.beans.proveedor.Proveedor;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository repository;

	public ProductoService() {
		super();
	}
	
	public Iterable<Producto> getAll() {
		Iterable<Producto> proveedors = new ArrayList<>();
		
		try {
			proveedors=repository.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return proveedors;
	}

	public boolean create(Producto proveedor) {
		Producto ob=null;
		
		try {
			ob=repository.save(proveedor);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ob != null;
	}
	public boolean update(Producto proveedor) {
		return create(proveedor);
	}
	
}
