package com.contentsquare.android.sdk;

import QJ.Q;
import XH.C16807N;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.d;
import dI.C17164e;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayViewModel$captureSnapshot$1", f = "OverlayViewModel.kt", l = {93}, m = "invokeSuspend")
/* renamed from: com.contentsquare.android.sdk.o  reason: case insensitive filesystem */
public final class C7142o extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public C7145p0 f47555c;

    /* renamed from: d  reason: collision with root package name */
    public int f47556d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C7161y f47557e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p<C7145p0, C17164e<? super Boolean>, Object> f47558f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7142o(C7161y yVar, d.a aVar, C17164e eVar) {
        super(2, eVar);
        this.f47557e = yVar;
        this.f47558f = aVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C7142o(this.f47557e, (d.a) this.f47558f, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C7142o(this.f47557e, (d.a) this.f47558f, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b7, code lost:
        if (r12 == null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        r1 = androidx.lifecycle.l0.a(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r11.f47556d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001c
            if (r2 != r3) goto L_0x0014
            com.contentsquare.android.sdk.p0 r0 = r11.f47555c
            XH.y.b(r12)
            goto L_0x00cf
        L_0x0014:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001c:
            XH.y.b(r12)
            com.contentsquare.android.sdk.y r12 = r11.f47557e
            a9.O3 r12 = r12.f47726j
            r12.getClass()
            bK.a r12 = r12.f42175a     // Catch:{ IllegalStateException -> 0x002b }
            bK.C17052a.C3460a.c(r12, r4, r3, r4)     // Catch:{ IllegalStateException -> 0x002b }
        L_0x002b:
            com.contentsquare.android.sdk.y r12 = r11.f47557e
            a9.p6 r2 = r12.f47722f
            a9.D4 r2 = (a9.D4) r2
            java.lang.ref.WeakReference<android.view.ViewGroup> r2 = r2.f41964h
            java.lang.Object r2 = r2.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x00bc
            com.contentsquare.android.sdk.s0 r12 = r12.f47723g
            r12.getClass()
            java.lang.String r5 = "rootView"
            kotlin.jvm.internal.C17542s.j(r2, r5)
            android.view.View[] r5 = new android.view.View[r3]
            r5[r0] = r2
            java.util.List r5 = YH.C16877v.t(r5)
        L_0x004d:
            java.lang.Object r6 = r5.remove(r0)
            android.view.View r6 = (android.view.View) r6
            a9.T2 r7 = r12.f47616d
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.String r8 = "com.facebook.react.ReactRootView"
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r8)
            if (r7 == 0) goto L_0x006b
            D8.c r12 = r12.f47617e
            java.lang.String r0 = "Snapshot config: React Native Screen found, returning RegularSnapshot"
            r12.f(r0)
            com.contentsquare.android.sdk.p0$a r12 = com.contentsquare.android.sdk.C7145p0.a.f47584a
            goto L_0x00b7
        L_0x006b:
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x0078
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            GJ.h r6 = I2.C4610g0.b(r6)
            YH.C16877v.D(r5, r6)
        L_0x0078:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x004d
            com.contentsquare.android.sdk.p0 r5 = r12.a(r2, r3)
            boolean r6 = r5 instanceof com.contentsquare.android.sdk.C7145p0.a
            if (r6 != 0) goto L_0x009f
            boolean r6 = r5 instanceof com.contentsquare.android.sdk.C7145p0.b
            if (r6 != 0) goto L_0x009f
            D8.c r12 = r12.f47617e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Snapshot config: preferVerticalScroll == true, returning "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r12.f(r0)
            r12 = r5
            goto L_0x00b7
        L_0x009f:
            com.contentsquare.android.sdk.p0 r0 = r12.a(r2, r0)
            D8.c r12 = r12.f47617e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Snapshot config: preferVerticalScroll == false, returning "
            r2.<init>(r5)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r12.f(r2)
            r12 = r0
        L_0x00b7:
            if (r12 != 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r0 = r12
            goto L_0x00c2
        L_0x00bc:
            com.contentsquare.android.sdk.p0$b r12 = new com.contentsquare.android.sdk.p0$b
            r12.<init>()
            goto L_0x00ba
        L_0x00c2:
            nI.p<com.contentsquare.android.sdk.p0, dI.e<? super java.lang.Boolean>, java.lang.Object> r12 = r11.f47558f
            r11.f47555c = r0
            r11.f47556d = r3
            java.lang.Object r12 = r12.invoke(r0, r11)
            if (r12 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x00da
            XH.N r12 = XH.C16807N.f139792a
            return r12
        L_0x00da:
            com.contentsquare.android.sdk.y r12 = r11.f47557e
            a9.p6 r1 = r12.f47722f
            a9.D4 r1 = (a9.D4) r1
            java.lang.ref.WeakReference<android.view.ViewGroup> r1 = r1.f41964h
            java.lang.Object r1 = r1.get()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x00f5
            androidx.lifecycle.y r1 = androidx.lifecycle.l0.a(r1)
            if (r1 == 0) goto L_0x00f5
            androidx.lifecycle.r r1 = r1.getLifecycle()
            goto L_0x00f6
        L_0x00f5:
            r1 = r4
        L_0x00f6:
            if (r1 == 0) goto L_0x00fd
            f8.a r12 = r12.f47730n
            r1.c(r12)
        L_0x00fd:
            com.contentsquare.android.sdk.y r12 = r11.f47557e
            int r1 = r12.f47729m
            r2 = 26
            java.lang.String r3 = ""
            if (r1 < r2) goto L_0x01d6
            boolean r1 = r0 instanceof com.contentsquare.android.sdk.C7145p0.a
            if (r1 == 0) goto L_0x011f
            dI.i r0 = r12.f47727k
            QJ.Q r5 = QJ.S.a(r0)
            a9.C r8 = new a9.C
            r8.<init>(r12, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            QJ.F0 unused = QJ.C16314k.d(r5, r6, r7, r8, r9, r10)
            goto L_0x01d3
        L_0x011f:
            boolean r1 = r0 instanceof com.contentsquare.android.sdk.r1.b
            if (r1 == 0) goto L_0x0153
            com.contentsquare.android.sdk.r1$b r0 = (com.contentsquare.android.sdk.r1.b) r0
            android.view.View r1 = r0.f47611a
            boolean r1 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r1 == 0) goto L_0x013f
            dI.i r1 = r12.f47727k
            QJ.Q r5 = QJ.S.a(r1)
            com.contentsquare.android.sdk.h r8 = new com.contentsquare.android.sdk.h
            r8.<init>(r12, r0, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            QJ.F0 unused = QJ.C16314k.d(r5, r6, r7, r8, r9, r10)
            goto L_0x01d3
        L_0x013f:
            dI.i r1 = r12.f47727k
            QJ.Q r5 = QJ.S.a(r1)
            com.contentsquare.android.sdk.l r8 = new com.contentsquare.android.sdk.l
            r8.<init>(r12, r0, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            QJ.F0 unused = QJ.C16314k.d(r5, r6, r7, r8, r9, r10)
            goto L_0x01d3
        L_0x0153:
            boolean r1 = r0 instanceof com.contentsquare.android.sdk.C7145p0.b
            if (r1 == 0) goto L_0x0187
            D8.c r12 = r12.f47728l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown snapshot configuration: "
            r1.<init>(r2)
            com.contentsquare.android.sdk.p0$b r0 = (com.contentsquare.android.sdk.C7145p0.b) r0
            java.lang.String r0 = r0.f47585a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.h(r0)
            com.contentsquare.android.sdk.y r12 = r11.f47557e
            TJ.B<com.contentsquare.android.sdk.k0> r0 = r12.f47725i
            com.contentsquare.android.sdk.k0$a r1 = new com.contentsquare.android.sdk.k0$a
            com.contentsquare.android.sdk.k0$b$e r2 = com.contentsquare.android.sdk.C7134k0.b.e.f47474a
            a9.p6 r12 = r12.f47722f
            a9.D4 r12 = (a9.D4) r12
            java.lang.String r12 = r12.f41961e
            if (r12 != 0) goto L_0x017f
            goto L_0x0180
        L_0x017f:
            r3 = r12
        L_0x0180:
            r1.<init>(r2, r3)
            r0.a(r1)
            goto L_0x01d3
        L_0x0187:
            boolean r1 = r0 instanceof com.contentsquare.android.sdk.p1.a
            if (r1 == 0) goto L_0x01c1
            com.contentsquare.android.sdk.p1$a r0 = (com.contentsquare.android.sdk.p1.a) r0
            w8.d r0 = r0.f47586a
            boolean r1 = r0 instanceof w8.b
            if (r1 == 0) goto L_0x01a8
            w8.b r0 = (w8.b) r0
            dI.i r1 = r12.f47727k
            QJ.Q r5 = QJ.S.a(r1)
            a9.c r8 = new a9.c
            r8.<init>(r12, r0, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            QJ.F0 unused = QJ.C16314k.d(r5, r6, r7, r8, r9, r10)
            goto L_0x01d3
        L_0x01a8:
            boolean r1 = r0 instanceof w8.c
            if (r1 == 0) goto L_0x01d3
            w8.c r0 = (w8.c) r0
            dI.i r1 = r12.f47727k
            QJ.Q r5 = QJ.S.a(r1)
            a9.m r8 = new a9.m
            r8.<init>(r12, r0, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            QJ.F0 unused = QJ.C16314k.d(r5, r6, r7, r8, r9, r10)
            goto L_0x01d3
        L_0x01c1:
            dI.i r0 = r12.f47727k
            QJ.Q r5 = QJ.S.a(r0)
            a9.C r8 = new a9.C
            r8.<init>(r12, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            QJ.F0 unused = QJ.C16314k.d(r5, r6, r7, r8, r9, r10)
        L_0x01d3:
            XH.N r12 = XH.C16807N.f139792a
            return r12
        L_0x01d6:
            D8.c r12 = r12.f47728l
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Minimum API level for snapshot is not met: "
            r0.<init>(r1)
            com.contentsquare.android.sdk.y r1 = r11.f47557e
            int r1 = r1.f47729m
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.h(r0)
            com.contentsquare.android.sdk.y r12 = r11.f47557e
            TJ.B<com.contentsquare.android.sdk.k0> r0 = r12.f47725i
            com.contentsquare.android.sdk.k0$a r1 = new com.contentsquare.android.sdk.k0$a
            com.contentsquare.android.sdk.k0$b$b r2 = com.contentsquare.android.sdk.C7134k0.b.C0819b.f47471a
            a9.p6 r12 = r12.f47722f
            a9.D4 r12 = (a9.D4) r12
            java.lang.String r12 = r12.f41961e
            if (r12 != 0) goto L_0x01fe
            goto L_0x01ff
        L_0x01fe:
            r3 = r12
        L_0x01ff:
            r1.<init>(r2, r3)
            r0.a(r1)
            XH.N r12 = XH.C16807N.f139792a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7142o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
