package controller.dao.proveedor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import controller.beans.Proveedor;

@Repository
public interface ProveedorRepository extends CrudRepository<Proveedor, Long> {


   
}