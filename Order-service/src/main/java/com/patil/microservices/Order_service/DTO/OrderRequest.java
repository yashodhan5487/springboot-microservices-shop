package com.patil.microservices.Order_service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber, String skuCode,
                               BigDecimal price, Integer quantity, UserDetails userDetails) {

        public record UserDetails(String email, String firstName, String lastName) {}
    }

