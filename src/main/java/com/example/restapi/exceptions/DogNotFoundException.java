package com.example.restapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "ID not Found")
public class DogNotFoundException extends RuntimeException{
    public DogNotFoundException() {
        super();
    }
}
