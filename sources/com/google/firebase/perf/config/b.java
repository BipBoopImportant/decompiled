package com.google.firebase.perf.config;

public final class b extends v<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static b f68531a;

    private b() {
    }

    protected static synchronized b e() {
        b bVar;
        synchronized (b.class) {
            try {
                if (f68531a == null) {
                    f68531a = new b();
                }
                bVar = f68531a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "firebase_performance_collection_deactivated";
    }

    /* access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.FALSE;
    }
}
