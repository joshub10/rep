package controller.dao.producto;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import controller.beans.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {


   
}