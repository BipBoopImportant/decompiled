package com.contentsquare.android.sdk;

import QJ.Q;
import XH.C16807N;
import XH.x;
import android.graphics.Rect;
import dI.C17164e;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.RecyclerViewCaptureUseCase$capture$2", f = "RecyclerViewCaptureUseCase.kt", l = {64, 65, 81}, m = "invokeSuspend")
public final class q1 extends l implements p<Q, C17164e<? super x<? extends C16807N>>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public Object f47592c;

    /* renamed from: d  reason: collision with root package name */
    public Object f47593d;

    /* renamed from: e  reason: collision with root package name */
    public String f47594e;

    /* renamed from: f  reason: collision with root package name */
    public Rect f47595f;

    /* renamed from: g  reason: collision with root package name */
    public int f47596g;

    /* renamed from: h  reason: collision with root package name */
    public int f47597h;

    /* renamed from: i  reason: collision with root package name */
    public int f47598i;

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f47599j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ C7141n1 f47600k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ r1 f47601l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q1(C7141n1 n1Var, r1 r1Var, C17164e<? super q1> eVar) {
        super(2, eVar);
        this.f47600k = n1Var;
        this.f47601l = r1Var;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        q1 q1Var = new q1(this.f47600k, this.f47601l, eVar);
        q1Var.f47599j = obj;
        return q1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r9 = r17
            r0 = 1
            java.lang.String r1 = "targetScrollPosition: "
            java.lang.String r2 = "container height: "
            java.lang.Object r10 = eI.C17187b.f()
            int r3 = r9.f47598i
            r11 = 3
            r4 = 2
            r12 = 0
            if (r3 == 0) goto L_0x005a
            if (r3 == r0) goto L_0x003b
            if (r3 == r4) goto L_0x002f
            if (r3 != r11) goto L_0x0027
            java.lang.Object r0 = r9.f47593d
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r1 = r9.f47592c
            com.contentsquare.android.sdk.n1 r1 = (com.contentsquare.android.sdk.C7141n1) r1
            java.lang.Object r2 = r9.f47599j
            XH.y.b(r18)
            goto L_0x01a4
        L_0x0027:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002f:
            java.lang.Object r0 = r9.f47599j
            com.contentsquare.android.sdk.n1 r0 = (com.contentsquare.android.sdk.C7141n1) r0
            XH.y.b(r18)     // Catch:{ all -> 0x0038 }
            goto L_0x0168
        L_0x0038:
            r0 = move-exception
            goto L_0x017a
        L_0x003b:
            int r0 = r9.f47597h
            int r1 = r9.f47596g
            android.graphics.Rect r2 = r9.f47595f
            java.lang.String r3 = r9.f47594e
            java.lang.Object r5 = r9.f47593d
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            java.lang.Object r6 = r9.f47592c
            com.contentsquare.android.sdk.r1 r6 = (com.contentsquare.android.sdk.r1) r6
            java.lang.Object r7 = r9.f47599j
            com.contentsquare.android.sdk.n1 r7 = (com.contentsquare.android.sdk.C7141n1) r7
            XH.y.b(r18)     // Catch:{ all -> 0x0038 }
            r4 = r5
            r5 = r2
            r2 = r6
            r6 = r0
            r0 = r7
            r7 = r1
            goto L_0x0151
        L_0x005a:
            XH.y.b(r18)
            java.lang.Object r3 = r9.f47599j
            QJ.Q r3 = (QJ.Q) r3
            com.contentsquare.android.sdk.n1 r3 = r9.f47600k
            com.contentsquare.android.sdk.r1 r5 = r9.f47601l
            XH.x$a r6 = XH.x.f139812b     // Catch:{ all -> 0x0038 }
            D8.c r6 = com.contentsquare.android.sdk.C7141n1.f47536i     // Catch:{ all -> 0x0038 }
            java.lang.String r7 = "start capturing"
            r6.f(r7)     // Catch:{ all -> 0x0038 }
            r3.f47541e = r12     // Catch:{ all -> 0x0038 }
            java.util.ArrayList r7 = r3.f47542f     // Catch:{ all -> 0x0038 }
            r7.clear()     // Catch:{ all -> 0x0038 }
            E8.c r7 = r3.f47540d     // Catch:{ all -> 0x0038 }
            E8.b r8 = E8.b.CLIENT_MODE_LONG_SNAPSHOT_SCROLL_DELAY_MILLISECONDS     // Catch:{ all -> 0x0038 }
            r13 = 0
            int r7 = r7.d(r8, r13)     // Catch:{ all -> 0x0038 }
            java.util.UUID r8 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0038 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0038 }
            java.lang.String r14 = "randomUUID().toString()"
            kotlin.jvm.internal.C17542s.i(r8, r14)     // Catch:{ all -> 0x0038 }
            android.view.View r14 = r5.a()     // Catch:{ all -> 0x0038 }
            boolean r15 = r14 instanceof androidx.recyclerview.widget.RecyclerView     // Catch:{ all -> 0x0038 }
            if (r15 == 0) goto L_0x0096
            androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14     // Catch:{ all -> 0x0038 }
            goto L_0x0097
        L_0x0096:
            r14 = r12
        L_0x0097:
            if (r14 != 0) goto L_0x009b
            goto L_0x0172
        L_0x009b:
            android.graphics.Rect r15 = new android.graphics.Rect     // Catch:{ all -> 0x0038 }
            r15.<init>()     // Catch:{ all -> 0x0038 }
            r14.getGlobalVisibleRect(r15)     // Catch:{ all -> 0x0038 }
            int r11 = r15.top     // Catch:{ all -> 0x0038 }
            int r16 = r14.getPaddingTop()     // Catch:{ all -> 0x0038 }
            int r11 = r11 + r16
            int r4 = r15.bottom     // Catch:{ all -> 0x0038 }
            int r4 = java.lang.Math.min(r11, r4)     // Catch:{ all -> 0x0038 }
            r15.top = r4     // Catch:{ all -> 0x0038 }
            int r4 = r15.bottom     // Catch:{ all -> 0x0038 }
            int r11 = r14.getPaddingBottom()     // Catch:{ all -> 0x0038 }
            int r4 = r4 - r11
            int r11 = r15.top     // Catch:{ all -> 0x0038 }
            int r4 = java.lang.Math.max(r4, r11)     // Catch:{ all -> 0x0038 }
            r15.bottom = r4     // Catch:{ all -> 0x0038 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r4.<init>(r2)     // Catch:{ all -> 0x0038 }
            int r2 = r14.getHeight()     // Catch:{ all -> 0x0038 }
            r4.append(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = ", inner without padding: "
            r4.append(r2)     // Catch:{ all -> 0x0038 }
            int r2 = r15.height()     // Catch:{ all -> 0x0038 }
            r4.append(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0038 }
            r6.f(r2)     // Catch:{ all -> 0x0038 }
            int r2 = r15.height()     // Catch:{ all -> 0x0038 }
            if (r2 <= 0) goto L_0x016b
            int r2 = com.contentsquare.android.sdk.C7141n1.a(r14)     // Catch:{ all -> 0x0038 }
            int r4 = r2 + 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r11.<init>(r1)     // Catch:{ all -> 0x0038 }
            r11.append(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = ", numberOfItems: "
            r11.append(r1)     // Catch:{ all -> 0x0038 }
            r11.append(r4)     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = r11.toString()     // Catch:{ all -> 0x0038 }
            r6.f(r1)     // Catch:{ all -> 0x0038 }
            if (r2 < 0) goto L_0x016b
            java.util.ArrayList r1 = r3.f47542f     // Catch:{ all -> 0x0038 }
            tI.j r6 = new tI.j     // Catch:{ all -> 0x0038 }
            r6.<init>(r13, r2)     // Catch:{ all -> 0x0038 }
            YH.C16877v.E(r1, r6)     // Catch:{ all -> 0x0038 }
            com.contentsquare.android.sdk.i r1 = r3.f47538b     // Catch:{ all -> 0x0038 }
            r1.getClass()     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "recyclerView"
            kotlin.jvm.internal.C17542s.j(r14, r1)     // Catch:{ all -> 0x0038 }
            com.contentsquare.android.sdk.i$a r1 = new com.contentsquare.android.sdk.i$a     // Catch:{ all -> 0x0038 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0038 }
            r2.<init>(r14)     // Catch:{ all -> 0x0038 }
            androidx.recyclerview.widget.RecyclerView$q r6 = r14.getLayoutManager()     // Catch:{ all -> 0x0038 }
            if (r6 == 0) goto L_0x012c
            android.os.Parcelable r6 = r6.C1()     // Catch:{ all -> 0x0038 }
            goto L_0x012d
        L_0x012c:
            r6 = r12
        L_0x012d:
            r1.<init>(r2, r6)     // Catch:{ all -> 0x0038 }
            r3.f47541e = r1     // Catch:{ all -> 0x0038 }
            com.contentsquare.android.sdk.i r1 = r3.f47538b     // Catch:{ all -> 0x0038 }
            r9.f47599j = r3     // Catch:{ all -> 0x0038 }
            r9.f47592c = r5     // Catch:{ all -> 0x0038 }
            r9.f47593d = r14     // Catch:{ all -> 0x0038 }
            r9.f47594e = r8     // Catch:{ all -> 0x0038 }
            r9.f47595f = r15     // Catch:{ all -> 0x0038 }
            r9.f47596g = r7     // Catch:{ all -> 0x0038 }
            r9.f47597h = r4     // Catch:{ all -> 0x0038 }
            r9.f47598i = r0     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r1.b(r14, r7, r9)     // Catch:{ all -> 0x0038 }
            if (r0 != r10) goto L_0x014b
            return r10
        L_0x014b:
            r0 = r3
            r6 = r4
            r2 = r5
            r3 = r8
            r4 = r14
            r5 = r15
        L_0x0151:
            r9.f47599j = r0     // Catch:{ all -> 0x0038 }
            r9.f47592c = r12     // Catch:{ all -> 0x0038 }
            r9.f47593d = r12     // Catch:{ all -> 0x0038 }
            r9.f47594e = r12     // Catch:{ all -> 0x0038 }
            r9.f47595f = r12     // Catch:{ all -> 0x0038 }
            r1 = 2
            r9.f47598i = r1     // Catch:{ all -> 0x0038 }
            r1 = r0
            r8 = r17
            java.lang.Object r1 = com.contentsquare.android.sdk.C7141n1.b(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0038 }
            if (r1 != r10) goto L_0x0168
            return r10
        L_0x0168:
            com.contentsquare.android.sdk.C7141n1.d(r0)     // Catch:{ all -> 0x0038 }
        L_0x016b:
            D8.c r0 = com.contentsquare.android.sdk.C7141n1.f47536i     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "end capture"
            r0.f(r1)     // Catch:{ all -> 0x0038 }
        L_0x0172:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ all -> 0x0038 }
        L_0x0178:
            r2 = r0
            goto L_0x0185
        L_0x017a:
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
            goto L_0x0178
        L_0x0185:
            com.contentsquare.android.sdk.n1 r1 = r9.f47600k
            java.lang.Throwable r0 = XH.x.e(r2)
            if (r0 == 0) goto L_0x01a9
            com.contentsquare.android.sdk.C7141n1.d(r1)
            r9.f47599j = r2
            r9.f47592c = r1
            r9.f47593d = r0
            r9.f47594e = r12
            r9.f47595f = r12
            r3 = 3
            r9.f47598i = r3
            java.lang.Object r3 = QJ.s1.a(r17)
            if (r3 != r10) goto L_0x01a4
            return r10
        L_0x01a4:
            com.contentsquare.android.sdk.o0 r1 = r1.f47537a
            r1.d(r0)
        L_0x01a9:
            XH.x r0 = XH.x.a(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
