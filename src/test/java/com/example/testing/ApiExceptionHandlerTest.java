package com.example.testing;

import com.example.testing.util.CustomError;
import com.example.testing.util.excepcions.ApiExceptionHandler;
import com.example.testing.util.excepcions.EntityNotFoundException;
import com.example.testing.util.excepcions.UnprocessableEntityException;
import org.junit.Before;
import org.junit.Test;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.Assert.assertEquals;


//@ExtendWith(MockitoExtension.class)
public class ApiExceptionHandlerTest {

    @InjectMocks
    private ApiExceptionHandler apiExceptionHandler;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
   public  void handleEntityNotFoundException() {
        EntityNotFoundException exception = new EntityNotFoundException("Entity not found", 404);
        ResponseEntity<CustomError> response = apiExceptionHandler.handlerEntityNotFounfException(exception);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertEquals(404, Objects.requireNonNull(response.getBody()).getHttpCode());
        assertEquals("Entity not found", response.getBody().getMessage());
    }
    @Test
    public void handleUnprocessableEntityException() {
        UnprocessableEntityException exception = new UnprocessableEntityException("Unprocessable entity", 422);
        ResponseEntity<CustomError> response = apiExceptionHandler.handleUnprocessableEntityException(exception);

        assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, response.getStatusCode());
        assertEquals(422, Objects.requireNonNull(response.getBody()).getHttpCode());
        assertEquals("Unprocessable entity", response.getBody().getMessage());
    }

    @Test
    public void handleUnknownException() {
        RuntimeException exception = new RuntimeException("Some unexpected error");
        ResponseEntity<CustomError> response = apiExceptionHandler.handleUnknownException(exception);

        // Assuming you have a default status code for unknown exceptions
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
        assertEquals(500, Objects.requireNonNull(response.getBody()).getHttpCode());
        assertEquals("Some unexpected error", response.getBody().getMessage());
    }





}
