package ma.security.customerfrontthymeleafapp.repository;


import ma.security.customerfrontthymeleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
