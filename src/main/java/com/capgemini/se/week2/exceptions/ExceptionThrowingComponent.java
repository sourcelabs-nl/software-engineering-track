package com.capgemini.se.week2.exceptions;

/**
 * Simple component class that throws an exception. It has two methods that
 * throw exceptions.
 */
public class ExceptionThrowingComponent {

    /**
     * This method throws a checked exception, and declares it (throw CheckedException)
     * to let all calling classes know it can/will throw a checked exception.
     * 
     * If you do not declare this exception in the throws clause, you'll encounter a
     * compiler error. Checked exceptions MUST be declared or caught.
     * 
     * @throws CheckedException
     */
    public void throwCheckedException() throws CheckedException {
        // Throw a checked exception
        throw new CheckedException();
    }

    /**
     * This method throws an unchecked exception. Notice how we do not have to declare
     * the exception in the throws clause, and we also do not have to catch it.
     */
    public void throwUncheckedException() {
        // throw an unchecked exception
        throw new UncheckedException();
    }
}
