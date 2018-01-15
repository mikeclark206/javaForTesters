package com.javafortesters.chap005testwithourownclasses.domainobject.examples;


import org.junit.Assert;
import org.junit.Test;
import static com.javafortesters.domainobject.TestAppEnv.*;
//import static org.junit.Assert;

/**
 * Filename: TestAppEnvironmentTest
 * Created By: mikec
 * Date: 1/10/2018
 * Project: javaForTesters
 * Package: com.javafortesters.chap005testwithourownclasses.domainobject.examples
 * Description:
 */
public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically() {

        Assert.assertEquals("Returns Hard Coded URL",
                "http://184.168.47.225:80",
                getUrl()
                );
    }

    @Test
    public void canGetDomainAndPortStatically(){

        Assert.assertEquals("Just the Domain",
                "184.168.47.225",
                DOMAIN);

        Assert.assertEquals("Just the port",
                "80",
                PORT);
    }

}
