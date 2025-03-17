package com.contentsquare.android.sdk;

import android.graphics.Rect;
import com.contentsquare.android.sdk.C7141n1;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class w1 extends C17544u implements C17642l<C7141n1.a, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Rect f47701c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w1(Rect rect) {
        super(1);
        this.f47701c = rect;
    }

    public final Object invoke(Object obj) {
        C7141n1.a aVar = (C7141n1.a) obj;
        C17542s.j(aVar, "itemView");
        return Boolean.valueOf(aVar.f47547c.bottom <= this.f47701c.bottom);
    }
}
