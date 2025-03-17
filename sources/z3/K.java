package z3;

import q3.D;
import t3.C5953d;
import t3.N;

public final class K implements F {

    /* renamed from: a  reason: collision with root package name */
    private final C5953d f32398a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f32399b;

    /* renamed from: c  reason: collision with root package name */
    private long f32400c;

    /* renamed from: d  reason: collision with root package name */
    private long f32401d;

    /* renamed from: e  reason: collision with root package name */
    private D f32402e = D.f27856d;

    public K(C5953d dVar) {
        this.f32398a = dVar;
    }

    public long L() {
        long j10 = this.f32400c;
        if (!this.f32399b) {
            return j10;
        }
        long c10 = this.f32398a.c() - this.f32401d;
        D d10 = this.f32402e;
        return j10 + (d10.f27859a == 1.0f ? N.P0(c10) : d10.a(c10));
    }

    public void a(long j10) {
        this.f32400c = j10;
        if (this.f32399b) {
            this.f32401d = this.f32398a.c();
        }
    }

    public void b() {
        if (!this.f32399b) {
            this.f32401d = this.f32398a.c();
            this.f32399b = true;
        }
    }

    public void c() {
        if (this.f32399b) {
            a(L());
            this.f32399b = false;
        }
    }

    public D e() {
        return this.f32402e;
    }

    public void g(D d10) {
        if (this.f32399b) {
            a(L());
        }
        this.f32402e = d10;
    }
}
