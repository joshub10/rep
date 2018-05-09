package controller.dao.clases;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import controller.beans.Categoria;
import controller.beans.Clas;

@Repository
public interface ClasesRepository extends CrudRepository<Clas, Long> {


   
}