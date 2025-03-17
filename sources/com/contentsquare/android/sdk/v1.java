package com.contentsquare.android.sdk;

import D8.c;
import QJ.C16311i0;
import QJ.M;
import QJ.P0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import a9.C6867k5;
import a9.H1;
import android.view.View;
import android.view.ViewGroup;
import dI.C17164e;
import eI.C17187b;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

public final class v1 {

    /* renamed from: b  reason: collision with root package name */
    public static final c f47662b = new c("AppBarHandler");

    /* renamed from: a  reason: collision with root package name */
    public final M f47663a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f47664a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<View> f47665b;

        /* renamed from: c  reason: collision with root package name */
        public final int f47666c;

        public a(WeakReference<View> weakReference, WeakReference<View> weakReference2, int i10) {
            C17542s.j(weakReference, "appBarLayout");
            C17542s.j(weakReference2, "scrollContainer");
            this.f47664a = weakReference;
            this.f47665b = weakReference2;
            this.f47666c = i10;
        }
    }

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.AppBarHandler$prepareAppBar$2", f = "AppBarHandler.kt", l = {44, 49}, m = "invokeSuspend")
    public static final class b extends l implements p<Q, C17164e<? super a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public a f47667c;

        /* renamed from: d  reason: collision with root package name */
        public float f47668d;

        /* renamed from: e  reason: collision with root package name */
        public int f47669e;

        /* renamed from: f  reason: collision with root package name */
        public int f47670f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ View f47671g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ View f47672h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ v1 f47673i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view, View view2, v1 v1Var, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f47671g = view;
            this.f47672h = view2;
            this.f47673i = v1Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f47671g, this.f47672h, this.f47673i, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            a aVar;
            int i10;
            a aVar2;
            float f10;
            Object f11 = C17187b.f();
            int i11 = this.f47670f;
            if (i11 == 0) {
                y.b(obj);
                aVar2 = new a(new WeakReference(this.f47671g), new WeakReference(this.f47672h), this.f47672h.getLayoutParams().height);
                f10 = this.f47672h.getY();
                v1.b(this.f47673i, this.f47671g, true);
                View view = this.f47671g;
                this.f47667c = aVar2;
                this.f47668d = f10;
                this.f47670f = 1;
                if (C6867k5.b(view, this) == f11) {
                    return f11;
                }
            } else if (i11 == 1) {
                f10 = this.f47668d;
                a aVar3 = this.f47667c;
                y.b(obj);
                aVar2 = aVar3;
            } else if (i11 == 2) {
                i10 = this.f47669e;
                aVar = this.f47667c;
                y.b(obj);
                this.f47672h.scrollBy(0, i10);
                return aVar;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int y10 = (int) (this.f47672h.getY() - f10);
            ViewGroup.LayoutParams layoutParams = this.f47672h.getLayoutParams();
            layoutParams.height = this.f47672h.getHeight() - y10;
            this.f47672h.setLayoutParams(layoutParams);
            View view2 = this.f47672h;
            this.f47667c = aVar2;
            this.f47669e = y10;
            this.f47670f = 2;
            if (C6867k5.b(view2, this) == f11) {
                return f11;
            }
            i10 = y10;
            aVar = aVar2;
            this.f47672h.scrollBy(0, i10);
            return aVar;
        }
    }

    public v1() {
        P0 c10 = C16311i0.c();
        C17542s.j(c10, "dispatcherMain");
        this.f47663a = c10;
    }

    public static final void b(v1 v1Var, View view, boolean z10) {
        v1Var.getClass();
        if (C17542s.e(view.getClass().getName(), "com.google.android.material.appbar.AppBarLayout")) {
            try {
                Class<?> cls = view.getClass();
                Class cls2 = Boolean.TYPE;
                cls.getMethod("setExpanded", new Class[]{cls2, cls2}).invoke(view, new Object[]{Boolean.valueOf(z10), Boolean.FALSE});
            } catch (NoSuchMethodException | SecurityException e10) {
                H1.a(f47662b, "Error while expanding/collapsing AppBarLayout", e10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.contentsquare.android.sdk.r1 r5, dI.C17164e<? super com.contentsquare.android.sdk.v1.a> r6) {
        /*
            r4 = this;
            android.view.View r5 = r5.a()
            android.view.ViewParent r0 = r5.getParent()
            java.lang.String r1 = "view.parent"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r1 = "CoordinatorLayout"
            boolean r0 = G8.g.h(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0039
            android.view.ViewParent r0 = r5.getParent()
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0021
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0022
        L_0x0021:
            r0 = r1
        L_0x0022:
            if (r0 == 0) goto L_0x0039
            GJ.h r0 = I2.C4610g0.b(r0)
            if (r0 == 0) goto L_0x0039
            a9.i r2 = a9.C6845i.f42604c
            GJ.h r0 = GJ.C15768k.H(r0, r2)
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = GJ.C15768k.L(r0)
            android.view.View r0 = (android.view.View) r0
            goto L_0x003a
        L_0x0039:
            r0 = r1
        L_0x003a:
            if (r0 == 0) goto L_0x0051
            QJ.M r2 = r4.f47663a
            com.contentsquare.android.sdk.v1$b r3 = new com.contentsquare.android.sdk.v1$b
            r3.<init>(r0, r5, r4, r1)
            java.lang.Object r5 = QJ.C16310i.g(r2, r3, r6)
            java.lang.Object r6 = eI.C17187b.f()
            if (r5 != r6) goto L_0x004e
            return r5
        L_0x004e:
            r1 = r5
            com.contentsquare.android.sdk.v1$a r1 = (com.contentsquare.android.sdk.v1.a) r1
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.v1.a(com.contentsquare.android.sdk.r1, dI.e):java.lang.Object");
    }
}
