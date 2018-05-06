package controller.dao.usuario;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import controller.beans.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {


   
}