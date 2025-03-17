package com.google.firebase.perf.config;

public final class t extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static t f68550a;

    private t() {
    }

    public static synchronized t e() {
        t tVar;
        synchronized (t.class) {
            try {
                if (f68550a == null) {
                    f68550a = new t();
                }
                tVar = f68550a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return tVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    /* access modifiers changed from: protected */
    public Long d() {
        return 300L;
    }
}
