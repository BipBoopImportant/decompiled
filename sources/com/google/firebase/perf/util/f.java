package com.google.firebase.perf.util;

import Ac.a;
import android.os.Bundle;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    private static final a f68660b = a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f68661a;

    public f() {
        this(new Bundle());
    }

    private g<Integer> d(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Integer) this.f68661a.get(str));
        } catch (ClassCastException e10) {
            f68660b.b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public boolean a(String str) {
        return str != null && this.f68661a.containsKey(str);
    }

    public g<Boolean> b(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Boolean) this.f68661a.get(str));
        } catch (ClassCastException e10) {
            f68660b.b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g<Double> c(String str) {
        if (!a(str)) {
            return g.a();
        }
        Object obj = this.f68661a.get(str);
        if (obj == null) {
            return g.a();
        }
        if (obj instanceof Float) {
            return g.e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return g.e((Double) obj);
        }
        f68660b.b("Metadata key %s contains type other than double: %s", str);
        return g.a();
    }

    public g<Long> e(String str) {
        g<Integer> d10 = d(str);
        return d10.d() ? g.e(Long.valueOf((long) d10.c().intValue())) : g.a();
    }

    public f(Bundle bundle) {
        this.f68661a = (Bundle) bundle.clone();
    }
}
