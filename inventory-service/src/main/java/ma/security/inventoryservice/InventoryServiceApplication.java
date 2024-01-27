package ma.security.inventoryservice;

import ma.security.inventoryservice.entities.Product;
import ma.security.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                            .id(UUID.randomUUID().toString())
                            .name("PS5")
                            .quantity(12)
                            .price(4300)
                    .build());
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Steam Deck")
                    .quantity(11)
                    .price(12000)
                    .build());
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Nintendo Switch")
                    .quantity(3)
                    .price(1200)
                    .build());
        };
    }
}
