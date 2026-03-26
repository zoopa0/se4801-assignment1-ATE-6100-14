package com.shopwave.shopwave_starter.model;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Product product;

    private Integer quantity;

    private BigDecimal unitPrice;

    @ManyToOne
    private Order order;
}
