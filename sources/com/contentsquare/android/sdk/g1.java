package com.contentsquare.android.sdk;

import android.graphics.Rect;
import com.contentsquare.android.sdk.M0;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import w8.e;

public final class g1 extends C17544u implements C17642l<e, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ M0.a f47417c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g1(M0.a aVar) {
        super(1);
        this.f47417c = aVar;
    }

    public final Object invoke(Object obj) {
        boolean z10;
        e eVar = (e) obj;
        C17542s.j(eVar, "child");
        if (!eVar.h()) {
            Rect e10 = eVar.e();
            M0.a aVar = this.f47417c;
            if (e10.contains(aVar.f47042b, aVar.f47043c)) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
