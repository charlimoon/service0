package com.service.service0.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService0 {

      Service0Delegate service0Delegate = new Service0Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = service0Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
