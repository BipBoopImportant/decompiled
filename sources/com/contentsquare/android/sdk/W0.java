package com.contentsquare.android.sdk;

import QJ.Q;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.ScrollViewCaptureUseCase$capture$2", f = "ScrollViewCaptureUseCase.kt", l = {37, 42, 49}, m = "invokeSuspend")
public final class W0 extends l implements p<Q, C17164e<? super x<? extends C16807N>>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public Object f47204c;

    /* renamed from: d  reason: collision with root package name */
    public Object f47205d;

    /* renamed from: e  reason: collision with root package name */
    public int f47206e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f47207f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ X0 f47208g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r1 f47209h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public W0(X0 x02, r1 r1Var, C17164e<? super W0> eVar) {
        super(2, eVar);
        this.f47208g = x02;
        this.f47209h = r1Var;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        W0 w02 = new W0(this.f47208g, this.f47209h, eVar);
        w02.f47207f = obj;
        return w02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((W0) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r11.f47206e
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 == r5) goto L_0x0031
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            java.lang.Object r0 = r11.f47205d
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r1 = r11.f47204c
            com.contentsquare.android.sdk.X0 r1 = (com.contentsquare.android.sdk.X0) r1
            java.lang.Object r2 = r11.f47207f
            XH.y.b(r12)
            goto L_0x010e
        L_0x0021:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0029:
            XH.y.b(r12)     // Catch:{ all -> 0x002e }
            goto L_0x00d2
        L_0x002e:
            r12 = move-exception
            goto L_0x00eb
        L_0x0031:
            java.lang.Object r1 = r11.f47205d
            com.contentsquare.android.sdk.X0 r1 = (com.contentsquare.android.sdk.X0) r1
            java.lang.Object r6 = r11.f47204c
            com.contentsquare.android.sdk.r1 r6 = (com.contentsquare.android.sdk.r1) r6
            java.lang.Object r7 = r11.f47207f
            com.contentsquare.android.sdk.X0 r7 = (com.contentsquare.android.sdk.X0) r7
            XH.y.b(r12)     // Catch:{ all -> 0x002e }
            goto L_0x008e
        L_0x0041:
            XH.y.b(r12)
            java.lang.Object r12 = r11.f47207f
            QJ.Q r12 = (QJ.Q) r12
            com.contentsquare.android.sdk.X0 r1 = r11.f47208g
            com.contentsquare.android.sdk.r1 r6 = r11.f47209h
            XH.x$a r12 = XH.x.f139812b     // Catch:{ all -> 0x002e }
            a9.U2 r12 = r1.f47213c     // Catch:{ all -> 0x002e }
            java.util.concurrent.atomic.AtomicBoolean r12 = r12.f42318a     // Catch:{ all -> 0x002e }
            r12.set(r4)     // Catch:{ all -> 0x002e }
            android.view.View r12 = r6.a()     // Catch:{ all -> 0x002e }
            com.contentsquare.android.sdk.l1 r7 = r1.f47212b     // Catch:{ all -> 0x002e }
            r7.getClass()     // Catch:{ all -> 0x002e }
            java.lang.String r7 = "view"
            kotlin.jvm.internal.C17542s.j(r12, r7)     // Catch:{ all -> 0x002e }
            com.contentsquare.android.sdk.l1$a r7 = new com.contentsquare.android.sdk.l1$a     // Catch:{ all -> 0x002e }
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x002e }
            r8.<init>(r12)     // Catch:{ all -> 0x002e }
            android.graphics.Point r9 = new android.graphics.Point     // Catch:{ all -> 0x002e }
            int r10 = r12.getScrollX()     // Catch:{ all -> 0x002e }
            int r12 = r12.getScrollY()     // Catch:{ all -> 0x002e }
            r9.<init>(r10, r12)     // Catch:{ all -> 0x002e }
            r7.<init>(r8, r9)     // Catch:{ all -> 0x002e }
            r1.f47217g = r7     // Catch:{ all -> 0x002e }
            com.contentsquare.android.sdk.v1 r12 = r1.f47214d     // Catch:{ all -> 0x002e }
            r11.f47207f = r1     // Catch:{ all -> 0x002e }
            r11.f47204c = r6     // Catch:{ all -> 0x002e }
            r11.f47205d = r1     // Catch:{ all -> 0x002e }
            r11.f47206e = r5     // Catch:{ all -> 0x002e }
            java.lang.Object r12 = r12.a(r6, r11)     // Catch:{ all -> 0x002e }
            if (r12 != r0) goto L_0x008d
            return r0
        L_0x008d:
            r7 = r1
        L_0x008e:
            com.contentsquare.android.sdk.v1$a r12 = (com.contentsquare.android.sdk.v1.a) r12     // Catch:{ all -> 0x002e }
            r1.f47216f = r12     // Catch:{ all -> 0x002e }
            r7.getClass()     // Catch:{ all -> 0x002e }
            android.view.View r12 = r6.a()     // Catch:{ all -> 0x002e }
            boolean r1 = r6 instanceof com.contentsquare.android.sdk.r1.a     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x00a7
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ all -> 0x002e }
            int r12 = r12.getScrollX()     // Catch:{ all -> 0x002e }
            r1.<init>(r12, r4)     // Catch:{ all -> 0x002e }
            goto L_0x00ba
        L_0x00a7:
            boolean r1 = r6 instanceof com.contentsquare.android.sdk.r1.b     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x00ad
            r1 = r5
            goto L_0x00af
        L_0x00ad:
            boolean r1 = r6 instanceof com.contentsquare.android.sdk.r1.c     // Catch:{ all -> 0x002e }
        L_0x00af:
            if (r1 == 0) goto L_0x00e5
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ all -> 0x002e }
            int r12 = r12.getScrollY()     // Catch:{ all -> 0x002e }
            r1.<init>(r4, r12)     // Catch:{ all -> 0x002e }
        L_0x00ba:
            int r12 = r1.x     // Catch:{ all -> 0x002e }
            r4 = 0
            if (r12 < 0) goto L_0x00d5
            int r12 = r1.y     // Catch:{ all -> 0x002e }
            if (r12 < 0) goto L_0x00d5
            r11.f47207f = r4     // Catch:{ all -> 0x002e }
            r11.f47204c = r4     // Catch:{ all -> 0x002e }
            r11.f47205d = r4     // Catch:{ all -> 0x002e }
            r11.f47206e = r3     // Catch:{ all -> 0x002e }
            java.lang.Object r12 = com.contentsquare.android.sdk.X0.b(r7, r1, r6, r11)     // Catch:{ all -> 0x002e }
            if (r12 != r0) goto L_0x00d2
            return r0
        L_0x00d2:
            XH.N r12 = XH.C16807N.f139792a     // Catch:{ all -> 0x002e }
            goto L_0x00e0
        L_0x00d5:
            D8.c r12 = new D8.c     // Catch:{ all -> 0x002e }
            r12.<init>(r4, r5, r4)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "Unable to determine target scroll coordinates"
            XH.N r12 = r12.f(r1)     // Catch:{ all -> 0x002e }
        L_0x00e0:
            java.lang.Object r12 = XH.x.b(r12)     // Catch:{ all -> 0x002e }
            goto L_0x00f5
        L_0x00e5:
            XH.t r12 = new XH.t     // Catch:{ all -> 0x002e }
            r12.<init>()     // Catch:{ all -> 0x002e }
            throw r12     // Catch:{ all -> 0x002e }
        L_0x00eb:
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r12 = XH.y.a(r12)
            java.lang.Object r12 = XH.x.b(r12)
        L_0x00f5:
            com.contentsquare.android.sdk.X0 r1 = r11.f47208g
            java.lang.Throwable r3 = XH.x.e(r12)
            if (r3 == 0) goto L_0x0114
            r11.f47207f = r12
            r11.f47204c = r1
            r11.f47205d = r3
            r11.f47206e = r2
            java.lang.Object r2 = QJ.s1.a(r11)
            if (r2 != r0) goto L_0x010c
            return r0
        L_0x010c:
            r2 = r12
            r0 = r3
        L_0x010e:
            com.contentsquare.android.sdk.x0 r12 = r1.f47211a
            r12.d(r0)
            r12 = r2
        L_0x0114:
            XH.x r12 = XH.x.a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.W0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
