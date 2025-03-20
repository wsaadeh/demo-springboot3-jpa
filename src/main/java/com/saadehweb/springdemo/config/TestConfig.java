package com.saadehweb.springdemo.config;

import com.saadehweb.springdemo.entities.Category;
import com.saadehweb.springdemo.entities.Order;
import com.saadehweb.springdemo.entities.Product;
import com.saadehweb.springdemo.entities.User;
import com.saadehweb.springdemo.entities.enums.OrderStatus;
import com.saadehweb.springdemo.repositories.CategoryRepository;
import com.saadehweb.springdemo.repositories.OrderRepository;
import com.saadehweb.springdemo.repositories.ProductRepository;
import com.saadehweb.springdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category c1 = new Category(null,"Electronics");
        Category c2 = new Category(null,"Books");
        Category c3 = new Category(null,"Computers");

        User u1 = new User(null,"Maria Brown","maria@gmail.com","988888888","123456");
        User u2 = new User(null,"Alex Green","alex@gmail.com","977777777","123456");

        Order o1 = new Order(null, Instant.parse("2025-01-20T19:53:07Z"), OrderStatus.PAID,u1);
        Order o2 = new Order(null, Instant.parse("2025-02-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT,u2);
        Order o3 = new Order(null, Instant.parse("2025-02-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT,u1);

        Product p1 = new Product(null,"The Lord of the Rings","Lorem ipsum dolor sit amet",90.5,"");
        Product p2 = new Product(null,"Smart TV","Nulls ru imperdiet purus.Maecenas ante.",2190.0,"");
        Product p3 = new Product(null,"Macbook Pro","Nam eleifend maximus tortor, at mollis.",1250.0,"");
        Product p4 = new Product(null,"PC Gamer","Donec aliquet odio ac rhoncus cursus.",1200.0,"");
        Product p5 = new Product(null,"Rails for Dummies","Cras fringilla convallis sem vel faucibus",100.90,"");

        categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

        p1.getCategories().add(c2);
        p2.getCategories().add(c1);
        p2.getCategories().add(c3);
        p3.getCategories().add(c3);
        p4.getCategories().add(c3);
        p5.getCategories().add(c2);

        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

    }
}
