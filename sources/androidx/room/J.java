package androidx.room;

public final /* synthetic */ class J implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f44247a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ K f44248b;

    public /* synthetic */ J(Runnable runnable, K k10) {
        this.f44247a = runnable;
        this.f44248b = k10;
    }

    public final void run() {
        K.b(this.f44247a, this.f44248b);
    }
}
