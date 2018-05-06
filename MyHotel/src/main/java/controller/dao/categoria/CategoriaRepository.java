package controller.dao.categoria;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import controller.beans.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {


   
}