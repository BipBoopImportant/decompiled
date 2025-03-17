package com.contentsquare.android.sdk;

import a9.M3;
import android.graphics.Rect;
import java.util.ArrayList;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import w8.C8933a;
import w8.e;

public final class d1 implements M0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f47385b = a.f47387c;

    /* renamed from: a  reason: collision with root package name */
    public final M3<C8933a> f47386a;

    public static final class a extends C17544u implements C17642l<Rect, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f47387c = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            C17542s.j((Rect) obj, "it");
            return "";
        }
    }

    public d1(M3<C8933a> m32) {
        C17542s.j(m32, "composeInterfaceProvider");
        this.f47386a = m32;
    }

    public static void b(e eVar, ArrayList arrayList, g1 g1Var) {
        if (((Boolean) g1Var.invoke(eVar)).booleanValue()) {
            arrayList.add(eVar);
            for (e b10 : eVar.g()) {
                b(b10, arrayList, g1Var);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: w8.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: w8.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: w8.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: w8.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.contentsquare.android.sdk.I0 a(com.contentsquare.android.sdk.M0.a r8) {
        /*
            r7 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            a9.M3<w8.a> r0 = r7.f47386a
            java.lang.Object r0 = r0.get()
            w8.a r0 = (w8.C8933a) r0
            r1 = 0
            if (r0 != 0) goto L_0x0011
            return r1
        L_0x0011:
            a9.J6<android.view.View> r2 = r8.f47041a
            r2.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            a9.J6$a<E> r2 = r2.f42087b
        L_0x001d:
            if (r2 == 0) goto L_0x002d
            java.lang.ref.WeakReference<T> r4 = r2.f42088a
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x002a
            r3.add(r4)
        L_0x002a:
            a9.J6$a<T> r2 = r2.f42090c
            goto L_0x001d
        L_0x002d:
            r2 = 0
            java.lang.Object r4 = YH.C16877v.z0(r3, r2)
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L_0x0037
            return r1
        L_0x0037:
            r5 = 1
            java.lang.Object r3 = YH.C16877v.z0(r3, r5)
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L_0x0041
            return r1
        L_0x0041:
            boolean r6 = r0.a(r4)
            if (r6 == 0) goto L_0x0048
            goto L_0x0057
        L_0x0048:
            boolean r4 = r0.d(r4)
            if (r4 == 0) goto L_0x0056
            boolean r4 = r0.a(r3)
            if (r4 == 0) goto L_0x0056
            r4 = r3
            goto L_0x0057
        L_0x0056:
            r4 = r1
        L_0x0057:
            if (r4 == 0) goto L_0x00cf
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.contentsquare.android.sdk.d1$a r6 = f47385b
            w8.e r0 = r0.c(r4, r5, r6)
            if (r0 == 0) goto L_0x006e
            com.contentsquare.android.sdk.g1 r6 = new com.contentsquare.android.sdk.g1
            r6.<init>(r8)
            b(r0, r3, r6)
        L_0x006e:
            int r8 = r3.size()
            java.util.ListIterator r8 = r3.listIterator(r8)
        L_0x0076:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r8.previous()
            r6 = r0
            w8.e r6 = (w8.e) r6
            boolean r6 = r6.o()
            if (r6 == 0) goto L_0x0076
            goto L_0x008b
        L_0x008a:
            r0 = r1
        L_0x008b:
            w8.e r0 = (w8.e) r0
            if (r0 != 0) goto L_0x00ae
            int r8 = r3.size()
            java.util.ListIterator r8 = r3.listIterator(r8)
        L_0x0097:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r8.previous()
            r3 = r0
            w8.e r3 = (w8.e) r3
            boolean r3 = r3.p()
            if (r3 != 0) goto L_0x0097
            r1 = r0
        L_0x00ab:
            r0 = r1
            w8.e r0 = (w8.e) r0
        L_0x00ae:
            if (r0 != 0) goto L_0x00b3
            com.contentsquare.android.sdk.I0$a r8 = com.contentsquare.android.sdk.I0.f47008d
            goto L_0x00b8
        L_0x00b3:
            com.contentsquare.android.sdk.Y0 r8 = new com.contentsquare.android.sdk.Y0
            r8.<init>(r0)
        L_0x00b8:
            boolean r0 = r8 instanceof com.contentsquare.android.sdk.Y0
            if (r0 == 0) goto L_0x00c8
            r0 = r8
            com.contentsquare.android.sdk.Y0 r0 = (com.contentsquare.android.sdk.Y0) r0
            w8.e r0 = r0.f47251a
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x00c8
            r2 = r5
        L_0x00c8:
            com.contentsquare.android.sdk.I0 r1 = new com.contentsquare.android.sdk.I0
            r0 = r2 ^ 1
            r1.<init>(r4, r8, r0)
        L_0x00cf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.d1.a(com.contentsquare.android.sdk.M0$a):com.contentsquare.android.sdk.I0");
    }
}
