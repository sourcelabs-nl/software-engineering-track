package com.capgemini.se.week2.exceptions;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class Main {

    /**
     * The try catch block catches an exception coming from the ExceptionThrowingComponent.
     * 
     * This exception has to be caught. Removing this block will result in a compiler error.
     * 
     */
    public void handleCheckedException() {
        try {
            new ExceptionThrowingComponent().throwCheckedException();
        }
        catch (final CheckedException ce) {
            System.out.println("Caught a checked exception");
        }
    }

    /**
     * This method is the same as the handleCheckedException, but instead of handling the
     * exception with a try-catch block, we just declared the exception to have it handled
     * by the caller of this method.
     * 
     * @throws CheckedException
     */
    public void declareCheckedException() throws CheckedException {
        new ExceptionThrowingComponent().throwCheckedException();
    }

    /**
     * This is the same code as the declareCheckedException - with one big difference: 
     * you do not HAVE to declare the exception in a throws declaration, or catch
     * it in a try catch. It still propagates up to the calling function.
     */
    public void withUncheckedException() {
        new ExceptionThrowingComponent().throwUncheckedException();
    }

    /**
     * This code is the same code as above, but it handles the exception, this means
     * it doesn't propagate up to the calling function.
     */
    public void catchUncheckedException() {
        try {
            new ExceptionThrowingComponent().throwUncheckedException();
        }
        catch(final UncheckedException unchecked) {
            System.out.println("Handled an unchecked exception");    
        }
    }
}

    