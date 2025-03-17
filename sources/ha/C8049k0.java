package ha;

import java.util.List;

/* renamed from: ha.k0  reason: case insensitive filesystem */
final class C8049k0 extends C8059l0 {

    /* renamed from: d  reason: collision with root package name */
    final transient int f52613d;

    /* renamed from: e  reason: collision with root package name */
    final transient int f52614e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ C8059l0 f52615f;

    C8049k0(C8059l0 l0Var, int i10, int i11) {
        this.f52615f = l0Var;
        this.f52613d = i10;
        this.f52614e = i11;
    }

    public final Object get(int i10) {
        C8167w.a(i10, this.f52614e, "index");
        return this.f52615f.get(i10 + this.f52613d);
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.f52615f.j() + this.f52613d + this.f52614e;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return this.f52615f.j() + this.f52613d;
    }

    /* access modifiers changed from: package-private */
    public final Object[] m() {
        return this.f52615f.m();
    }

    public final C8059l0 p(int i10, int i11) {
        C8167w.d(i10, i11, this.f52614e);
        C8059l0 l0Var = this.f52615f;
        int i12 = this.f52613d;
        return l0Var.subList(i10 + i12, i11 + i12);
    }

    public final int size() {
        return this.f52614e;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
