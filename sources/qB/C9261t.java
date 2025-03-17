package Qb;

import java.util.Map;

/* renamed from: Qb.t  reason: case insensitive filesystem */
public final /* synthetic */ class C9261t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C9267z f63036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f63037b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f63038c;

    public /* synthetic */ C9261t(C9267z zVar, Throwable th2, Map map) {
        this.f63036a = zVar;
        this.f63037b = th2;
        this.f63038c = map;
    }

    public final void run() {
        this.f63036a.y(this.f63037b, this.f63038c);
    }
}
