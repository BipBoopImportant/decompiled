package com.oppwa.mobile.connect.payment;

import com.oppwa.mobile.connect.payment.token.Token;

class a {
    static Token[] a(Token[] tokenArr) {
        if (tokenArr == null) {
            return null;
        }
        int length = tokenArr.length;
        Token[] tokenArr2 = new Token[length];
        for (int i10 = 0; i10 < length; i10++) {
            Token token = tokenArr[i10];
            tokenArr2[i10] = token.copyToken(token);
        }
        return tokenArr2;
    }
}
