package ha;

/* renamed from: ha.o8  reason: case insensitive filesystem */
public final /* synthetic */ class C8097o8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C8136s8 f52698a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8027h8 f52699b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C8005f6 f52700c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f52701d;

    public /* synthetic */ C8097o8(C8136s8 s8Var, C8027h8 h8Var, C8005f6 f6Var, String str) {
        this.f52698a = s8Var;
        this.f52699b = h8Var;
        this.f52700c = f6Var;
        this.f52701d = str;
    }

    public final void run() {
        this.f52698a.c(this.f52699b, this.f52700c, this.f52701d);
    }
}
