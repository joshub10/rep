package controller.dao.clases;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import controller.beans.Categoria;
import controller.beans.Clas;
import java.util.List;

@Repository
public interface ClasesRepository extends JpaRepository<Clas, Long> {


   List<Clas> findByCategorias(List categorias);
}