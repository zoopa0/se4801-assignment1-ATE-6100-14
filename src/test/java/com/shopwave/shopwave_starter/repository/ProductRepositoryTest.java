//student Number : ATE/6100/14

package com.shopwave.shopwave_starter.repository;
import com.shopwave.shopwave_starter.model.Product;
import com.shopwave.shopwave_starter.model.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void findByNameContainingIgnoreCase_shouldWork() {
        Category category = categoryRepository.save(
                new Category(null, "Electronics", "Devices"));

        Product product = Product.builder()
                .name("Phone")
                .price(BigDecimal.valueOf(500))
                .stock(10)
                .category(category)
                .build();

        productRepository.save(product);

        List<Product> result =
                productRepository.findByNameContainingIgnoreCase("phone");

        assertFalse(result.isEmpty());
    }
}