package Qb;

import Sb.c;
import Tb.F;

public final /* synthetic */ class Y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0 f62945a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ F.e.d f62946b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f62947c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f62948d;

    public /* synthetic */ Y(b0 b0Var, F.e.d dVar, c cVar, boolean z10) {
        this.f62945a = b0Var;
        this.f62946b = dVar;
        this.f62947c = cVar;
        this.f62948d = z10;
    }

    public final void run() {
        this.f62945a.r(this.f62946b, this.f62947c, this.f62948d);
    }
}
