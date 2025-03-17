package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class b implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadFactory f68179e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f68180a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    private final String f68181b;

    /* renamed from: c  reason: collision with root package name */
    private final int f68182c;

    /* renamed from: d  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f68183d;

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f68181b = str;
        this.f68182c = i10;
        this.f68183d = threadPolicy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f68182c);
        StrictMode.ThreadPolicy threadPolicy = this.f68183d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = f68179e.newThread(new a(this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f68181b, Long.valueOf(this.f68180a.getAndIncrement())}));
        return newThread;
    }
}
