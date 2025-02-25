package com.giomuathu.AquariumWarehousingSupportSystem.repository;

import com.giomuathu.AquariumWarehousingSupportSystem.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
