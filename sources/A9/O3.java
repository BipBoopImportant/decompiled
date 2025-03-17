package a9;

import XH.C16807N;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import nI.C17631a;

public final class O3 {

    /* renamed from: a  reason: collision with root package name */
    public final C17052a f42175a = g.a(false);

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.SnapshotPausingController", f = "SnapshotPausingController.kt", l = {74}, m = "waitIfPaused")
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public C17052a f42176c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f42177d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ O3 f42178e;

        /* renamed from: f  reason: collision with root package name */
        public int f42179f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(O3 o32, C17164e<? super a> eVar) {
            super(eVar);
            this.f42178e = o32;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42177d = obj;
            this.f42179f |= Integer.MIN_VALUE;
            return this.f42178e.a((C17631a<C16807N>) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(nI.C17631a<XH.C16807N> r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a9.O3.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            a9.O3$a r0 = (a9.O3.a) r0
            int r1 = r0.f42179f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42179f = r1
            goto L_0x0018
        L_0x0013:
            a9.O3$a r0 = new a9.O3$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f42177d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42179f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            bK.a r6 = r0.f42176c
            XH.y.b(r7)
            goto L_0x004f
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            XH.y.b(r7)
            bK.a r7 = r5.f42175a
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x005a
            r6.invoke()
            bK.a r6 = r5.f42175a
            r0.f42176c = r6
            r0.f42179f = r3
            java.lang.Object r7 = r6.e(r4, r0)
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            XH.N r7 = XH.C16807N.f139792a     // Catch:{ all -> 0x0055 }
            r6.d(r4)
            return r7
        L_0x0055:
            r7 = move-exception
            r6.d(r4)
            throw r7
        L_0x005a:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.O3.a(nI.a, dI.e):java.lang.Object");
    }
}
