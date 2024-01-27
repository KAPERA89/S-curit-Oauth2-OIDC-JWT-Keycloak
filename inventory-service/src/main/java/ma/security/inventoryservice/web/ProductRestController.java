package ma.security.inventoryservice.web;

import ma.security.inventoryservice.entities.Product;
import ma.security.inventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductRestController {
    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping("/products")

    public List<Product> products(){
        return productRepository.findAll();
    }
}
