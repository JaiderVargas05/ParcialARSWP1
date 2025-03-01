package eci.arsw.ParcialARSWP1.controller;

import eci.arsw.ParcialARSWP1.model.Product;
import eci.arsw.ParcialARSWP1.service.ProductService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.function.EntityResponse;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;
@RestController
@RequestMapping("/productos")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping()
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }
    @PostMapping()
    public Product addProduct(@RequestBody Product product) {
         return productService.addProduct(product.getNombre(), product.getPrecio());
    }

}