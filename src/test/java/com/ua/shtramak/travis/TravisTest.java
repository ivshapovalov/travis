package com.ua.shtramak.travis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TravisTest {
    @Test
    public void helloInAnyCaseReturnsHelloTravis() {
        assertEquals("Hello Travis", new Travis().helloTravis());
    }
}
