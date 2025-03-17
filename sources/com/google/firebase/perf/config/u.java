package com.google.firebase.perf.config;

public final class u extends v<Double> {

    /* renamed from: a  reason: collision with root package name */
    private static u f68551a;

    private u() {
    }

    protected static synchronized u f() {
        u uVar;
        synchronized (u.class) {
            try {
                if (f68551a == null) {
                    f68551a = new u();
                }
                uVar = f68551a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return uVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    /* access modifiers changed from: protected */
    public Double d() {
        return Double.valueOf(1.0d);
    }

    /* access modifiers changed from: protected */
    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
