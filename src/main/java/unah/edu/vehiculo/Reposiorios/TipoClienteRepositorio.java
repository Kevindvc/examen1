package unah.edu.vehiculo.Reposiorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unah.edu.vehiculo.modelos.TipoCliente;
@Repository
public interface TipoClienteRepositorio extends JpaRepository<TipoCliente,Integer> {
    
}
