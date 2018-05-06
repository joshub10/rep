package controller.dao.compra;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import controller.beans.Compra;

@Repository
public interface CompraRepository extends CrudRepository<Compra, Long> {


   
}