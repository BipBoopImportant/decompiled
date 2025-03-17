package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

final class G1<T> implements S1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final A1 f49198a;

    /* renamed from: b  reason: collision with root package name */
    private final C7503j2<?, ?> f49199b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f49200c;

    /* renamed from: d  reason: collision with root package name */
    private final E0<?> f49201d;

    private G1(C7503j2<?, ?> j2Var, E0<?> e02, A1 a12) {
        this.f49199b = j2Var;
        this.f49200c = e02.e(a12);
        this.f49201d = e02;
        this.f49198a = a12;
    }

    static <T> G1<T> f(C7503j2<?, ?> j2Var, E0<?> e02, A1 a12) {
        return new G1<>(j2Var, e02, a12);
    }

    public final void a(T t10, H2 h22) {
        Iterator<Map.Entry<?, Object>> o10 = this.f49201d.b(t10).o();
        while (o10.hasNext()) {
            Map.Entry next = o10.next();
            K0 k02 = (K0) next.getKey();
            if (k02.zzc() != E2.MESSAGE || k02.zzd() || k02.h()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C7490g1) {
                h22.g(k02.zza(), ((C7490g1) next).a().d());
            } else {
                h22.g(k02.zza(), next.getValue());
            }
        }
        C7503j2<?, ?> j2Var = this.f49199b;
        j2Var.g(j2Var.f(t10), h22);
    }

    public final boolean b(T t10, T t11) {
        if (!this.f49199b.f(t10).equals(this.f49199b.f(t11))) {
            return false;
        }
        if (this.f49200c) {
            return this.f49201d.b(t10).equals(this.f49201d.b(t11));
        }
        return true;
    }

    public final void c(T t10, T t11) {
        T1.o(this.f49199b, t10, t11);
        if (this.f49200c) {
            T1.m(this.f49201d, t10, t11);
        }
    }

    public final void d(T t10) {
        this.f49199b.j(t10);
        this.f49201d.g(t10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.android.gms.internal.vision.Q0$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(T r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.vision.C7481e0 r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.vision.Q0 r0 = (com.google.android.gms.internal.vision.Q0) r0
            com.google.android.gms.internal.vision.m2 r1 = r0.zzb
            com.google.android.gms.internal.vision.m2 r2 = com.google.android.gms.internal.vision.C7515m2.a()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.vision.m2 r1 = com.google.android.gms.internal.vision.C7515m2.g()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.vision.Q0$c r11 = (com.google.android.gms.internal.vision.Q0.c) r11
            com.google.android.gms.internal.vision.I0 r11 = r11.x()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00c9
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r12, r13, r15)
            int r13 = r15.f49310a
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L_0x0065
            r3 = r13 & 7
            if (r3 != r5) goto L_0x0060
            com.google.android.gms.internal.vision.E0<?> r2 = r10.f49201d
            com.google.android.gms.internal.vision.C0 r3 = r15.f49313d
            com.google.android.gms.internal.vision.A1 r5 = r10.f49198a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.c(r3, r5, r6)
            r8 = r2
            com.google.android.gms.internal.vision.Q0$d r8 = (com.google.android.gms.internal.vision.Q0.d) r8
            if (r8 == 0) goto L_0x0056
            com.google.android.gms.internal.vision.N1 r13 = com.google.android.gms.internal.vision.N1.a()
            com.google.android.gms.internal.vision.A1 r2 = r8.f49246a
            java.lang.Class r2 = r2.getClass()
            com.google.android.gms.internal.vision.S1 r13 = r13.b(r2)
            int r13 = com.google.android.gms.internal.vision.C7477d0.g(r13, r12, r4, r14, r15)
            com.google.android.gms.internal.vision.Q0$e r2 = r8.f49247b
            java.lang.Object r3 = r15.f49312c
            r11.g(r2, r3)
        L_0x0054:
            r2 = r8
            goto L_0x0019
        L_0x0056:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.android.gms.internal.vision.C7477d0.c(r2, r3, r4, r5, r6, r7)
            goto L_0x0054
        L_0x0060:
            int r13 = com.google.android.gms.internal.vision.C7477d0.a(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x0065:
            r13 = 0
            r3 = r0
        L_0x0067:
            if (r4 >= r14) goto L_0x00be
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r12, r4, r15)
            int r6 = r15.f49310a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto L_0x00a0
            r9 = 3
            if (r7 == r9) goto L_0x0079
            goto L_0x00b5
        L_0x0079:
            if (r2 == 0) goto L_0x0095
            com.google.android.gms.internal.vision.N1 r6 = com.google.android.gms.internal.vision.N1.a()
            com.google.android.gms.internal.vision.A1 r7 = r2.f49246a
            java.lang.Class r7 = r7.getClass()
            com.google.android.gms.internal.vision.S1 r6 = r6.b(r7)
            int r4 = com.google.android.gms.internal.vision.C7477d0.g(r6, r12, r4, r14, r15)
            com.google.android.gms.internal.vision.Q0$e r6 = r2.f49247b
            java.lang.Object r7 = r15.f49312c
            r11.g(r6, r7)
            goto L_0x0067
        L_0x0095:
            if (r8 != r5) goto L_0x00b5
            int r4 = com.google.android.gms.internal.vision.C7477d0.q(r12, r4, r15)
            java.lang.Object r3 = r15.f49312c
            com.google.android.gms.internal.vision.i0 r3 = (com.google.android.gms.internal.vision.C7497i0) r3
            goto L_0x0067
        L_0x00a0:
            if (r8 != 0) goto L_0x00b5
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r12, r4, r15)
            int r13 = r15.f49310a
            com.google.android.gms.internal.vision.E0<?> r2 = r10.f49201d
            com.google.android.gms.internal.vision.C0 r6 = r15.f49313d
            com.google.android.gms.internal.vision.A1 r7 = r10.f49198a
            java.lang.Object r2 = r2.c(r6, r7, r13)
            com.google.android.gms.internal.vision.Q0$d r2 = (com.google.android.gms.internal.vision.Q0.d) r2
            goto L_0x0067
        L_0x00b5:
            r7 = 12
            if (r6 == r7) goto L_0x00be
            int r4 = com.google.android.gms.internal.vision.C7477d0.a(r6, r12, r4, r14, r15)
            goto L_0x0067
        L_0x00be:
            if (r3 == 0) goto L_0x00c6
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.c(r13, r3)
        L_0x00c6:
            r13 = r4
            goto L_0x0019
        L_0x00c9:
            if (r13 != r14) goto L_0x00cc
            return
        L_0x00cc:
            com.google.android.gms.internal.vision.Z0 r11 = com.google.android.gms.internal.vision.Z0.e()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.G1.e(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.e0):void");
    }

    public final T zza() {
        return this.f49198a.u().h();
    }

    public final int zzb(T t10) {
        C7503j2<?, ?> j2Var = this.f49199b;
        int k10 = j2Var.k(j2Var.f(t10));
        return this.f49200c ? k10 + this.f49201d.b(t10).s() : k10;
    }

    public final boolean zzd(T t10) {
        return this.f49201d.b(t10).r();
    }

    public final int zza(T t10) {
        int hashCode = this.f49199b.f(t10).hashCode();
        return this.f49200c ? (hashCode * 53) + this.f49201d.b(t10).hashCode() : hashCode;
    }
}
