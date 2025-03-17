package androidx.work;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.work.t  reason: case insensitive filesystem */
public final /* synthetic */ class C7050t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f45315a;

    public /* synthetic */ C7050t(AtomicBoolean atomicBoolean) {
        this.f45315a = atomicBoolean;
    }

    public final void run() {
        C7052v.h(this.f45315a);
    }
}
