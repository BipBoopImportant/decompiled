package com.google.firebase.perf.config;

public final class c extends v<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static c f68532a;

    private c() {
    }

    protected static synchronized c d() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f68532a == null) {
                    f68532a = new c();
                }
                cVar = f68532a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "isEnabled";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "firebase_performance_collection_enabled";
    }
}
