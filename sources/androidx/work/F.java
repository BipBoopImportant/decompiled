package androidx.work;

import androidx.concurrent.futures.c;
import androidx.lifecycle.K;
import nI.C17631a;

public final /* synthetic */ class F implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N f45072a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f45073b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C17631a f45074c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ K f45075d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c.a f45076e;

    public /* synthetic */ F(N n10, String str, C17631a aVar, K k10, c.a aVar2) {
        this.f45072a = n10;
        this.f45073b = str;
        this.f45074c = aVar;
        this.f45075d = k10;
        this.f45076e = aVar2;
    }

    public final void run() {
        G.e(this.f45072a, this.f45073b, this.f45074c, this.f45075d, this.f45076e);
    }
}
