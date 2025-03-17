package a0;

/* renamed from: a0.D  reason: case insensitive filesystem */
public final /* synthetic */ class C4953D implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4966j f14972a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f14973b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f14974c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Throwable f14975d;

    public /* synthetic */ C4953D(C4966j jVar, int i10, String str, Throwable th2) {
        this.f14972a = jVar;
        this.f14973b = i10;
        this.f14974c = str;
        this.f14975d = th2;
    }

    public final void run() {
        this.f14972a.b(new C4961e(this.f14973b, this.f14974c, this.f14975d));
    }
}
