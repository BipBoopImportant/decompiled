package hb;

import ib.C9832a;
import s.C5829h;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f73525a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C5829h f73526b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f73527c;

    public /* synthetic */ i(l lVar, C5829h hVar, C9832a aVar, Runnable runnable) {
        this.f73525a = lVar;
        this.f73526b = hVar;
        this.f73527c = runnable;
    }

    public final void run() {
        this.f73525a.l(this.f73526b, (C9832a) null, this.f73527c);
    }
}
