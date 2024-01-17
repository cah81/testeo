package com.example.testing.util.excepcions;

import org.junit.Test;

public class UnprocessableEntityExceptionDiffblueTest {
    /**
     * Method under test: {@link UnprocessableEntityException#setHttpCode(int)}
     */
    @Test
    public void testSetHttpCode() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     UnprocessableEntityException.httpCode
        //     Throwable.cause
        //     Throwable.detailMessage
        //     Throwable.stackTrace
        //     Throwable.suppressedExceptions

        (new UnprocessableEntityException("An error occurred", 1)).setHttpCode(1);
    }
}

