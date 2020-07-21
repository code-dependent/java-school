package com.lambdaschool.schools.exceptions;

public class ResourceFoundException extends RuntimeException
{
    public ResourceFoundException(String message)
    {
        super("Error From a Lambda App: "+message);
    }
}