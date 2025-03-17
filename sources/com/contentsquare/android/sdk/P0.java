package com.contentsquare.android.sdk;

import YH.C16870n;
import com.contentsquare.android.sdk.M0;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public final class P0 implements M0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<M0> f47115a;

    public P0(M0... m0Arr) {
        C17542s.j(m0Arr, "resolvers");
        this.f47115a = C16870n.c1(m0Arr);
    }

    public final I0 a(M0.a aVar) {
        C17542s.j(aVar, "request");
        for (M0 a10 : this.f47115a) {
            I0 a11 = a10.a(aVar);
            if (a11 != null) {
                return a11;
            }
        }
        return null;
    }
}
