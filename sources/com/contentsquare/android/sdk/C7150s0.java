package com.contentsquare.android.sdk;

import D8.c;
import a9.T;
import a9.T2;
import android.view.View;
import com.contentsquare.android.sdk.D;
import com.contentsquare.android.sdk.r1;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import w8.C8933a;

/* renamed from: com.contentsquare.android.sdk.s0  reason: case insensitive filesystem */
public final class C7150s0 {

    /* renamed from: a  reason: collision with root package name */
    public final C17631a<C8933a> f47613a;

    /* renamed from: b  reason: collision with root package name */
    public final E0 f47614b;

    /* renamed from: c  reason: collision with root package name */
    public final T f47615c;

    /* renamed from: d  reason: collision with root package name */
    public final T2 f47616d;

    /* renamed from: e  reason: collision with root package name */
    public final c f47617e = new c("SnapshotConfigCreator");

    public C7150s0(D.b bVar, E0 e02, T t10) {
        T2 t22 = new T2();
        C17542s.j(bVar, "composeInterfaceProvider");
        C17542s.j(e02, "gestureStorage");
        C17542s.j(t10, "touchTargetDetector");
        C17542s.j(t22, "classNameResolver");
        this.f47613a = bVar;
        this.f47614b = e02;
        this.f47615c = t10;
        this.f47616d = t22;
    }

    public static r1 b(View view, boolean z10) {
        C17542s.j(view, "scrollContainer");
        boolean z11 = false;
        boolean z12 = view.canScrollVertically(-1) || view.canScrollVertically(1);
        if (view.canScrollHorizontally(-1) || view.canScrollHorizontally(1)) {
            z11 = true;
        }
        if (z12 && z11 && !z10) {
            return new r1.c(view);
        }
        if (z12) {
            return new r1.b(view);
        }
        if (!z11 || z10) {
            return null;
        }
        return new r1.a(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe A[EDGE_INSN: B:86:0x00fe->B:48:0x00fe ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.contentsquare.android.sdk.C7145p0 a(android.view.ViewGroup r13, boolean r14) {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "rootView"
            kotlin.jvm.internal.C17542s.j(r13, r2)
            u8.a$a r3 = u8.C8886a.f56874d
            u8.a r3 = r3.a()
            java.lang.String r4 = "long_snapshot_jetpack_compose"
            boolean r3 = a9.D6.a(r3, r4)
            r4 = 0
            if (r3 == 0) goto L_0x001f
            nI.a<w8.a> r3 = r12.f47613a
            java.lang.Object r3 = r3.invoke()
            w8.a r3 = (w8.C8933a) r3
            goto L_0x0020
        L_0x001f:
            r3 = r4
        L_0x0020:
            kotlin.jvm.internal.C17542s.j(r13, r2)
            com.contentsquare.android.sdk.E0 r2 = r12.f47614b
            com.contentsquare.android.sdk.E0$a r2 = r2.f46959b
            java.lang.String r5 = "androidx.viewpager2.widget.ViewPager2"
            java.lang.String r6 = "NavigationMenuView"
            r7 = 2
            if (r2 == 0) goto L_0x00fd
            java.lang.ref.WeakReference<android.os.IBinder> r8 = r2.f46962c
            java.lang.Object r8 = r8.get()
            android.os.IBinder r8 = (android.os.IBinder) r8
            android.os.IBinder r9 = r13.getWindowToken()
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r2 = r4
        L_0x0042:
            if (r2 == 0) goto L_0x00fd
            a9.T r8 = r12.f47615c
            int r9 = r2.f46960a
            int r2 = r2.f46961b
            r8.getClass()
            java.lang.String r10 = "parent"
            kotlin.jvm.internal.C17542s.j(r13, r10)
            a9.J6 r10 = new a9.J6
            r10.<init>()
            a9.M r11 = new a9.M
            r11.<init>(r10, r9, r2)
            H2.j<android.view.View> r2 = r8.f42284a
            java.lang.String r8 = "processor"
            kotlin.jvm.internal.C17542s.j(r11, r8)
            java.lang.String r8 = "viewFilter"
            kotlin.jvm.internal.C17542s.j(r2, r8)
            a9.D0 r8 = new a9.D0
            r8.<init>(r11, r2)
            r8.a(r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            a9.J6$a<E> r8 = r10.f42087b
        L_0x0077:
            if (r8 == 0) goto L_0x0087
            java.lang.ref.WeakReference<T> r9 = r8.f42088a
            java.lang.Object r9 = r9.get()
            if (r9 == 0) goto L_0x0084
            r2.add(r9)
        L_0x0084:
            a9.J6$a<T> r8 = r8.f42090c
            goto L_0x0077
        L_0x0087:
            java.util.Iterator r2 = r2.iterator()
        L_0x008b:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00fd
            java.lang.Object r8 = r2.next()
            android.view.View r8 = (android.view.View) r8
            java.lang.String r9 = "view"
            kotlin.jvm.internal.C17542s.j(r8, r9)
            if (r3 == 0) goto L_0x00c9
            boolean r9 = r3.a(r8)
            if (r9 != r0) goto L_0x00c9
            com.contentsquare.android.sdk.E0 r9 = r12.f47614b
            com.contentsquare.android.sdk.E0$a r9 = r9.f46959b
            if (r9 == 0) goto L_0x00bc
            XH.v r10 = new XH.v
            int r11 = r9.f46960a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r9 = r9.f46961b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10.<init>(r11, r9)
            goto L_0x00bd
        L_0x00bc:
            r10 = r4
        L_0x00bd:
            w8.d r8 = r3.g(r8, r10)
            if (r8 == 0) goto L_0x00f9
            com.contentsquare.android.sdk.p1$a r9 = new com.contentsquare.android.sdk.p1$a
            r9.<init>(r8)
            goto L_0x00fa
        L_0x00c9:
            boolean r9 = r8.isScrollContainer()
            if (r9 != 0) goto L_0x00d7
            boolean r9 = r8 instanceof android.widget.ScrollView
            if (r9 != 0) goto L_0x00d7
            boolean r9 = r8 instanceof androidx.core.widget.NestedScrollView
            if (r9 == 0) goto L_0x00f9
        L_0x00d7:
            boolean r9 = r8 instanceof android.widget.HorizontalScrollView
            if (r9 != 0) goto L_0x00f9
            boolean r9 = r8 instanceof android.webkit.WebView
            if (r9 != 0) goto L_0x00f9
            boolean r9 = G8.g.h(r8, r6)
            if (r9 != 0) goto L_0x00f9
            a9.T2 r9 = r12.f47616d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = HJ.C15854t.W(r9, r5, r1, r7, r4)
            if (r9 == 0) goto L_0x00f4
            goto L_0x00f9
        L_0x00f4:
            com.contentsquare.android.sdk.r1 r9 = b(r8, r14)
            goto L_0x00fa
        L_0x00f9:
            r9 = r4
        L_0x00fa:
            if (r9 == 0) goto L_0x008b
            goto L_0x00fe
        L_0x00fd:
            r9 = r4
        L_0x00fe:
            D8.c r2 = r12.f47617e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Searched last scrolled: "
            r8.<init>(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r2.f(r8)
            if (r9 != 0) goto L_0x0136
            if (r3 == 0) goto L_0x0136
            w8.d r2 = w8.C8933a.C0923a.a(r3, r13, r4, r7, r4)
            if (r2 == 0) goto L_0x0122
            com.contentsquare.android.sdk.p1$a r3 = new com.contentsquare.android.sdk.p1$a
            r3.<init>(r2)
            r9 = r3
            goto L_0x0123
        L_0x0122:
            r9 = r4
        L_0x0123:
            D8.c r2 = r12.f47617e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "Searched Compose: "
            r3.<init>(r8)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r2.f(r3)
        L_0x0136:
            if (r9 != 0) goto L_0x019e
            android.view.View[] r0 = new android.view.View[r0]
            r0[r1] = r13
            java.util.List r13 = YH.C16877v.t(r0)
        L_0x0140:
            java.lang.Object r0 = r13.remove(r1)
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r0.isScrollContainer()
            if (r2 != 0) goto L_0x0154
            boolean r2 = r0 instanceof android.widget.ScrollView
            if (r2 != 0) goto L_0x0154
            boolean r2 = r0 instanceof androidx.core.widget.NestedScrollView
            if (r2 == 0) goto L_0x0176
        L_0x0154:
            boolean r2 = r0 instanceof android.widget.HorizontalScrollView
            if (r2 != 0) goto L_0x0176
            boolean r2 = r0 instanceof android.webkit.WebView
            if (r2 != 0) goto L_0x0176
            boolean r2 = G8.g.h(r0, r6)
            if (r2 != 0) goto L_0x0176
            a9.T2 r2 = r12.f47616d
            java.lang.Object r2 = r2.invoke(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = HJ.C15854t.W(r2, r5, r1, r7, r4)
            if (r2 == 0) goto L_0x0171
            goto L_0x0176
        L_0x0171:
            com.contentsquare.android.sdk.r1 r2 = b(r0, r14)
            r9 = r2
        L_0x0176:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0183
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            GJ.h r0 = I2.C4610g0.b(r0)
            YH.C16877v.D(r13, r0)
        L_0x0183:
            if (r9 != 0) goto L_0x018b
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0140
        L_0x018b:
            D8.c r13 = r12.f47617e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Searched view tree: "
            r14.<init>(r0)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            r13.f(r14)
        L_0x019e:
            if (r9 != 0) goto L_0x01a2
            com.contentsquare.android.sdk.p0$a r9 = com.contentsquare.android.sdk.C7145p0.a.f47584a
        L_0x01a2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7150s0.a(android.view.ViewGroup, boolean):com.contentsquare.android.sdk.p0");
    }
}
