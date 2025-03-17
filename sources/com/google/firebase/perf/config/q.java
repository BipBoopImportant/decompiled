package com.google.firebase.perf.config;

public final class q extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static q f68547a;

    private q() {
    }

    public static synchronized q f() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f68547a == null) {
                    f68547a = new q();
                }
                qVar = f68547a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return qVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    /* access modifiers changed from: protected */
    public Long d() {
        return 100L;
    }

    /* access modifiers changed from: protected */
    public Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
