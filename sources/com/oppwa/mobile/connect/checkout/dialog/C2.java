package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.payment.token.Token;
import java.util.Comparator;
import java.util.LinkedList;

public final /* synthetic */ class C2 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LinkedList f120867a;

    public /* synthetic */ C2(LinkedList linkedList) {
        this.f120867a = linkedList;
    }

    public final int compare(Object obj, Object obj2) {
        return C14122y.a(this.f120867a, (Token) obj, (Token) obj2);
    }
}
