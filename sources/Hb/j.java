package hb;

import hb.l;
import s.C5829h;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f73528a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l.a f73529b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C5829h f73530c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Runnable f73531d;

    public /* synthetic */ j(l lVar, l.a aVar, C5829h hVar, Runnable runnable) {
        this.f73528a = lVar;
        this.f73529b = aVar;
        this.f73530c = hVar;
        this.f73531d = runnable;
    }

    public final void run() {
        this.f73528a.m(this.f73529b, this.f73530c, this.f73531d);
    }
}
