package com.example.testing.util.excepcions;

import com.example.testing.util.CustomError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = {EntityNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<CustomError> handlerEntityNotFounfException(EntityNotFoundException exception){
        CustomError customError = new CustomError(exception.getMessage(),exception.getHttpCode());
        return ResponseEntity.status(404).body(customError);

    }

    @ExceptionHandler(value = {UnprocessableEntityException.class})
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ResponseEntity<CustomError> handleUnprocessableEntityException(UnprocessableEntityException e) {
        CustomError customError = new CustomError(e.getMessage(), e.getHttpCode());
        return ResponseEntity.status(422).body(customError);

    }

    @ExceptionHandler(value = {RuntimeException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<CustomError> handleUnknownException(RuntimeException e) {
        CustomError customError = new CustomError(e.getMessage(), 500);
        return ResponseEntity.status(500).body(customError);
    }





}
