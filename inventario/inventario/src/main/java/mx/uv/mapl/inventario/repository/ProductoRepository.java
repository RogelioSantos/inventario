package mx.uv.mapl.inventario.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import mx.uv.mapl.inventario.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
        
} 
