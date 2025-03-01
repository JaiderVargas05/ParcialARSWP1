package eci.arsw.ParcialARSWP1.controller;

import eci.arsw.ParcialARSWP1.model.Product;
import eci.arsw.ParcialARSWP1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/productos")
class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product.getNombre(), product.getPrecio());
    }
}