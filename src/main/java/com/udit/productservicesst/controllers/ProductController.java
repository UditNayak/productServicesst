package com.udit.productservicesst.controllers;

import com.udit.productservicesst.dtos.ExceptionDto;
import com.udit.productservicesst.models.Product;
import com.udit.productservicesst.services.FakeStoreProductService;
import com.udit.productservicesst.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


// /products

@RestController  // This controller is capable to host HTTP API's
@RequestMapping("/products")   // localhost:8080/products --> ProductController
public class ProductController {   // Waiter
    private ProductService productService;
    ProductController(ProductService productService){
        this.productService = productService;
    }


    // localhost:80808080/products/get/10
    //@GetMapping("/get/{id}")   // As per the Rest principle, it says that the action that api perform should not be the part of url
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
//        ResponseEntity<Product> responseEntity = null;
//        Product product = null;
//        try{
//            product = productService.getProductById(id);
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//            System.out.println("Hello, This code will only execute when the exception doesn't happens.");
//            return responseEntity;
//        } catch(RuntimeException exception){
//            ExceptionDto dto = new ExceptionDto();
//            dto.setMessage("Something went wrong udit");
//            ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.NOT_FOUND );
//            return response;
//        }
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
