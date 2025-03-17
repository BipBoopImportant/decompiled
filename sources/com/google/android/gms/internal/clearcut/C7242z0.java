package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.z0  reason: case insensitive filesystem */
final class C7242z0 extends C7233w0 {
    private C7242z0() {
        super();
    }

    private static <E> C7201l0<E> e(Object obj, long j10) {
        return (C7201l0) C1.M(obj, j10);
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj, long j10) {
        e(obj, j10).zzv();
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j10) {
        C7201l0 e10 = e(obj, j10);
        C7201l0 e11 = e(obj2, j10);
        int size = e10.size();
        int size2 = e11.size();
        if (size > 0 && size2 > 0) {
            if (!e10.N()) {
                e10 = e10.R0(size2 + size);
            }
            e10.addAll(e11);
        }
        if (size > 0) {
            e11 = e10;
        }
        C1.i(obj, j10, e11);
    }
}
