package com.example.testing.util.excepcions;

import org.junit.Test;

public class EntityNotFoundExceptionDiffblueTest {
    /**
     * Method under test: {@link EntityNotFoundException#setHttpCode(int)}
     */
    @Test
    public void testSetHttpCode() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     EntityNotFoundException.httpCode
        //     Throwable.cause
        //     Throwable.detailMessage
        //     Throwable.stackTrace
        //     Throwable.suppressedExceptions

        (new EntityNotFoundException("An error occurred", 1)).setHttpCode(1);
    }
}

