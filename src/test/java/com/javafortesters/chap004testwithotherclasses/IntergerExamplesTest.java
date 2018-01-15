package com.javafortesters.chap004testwithotherclasses;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Filename: IntergerExamplesTest
 * Created By: mikec
 * Date: 12/23/2017
 * Project: javaForTesters
 * Package: com.javafortesters.chap004testwithotherclasses
 * Description:
 */
public class IntergerExamplesTest {

    @Test
    public void integerExploration () {

        Integer four = new Integer(4);
        assertEquals("intValue returns int 4",
                4,four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns int 5",
                5, five.intValue());

        Integer six = 6;
        assertEquals("autoboxing assignment for 6",
                6, six.intValue());
        }

    @Test
    public void toHexString(){
        assertEquals("hex 11 is b", "b",
                Integer.toHexString(11));

        assertEquals("hex 10 is a", "a",
                Integer.toHexString(10));

        assertEquals("hex 3 is 3", "3",
                Integer.toHexString(3));

        assertEquals("21 becomes 15", "15",
                Integer.toHexString(21));
        }

    @Test
    public void minMax(){
        int min = -2147483648;
        int max = 2147483647;

        assertEquals("Min value is -2147483648",min,
                Integer.MIN_VALUE);
        assertEquals("Max value is  2147483647", max,
                Integer.MAX_VALUE);

    }

}
