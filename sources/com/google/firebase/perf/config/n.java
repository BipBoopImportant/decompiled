package com.google.firebase.perf.config;

public final class n extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static n f68544a;

    private n() {
    }

    public static synchronized n f() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f68544a == null) {
                    f68544a = new n();
                }
                nVar = f68544a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return nVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
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
