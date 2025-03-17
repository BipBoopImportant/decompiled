package com.oppwa.mobile.connect.core.nfc;

import com.oppwa.mobile.connect.core.nfc.model.EmvTag;
import com.oppwa.mobile.connect.core.nfc.model.apdu.ResponseApdu;
import java.security.SecureRandom;
import java.util.Locale;

class a {
    public static boolean a(byte b10) {
        return (b10 & 31) == 31;
    }

    public static String b(byte b10) {
        return String.format(Locale.US, "%02X", new Object[]{Byte.valueOf(b10)});
    }

    public static boolean a(int i10, EmvTag emvTag) {
        return i10 > 0 && i10 >= emvTag.getMinLength() && i10 <= emvTag.getMaxLength();
    }

    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(b(b10));
        }
        return sb2.toString();
    }

    public static byte[] a(String str) {
        int length = str.length();
        if (length == 0 || length % 2 != 0) {
            return null;
        }
        byte[] bArr = new byte[(length / 2)];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((a(str.charAt(i10)) << 4) + a(str.charAt(i10 + 1)));
        }
        return bArr;
    }

    private static int a(char c10) {
        return Character.digit(c10, 16);
    }

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static String a(ResponseApdu responseApdu) {
        return String.format("[%s_%s]", new Object[]{b(responseApdu.getSw1()), b(responseApdu.getSw2())});
    }
}
