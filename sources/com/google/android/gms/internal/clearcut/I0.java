package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

final class I0 implements H0 {
    I0() {
    }

    public final Object c(Object obj, Object obj2) {
        G0 g02 = (G0) obj;
        G0 g03 = (G0) obj2;
        if (!g03.isEmpty()) {
            if (!g02.a()) {
                g02 = g02.d();
            }
            g02.b(g03);
        }
        return g02;
    }

    public final int d(int i10, Object obj, Object obj2) {
        G0 g02 = (G0) obj;
        if (g02.isEmpty()) {
            return 0;
        }
        Iterator it = g02.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final F0<?, ?> e(Object obj) {
        throw new NoSuchMethodError();
    }

    public final Object f(Object obj) {
        return G0.c().d();
    }

    public final Object g(Object obj) {
        ((G0) obj).l();
        return obj;
    }

    public final boolean h(Object obj) {
        return !((G0) obj).a();
    }

    public final Map<?, ?> i(Object obj) {
        return (G0) obj;
    }

    public final Map<?, ?> zzh(Object obj) {
        return (G0) obj;
    }
}
