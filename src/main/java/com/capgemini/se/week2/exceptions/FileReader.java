package com.capgemini.se.week2.exceptions;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class FileReader {

    public String readFile() throws FileNotFoundException {
        // do some reading from filesystem
        //        throw new IOException();
        throw new FileNotFoundException();
    }
}
