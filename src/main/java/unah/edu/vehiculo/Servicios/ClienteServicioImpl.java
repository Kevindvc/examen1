package unah.edu.vehiculo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.edu.vehiculo.Reposiorios.ClienteRepositorio;
import unah.edu.vehiculo.modelos.Cliente;
@Service
public class ClienteServicioImpl implements ClienteServicio{
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Override
    public Cliente BuscarClientePorid(int id) {
        
        return clienteRepositorio.findById(id).get();
    }

    @Override
    public Cliente CrearCliente(Cliente cliente) {
       
        return clienteRepositorio.save(cliente);
    }

    @Override
    public List<Cliente> MostrarCliente() {
        return clienteRepositorio.findAll();
    }
    
}
