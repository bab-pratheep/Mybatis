package com.example.controller;

import com.example.dto.InventoryDTO;
import com.example.mapper.InventoryMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryMapper inventoryMapper;

    public InventoryController(InventoryMapper inventoryMapper) {
        this.inventoryMapper = inventoryMapper;
    }

    @GetMapping
    public List<InventoryDTO> getAll() {
        return inventoryMapper.getAllInventories();
    }
}
