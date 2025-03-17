package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C7141n1;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class u1 extends C17544u implements C17642l<C7141n1.a, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C7141n1 f47656c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u1(C7141n1 n1Var) {
        super(1);
        this.f47656c = n1Var;
    }

    public final Object invoke(Object obj) {
        C7141n1.a aVar = (C7141n1.a) obj;
        C17542s.j(aVar, "itemView");
        return Boolean.valueOf(this.f47656c.f47542f.contains(Integer.valueOf(aVar.f47546b)));
    }
}
