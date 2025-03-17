package v;

import w.B;

/* renamed from: v.k1  reason: case insensitive filesystem */
class C6081k1 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f30599a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final B f30600b;

    /* renamed from: c  reason: collision with root package name */
    private int f30601c;

    C6081k1(B b10, int i10) {
        this.f30600b = b10;
        this.f30601c = i10;
    }

    public int a() {
        int i10;
        synchronized (this.f30599a) {
            i10 = this.f30601c;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void b(int i10) {
        synchronized (this.f30599a) {
            this.f30601c = i10;
        }
    }
}
