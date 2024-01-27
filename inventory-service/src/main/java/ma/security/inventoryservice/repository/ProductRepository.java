package ma.security.inventoryservice.repository;

import ma.security.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,String> {
}
