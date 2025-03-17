package nd;

import od.C10104a;

/* renamed from: nd.g  reason: case insensitive filesystem */
abstract class C10088g {

    /* renamed from: b  reason: collision with root package name */
    static final C10088g f75549b = new C10086e((C10088g) null, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final C10088g f75550a;

    C10088g(C10088g gVar) {
        this.f75550a = gVar;
    }

    /* access modifiers changed from: package-private */
    public final C10088g a(int i10, int i11) {
        return new C10086e(this, i10, i11);
    }

    /* access modifiers changed from: package-private */
    public final C10088g b(int i10, int i11) {
        return new C10083b(this, i10, i11);
    }

    /* access modifiers changed from: package-private */
    public abstract void c(C10104a aVar, byte[] bArr);

    /* access modifiers changed from: package-private */
    public final C10088g d() {
        return this.f75550a;
    }
}
