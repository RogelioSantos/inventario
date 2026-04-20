package mx.uv.mapl.inventario.entity;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "productos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Column(nullable = false , length = 100)
    private String nombre;

    @Column(length = 500)
    private String descripcion;

    @NotNull(message = "El precio no puede ser nulo")
    @Positive(message = "El precio debe ser positivo")
    @Column(nullable = false )
    private Double precio;

    @NotNull(message = "La cantidad no puede ser nula")
    @Column(nullable = false)
    private Integer cantidad;


    private String categoria;
    private LocalDateTime fechaCreacion = LocalDateTime.now();



    
}
