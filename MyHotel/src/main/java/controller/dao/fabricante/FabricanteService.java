package controller.dao.fabricante;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.beans.Fabricante;

@Service
public class FabricanteService {

	@Autowired
	private FabricanteRepository repository;

	public FabricanteService() {
		super();
	}
	
	public Iterable<Fabricante> getAll() {
		Iterable<Fabricante> Proveedores = new ArrayList<>();
		
		try {
			Proveedores=repository.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Proveedores;
	}

	public boolean create(Fabricante fabricante) {
		Fabricante ob=null;
		
		try {
			ob=repository.save(fabricante);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ob != null;
	}
	public boolean update(Fabricante fabricante) {
		return create(fabricante);
	}
	
}
