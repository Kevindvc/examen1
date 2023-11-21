package unah.edu.vehiculo.modelos;

import java.sql.Date;

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
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CodigoCliente;
    private String nombre;
    private String apellido;
    private Date FechaIngreso;

    @ManyToOne
    @JoinColumn(name = "idTipoCliente", referencedColumnName = "idTipoCliente")
    private TipoCliente tipoCliente;


    
}
