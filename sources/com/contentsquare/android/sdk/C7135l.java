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

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayViewModel$captureScrollViewSnapshot$1", f = "OverlayViewModel.kt", l = {193}, m = "invokeSuspend")
/* renamed from: com.contentsquare.android.sdk.l  reason: case insensitive filesystem */
public final class C7135l extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f47490c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C7161y f47491d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r1.b f47492e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7135l(C7161y yVar, r1.b bVar, C17164e<? super C7135l> eVar) {
        super(2, eVar);
        this.f47491d = yVar;
        this.f47492e = bVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C7135l(this.f47491d, this.f47492e, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C7135l(this.f47491d, this.f47492e, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f47490c;
        if (i10 == 0) {
            y.b(obj);
            X0 x02 = this.f47491d.f47718b;
            r1.b bVar = this.f47492e;
            this.f47490c = 1;
            x02.getClass();
            Object g10 = C16310i.g(C16311i0.c(), new W0(x02, bVar, (C17164e<? super W0>) null), this);
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
