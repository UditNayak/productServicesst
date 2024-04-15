package com.udit.productservicesst.controllers;

import com.udit.productservicesst.dtos.ExceptionDto;
import com.udit.productservicesst.models.Product;
import com.udit.productservicesst.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    ProductController(@Qualifier("selfProductService") ProductService productService){
        this.productService = productService;
    }

//    ProductController(@Qualifier("fakeStoreProductService") ProductService productService){
//        this.productService = productService;
//    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
//          throw new RuntimeException("Something went Wrong in Controller");
//        try{
//            Product product = productService.getProductById(id);
//            ResponseEntity<Product> responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//            return responseEntity;
//        }catch (RuntimeException exception){
//            ExceptionDto exceptionDto = new ExceptionDto();
//            exceptionDto.setMessage("Something Went Wront [ Through Exception DTO] ");
//            exceptionDto.setResolution("DO Nothing, Tere Baska nehi hai Bhai.");
//            ResponseEntity<ExceptionDto> responseEntity = new ResponseEntity<>(exceptionDto,HttpStatus.BAD_REQUEST);
//            return responseEntity;
//        }
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product ){
        return productService.createProduct(product);
    }
}
