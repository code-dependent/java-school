package com.lambdaschool.schools.exceptions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;

@Component
public class CustomErrorDetails extends DefaultErrorAttributes
{

    @Autowired
    private HelpFunctions helper;


}
