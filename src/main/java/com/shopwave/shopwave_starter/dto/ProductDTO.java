//student Number : ATE/6100/14
package com.shopwave.shopwave_starter.dto;

import java.math.BigDecimal;

public record ProductDTO(
        Long id,
        String name,
        String description,
        BigDecimal price,
        Integer stock,
        Long categoryId
) {}