package E7;

import C7.f;
import Y7.k;

class p<Z> implements v<Z> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f35180a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f35181b;

    /* renamed from: c  reason: collision with root package name */
    private final v<Z> f35182c;

    /* renamed from: d  reason: collision with root package name */
    private final a f35183d;

    /* renamed from: e  reason: collision with root package name */
    private final f f35184e;

    /* renamed from: f  reason: collision with root package name */
    private int f35185f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f35186g;

    interface a {
        void a(f fVar, p<?> pVar);
    }

    p(v<Z> vVar, boolean z10, boolean z11, f fVar, a aVar) {
        this.f35182c = (v) k.d(vVar);
        this.f35180a = z10;
        this.f35181b = z11;
        this.f35184e = fVar;
        this.f35183d = (a) k.d(aVar);
    }

    public int a() {
        return this.f35182c.a();
    }

    /* access modifiers changed from: package-private */
    public synchronized void b() {
        if (!this.f35186g) {
            this.f35185f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public synchronized void c() {
        if (this.f35185f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f35186g) {
            this.f35186g = true;
            if (this.f35181b) {
                this.f35182c.c();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public Class<Z> d() {
        return this.f35182c.d();
    }

    /* access modifiers changed from: package-private */
    public v<Z> e() {
        return this.f35182c;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f35180a;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f35185f;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.f35185f = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f35183d.a(this.f35184e, this);
        }
    }

    public Z get() {
        return this.f35182c.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f35180a + ", listener=" + this.f35183d + ", key=" + this.f35184e + ", acquired=" + this.f35185f + ", isRecycled=" + this.f35186g + ", resource=" + this.f35182c + '}';
    }
}
