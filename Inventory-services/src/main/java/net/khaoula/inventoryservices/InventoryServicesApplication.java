package net.khaoula.inventoryservices;

import net.khaoula.inventoryservices.entities.Product;
import net.khaoula.inventoryservices.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServicesApplication.class, args);
	}
 @Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return  args -> {
			productRepository.save(Product.builder()
							.id(UUID.randomUUID().toString())
							.nom("Computer")
							.prix(3200)
							.quantity(11)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.nom("Smartphone")
					.prix(2300)
					.quantity(20)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.nom("Printer")
					.prix(1300)
					.quantity(10)
					.build());

			productRepository.findAll().forEach(p ->{
							System.out.println(p.toString());
			});
		};
 }
}
