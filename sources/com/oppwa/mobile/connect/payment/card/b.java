package com.oppwa.mobile.connect.payment.card;

class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f121866a = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};

    static boolean a(String str) {
        String replaceAll = str.replaceAll("[^0-9]", "");
        if (replaceAll.length() == 0) {
            return false;
        }
        String stringBuffer = new StringBuffer(replaceAll).reverse().toString();
        int i10 = 0;
        for (int i11 = 0; i11 < stringBuffer.length(); i11++) {
            int digit = Character.digit(stringBuffer.charAt(i11), 10);
            if (i11 % 2 == 1) {
                digit = f121866a[digit];
            }
            i10 += digit;
        }
        return i10 % 10 == 0;
    }
}
