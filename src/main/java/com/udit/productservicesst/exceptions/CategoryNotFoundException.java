package com.udit.productservicesst.exceptions;

public class CategoryNotFoundException extends RuntimeException{
        public CategoryNotFoundException(String message){
            super(message);
        }
}
