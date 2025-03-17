package com.contentsquare.android.sdk;

import XH.C16807N;
import a9.C6783a1;
import a9.D3;
import a9.J3;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a;
import com.contentsquare.android.sdk.c1;
import dI.C17164e;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;

public final class I implements J3 {

    /* renamed from: a  reason: collision with root package name */
    public final C6783a1 f46999a;

    /* renamed from: b  reason: collision with root package name */
    public final C17631a<C16807N> f47000b;

    /* renamed from: c  reason: collision with root package name */
    public c1 f47001c;

    /* renamed from: d  reason: collision with root package name */
    public C17642l<? super D3, C16807N> f47002d;

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.statusdialog.StatusDialogManager", f = "StatusDialogManager.kt", l = {36}, m = "showDialog")
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public c1 f47003c;

        /* renamed from: d  reason: collision with root package name */
        public I f47004d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f47005e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ I f47006f;

        /* renamed from: g  reason: collision with root package name */
        public int f47007g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(I i10, C17164e<? super a> eVar) {
            super(eVar);
            this.f47006f = i10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f47005e = obj;
            this.f47007g |= Integer.MIN_VALUE;
            return this.f47006f.b(this);
        }
    }

    public I(C6783a1 a1Var, a.g gVar) {
        C17542s.j(a1Var, "liveActivityProvider");
        C17542s.j(gVar, "onDialogDismissed");
        this.f46999a = a1Var;
        this.f47000b = gVar;
    }

    public final void a() {
        this.f47000b.invoke();
        this.f47001c = null;
        this.f47002d = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.contentsquare.android.sdk.I.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.contentsquare.android.sdk.I$a r0 = (com.contentsquare.android.sdk.I.a) r0
            int r1 = r0.f47007g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f47007g = r1
            goto L_0x0018
        L_0x0013:
            com.contentsquare.android.sdk.I$a r0 = new com.contentsquare.android.sdk.I$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f47005e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f47007g
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            com.contentsquare.android.sdk.I r1 = r0.f47004d
            com.contentsquare.android.sdk.c1 r0 = r0.f47003c
            XH.y.b(r5)
            goto L_0x0058
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            XH.y.b(r5)
            com.contentsquare.android.sdk.c1 r5 = new com.contentsquare.android.sdk.c1
            r5.<init>()
            a9.a1 r2 = r4.f46999a
            java.lang.ref.WeakReference<android.app.Activity> r2 = r2.f42433a
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x0056
            r0.f47003c = r5
            r0.f47004d = r4
            r0.f47007g = r3
            java.lang.Object r0 = r5.a(r2, r4, r0)
            if (r0 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r1 = r4
            r0 = r5
        L_0x0058:
            r1.f47001c = r0
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.I.b(dI.e):java.lang.Object");
    }

    public final void a(c1.a aVar) {
        C17542s.j(aVar, "callback");
        this.f47002d = aVar;
    }
}
