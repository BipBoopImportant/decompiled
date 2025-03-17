package com.google.firebase.perf.config;

public final class i extends v<Double> {

    /* renamed from: a  reason: collision with root package name */
    private static i f68539a;

    private i() {
    }

    protected static synchronized i f() {
        i iVar;
        synchronized (i.class) {
            try {
                if (f68539a == null) {
                    f68539a = new i();
                }
                iVar = f68539a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_vc_network_request_sampling_rate";
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
