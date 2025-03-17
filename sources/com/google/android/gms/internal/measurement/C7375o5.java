package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.o5  reason: case insensitive filesystem */
final class C7375o5 implements C7383p5 {
    C7375o5() {
    }

    public final Map<?, ?> a(Object obj) {
        return (C7358m5) obj;
    }

    public final Object b(Object obj, Object obj2) {
        C7358m5 m5Var = (C7358m5) obj;
        C7358m5 m5Var2 = (C7358m5) obj2;
        if (!m5Var2.isEmpty()) {
            if (!m5Var.k()) {
                m5Var = m5Var.d();
            }
            m5Var.c(m5Var2);
        }
        return m5Var;
    }

    public final boolean c(Object obj) {
        return !((C7358m5) obj).k();
    }

    public final Object d(Object obj) {
        ((C7358m5) obj).f();
        return obj;
    }

    public final int e(int i10, Object obj, Object obj2) {
        C7358m5 m5Var = (C7358m5) obj;
        C7340k5 k5Var = (C7340k5) obj2;
        if (m5Var.isEmpty()) {
            return 0;
        }
        Iterator it = m5Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final C7367n5<?, ?> zza(Object obj) {
        C7340k5 k5Var = (C7340k5) obj;
        throw new NoSuchMethodError();
    }

    public final Object zzb(Object obj) {
        return C7358m5.b().d();
    }

    public final Map<?, ?> zzd(Object obj) {
        return (C7358m5) obj;
    }
}
