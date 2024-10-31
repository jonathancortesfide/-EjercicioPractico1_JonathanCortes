package EjercicioPractico.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="medicamentos")
public class Medicamento implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String categoria;


    public Medicamento() {
    }

    public Medicamento(Long id, String nombre, String descripcion, double precio, int stock, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    
}