package E7;

import H2.f;
import Y7.k;
import Z7.a;
import Z7.c;

final class u<Z> implements v<Z>, a.f {

    /* renamed from: e  reason: collision with root package name */
    private static final f<u<?>> f35202e = Z7.a.d(20, new a());

    /* renamed from: a  reason: collision with root package name */
    private final c f35203a = c.a();

    /* renamed from: b  reason: collision with root package name */
    private v<Z> f35204b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f35205c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f35206d;

    class a implements a.d<u<?>> {
        a() {
        }

        /* renamed from: b */
        public u<?> a() {
            return new u<>();
        }
    }

    u() {
    }

    private void b(v<Z> vVar) {
        this.f35206d = false;
        this.f35205c = true;
        this.f35204b = vVar;
    }

    static <Z> u<Z> e(v<Z> vVar) {
        u<Z> uVar = (u) k.d(f35202e.b());
        uVar.b(vVar);
        return uVar;
    }

    private void f() {
        this.f35204b = null;
        f35202e.a(this);
    }

    public int a() {
        return this.f35204b.a();
    }

    public synchronized void c() {
        this.f35203a.c();
        this.f35206d = true;
        if (!this.f35205c) {
            this.f35204b.c();
            f();
        }
    }

    public Class<Z> d() {
        return this.f35204b.d();
    }

    /* access modifiers changed from: package-private */
    public synchronized void g() {
        this.f35203a.c();
        if (this.f35205c) {
            this.f35205c = false;
            if (this.f35206d) {
                c();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Z get() {
        return this.f35204b.get();
    }

    public c j() {
        return this.f35203a;
    }
}
