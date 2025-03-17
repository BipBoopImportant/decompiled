package com.oppwa.mobile.connect.payment.bankaccount;

import android.text.TextUtils;
import java.util.regex.Pattern;

class d {

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f121836a;

    private static Pattern a() {
        if (f121836a == null) {
            f121836a = Pattern.compile("[A-Z]{2}[0-9]{2}[A-Z0-9]{11,27}");
        }
        return f121836a;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String upperCase = str.replaceAll("\\s", "").toUpperCase();
        return a().matcher(upperCase).matches() && a(upperCase) == 1;
    }

    private static int a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(4));
        sb2.append(str.substring(0, 4));
        long j10 = 0;
        for (char numericValue : sb2.toString().toCharArray()) {
            int numericValue2 = Character.getNumericValue(numericValue);
            j10 = (j10 * (numericValue2 > 9 ? 100 : 10)) + ((long) numericValue2);
            if (j10 > 999999999) {
                j10 %= 97;
            }
        }
        return (int) (j10 % 97);
    }
}
