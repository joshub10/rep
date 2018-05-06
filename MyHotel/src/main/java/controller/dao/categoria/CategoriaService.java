package controller.dao.categoria;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.beans.Categoria;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public CategoriaService() {
		super();
	}
	
	public Iterable<Categoria> getAll() {
		Iterable<Categoria> Proveedores = new ArrayList<>();
		
		try {
			Proveedores=repository.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Proveedores;
	}

	public boolean create(Categoria fabricante) {
		Categoria ob=null;
		
		try {
			ob=repository.save(fabricante);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ob != null;
	}
	public boolean update(Categoria fabricante) {
		return create(fabricante);
	}
	
}
