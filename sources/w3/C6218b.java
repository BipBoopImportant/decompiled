package w3;

import java.util.ArrayList;
import t3.C5950a;
import t3.N;

/* renamed from: w3.b  reason: case insensitive filesystem */
public abstract class C6218b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31412a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<C> f31413b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    private int f31414c;

    /* renamed from: d  reason: collision with root package name */
    private k f31415d;

    protected C6218b(boolean z10) {
        this.f31412a = z10;
    }

    public final void l(C c10) {
        C5950a.e(c10);
        if (!this.f31413b.contains(c10)) {
            this.f31413b.add(c10);
            this.f31414c++;
        }
    }

    /* access modifiers changed from: protected */
    public final void p(int i10) {
        k kVar = (k) N.i(this.f31415d);
        for (int i11 = 0; i11 < this.f31414c; i11++) {
            this.f31413b.get(i11).f(this, kVar, this.f31412a, i10);
        }
    }

    /* access modifiers changed from: protected */
    public final void q() {
        k kVar = (k) N.i(this.f31415d);
        for (int i10 = 0; i10 < this.f31414c; i10++) {
            this.f31413b.get(i10).b(this, kVar, this.f31412a);
        }
        this.f31415d = null;
    }

    /* access modifiers changed from: protected */
    public final void r(k kVar) {
        for (int i10 = 0; i10 < this.f31414c; i10++) {
            this.f31413b.get(i10).g(this, kVar, this.f31412a);
        }
    }

    /* access modifiers changed from: protected */
    public final void s(k kVar) {
        this.f31415d = kVar;
        for (int i10 = 0; i10 < this.f31414c; i10++) {
            this.f31413b.get(i10).a(this, kVar, this.f31412a);
        }
    }
}
