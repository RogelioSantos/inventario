package mx.uv.roge.inventario.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import mx.uv.roge.inventario.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
        
} 
