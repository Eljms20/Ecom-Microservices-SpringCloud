package net.khaoula.customerservice;

import net.khaoula.customerservice.entities.Customer;
import net.khaoula.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
@Bean // un objet gerer par spring
// excuter le code aprer le dempmarage grace au commandLineRunner
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return  args -> {


			// enregistrer des costumers
			customerRepository.save(Customer.builder()
							.name("KHAOULA").email("khaoula@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("hamza").email("hamza@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("ayman").email("ayman@gmail.com")
					.build());

			// affichage
			customerRepository.findAll().forEach(c -> {
				System.out.println("============");
				System.out.println(c.getId());
				System.out.println(c.getName());
				System.out.println(c.getEmail());
				System.out.println("============");
			});

		};
}

}
