package com.example.testing.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomErrorDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomError#CustomError(String, int)}
     *   <li>{@link CustomError#setHttpCode(int)}
     *   <li>{@link CustomError#setMessage(String)}
     *   <li>{@link CustomError#getHttpCode()}
     *   <li>{@link CustomError#getMessage()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        CustomError actualCustomError = new CustomError("Not all who wander are lost", 1);
        actualCustomError.setHttpCode(1);
        actualCustomError.setMessage("Not all who wander are lost");
        int actualHttpCode = actualCustomError.getHttpCode();
        assertEquals(1, actualHttpCode);
        assertEquals("Not all who wander are lost", actualCustomError.getMessage());
    }

    /**
     * Method under test: {@link CustomError#setMessage(String)}
     */
    @Test
    public void testSetMessage() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     CustomError.httpCode
        //     CustomError.message
        //     CustomError.timestamp

        (new CustomError("Not all who wander are lost", 1)).setMessage("Not all who wander are lost");
    }

    /**
     * Method under test: {@link CustomError#setHttpCode(int)}
     */
    @Test
    public void testSetHttpCode() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     CustomError.httpCode
        //     CustomError.message
        //     CustomError.timestamp

        (new CustomError("Not all who wander are lost", 1)).setHttpCode(1);
    }
}

