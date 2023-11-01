package com.savina.demoproductservice.controllers;

import com.savina.demoproductservice.services.CategoryService;
import com.savina.demoproductservice.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/categories")
public class CategoryController {

    private CategoryService categoryService;
    public  CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }
   // @GetMapping("/products/categories")
    @GetMapping()
    public String getAllCategories(){
        return "Getting All Categories";
    }
    @GetMapping("/{categoryId}")
    public  String getProductsInCategory(@PathVariable("categoryId") Long categoryId){
        return "Get product in category "+ categoryId;
    }
}
