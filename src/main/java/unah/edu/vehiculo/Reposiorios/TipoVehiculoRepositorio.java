package unah.edu.vehiculo.Reposiorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unah.edu.vehiculo.modelos.TipoVehiculo;

@Repository
public interface TipoVehiculoRepositorio extends JpaRepository<TipoVehiculo, Integer>{
    
}
