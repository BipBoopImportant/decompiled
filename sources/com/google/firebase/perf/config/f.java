package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import wc.C10352a;

public final class f extends v<String> {

    /* renamed from: a  reason: collision with root package name */
    private static f f68535a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Long, String> f68536b = Collections.unmodifiableMap(new a());

    class a extends HashMap<Long, String> {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private f() {
    }

    public static synchronized f e() {
        f fVar;
        synchronized (f.class) {
            try {
                if (f68535a == null) {
                    f68535a = new f();
                }
                fVar = f68535a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return fVar;
    }

    protected static String f(long j10) {
        return f68536b.get(Long.valueOf(j10));
    }

    protected static boolean g(long j10) {
        return f68536b.containsKey(Long.valueOf(j10));
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_log_source";
    }

    /* access modifiers changed from: protected */
    public String d() {
        return C10352a.f77591c;
    }
}
