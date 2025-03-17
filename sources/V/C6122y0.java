package v;

import androidx.concurrent.futures.c;
import java.util.concurrent.atomic.AtomicReference;
import v.C6050a0;

/* renamed from: v.y0  reason: case insensitive filesystem */
public final /* synthetic */ class C6122y0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6050a0.g f30747a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f30748b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.a f30749c;

    public /* synthetic */ C6122y0(C6050a0.g gVar, AtomicReference atomicReference, c.a aVar) {
        this.f30747a = gVar;
        this.f30748b = atomicReference;
        this.f30749c = aVar;
    }

    public final void run() {
        this.f30747a.v(this.f30748b, this.f30749c);
    }
}
