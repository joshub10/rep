package controller.dao.fabricante;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import controller.beans.Fabricante;
import controller.beans.Proveedore;

@Repository
public interface FabricanteRepository extends CrudRepository<Fabricante, Long> {


   
}