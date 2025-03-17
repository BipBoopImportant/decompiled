package a9;

import QJ.Q;
import XH.C16807N;
import com.contentsquare.android.sdk.C7161y;
import dI.C17164e;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayViewModel$resumeSnapshot$1", f = "OverlayViewModel.kt", l = {156}, m = "invokeSuspend")
public final class X extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42373c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C7161y f42374d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public X(C7161y yVar, C17164e<? super X> eVar) {
        super(2, eVar);
        this.f42374d = yVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new X(this.f42374d, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new X(this.f42374d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (r5 == eI.C17187b.f()) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r4.f42373c
            r2 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r2) goto L_0x000f
            XH.y.b(r5)
            goto L_0x0048
        L_0x000f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0017:
            XH.y.b(r5)
            com.contentsquare.android.sdk.y r5 = r4.f42374d
            com.contentsquare.android.sdk.X0 r5 = r5.f47718b
            r4.f42373c = r2
            a9.U2 r1 = r5.f47213c
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f42318a
            r2 = 0
            r1.set(r2)
            com.contentsquare.android.sdk.X0$d r1 = r5.f47215e
            if (r1 == 0) goto L_0x0043
            r2 = 0
            r5.f47215e = r2
            QJ.P0 r5 = QJ.C16311i0.c()
            a9.z5 r3 = new a9.z5
            r3.<init>(r1, r2)
            java.lang.Object r5 = QJ.C16310i.g(r5, r3, r4)
            java.lang.Object r1 = eI.C17187b.f()
            if (r5 != r1) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            XH.N r5 = XH.C16807N.f139792a
        L_0x0045:
            if (r5 != r0) goto L_0x0048
            return r0
        L_0x0048:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.X.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
