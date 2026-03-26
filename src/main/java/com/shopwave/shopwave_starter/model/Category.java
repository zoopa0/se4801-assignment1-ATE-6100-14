//student Number : ATE/6100/14

package com.shopwave.shopwave_starter.model;
import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Category {


    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;
}
