package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.w1  reason: case insensitive filesystem */
final class C7545w1 implements C7548x1 {
    C7545w1() {
    }

    public final Object a(Object obj) {
        ((C7539u1) obj).f();
        return obj;
    }

    public final Object b(Object obj, Object obj2) {
        C7539u1 u1Var = (C7539u1) obj;
        C7539u1 u1Var2 = (C7539u1) obj2;
        if (!u1Var2.isEmpty()) {
            if (!u1Var.k()) {
                u1Var = u1Var.d();
            }
            u1Var.c(u1Var2);
        }
        return u1Var;
    }

    public final Object c(Object obj) {
        return C7539u1.b().d();
    }

    public final Map<?, ?> d(Object obj) {
        return (C7539u1) obj;
    }

    public final int e(int i10, Object obj, Object obj2) {
        C7539u1 u1Var = (C7539u1) obj;
        C7533s1 s1Var = (C7533s1) obj2;
        if (u1Var.isEmpty()) {
            return 0;
        }
        Iterator it = u1Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> zza(Object obj) {
        return (C7539u1) obj;
    }

    public final C7542v1<?, ?> zzb(Object obj) {
        C7533s1 s1Var = (C7533s1) obj;
        throw new NoSuchMethodError();
    }

    public final boolean zzd(Object obj) {
        return !((C7539u1) obj).k();
    }
}
