
package com.tcs.unit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClass {

    private static Compute compute;

    @BeforeAll
    static void setUpAll() {
        compute = new Compute();
    }

    @AfterAll
    static void tearDownAll() {
        compute = null; // cleanup
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("running a test...");
    }

    @Test
    void testAdd() {
        double a = 10;
        double b = 20;
        double expected = 30;
        double actual = compute.add(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void testPrimes() {
        assertTrue(compute.isPrime(2));
        assertTrue(compute.isPrime(13));
        assertTrue(compute.isPrime(5));   
        assertFalse(compute.isPrime(4));
        assertFalse(compute.isPrime(1));
        assertFalse(compute.isPrime(0));
        assertFalse(compute.isPrime(-7));
    }
}
