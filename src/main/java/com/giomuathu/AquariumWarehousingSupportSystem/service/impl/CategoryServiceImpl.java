package com.giomuathu.AquariumWarehousingSupportSystem.service.impl;

import com.giomuathu.AquariumWarehousingSupportSystem.entity.CategoryEntity;
import com.giomuathu.AquariumWarehousingSupportSystem.repository.CategoryRepository;
import com.giomuathu.AquariumWarehousingSupportSystem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryEntity> getAllCategory() {
        return categoryRepository.findAll();
    }
}
