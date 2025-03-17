package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.u1  reason: case insensitive filesystem */
final class C7418u1 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private ThreadFactory f49085a = Executors.defaultThreadFactory();

    C7418u1(C7327j1 j1Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f49085a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
