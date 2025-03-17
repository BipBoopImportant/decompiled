package J9;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f37410a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37411b;

    public a(int i10, int i11) {
        this.f37410a = i10;
        this.f37411b = i11;
    }

    public int a() {
        return this.f37411b;
    }

    public int b() {
        return this.f37410a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f37410a == aVar.f37410a && this.f37411b == aVar.f37411b;
        }
    }

    public int hashCode() {
        int i10 = this.f37410a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f37411b;
    }

    public String toString() {
        return this.f37410a + "x" + this.f37411b;
    }
}
