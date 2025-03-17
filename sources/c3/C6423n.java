package C3;

import C3.t;

/* renamed from: C3.n  reason: case insensitive filesystem */
public final /* synthetic */ class C6423n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t.a f33663a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f33664b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f33665c;

    public /* synthetic */ C6423n(t.a aVar, t tVar, Exception exc) {
        this.f33663a = aVar;
        this.f33664b = tVar;
        this.f33665c = exc;
    }

    public final void run() {
        this.f33663a.r(this.f33664b, this.f33665c);
    }
}
