package com.vyatsu.task14.repositories;

import com.vyatsu.task14.entities.Product;
import com.vyatsu.task14.services.ProductsService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Bread", 40));
        products.add(new Product(2L, "Milk", 90));
        products.add(new Product(3L, "Cheese", 200));
    }

    public List<Product> findAll() {
        return products;
    }

    public Product findByTitle(String title) {
        return products.stream().filter(p -> p.getTitle().equals(title)).findFirst().get();
    }

    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> filtrAll(ProductsService productsService, Pattern pattern, int min, int max)
    {
        List<Product> filpr = new ArrayList<Product>();
        for (Product p:
                productsService.getAllProducts()) {
            if(pattern.matcher(p.getTitle()).find()){
                filpr.add(p);
            }
        }
        filpr = filpr.stream().filter(p -> p.getPrice() > min && p.getPrice()< max).collect(Collectors.toList());
        return filpr;
    }
    public void del(Product product) {products.remove(product);}
}
