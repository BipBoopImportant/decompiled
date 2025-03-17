package com.google.firebase.perf.config;

public final class d extends v<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static d f68533a;

    private d() {
    }

    protected static synchronized d e() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f68533a == null) {
                    f68533a = new d();
                }
                dVar = f68533a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "experiment_app_start_ttid";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_experiment_app_start_ttid";
    }

    /* access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.FALSE;
    }
}
