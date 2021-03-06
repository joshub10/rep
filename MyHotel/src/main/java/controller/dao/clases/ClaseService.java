package controller.dao.clases;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.beans.Categoria;
import controller.beans.Clas;

@Service
public class ClaseService {

	@Autowired
	private ClasesRepository repository;

	public ClaseService() {
		super();
	}
	
	public List<Clas> getAll() {
		List<Clas> Proveedores = new ArrayList<>();
		
		try {
			Proveedores=repository.findAll();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Proveedores;
	}
	public List<Clas> getAllByCategoria(String categoria) {
		List<Clas> Proveedores = new ArrayList<>();
		
		try {
			Proveedores=repository.findAll();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Proveedores;
	}

	public boolean create(Clas fabricante) {
		Clas ob=null;
		
		try {
			ob=repository.save(fabricante);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ob != null;
	}
	public boolean update(Clas fabricante) {
		return create(fabricante);
	}
	
}
