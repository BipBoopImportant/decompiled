package com.contentsquare.android.sdk;

import D8.c;
import G8.t;
import H2.j;
import HJ.C15854t;
import a9.C6849i3;
import a9.D0;
import a9.J6;
import a9.M;
import a9.T;
import a9.W2;
import android.app.Application;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import com.contentsquare.android.sdk.B0;
import com.contentsquare.android.sdk.C7118c0;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.z0  reason: case insensitive filesystem */
public final class C7164z0 implements C7118c0.a {

    /* renamed from: a  reason: collision with root package name */
    public final T f47759a;

    /* renamed from: b  reason: collision with root package name */
    public final Application f47760b;

    /* renamed from: c  reason: collision with root package name */
    public C7126g0 f47761c;

    /* renamed from: d  reason: collision with root package name */
    public final C7133k f47762d;

    /* renamed from: e  reason: collision with root package name */
    public final O0 f47763e;

    /* renamed from: f  reason: collision with root package name */
    public final E0 f47764f;

    /* renamed from: g  reason: collision with root package name */
    public final c f47765g;

    public C7164z0() {
        this((T) null, 63);
    }

    public static final boolean c(View view) {
        return false;
    }

    public final void a(B0 b02) {
        String a10;
        C17542s.j(b02, "result");
        c cVar = this.f47765g;
        cVar.f("onGestureDetected() called with result [" + b02 + ']');
        W2 w22 = b02.f46906c;
        if (!(w22 == null || (a10 = w22.a()) == null)) {
            if (!B0.a.a(a10)) {
                C17542s.j(a10, "path");
                if (C15854t.d0(a10, ">FlutterView", false, 2, (Object) null) && !C15854t.d0(a10, ">PlatformViewWrapper", false, 2, (Object) null)) {
                    return;
                }
            } else {
                return;
            }
        }
        d(b02);
    }

    public final void b(MotionEvent motionEvent, ViewGroup viewGroup) {
        VelocityTracker velocityTracker;
        C17542s.j(motionEvent, "event");
        C17542s.j(viewGroup, "decorView");
        if (motionEvent.getPointerCount() > 1) {
            this.f47765g.f("event with multiple pointers skipped");
            return;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f47761c.a();
            C7126g0 g0Var = this.f47761c;
            g0Var.getClass();
            C17542s.j(motionEvent, "event");
            C17542s.j(viewGroup, "decorView");
            g0Var.b(motionEvent);
            T t10 = g0Var.f47413q;
            int i10 = g0Var.f47331e;
            int i11 = g0Var.f47332f;
            t10.getClass();
            C17542s.j(viewGroup, "parent");
            J6<View> j62 = new J6<>();
            M m10 = new M(j62, i10, i11);
            j<View> jVar = t10.f42284a;
            C17542s.j(m10, "processor");
            C17542s.j(jVar, "viewFilter");
            new D0(m10, jVar).a(viewGroup);
            g0Var.f47414r = j62;
            this.f47765g.f("processed MotionEvent.ACTION_DOWN event type");
        } else if (action == 1) {
            this.f47761c.d(motionEvent);
            C7126g0 g0Var2 = new C7126g0(this.f47760b, this.f47759a, new t(), new C6849i3());
            this.f47761c = g0Var2;
            g0Var2.f47342p = this;
            this.f47765g.f("processed MotionEvent.ACTION_UP event type");
        } else if (action != 2) {
            C7126g0 g0Var3 = new C7126g0(this.f47760b, this.f47759a, new t(), new C6849i3());
            this.f47761c = g0Var3;
            g0Var3.f47342p = this;
            c cVar = this.f47765g;
            cVar.l("received unhandled event type: " + motionEvent);
        } else {
            C7126g0 g0Var4 = this.f47761c;
            g0Var4.getClass();
            C17542s.j(motionEvent, "event");
            if (!(g0Var4.f47339m == Long.MIN_VALUE || (velocityTracker = g0Var4.f47329c) == null)) {
                velocityTracker.addMovement(motionEvent);
            }
            this.f47765g.f("processed MotionEvent.ACTION_MOVE event type");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.contentsquare.android.sdk.T$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.contentsquare.android.sdk.A0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.contentsquare.android.sdk.Q$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.contentsquare.android.sdk.e0$a} */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(com.contentsquare.android.sdk.B0 r10) {
        /*
            r9 = this;
            D8.c r0 = r9.f47765g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "processGestureResult() called with result ["
            r1.<init>(r2)
            r1.append(r10)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.f(r1)
            a9.W2 r0 = r10.f46906c
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            com.contentsquare.android.sdk.E0 r0 = r9.f47764f
            r0.getClass()
            java.lang.String r1 = "gestureResult"
            kotlin.jvm.internal.C17542s.j(r10, r1)
            int r1 = r10.f46905b
            r2 = 10
            r3 = 9
            r4 = 0
            if (r1 == r3) goto L_0x0032
            if (r1 != r2) goto L_0x003b
        L_0x0032:
            int r1 = r10.f46907d
            r5 = 1
            if (r1 == r5) goto L_0x0051
            r5 = 2
            if (r1 != r5) goto L_0x003b
            goto L_0x0051
        L_0x003b:
            D8.c r0 = r0.f46958a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "gesture skipped, not vertical scroll: gesture="
            r1.<init>(r5)
            int r5 = r10.f46905b
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.f(r1)
            goto L_0x008c
        L_0x0051:
            a9.J6<android.view.View> r1 = r10.f46914k
            if (r1 == 0) goto L_0x006f
            a9.J6$a<E> r1 = r1.f42086a
        L_0x0057:
            if (r1 == 0) goto L_0x0065
            java.lang.ref.WeakReference<T> r5 = r1.f42088a
            java.lang.Object r5 = r5.get()
            if (r5 == 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            a9.J6$a<T> r1 = r1.f42089b
            goto L_0x0057
        L_0x0065:
            r5 = r4
        L_0x0066:
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x006f
            android.os.IBinder r1 = r5.getWindowToken()
            goto L_0x0070
        L_0x006f:
            r1 = r4
        L_0x0070:
            if (r1 == 0) goto L_0x0087
            com.contentsquare.android.sdk.E0$a r5 = new com.contentsquare.android.sdk.E0$a
            double r6 = r10.f46910g
            int r6 = (int) r6
            double r7 = r10.f46911h
            int r7 = (int) r7
            r5.<init>(r1, r6, r7)
            r0.f46959b = r5
            D8.c r0 = r0.f46958a
            java.lang.String r1 = "vertical scroll gesture target saved"
        L_0x0083:
            r0.f(r1)
            goto L_0x008c
        L_0x0087:
            D8.c r0 = r0.f46958a
            java.lang.String r1 = "vertical scroll gesture skipped, target not found"
            goto L_0x0083
        L_0x008c:
            int r0 = r10.f46905b
            r1 = -1
            if (r0 == r1) goto L_0x013d
            r1 = 6
            java.lang.String r5 = "touchPath"
            java.lang.String r6 = ""
            if (r0 == r1) goto L_0x011f
            switch(r0) {
                case 8: goto L_0x0103;
                case 9: goto L_0x00db;
                case 10: goto L_0x00b2;
                default: goto L_0x009b;
            }
        L_0x009b:
            D8.c r0 = r9.f47765g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "GestureProcessor: Failed to get event for type: "
            r1.<init>(r2)
            int r10 = r10.f46905b
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.f(r10)
            goto L_0x013d
        L_0x00b2:
            com.contentsquare.android.sdk.k r0 = r9.f47762d
            com.contentsquare.android.sdk.y0$a r0 = com.contentsquare.android.sdk.C7133k.b(r0, r2)
            com.contentsquare.android.sdk.Q$a r0 = (com.contentsquare.android.sdk.Q.a) r0
            a9.W2 r1 = r10.f46906c
            if (r1 == 0) goto L_0x00c2
            java.lang.String r4 = r1.a()
        L_0x00c2:
            if (r4 != 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r6 = r4
        L_0x00c6:
            kotlin.jvm.internal.C17542s.j(r6, r5)
            r0.f47120k = r6
            int r1 = r10.f46907d
            r0.f47121l = r1
            double r1 = r10.f46908e
            int r1 = (int) r1
            r0.f47122m = r1
            double r1 = r10.f46909f
            int r10 = (int) r1
            r0.f47123n = r10
        L_0x00d9:
            r4 = r0
            goto L_0x013d
        L_0x00db:
            com.contentsquare.android.sdk.k r0 = r9.f47762d
            com.contentsquare.android.sdk.y0$a r0 = com.contentsquare.android.sdk.C7133k.b(r0, r3)
            com.contentsquare.android.sdk.A0$a r0 = (com.contentsquare.android.sdk.A0.a) r0
            a9.W2 r1 = r10.f46906c
            if (r1 == 0) goto L_0x00eb
            java.lang.String r4 = r1.a()
        L_0x00eb:
            if (r4 != 0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r6 = r4
        L_0x00ef:
            kotlin.jvm.internal.C17542s.j(r6, r5)
            r0.f46893k = r6
            int r1 = r10.f46907d
            r0.f46894l = r1
            double r1 = r10.f46908e
            int r1 = (int) r1
            r0.f46895m = r1
            double r1 = r10.f46909f
            int r10 = (int) r1
            r0.f46896n = r10
            goto L_0x00d9
        L_0x0103:
            com.contentsquare.android.sdk.k r0 = r9.f47762d
            r1 = 8
            com.contentsquare.android.sdk.y0$a r0 = com.contentsquare.android.sdk.C7133k.b(r0, r1)
            com.contentsquare.android.sdk.T$a r0 = (com.contentsquare.android.sdk.T.a) r0
            a9.W2 r10 = r10.f46906c
            if (r10 == 0) goto L_0x0115
            java.lang.String r4 = r10.a()
        L_0x0115:
            if (r4 != 0) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r6 = r4
        L_0x0119:
            kotlin.jvm.internal.C17542s.j(r6, r5)
            r0.f47155k = r6
            goto L_0x00d9
        L_0x011f:
            com.contentsquare.android.sdk.k r0 = r9.f47762d
            com.contentsquare.android.sdk.y0$a r0 = com.contentsquare.android.sdk.C7133k.b(r0, r1)
            com.contentsquare.android.sdk.e0$a r0 = (com.contentsquare.android.sdk.C7122e0.a) r0
            a9.W2 r1 = r10.f46906c
            if (r1 == 0) goto L_0x012f
            java.lang.String r4 = r1.a()
        L_0x012f:
            if (r4 != 0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r6 = r4
        L_0x0133:
            kotlin.jvm.internal.C17542s.j(r6, r5)
            r0.f47390k = r6
            boolean r10 = r10.f46904a
            r0.f47391l = r10
            goto L_0x00d9
        L_0x013d:
            if (r4 == 0) goto L_0x015c
            com.contentsquare.android.sdk.O0 r10 = r9.f47763e
            r10.a(r4)
            D8.c r10 = r9.f47765g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "message sent to the reservoir: [ "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " ]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.f(r0)
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7164z0.d(com.contentsquare.android.sdk.B0):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C7164z0(a9.T r8, int r9) {
        /*
            r7 = this;
            r9 = r9 & 1
            if (r9 == 0) goto L_0x000e
            a9.T r8 = new a9.T
            a9.K3 r9 = new a9.K3
            r9.<init>()
            r8.<init>(r9)
        L_0x000e:
            r1 = r8
            X8.b r8 = X8.b.i()
            kotlin.jvm.internal.C17542s.g(r8)
            android.app.Application r2 = r8.b()
            java.lang.String r8 = "getInstance()!!.application"
            kotlin.jvm.internal.C17542s.i(r2, r8)
            com.contentsquare.android.sdk.g0 r3 = new com.contentsquare.android.sdk.g0
            X8.b r9 = X8.b.i()
            kotlin.jvm.internal.C17542s.g(r9)
            android.app.Application r9 = r9.b()
            kotlin.jvm.internal.C17542s.i(r9, r8)
            G8.t r8 = new G8.t
            r8.<init>()
            a9.i3 r0 = new a9.i3
            r0.<init>()
            r3.<init>(r9, r1, r8, r0)
            X8.b r8 = X8.b.i()
            kotlin.jvm.internal.C17542s.g(r8)
            com.contentsquare.android.sdk.k r4 = r8.d()
            java.lang.String r8 = "getInstance()!!.eventsBuildersFactory"
            kotlin.jvm.internal.C17542s.i(r4, r8)
            X8.b r8 = X8.b.i()
            kotlin.jvm.internal.C17542s.g(r8)
            com.contentsquare.android.sdk.O0 r5 = r8.a()
            java.lang.String r8 = "getInstance()!!.analyticsPipeline"
            kotlin.jvm.internal.C17542s.i(r5, r8)
            com.contentsquare.android.sdk.E0 r6 = new com.contentsquare.android.sdk.E0
            r6.<init>()
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7164z0.<init>(a9.T, int):void");
    }

    public C7164z0(T t10, Application application, C7126g0 g0Var, C7133k kVar, O0 o02, E0 e02) {
        C17542s.j(t10, "touchTargetDetector");
        C17542s.j(application, "application");
        C17542s.j(g0Var, "gestureDetector");
        C17542s.j(kVar, "eventsBuildersFactory");
        C17542s.j(o02, "analyticsPipeline");
        C17542s.j(e02, "gestureStorage");
        this.f47759a = t10;
        this.f47760b = application;
        this.f47761c = g0Var;
        this.f47762d = kVar;
        this.f47763e = o02;
        this.f47764f = e02;
        this.f47765g = new c("GestureProcessor");
        this.f47761c.f47342p = this;
    }
}
