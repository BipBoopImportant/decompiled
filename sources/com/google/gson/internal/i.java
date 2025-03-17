package com.google.gson.internal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class i {
    private static void a(String str) {
        if (str.length() > 10000) {
            throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
        }
    }

    public static BigDecimal b(String str) {
        a(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs((long) bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: " + str);
    }

    public static BigInteger c(String str) {
        a(str);
        return new BigInteger(str);
    }
}
