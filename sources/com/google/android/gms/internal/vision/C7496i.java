package com.google.android.gms.internal.vision;

import java.util.List;

/* renamed from: com.google.android.gms.internal.vision.i  reason: case insensitive filesystem */
final class C7496i extends C7480e {

    /* renamed from: b  reason: collision with root package name */
    private final C7492h f49334b = new C7492h();

    C7496i() {
    }

    public final void a(Throwable th2) {
        th2.printStackTrace();
        List<Throwable> a10 = this.f49334b.a(th2, false);
        if (a10 != null) {
            synchronized (a10) {
                try {
                    for (Throwable printStackTrace : a10) {
                        System.err.print("Suppressed: ");
                        printStackTrace.printStackTrace();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
