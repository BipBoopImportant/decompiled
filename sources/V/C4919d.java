package V;

import V.C4926k;

/* renamed from: V.d  reason: case insensitive filesystem */
final class C4919d extends C4926k {

    /* renamed from: a  reason: collision with root package name */
    private final i0 f14409a;

    /* renamed from: b  reason: collision with root package name */
    private final C4916a f14410b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14411c;

    /* renamed from: V.d$b */
    static final class b extends C4926k.a {

        /* renamed from: a  reason: collision with root package name */
        private i0 f14412a;

        /* renamed from: b  reason: collision with root package name */
        private C4916a f14413b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f14414c;

        public C4926k a() {
            String str = "";
            if (this.f14412a == null) {
                str = str + " videoSpec";
            }
            if (this.f14413b == null) {
                str = str + " audioSpec";
            }
            if (this.f14414c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new C4919d(this.f14412a, this.f14413b, this.f14414c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public i0 c() {
            i0 i0Var = this.f14412a;
            if (i0Var != null) {
                return i0Var;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        public C4926k.a d(C4916a aVar) {
            if (aVar != null) {
                this.f14413b = aVar;
                return this;
            }
            throw new NullPointerException("Null audioSpec");
        }

        public C4926k.a e(int i10) {
            this.f14414c = Integer.valueOf(i10);
            return this;
        }

        public C4926k.a f(i0 i0Var) {
            if (i0Var != null) {
                this.f14412a = i0Var;
                return this;
            }
            throw new NullPointerException("Null videoSpec");
        }

        b() {
        }

        private b(C4926k kVar) {
            this.f14412a = kVar.d();
            this.f14413b = kVar.b();
            this.f14414c = Integer.valueOf(kVar.c());
        }
    }

    public C4916a b() {
        return this.f14410b;
    }

    public int c() {
        return this.f14411c;
    }

    public i0 d() {
        return this.f14409a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4926k)) {
            return false;
        }
        C4926k kVar = (C4926k) obj;
        return this.f14409a.equals(kVar.d()) && this.f14410b.equals(kVar.b()) && this.f14411c == kVar.c();
    }

    public C4926k.a g() {
        return new b(this);
    }

    public int hashCode() {
        return ((((this.f14409a.hashCode() ^ 1000003) * 1000003) ^ this.f14410b.hashCode()) * 1000003) ^ this.f14411c;
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f14409a + ", audioSpec=" + this.f14410b + ", outputFormat=" + this.f14411c + "}";
    }

    private C4919d(i0 i0Var, C4916a aVar, int i10) {
        this.f14409a = i0Var;
        this.f14410b = aVar;
        this.f14411c = i10;
    }
}
