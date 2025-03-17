package com.contentsquare.android.sdk;

import XH.C16807N;
import android.view.View;
import com.contentsquare.android.sdk.C7158w0;
import com.optimizely.ab.config.FeatureVariable;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.O;
import nI.p;

/* renamed from: com.contentsquare.android.sdk.q0  reason: case insensitive filesystem */
public final class C7147q0 extends C17544u implements p<View, C7153u, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C7158w0.e f47590c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ O<C7153u> f47591d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7147q0(C7158w0.e eVar, O<C7153u> o10) {
        super(2);
        this.f47590c = eVar;
        this.f47591d = o10;
    }

    public final Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        T t10 = (C7153u) obj2;
        C17542s.j(view, "view");
        C17542s.j(t10, FeatureVariable.JSON_TYPE);
        if (C17542s.e(view.getParent(), this.f47590c.f47700f.a())) {
            this.f47591d.f144348a = t10;
        }
        return C16807N.f139792a;
    }
}
