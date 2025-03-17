package y6;

import D6.t;
import E6.b;
import java.util.ArrayList;
import java.util.List;
import z6.C9019a;

public class u implements C8986c, C9019a.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f57978a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f57979b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C9019a.b> f57980c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final t.a f57981d;

    /* renamed from: e  reason: collision with root package name */
    private final C9019a<?, Float> f57982e;

    /* renamed from: f  reason: collision with root package name */
    private final C9019a<?, Float> f57983f;

    /* renamed from: g  reason: collision with root package name */
    private final C9019a<?, Float> f57984g;

    public u(b bVar, t tVar) {
        this.f57978a = tVar.c();
        this.f57979b = tVar.g();
        this.f57981d = tVar.f();
        C9019a<Float, Float> h10 = tVar.e().h();
        this.f57982e = h10;
        C9019a<Float, Float> h11 = tVar.b().h();
        this.f57983f = h11;
        C9019a<Float, Float> h12 = tVar.d().h();
        this.f57984g = h12;
        bVar.i(h10);
        bVar.i(h11);
        bVar.i(h12);
        h10.a(this);
        h11.a(this);
        h12.a(this);
    }

    public void a() {
        for (int i10 = 0; i10 < this.f57980c.size(); i10++) {
            this.f57980c.get(i10).a();
        }
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
    }

    /* access modifiers changed from: package-private */
    public void c(C9019a.b bVar) {
        this.f57980c.add(bVar);
    }

    public C9019a<?, Float> f() {
        return this.f57983f;
    }

    public C9019a<?, Float> h() {
        return this.f57984g;
    }

    public C9019a<?, Float> i() {
        return this.f57982e;
    }

    /* access modifiers changed from: package-private */
    public t.a j() {
        return this.f57981d;
    }

    public boolean k() {
        return this.f57979b;
    }
}
