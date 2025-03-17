package com.contentsquare.android.sdk;

import TJ.C16505B;
import a9.C6822f0;
import a9.C6839h1;
import a9.C6984z3;
import a9.Q3;
import a9.W3;
import android.view.View;
import android.view.ViewGroup;
import dI.C17164e;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import l8.C8537a;
import nI.p;

/* renamed from: com.contentsquare.android.sdk.d0  reason: case insensitive filesystem */
public final class C7120d0 {

    /* renamed from: a  reason: collision with root package name */
    public final E f47371a;

    /* renamed from: b  reason: collision with root package name */
    public final C16505B<C7134k0> f47372b;

    /* renamed from: c  reason: collision with root package name */
    public final C6822f0 f47373c;

    /* renamed from: d  reason: collision with root package name */
    public final Q3 f47374d;

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.screencapture.ScreenGraphProducer", f = "ScreenGraphProducer.kt", l = {43}, m = "obtain")
    /* renamed from: com.contentsquare.android.sdk.d0$a */
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public C7120d0 f47375c;

        /* renamed from: d  reason: collision with root package name */
        public ViewGroup f47376d;

        /* renamed from: e  reason: collision with root package name */
        public String f47377e;

        /* renamed from: f  reason: collision with root package name */
        public String f47378f;

        /* renamed from: g  reason: collision with root package name */
        public C8537a[] f47379g;

        /* renamed from: h  reason: collision with root package name */
        public C6839h1 f47380h;

        /* renamed from: i  reason: collision with root package name */
        public p f47381i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f47382j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ C7120d0 f47383k;

        /* renamed from: l  reason: collision with root package name */
        public int f47384l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C7120d0 d0Var, C17164e<? super a> eVar) {
            super(eVar);
            this.f47383k = d0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f47382j = obj;
            this.f47384l |= Integer.MIN_VALUE;
            return this.f47383k.a((ViewGroup) null, (String) null, (String) null, (C8537a[]) null, (C6839h1) null, (p<? super View, ? super W3, ? extends C6984z3>) null, this);
        }
    }

    public C7120d0(E e10, C16505B<C7134k0> b10, C6822f0 f0Var, Q3 q32) {
        C17542s.j(e10, "externalViewsProcessor");
        C17542s.j(b10, "snapshotStateFlow");
        C17542s.j(f0Var, "treeTraverser");
        C17542s.j(q32, "viewBitmapProviderFactory");
        this.f47371a = e10;
        this.f47372b = b10;
        this.f47373c = f0Var;
        this.f47374d = q32;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(android.view.ViewGroup r16, java.lang.String r17, java.lang.String r18, l8.C8537a[] r19, a9.C6839h1 r20, nI.p<? super android.view.View, ? super a9.W3, ? extends a9.C6984z3> r21, dI.C17164e<? super XH.C16807N> r22) {
        /*
            r15 = this;
            r0 = r15
            r1 = r22
            boolean r2 = r1 instanceof com.contentsquare.android.sdk.C7120d0.a
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.contentsquare.android.sdk.d0$a r2 = (com.contentsquare.android.sdk.C7120d0.a) r2
            int r3 = r2.f47384l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.f47384l = r3
            goto L_0x001b
        L_0x0016:
            com.contentsquare.android.sdk.d0$a r2 = new com.contentsquare.android.sdk.d0$a
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.f47382j
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r2.f47384l
            r5 = 1
            if (r4 == 0) goto L_0x004a
            if (r4 != r5) goto L_0x0042
            nI.p r3 = r2.f47381i
            a9.h1 r4 = r2.f47380h
            l8.a[] r5 = r2.f47379g
            java.lang.String r6 = r2.f47378f
            java.lang.String r7 = r2.f47377e
            android.view.ViewGroup r8 = r2.f47376d
            com.contentsquare.android.sdk.d0 r2 = r2.f47375c
            XH.y.b(r1)
            r12 = r2
            r10 = r3
            r3 = r4
            r2 = r6
            r4 = r1
            r6 = r5
            r1 = r7
            r5 = r8
            goto L_0x0085
        L_0x0042:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004a:
            XH.y.b(r1)
            a9.Q3 r1 = r0.f47374d
            com.contentsquare.android.sdk.K0 r4 = new com.contentsquare.android.sdk.K0
            a9.W1 r6 = new a9.W1
            r6.<init>()
            a9.a1 r1 = r1.f42228a
            r4.<init>(r6, r1)
            r2.f47375c = r0
            r1 = r16
            r2.f47376d = r1
            r6 = r17
            r2.f47377e = r6
            r7 = r18
            r2.f47378f = r7
            r8 = r19
            r2.f47379g = r8
            r9 = r20
            r2.f47380h = r9
            r10 = r21
            r2.f47381i = r10
            r2.f47384l = r5
            java.lang.Object r2 = r4.a(r2)
            if (r2 != r3) goto L_0x007e
            return r3
        L_0x007e:
            r12 = r0
            r5 = r1
            r4 = r2
            r1 = r6
            r2 = r7
            r6 = r8
            r3 = r9
        L_0x0085:
            r13 = r4
            a9.W3 r13 = (a9.W3) r13
            java.lang.String r14 = r13.c(r5)
            TJ.B<com.contentsquare.android.sdk.k0> r4 = r12.f47372b
            com.contentsquare.android.sdk.k0$f r7 = com.contentsquare.android.sdk.C7134k0.f.f47481a
            r4.a(r7)
            a9.f0 r4 = r12.f47373c
            com.contentsquare.android.sdk.E r7 = r12.f47371a
            a9.K2 r9 = new a9.K2
            boolean r8 = r13.a()
            r9.<init>(r5, r8)
            a9.n0$b r11 = a9.C6886n0.f42722a
            r8 = r13
            a9.q2 r4 = r4.a(r5, r6, r7, r8, r9, r10, r11)
            r4.f42805a = r1
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.C17542s.j(r2, r1)
            r4.f42806b = r2
            com.contentsquare.android.sdk.E r1 = r12.f47371a
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x00cc
            com.contentsquare.android.sdk.E r1 = r12.f47371a
            TJ.B<com.contentsquare.android.sdk.k0> r2 = r12.f47372b
            r16 = r1
            r17 = r4
            r18 = r14
            r19 = r13
            r20 = r3
            r21 = r2
            r16.c(r17, r18, r19, r20, r21)
            goto L_0x00da
        L_0x00cc:
            TJ.B<com.contentsquare.android.sdk.k0> r1 = r12.f47372b
            com.contentsquare.android.sdk.k0$g r2 = com.contentsquare.android.sdk.C7134k0.g.f47482a
            r1.a(r2)
            boolean r1 = r13.a()
            r3.a(r4, r14, r1)
        L_0x00da:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7120d0.a(android.view.ViewGroup, java.lang.String, java.lang.String, l8.a[], a9.h1, nI.p, dI.e):java.lang.Object");
    }
}
