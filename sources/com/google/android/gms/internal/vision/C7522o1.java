package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.o1  reason: case insensitive filesystem */
final class C7522o1 extends C7502j1 {
    private C7522o1() {
        super();
    }

    private static <E> C7466a1<E> e(Object obj, long j10) {
        return (C7466a1) q2.F(obj, j10);
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j10) {
        C7466a1 e10 = e(obj, j10);
        C7466a1 e11 = e(obj2, j10);
        int size = e10.size();
        int size2 = e11.size();
        if (size > 0 && size2 > 0) {
            if (!e10.zza()) {
                e10 = e10.c(size2 + size);
            }
            e10.addAll(e11);
        }
        if (size > 0) {
            e11 = e10;
        }
        q2.j(obj, j10, e11);
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj, long j10) {
        e(obj, j10).zzb();
    }
}
