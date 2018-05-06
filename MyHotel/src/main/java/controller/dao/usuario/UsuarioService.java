package controller.dao.usuario;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.beans.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public UsuarioService() {
		super();
	}
	
	public Iterable<Usuario> getAll() {
		Iterable<Usuario> Proveedores = new ArrayList<>();
		
		try {
			Proveedores=repository.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Proveedores;
	}

	public boolean create(Usuario fabricante) {
		Usuario ob=null;
		
		try {
			ob=repository.save(fabricante);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ob != null;
	}
	public boolean update(Usuario fabricante) {
		return create(fabricante);
	}
	
}
