package C;

import C.r;

/* renamed from: C.c  reason: case insensitive filesystem */
final class C4386c extends r.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f5314a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f5315b;

    C4386c(int i10, Throwable th2) {
        this.f5314a = i10;
        this.f5315b = th2;
    }

    public Throwable c() {
        return this.f5315b;
    }

    public int d() {
        return this.f5314a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r.a)) {
            return false;
        }
        r.a aVar = (r.a) obj;
        if (this.f5314a == aVar.d()) {
            Throwable th2 = this.f5315b;
            if (th2 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (th2.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f5314a ^ 1000003) * 1000003;
        Throwable th2 = this.f5315b;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f5314a + ", cause=" + this.f5315b + "}";
    }
}
