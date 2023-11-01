package com.savina.demoproductservice.services;

import com.savina.demoproductservice.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

public interface ProductService {
    public String getAllProducts();
    public String getSingleProduct(Long productid);
    public String addNewProduct(ProductDto productDto);
    public String updateProduct(Long productid);
    public String deleteProduct(Long productid);

}
