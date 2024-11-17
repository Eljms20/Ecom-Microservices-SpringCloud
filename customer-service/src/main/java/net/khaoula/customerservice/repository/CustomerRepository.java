package net.khaoula.customerservice.repository;

import net.khaoula.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource //annotation fournit par spring data rest il   permet de demander a spring de demarrer
// automatiquement  un web service restful qui permet dacceder au tous les  methodes qui ce trouve dans cette interface
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
