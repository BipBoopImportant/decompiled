package com.google.android.gms.vision.clearcut;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final long f50559a = Math.round(30000.0d);

    /* renamed from: b  reason: collision with root package name */
    private final Object f50560b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private long f50561c = Long.MIN_VALUE;

    public b(double d10) {
    }

    public final boolean a() {
        synchronized (this.f50560b) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f50561c + this.f50559a > currentTimeMillis) {
                    return false;
                }
                this.f50561c = currentTimeMillis;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
