package com.google.firebase.perf.config;

public final class e extends v<Double> {

    /* renamed from: a  reason: collision with root package name */
    private static e f68534a;

    private e() {
    }

    protected static synchronized e e() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f68534a == null) {
                    f68534a = new e();
                }
                eVar = f68534a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "fragment_sampling_percentage";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    /* access modifiers changed from: protected */
    public Double d() {
        return Double.valueOf(0.0d);
    }
}
