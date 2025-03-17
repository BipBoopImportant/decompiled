package com.google.android.gms.measurement.internal;

import K9.C6620s;
import java.lang.Thread;

final class K2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final String f49800a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ J2 f49801b;

    public K2(J2 j22, String str) {
        this.f49801b = j22;
        C6620s.l(str);
        this.f49800a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f49801b.f().E().b(this.f49800a, th2);
    }
}
