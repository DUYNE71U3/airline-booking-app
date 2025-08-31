package com.javapp.MainApiJava.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String ex){
        super(ex); //sử dụng lại các thuộc tính RunTimeException
    }
}
