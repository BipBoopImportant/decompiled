package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e5  reason: case insensitive filesystem */
final class C7286e5 implements C7259b5 {
    C7286e5() {
    }

    private static <E> R4<E> c(Object obj, long j10) {
        return (R4) C7287e6.B(obj, j10);
    }

    public final <E> void a(Object obj, Object obj2, long j10) {
        R4 c10 = c(obj, j10);
        R4 c11 = c(obj2, j10);
        int size = c10.size();
        int size2 = c11.size();
        if (size > 0 && size2 > 0) {
            if (!c10.zzc()) {
                c10 = c10.c(size2 + size);
            }
            c10.addAll(c11);
        }
        if (size > 0) {
            c11 = c10;
        }
        C7287e6.j(obj, j10, c11);
    }

    public final void b(Object obj, long j10) {
        c(obj, j10).zzb();
    }
}
