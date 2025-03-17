package com.google.firebase.perf.session.gauges;

import Ac.a;
import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.util.k;
import com.google.firebase.perf.util.o;

class i {

    /* renamed from: e  reason: collision with root package name */
    private static final a f68640e = a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Runtime f68641a;

    /* renamed from: b  reason: collision with root package name */
    private final ActivityManager f68642b;

    /* renamed from: c  reason: collision with root package name */
    private final ActivityManager.MemoryInfo f68643c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f68644d;

    i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return o.c(k.BYTES.b(this.f68643c.totalMem));
    }

    public int b() {
        return o.c(k.BYTES.b(this.f68641a.maxMemory()));
    }

    public int c() {
        return o.c(k.MEGABYTES.b((long) this.f68642b.getMemoryClass()));
    }

    i(Runtime runtime, Context context) {
        this.f68641a = runtime;
        this.f68644d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f68642b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f68643c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
