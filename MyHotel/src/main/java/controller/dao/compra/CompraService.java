package controller.dao.compra;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.beans.Compra;
import controller.beans.Fabricante;

@Service
public class CompraService {

	@Autowired
	private CompraRepository repository;

	public CompraService() {
		super();
	}
	
	public Iterable<Compra> getAll() {
		Iterable<Compra> Proveedores = new ArrayList<>();
		
		try {
			Proveedores=repository.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Proveedores;
	}

	public boolean create(Compra fabricante) {
		Compra ob=null;
		
		try {
			ob=repository.save(fabricante);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ob != null;
	}
	public boolean update(Compra fabricante) {
		return create(fabricante);
	}
	
}
