package com.google.firebase.perf.config;

public final class r extends v<Double> {

    /* renamed from: a  reason: collision with root package name */
    private static r f68548a;

    private r() {
    }

    public static synchronized r f() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f68548a == null) {
                    f68548a = new r();
                }
                rVar = f68548a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return rVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "sessions_sampling_percentage";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_vc_session_sampling_rate";
    }

    /* access modifiers changed from: protected */
    public Double d() {
        return Double.valueOf(0.01d);
    }

    /* access modifiers changed from: protected */
    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
