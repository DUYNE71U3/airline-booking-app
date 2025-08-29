package com.javapp.MainApiJava.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {

    private int status;

    private String message;

    private T Data;
}
