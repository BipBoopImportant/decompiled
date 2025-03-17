package androidx.work;

import androidx.concurrent.futures.c;
import java.util.concurrent.atomic.AtomicBoolean;
import nI.C17631a;

public final /* synthetic */ class Z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f45129a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.a f45130b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C17631a f45131c;

    public /* synthetic */ Z(AtomicBoolean atomicBoolean, c.a aVar, C17631a aVar2) {
        this.f45129a = atomicBoolean;
        this.f45130b = aVar;
        this.f45131c = aVar2;
    }

    public final void run() {
        a0.h(this.f45129a, this.f45130b, this.f45131c);
    }
}
