package unah.edu.vehiculo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.edu.vehiculo.Reposiorios.VehiculoRepositorio;
import unah.edu.vehiculo.modelos.Vehiculo;

@Service
public class VehiculoServicioImpl implements VehiculoServicio {
    @Autowired
    private VehiculoRepositorio vehiculoRepositorio;

    @Override
    public Vehiculo BuscarVehiculoPorid(int Id) {

        return vehiculoRepositorio.findById(Id).get();
    }

    @Override
    public Vehiculo CrearVehiculo(Vehiculo vehiculo) {

        return vehiculoRepositorio.save(vehiculo);
    }

    @Override
    public List<Vehiculo> ObtenerVehiculos() {

        return vehiculoRepositorio.findAll();
    }

}
