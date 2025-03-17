package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y5  reason: case insensitive filesystem */
final class C7454y5<T> implements K5<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C7406s5 f49153a;

    /* renamed from: b  reason: collision with root package name */
    private final Z5<?, ?> f49154b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f49155c;

    /* renamed from: d  reason: collision with root package name */
    private final C7461z4<?> f49156d;

    private C7454y5(Z5<?, ?> z52, C7461z4<?> z4Var, C7406s5 s5Var) {
        this.f49154b = z52;
        this.f49155c = z4Var.e(s5Var);
        this.f49156d = z4Var;
        this.f49153a = s5Var;
    }

    static <T> C7454y5<T> f(Z5<?, ?> z52, C7461z4<?> z4Var, C7406s5 s5Var) {
        return new C7454y5<>(z52, z4Var, s5Var);
    }

    public final boolean a(T t10) {
        return this.f49156d.b(t10).s();
    }

    public final void b(T t10, T t11) {
        L5.n(this.f49154b, t10, t11);
        if (this.f49155c) {
            L5.l(this.f49156d, t10, t11);
        }
    }

    public final boolean c(T t10, T t11) {
        if (!this.f49154b.k(t10).equals(this.f49154b.k(t11))) {
            return false;
        }
        if (this.f49155c) {
            return this.f49156d.b(t10).equals(this.f49156d.b(t11));
        }
        return true;
    }

    public final void d(T t10, C7399r6 r6Var) {
        Iterator<Map.Entry<?, Object>> p10 = this.f49156d.b(t10).p();
        while (p10.hasNext()) {
            Map.Entry next = p10.next();
            C4 c42 = (C4) next.getKey();
            if (c42.zzc() != C7384p6.MESSAGE || c42.h() || c42.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof Y4) {
                r6Var.g(c42.zza(), ((Y4) next).a().c());
            } else {
                r6Var.g(c42.zza(), next.getValue());
            }
        }
        Z5<?, ?> z52 = this.f49154b;
        z52.d(z52.k(t10), r6Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.measurement.L4$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.Y3 r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.L4 r0 = (com.google.android.gms.internal.measurement.L4) r0
            com.google.android.gms.internal.measurement.c6 r1 = r0.zzb
            com.google.android.gms.internal.measurement.c6 r2 = com.google.android.gms.internal.measurement.C7269c6.k()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.measurement.c6 r1 = com.google.android.gms.internal.measurement.C7269c6.l()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.measurement.L4$b r10 = (com.google.android.gms.internal.measurement.L4.b) r10
            r10.J()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.measurement.Z3.s(r11, r12, r14)
            int r2 = r14.f48829a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.measurement.z4<?> r12 = r9.f49156d
            com.google.android.gms.internal.measurement.x4 r0 = r14.f48832d
            com.google.android.gms.internal.measurement.s5 r3 = r9.f49153a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.L4$d r0 = (com.google.android.gms.internal.measurement.L4.d) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.Z3.d(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.measurement.G5.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.measurement.Z3.b(r2, r11, r4, r13, r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.Z3.s(r11, r4, r14)
            int r5 = r14.f48829a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.Z3.l(r11, r4, r14)
            java.lang.Object r2 = r14.f48831c
            com.google.android.gms.internal.measurement.d4 r2 = (com.google.android.gms.internal.measurement.C7276d4) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.measurement.G5.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.Z3.s(r11, r4, r14)
            int r12 = r14.f48829a
            com.google.android.gms.internal.measurement.z4<?> r0 = r9.f49156d
            com.google.android.gms.internal.measurement.x4 r5 = r14.f48832d
            com.google.android.gms.internal.measurement.s5 r6 = r9.f49153a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            com.google.android.gms.internal.measurement.L4$d r0 = (com.google.android.gms.internal.measurement.L4.d) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.Z3.b(r5, r11, r4, r13, r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.e(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.measurement.U4 r10 = com.google.android.gms.internal.measurement.U4.e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7454y5.e(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.Y3):void");
    }

    public final int zza(T t10) {
        Z5<?, ?> z52 = this.f49154b;
        int e10 = z52.e(z52.k(t10));
        return this.f49155c ? e10 + this.f49156d.b(t10).a() : e10;
    }

    public final int zzb(T t10) {
        int hashCode = this.f49154b.k(t10).hashCode();
        return this.f49155c ? (hashCode * 53) + this.f49156d.b(t10).hashCode() : hashCode;
    }

    public final void zzd(T t10) {
        this.f49154b.l(t10);
        this.f49156d.g(t10);
    }

    public final T zza() {
        C7406s5 s5Var = this.f49153a;
        if (s5Var instanceof L4) {
            return ((L4) s5Var).B();
        }
        return s5Var.c().F();
    }
}
