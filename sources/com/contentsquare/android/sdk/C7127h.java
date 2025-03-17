package com.contentsquare.android.sdk;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.sdk.r1;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayViewModel$captureRecyclerViewSnapshot$1", f = "OverlayViewModel.kt", l = {175}, m = "invokeSuspend")
/* renamed from: com.contentsquare.android.sdk.h  reason: case insensitive filesystem */
public final class C7127h extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f47418c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C7161y f47419d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r1.b f47420e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7127h(C7161y yVar, r1.b bVar, C17164e<? super C7127h> eVar) {
        super(2, eVar);
        this.f47419d = yVar;
        this.f47420e = bVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C7127h(this.f47419d, this.f47420e, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C7127h(this.f47419d, this.f47420e, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f47418c;
        if (i10 == 0) {
            y.b(obj);
            C7141n1 n1Var = this.f47419d.f47719c;
            r1.b bVar = this.f47420e;
            this.f47418c = 1;
            n1Var.getClass();
            Object g10 = C16310i.g(C16311i0.c(), new q1(n1Var, bVar, (C17164e<? super q1>) null), this);
            if (g10 != C17187b.f()) {
                g10 = C16807N.f139792a;
            }
            if (g10 == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C16807N.f139792a;
    }
}
