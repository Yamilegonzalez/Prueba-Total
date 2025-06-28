package com.total.products.Products.Config;

import com.total.products.Products.Model.Product;
import com.total.products.Products.Repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatabaseSeeder {
    @Bean
    public CommandLineRunner loadInitialProducts(ProductRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                Product prod1 = new Product();
                prod1.setName("Laptop ASUS");
                prod1.setPrice(12500.99);
                prod1.setCategoryId(1L);
                prod1.setDescription("High-performance laptop with 16GB RAM and 512GB SSD.");
                prod1.setImageUrl("https://m.media-amazon.com/images/I/71ehzrGUO7L.jpg");

                Product prod2 = new Product();
                prod2.setName("Smartphone Samsung Galaxy");
                prod2.setPrice(8999.99);
                prod2.setCategoryId(1L);
                prod2.setDescription("Latest model with 128GB storage and 48MP camera.");
                prod2.setImageUrl("https://m.media-amazon.com/images/I/61b1d8e4JpL.jpg");

                Product prod3 = new Product();
                prod3.setName("Camiseta Nike");
                prod3.setPrice(499.99);
                prod3.setCategoryId(2L);
                prod3.setDescription("Comfortable and stylish Nike t-shirt.");
                prod3.setImageUrl("https://m.media-amazon.com/images/I/61b1d8e4JpL.jpg");

                Product prod4 = new Product();
                prod4.setName("Sofá de 3 plazas");
                prod4.setPrice(15000.00);
                prod4.setCategoryId(3L);
                prod4.setDescription("Spacious and comfortable 3-seater sofa.");
                prod4.setImageUrl("https://m.media-amazon.com/images/I/71ehzrGUO7L.jpg");

                repository.saveAll(List.of(prod1, prod2, prod3, prod4));
                System.out.println("Initial products created.");
            }
        };
    }
}
