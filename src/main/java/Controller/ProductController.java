package Controller;

import Entity.ProductEntity;
import Service.ProductServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductServi productService;

    // Get all products with pagination

    // Create a new product
    @PostMapping
    public ProductEntity createProduct(@RequestBody ProductEntity product) {
        return productService.createProduct(product);
    }

    // Get product by ID, include category details in response
    @GetMapping("/{id}")
    public ProductEntity getProductById(@PathVariable Long id) {
        ProductEntity product = productService.getProductById(id);

        return product;
    }

    // Update product by ID
    @PutMapping("/{id}")
    public ProductEntity updateProduct(@PathVariable Long id, @RequestBody ProductEntity productDetails) {
        return productService.updateProduct(id, productDetails);
    }

    // Delete product by ID
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
