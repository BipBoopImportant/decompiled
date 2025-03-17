package com.google.android.gms.internal.measurement;

public final class Y2 {

    /* renamed from: a  reason: collision with root package name */
    private static C7257b3 f48828a;

    public static synchronized C7257b3 a() {
        C7257b3 b3Var;
        synchronized (Y2.class) {
            try {
                if (f48828a == null) {
                    b(new C7248a3());
                }
                b3Var = f48828a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return b3Var;
    }

    private static synchronized void b(C7257b3 b3Var) {
        synchronized (Y2.class) {
            if (f48828a == null) {
                f48828a = b3Var;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}
