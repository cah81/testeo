package com.example.testing.util.excepcions;

public class EntityNotFoundException extends RuntimeException{
    private int httpCode;


    public EntityNotFoundException(String message, int httpCode){
        super(message);
        this.httpCode=httpCode;
    }



    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }
}
