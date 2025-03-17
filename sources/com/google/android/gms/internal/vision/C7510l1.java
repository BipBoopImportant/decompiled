package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.vision.l1  reason: case insensitive filesystem */
final class C7510l1 extends C7502j1 {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f49349c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C7510l1() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.vision.h1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.vision.h1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.vision.h1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> e(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = f(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.C7506k1
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.vision.h1 r0 = new com.google.android.gms.internal.vision.h1
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.L1
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.C7466a1
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.vision.a1 r0 = (com.google.android.gms.internal.vision.C7466a1) r0
            com.google.android.gms.internal.vision.a1 r6 = r0.c(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.vision.q2.j(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f49349c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.vision.q2.j(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.o2
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.vision.h1 r1 = new com.google.android.gms.internal.vision.h1
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.vision.o2 r0 = (com.google.android.gms.internal.vision.o2) r0
            r1.addAll(r0)
            com.google.android.gms.internal.vision.q2.j(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.L1
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.C7466a1
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.vision.a1 r1 = (com.google.android.gms.internal.vision.C7466a1) r1
            boolean r2 = r1.zza()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.vision.a1 r0 = r1.c(r0)
            com.google.android.gms.internal.vision.q2.j(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C7510l1.e(java.lang.Object, long, int):java.util.List");
    }

    private static <E> List<E> f(Object obj, long j10) {
        return (List) q2.F(obj, j10);
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j10) {
        List f10 = f(obj2, j10);
        List e10 = e(obj, j10, f10.size());
        int size = e10.size();
        int size2 = f10.size();
        if (size > 0 && size2 > 0) {
            e10.addAll(f10);
        }
        if (size > 0) {
            f10 = e10;
        }
        q2.j(obj, j10, f10);
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj, long j10) {
        Object obj2;
        List list = (List) q2.F(obj, j10);
        if (list instanceof C7506k1) {
            obj2 = ((C7506k1) list).h();
        } else if (!f49349c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof L1) || !(list instanceof C7466a1)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C7466a1 a1Var = (C7466a1) list;
                if (a1Var.zza()) {
                    a1Var.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        q2.j(obj, j10, obj2);
    }
}
