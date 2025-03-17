package com.google.firebase.perf.config;

public final class m extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static m f68543a;

    private m() {
    }

    public static synchronized m e() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f68543a == null) {
                    f68543a = new m();
                }
                mVar = f68543a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    public Long d() {
        return 0L;
    }
}
