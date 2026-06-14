package com.patil.microservices.Inventory_service.Service;

import com.patil.microservices.Inventory_service.Repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode, Integer quantity) {
        return inventoryRepository
                .existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}