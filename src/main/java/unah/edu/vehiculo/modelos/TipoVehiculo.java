package unah.edu.vehiculo.modelos;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tipovehiculo")
public class TipoVehiculo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idTipoVehiculo;

    private String descripcion;

    private double precioXhora;

    @OneToMany(mappedBy = "tipoVehiculo", cascade= CascadeType.ALL)
    private List<Vehiculo> vehiculo;
    
    
}
