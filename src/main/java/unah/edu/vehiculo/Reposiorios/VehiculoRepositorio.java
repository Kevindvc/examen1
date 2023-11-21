package unah.edu.vehiculo.Reposiorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unah.edu.vehiculo.modelos.Vehiculo;
@Repository
public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Integer>{
    
}
