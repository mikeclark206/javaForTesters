package com.javafortesters.chap003myfirsttest.examples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2=4",4, answer);
    }

    @Test
    public void canSubtractTwoMinusTwo(){
        int answer =2-2;
        assertEquals("2-2=0", 0,answer);
    }

    @Test
    public void fourDividedByTwo(){
        int answer = 4/2;
        assertEquals("4/2=2",2,answer);
    }

    @Test
    public void twoTimesTwo(){
        int answer = 2*2;
        assertEquals("2*2=4",4,answer);
    }

}

