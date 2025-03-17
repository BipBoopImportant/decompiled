package com.google.firebase.perf.config;

public final class j extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static j f68540a;

    private j() {
    }

    public static synchronized j e() {
        j jVar;
        synchronized (j.class) {
            try {
                if (f68540a == null) {
                    f68540a = new j();
                }
                jVar = f68540a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return jVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_rl_time_limit_sec";
    }

    /* access modifiers changed from: protected */
    public Long d() {
        return 600L;
    }
}
