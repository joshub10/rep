package controller.dao.proveedor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import controller.beans.Proveedore;

@Repository
public interface ProveedorRepository extends CrudRepository<Proveedore, Long> {


   
}