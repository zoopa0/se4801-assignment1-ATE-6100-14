//student Number : ATE/6100/14

package com.shopwave.shopwave_starter.model;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    private Integer stock;

    @ManyToOne
    private Category category;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
