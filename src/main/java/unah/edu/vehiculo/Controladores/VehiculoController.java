package unah.edu.vehiculo.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.edu.vehiculo.Servicios.VehiculoServicioImpl;
import unah.edu.vehiculo.modelos.Vehiculo;

@RestController
@RequestMapping("api/Vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoServicioImpl vehiculoServicioImpl;

    @PostMapping("crear")
    public Vehiculo CrearVehiculo(@RequestBody Vehiculo vehiculo) {

        return this.vehiculoServicioImpl.CrearVehiculo(vehiculo);

    }

    @GetMapping("mostrar")
    public List<Vehiculo> ObtenerVehiculos() {

        return this.vehiculoServicioImpl.ObtenerVehiculos();
    }

}
