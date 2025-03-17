package K6;

/* renamed from: K6.q  reason: case insensitive filesystem */
public final class C6596q<A, B, C> {

    /* renamed from: a  reason: collision with root package name */
    public final A f37702a;

    /* renamed from: b  reason: collision with root package name */
    public final B f37703b;

    /* renamed from: c  reason: collision with root package name */
    public final C f37704c;

    public C6596q(A a10, B b10, C c10) {
        this.f37702a = a10;
        this.f37703b = b10;
        this.f37704c = c10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6596q)) {
            return false;
        }
        C6596q qVar = (C6596q) obj;
        return qVar.f37702a.equals(this.f37702a) && qVar.f37703b.equals(this.f37703b) && qVar.f37704c.equals(this.f37704c);
    }

    public final int hashCode() {
        A a10 = this.f37702a;
        int i10 = 0;
        int hashCode = a10 == null ? 0 : a10.hashCode();
        B b10 = this.f37703b;
        int hashCode2 = hashCode ^ (b10 == null ? 0 : b10.hashCode());
        C c10 = this.f37704c;
        if (c10 != null) {
            i10 = c10.hashCode();
        }
        return hashCode2 ^ i10;
    }
}
