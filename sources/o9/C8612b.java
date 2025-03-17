package o9;

import ic.C9836d;

/* renamed from: o9.b  reason: case insensitive filesystem */
public final class C8612b {

    /* renamed from: b  reason: collision with root package name */
    private static final C8612b f55304b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final C8615e f55305a;

    /* renamed from: o9.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private C8615e f55306a = null;

        a() {
        }

        public C8612b a() {
            return new C8612b(this.f55306a);
        }

        public a b(C8615e eVar) {
            this.f55306a = eVar;
            return this;
        }
    }

    C8612b(C8615e eVar) {
        this.f55305a = eVar;
    }

    public static a b() {
        return new a();
    }

    @C9836d(tag = 1)
    public C8615e a() {
        return this.f55305a;
    }
}
