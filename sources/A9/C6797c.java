package a9;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.sdk.C7161y;
import com.contentsquare.android.sdk.V;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;
import w8.b;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayViewModel$captureComposeLazySnapshot$1", f = "OverlayViewModel.kt", l = {181}, m = "invokeSuspend")
/* renamed from: a9.c  reason: case insensitive filesystem */
public final class C6797c extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42473c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C7161y f42474d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f42475e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6797c(C7161y yVar, b bVar, C17164e<? super C6797c> eVar) {
        super(2, eVar);
        this.f42474d = yVar;
        this.f42475e = bVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C6797c(this.f42474d, this.f42475e, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C6797c(this.f42474d, this.f42475e, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f42473c;
        if (i10 == 0) {
            y.b(obj);
            C6856j2 j2Var = this.f42474d.f47721e;
            b bVar = this.f42475e;
            this.f42473c = 1;
            j2Var.getClass();
            Object g10 = C16310i.g(C16311i0.c(), new V(j2Var, bVar, (C17164e<? super V>) null), this);
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
