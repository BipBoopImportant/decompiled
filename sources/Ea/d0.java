package ea;

import java.util.List;

final class d0 extends e0 {

    /* renamed from: c  reason: collision with root package name */
    final transient int f50947c;

    /* renamed from: d  reason: collision with root package name */
    final transient int f50948d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ e0 f50949e;

    d0(e0 e0Var, int i10, int i11) {
        this.f50949e = e0Var;
        this.f50947c = i10;
        this.f50948d = i11;
    }

    public final Object get(int i10) {
        Y.a(i10, this.f50948d, "index");
        return this.f50949e.get(i10 + this.f50947c);
    }

    /* access modifiers changed from: package-private */
    public final Object[] i() {
        return this.f50949e.i();
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return this.f50949e.j() + this.f50947c;
    }

    /* access modifiers changed from: package-private */
    public final int k() {
        return this.f50949e.j() + this.f50947c + this.f50948d;
    }

    /* access modifiers changed from: package-private */
    public final boolean p() {
        return true;
    }

    public final e0 r(int i10, int i11) {
        Y.c(i10, i11, this.f50948d);
        int i12 = this.f50947c;
        return this.f50949e.subList(i10 + i12, i11 + i12);
    }

    public final int size() {
        return this.f50948d;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
