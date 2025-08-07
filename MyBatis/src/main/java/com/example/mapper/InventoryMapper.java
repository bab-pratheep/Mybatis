package com.example.mapper;

import com.example.dto.InventoryDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InventoryMapper {

    @Select("""
        SELECT 
            i.id, i.code, i.description, i.details, i.in_stock AS inStock,
            t.name AS typeName,
            s.name AS supplierName,
            r.value AS rateValue,
            c.is_hardware AS isHardware
        FROM inventory i
        LEFT JOIN type t ON i.type_id = t.id
        LEFT JOIN supplier s ON i.supplier_id = s.id
        LEFT JOIN rate_type r ON i.rate_type_id = r.id
        LEFT JOIN category c ON i.category_id = c.id
        """)
    List<InventoryDTO> getAllInventories();
}
