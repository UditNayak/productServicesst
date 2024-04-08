package com.udit.productservicesst.services;

import com.udit.productservicesst.dtos.FakeStoreProductDto;
import com.udit.productservicesst.models.Category;
import com.udit.productservicesst.models.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component   // initialise an object of this class, in the start of the program
//@Service
public class FakeStoreProductService implements ProductService{

    @Override
    public Product getProductById(Long id) {
        // Call the FakeStore API to get the product with given id
        throw new RuntimeException();
//        RestTemplate restTemplate = new RestTemplate();
//        FakeStoreProductDto fakeStoreProductDto =  restTemplate.getForObject("https://fakestoreapi.com/products/" + id,
//                FakeStoreProductDto.class);
//
//        // convert FakestoreDto object to product object
//        Product product = convertFakeStoreDtosToProduct(fakeStoreProductDto);
//        return product;
    }

    public List<Product> getAllProducts(){
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductDto[] fakeStoreProductDtos = restTemplate.getForObject("https://fakestoreapi.com/products",
                FakeStoreProductDto[].class);
        List<Product> products = new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto: fakeStoreProductDtos){
            products.add(convertFakeStoreDtosToProduct(fakeStoreProductDto));
        }
        return products;
    }

    private Product convertFakeStoreDtosToProduct( FakeStoreProductDto fakeStoreProductDto ){
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setImage(fakeStoreProductDto.getImage());
        product.setDescription(fakeStoreProductDto.getDescription());
        Category category = new Category();
        category.setTitle(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        return product;
    }
}
