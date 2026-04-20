package mx.uv.mapl.inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import mx.uv.mapl.inventario.entity.Producto;
import mx.uv.mapl.inventario.repository.ProductoRepository;

@SpringBootApplication
public class InventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}
	
	@Bean 
	CommandLineRunner initData(ProductoRepository repository) {
		return args -> {
			if (repository.count() == 0) {
				repository.save(new Producto(null, "Laptop dell","I7 16 GB RAM", 1500000.0 , 5 , "Electronica" , null));
				repository.save(new Producto(null, "Mouse","Mouse innalambrico", 500.50 , 50 , "Accesorios" , null));
				repository.save(new Producto(null, "Audifonos","SONY", 1500.0 , 1 , "Electronica" , null));
			}
		};
	}
}
