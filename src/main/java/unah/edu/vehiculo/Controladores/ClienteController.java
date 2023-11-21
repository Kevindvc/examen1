package unah.edu.vehiculo.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.edu.vehiculo.Servicios.ClienteServicioImpl;
import unah.edu.vehiculo.modelos.Cliente;

@RestController
@RequestMapping("api/Cliente")
public class ClienteController {
    @Autowired
    private ClienteServicioImpl clienteServicioImpl;

    @PostMapping("guardarcliente")
    public Cliente CrearCliente(@RequestBody Cliente cliente) {

        return this.clienteServicioImpl.CrearCliente(cliente);

    }

    @GetMapping("obetener")
    public List<Cliente> MostrarCliente() {
        return this.clienteServicioImpl.MostrarCliente();
    }

}
