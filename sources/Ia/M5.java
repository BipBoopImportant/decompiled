package ia;

import java.util.List;

final class M5 extends N5 {

    /* renamed from: c  reason: collision with root package name */
    final transient int f53345c;

    /* renamed from: d  reason: collision with root package name */
    final transient int f53346d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ N5 f53347e;

    M5(N5 n52, int i10, int i11) {
        this.f53347e = n52;
        this.f53345c = i10;
        this.f53346d = i11;
    }

    public final Object get(int i10) {
        G1.a(i10, this.f53346d, "index");
        return this.f53347e.get(i10 + this.f53345c);
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.f53347e.j() + this.f53345c + this.f53346d;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return this.f53347e.j() + this.f53345c;
    }

    /* access modifiers changed from: package-private */
    public final Object[] k() {
        return this.f53347e.k();
    }

    public final N5 m(int i10, int i11) {
        G1.c(i10, i11, this.f53346d);
        N5 n52 = this.f53347e;
        int i12 = this.f53345c;
        return n52.subList(i10 + i12, i11 + i12);
    }

    public final int size() {
        return this.f53346d;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
