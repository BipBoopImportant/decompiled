package s9;

import l9.p;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f56016a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f56017b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f56018c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Runnable f56019d;

    public /* synthetic */ g(r rVar, p pVar, int i10, Runnable runnable) {
        this.f56016a = rVar;
        this.f56017b = pVar;
        this.f56018c = i10;
        this.f56019d = runnable;
    }

    public final void run() {
        this.f56016a.t(this.f56017b, this.f56018c, this.f56019d);
    }
}
