package com.giomuathu.AquariumWarehousingSupportSystem.service;

import com.giomuathu.AquariumWarehousingSupportSystem.exception.MissingFieldException;
import com.giomuathu.AquariumWarehousingSupportSystem.model.request.ProductRequest;
import com.giomuathu.AquariumWarehousingSupportSystem.model.response.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProducts(int pageIndex, int pageSize);

    ProductDTO getProductById(Long id);

    Boolean createProduct (ProductRequest product) throws MissingFieldException;

}
