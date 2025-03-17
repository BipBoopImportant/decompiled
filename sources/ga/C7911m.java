package ga;

import java.util.List;

/* renamed from: ga.m  reason: case insensitive filesystem */
final class C7911m extends C7912n {

    /* renamed from: d  reason: collision with root package name */
    final transient int f51397d;

    /* renamed from: e  reason: collision with root package name */
    final transient int f51398e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ C7912n f51399f;

    C7911m(C7912n nVar, int i10, int i11) {
        this.f51399f = nVar;
        this.f51397d = i10;
        this.f51398e = i11;
    }

    public final Object get(int i10) {
        C7902d.a(i10, this.f51398e, "index");
        return this.f51399f.get(i10 + this.f51397d);
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.f51399f.j() + this.f51397d + this.f51398e;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return this.f51399f.j() + this.f51397d;
    }

    /* access modifiers changed from: package-private */
    public final Object[] k() {
        return this.f51399f.k();
    }

    public final C7912n m(int i10, int i11) {
        C7902d.c(i10, i11, this.f51398e);
        C7912n nVar = this.f51399f;
        int i12 = this.f51397d;
        return nVar.subList(i10 + i12, i11 + i12);
    }

    public final int size() {
        return this.f51398e;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
