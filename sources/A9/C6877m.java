package a9;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.sdk.C7124f0;
import com.contentsquare.android.sdk.C7161y;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;
import w8.c;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayViewModel$captureComposeSnapshot$1", f = "OverlayViewModel.kt", l = {187}, m = "invokeSuspend")
/* renamed from: a9.m  reason: case insensitive filesystem */
public final class C6877m extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42699c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C7161y f42700d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c f42701e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6877m(C7161y yVar, c cVar, C17164e<? super C6877m> eVar) {
        super(2, eVar);
        this.f42700d = yVar;
        this.f42701e = cVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C6877m(this.f42700d, this.f42701e, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C6877m(this.f42700d, this.f42701e, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f42699c;
        if (i10 == 0) {
            y.b(obj);
            X2 x22 = this.f42700d.f47720d;
            c cVar = this.f42701e;
            this.f42699c = 1;
            x22.getClass();
            Object g10 = C16310i.g(C16311i0.c(), new C7124f0(cVar, x22, (C17164e<? super C7124f0>) null), this);
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
