package edu.yavirac.clientebackend.repository;
import org.springframework.data.repository.CrudRepository;
import edu.yavirac.clientebackend.entity.Cliente;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

    List<Cliente> findAll();

    List<Cliente> findByNombreLikeIgnoreCase(String termino);
    
}
