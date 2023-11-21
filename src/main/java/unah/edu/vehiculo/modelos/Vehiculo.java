package unah.edu.vehiculo.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idVehiculo;

    private String marca;

    private int anio;

    private int disponible;

    @ManyToOne
    @JoinColumn(name="idTipoVehiculo", referencedColumnName = "idTipoVehiculo")
    private TipoVehiculo tipoVehiculo;

}
