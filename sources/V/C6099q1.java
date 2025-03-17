package v;

import androidx.concurrent.futures.c;

/* renamed from: v.q1  reason: case insensitive filesystem */
public final /* synthetic */ class C6099q1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6123y1 f30654a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f30655b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.a f30656c;

    public /* synthetic */ C6099q1(C6123y1 y1Var, boolean z10, c.a aVar) {
        this.f30654a = y1Var;
        this.f30655b = z10;
        this.f30656c = aVar;
    }

    public final void run() {
        this.f30654a.J(this.f30655b, this.f30656c);
    }
}
