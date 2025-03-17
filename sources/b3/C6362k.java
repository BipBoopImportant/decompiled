package B3;

/* renamed from: B3.k  reason: case insensitive filesystem */
public final class C6362k {

    /* renamed from: d  reason: collision with root package name */
    public static final C6362k f33064d = new b().d();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f33065a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f33066b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f33067c;

    /* renamed from: B3.k$b */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f33068a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f33069b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f33070c;

        public C6362k d() {
            if (this.f33068a || (!this.f33069b && !this.f33070c)) {
                return new C6362k(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f33068a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f33069b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f33070c = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6362k.class != obj.getClass()) {
            return false;
        }
        C6362k kVar = (C6362k) obj;
        return this.f33065a == kVar.f33065a && this.f33066b == kVar.f33066b && this.f33067c == kVar.f33067c;
    }

    public int hashCode() {
        return ((this.f33065a ? 1 : 0) << true) + ((this.f33066b ? 1 : 0) << true) + (this.f33067c ? 1 : 0);
    }

    private C6362k(b bVar) {
        this.f33065a = bVar.f33068a;
        this.f33066b = bVar.f33069b;
        this.f33067c = bVar.f33070c;
    }
}
