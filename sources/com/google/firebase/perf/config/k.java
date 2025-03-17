package com.google.firebase.perf.config;

public final class k extends v<String> {

    /* renamed from: a  reason: collision with root package name */
    private static k f68541a;

    protected k() {
    }

    protected static synchronized k e() {
        k kVar;
        synchronized (k.class) {
            try {
                if (f68541a == null) {
                    f68541a = new k();
                }
                kVar = f68541a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return kVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_disabled_android_versions";
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "";
    }
}
