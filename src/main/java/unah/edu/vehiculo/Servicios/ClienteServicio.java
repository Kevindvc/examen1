package unah.edu.vehiculo.Servicios;

import java.util.List;

import unah.edu.vehiculo.modelos.Cliente;

public interface ClienteServicio {


    public Cliente CrearCliente(Cliente cliente);

    public List<Cliente> MostrarCliente();

    public Cliente BuscarClientePorid(int id);
    
}
