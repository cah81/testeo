package com.example.testing.util;
import java.util.Date;

public class CustomError {
    private String message;

    private int httpCode;


    public CustomError(String message, int httpCode) {
        this.message = message;
        this.httpCode = httpCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }
}
