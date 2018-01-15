package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Filename: FailingAssert
 * Created By: mikec
 * Date: 12/22/2017
 * Project: javaForTesters
 * Package: com.javafortesters.chap003myfirsttest.examples
 * Description:
 */
public class TestIsFailing {
    @Test
    public void FailingAssertTrue(){
        int answer = 9+9;
       assertEquals("9+9=18",18, answer);
    }
}
