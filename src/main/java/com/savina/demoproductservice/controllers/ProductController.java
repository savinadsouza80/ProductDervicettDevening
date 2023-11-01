package com.savina.demoproductservice.controllers;

import com.savina.demoproductservice.dtos.ProductDto;
import com.savina.demoproductservice.services.ProductService;
import org.apache.catalina.connector.ClientAbortException;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// RestController tells spring this class has API internally
//used to register the class with spring dispatcher
//this class has end points

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    public  ProductController(ProductService productService){
        this.productService=productService;
    }
    @GetMapping ()
    public String getAllProducts(){
        return "Getting All products";
    }

//    public HttpEntity<List<String>> getAllCategories() throws ClientAbortException {
//        HttpEntity<List<String>> response;
//        try {
//            List<String> categories = this.categoryService.getAllCategories().stream()
//                    .map(category -> category.getName())
//                    .collect(Collectors.toList());
//            response = new ResponseEntity<>(categories, HttpStatus.OK);
//        } catch (Exception e) {
//            String errorMessage = String.format(CategoryController.errMsg, "getAllCategories()", e.getClass(), e.getMessage());
//            this.logger.logError(errorMessage);
//            throw new ClientErrorException(201, errorMessage);
//        }
//        return response;
//    }
// get productId from PathVariable and put it into productid local variable
    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productid){
        return "Returning Single product with id " + productid;
    }

    //Converts the req body JSON received to obj of ProductDto (calls the setters and create obj of ProductDto)
    @PostMapping( )
    public String addNewProduct(@RequestBody ProductDto productDto){
       return "Adding new product " + productDto;
    }
    //    /products/{productId}
    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productid){
        return "Updating product " + productid;
    }
    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productid){
        return "Deleting product id "+ productid;
    }


}
