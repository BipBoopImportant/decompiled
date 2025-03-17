package com.google.firebase.perf.config;

public final class o extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static o f68545a;

    private o() {
    }

    public static synchronized o e() {
        o oVar;
        synchronized (o.class) {
            try {
                if (f68545a == null) {
                    f68545a = new o();
                }
                oVar = f68545a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return oVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "sessions_max_length_minutes";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_session_max_duration_min";
    }

    /* access modifiers changed from: protected */
    public Long d() {
        return 240L;
    }
}
