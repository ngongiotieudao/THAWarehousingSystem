package com.giomuathu.AquariumWarehousingSupportSystem.controller;

import com.giomuathu.AquariumWarehousingSupportSystem.entity.CategoryEntity;
import com.giomuathu.AquariumWarehousingSupportSystem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("category")
public class CategoryController {

    CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryEntity>> getAllCategory() {
        return ResponseEntity.ok(categoryService.getAllCategory());
    }
}