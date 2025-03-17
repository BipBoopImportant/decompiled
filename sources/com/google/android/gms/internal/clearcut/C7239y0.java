package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.y0  reason: case insensitive filesystem */
final class C7239y0 extends C7233w0 {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f48517c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C7239y0() {
        super();
    }

    private static <E> List<E> e(Object obj, long j10) {
        return (List) C1.M(obj, j10);
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj, long j10) {
        Object obj2;
        List list = (List) C1.M(obj, j10);
        if (list instanceof C7230v0) {
            obj2 = ((C7230v0) list).d3();
        } else if (!f48517c.isAssignableFrom(list.getClass())) {
            obj2 = Collections.unmodifiableList(list);
        } else {
            return;
        }
        C1.i(obj, j10, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.gms.internal.clearcut.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.google.android.gms.internal.clearcut.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.gms.internal.clearcut.u0} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.util.List r6 = e(r6, r7)
            int r0 = r6.size()
            java.util.List r1 = e(r5, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0025
            boolean r1 = r1 instanceof com.google.android.gms.internal.clearcut.C7230v0
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.clearcut.u0 r1 = new com.google.android.gms.internal.clearcut.u0
            r1.<init>((int) r0)
            goto L_0x0021
        L_0x001c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0021:
            com.google.android.gms.internal.clearcut.C1.i(r5, r7, r1)
            goto L_0x0057
        L_0x0025:
            java.lang.Class<?> r2 = f48517c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0043
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x003e:
            com.google.android.gms.internal.clearcut.C1.i(r5, r7, r2)
            r1 = r2
            goto L_0x0057
        L_0x0043:
            boolean r2 = r1 instanceof com.google.android.gms.internal.clearcut.C7243z1
            if (r2 == 0) goto L_0x0057
            com.google.android.gms.internal.clearcut.u0 r2 = new com.google.android.gms.internal.clearcut.u0
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.clearcut.z1 r1 = (com.google.android.gms.internal.clearcut.C7243z1) r1
            r2.addAll(r1)
            goto L_0x003e
        L_0x0057:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0066
            if (r2 <= 0) goto L_0x0066
            r1.addAll(r6)
        L_0x0066:
            if (r0 <= 0) goto L_0x0069
            r6 = r1
        L_0x0069:
            com.google.android.gms.internal.clearcut.C1.i(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C7239y0.b(java.lang.Object, java.lang.Object, long):void");
    }
}
