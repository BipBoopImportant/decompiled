package com.adjust.sdk.sig;

class Util {
    private static final char[] hexArray = "0123456789ABCDEF".toCharArray();

    Util() {
    }

    static String bytesToHex(byte[] bArr, int i10) {
        char[] cArr = new char[(i10 * 2)];
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = bArr[i11];
            int i12 = i11 * 2;
            char[] cArr2 = hexArray;
            cArr[i12] = cArr2[(b10 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}
