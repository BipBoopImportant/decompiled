package androidx.work;

import androidx.concurrent.futures.c;
import java.util.concurrent.atomic.AtomicBoolean;
import nI.C17631a;

/* renamed from: androidx.work.u  reason: case insensitive filesystem */
public final /* synthetic */ class C7051u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f45316a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.a f45317b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C17631a f45318c;

    public /* synthetic */ C7051u(AtomicBoolean atomicBoolean, c.a aVar, C17631a aVar2) {
        this.f45316a = atomicBoolean;
        this.f45317b = aVar;
        this.f45318c = aVar2;
    }

    public final void run() {
        C7052v.i(this.f45316a, this.f45317b, this.f45318c);
    }
}
