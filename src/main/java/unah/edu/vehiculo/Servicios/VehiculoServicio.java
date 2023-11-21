package unah.edu.vehiculo.Servicios;

import java.util.List;

import unah.edu.vehiculo.modelos.Vehiculo;

public interface VehiculoServicio {


    public Vehiculo CrearVehiculo (Vehiculo vehiculo);
    

    public List<Vehiculo> ObtenerVehiculos();

    public Vehiculo BuscarVehiculoPorid(int Id);
    
}
