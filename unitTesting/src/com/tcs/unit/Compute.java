
package com.tcs.unit;

public class Compute {

    public double add(double a, double b) {
        return a + b;
    }

    public boolean isPrime(double num) {
        if (num < 2) return false;
        if (num == 2) return true	;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}