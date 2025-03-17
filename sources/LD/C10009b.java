package ld;

/* renamed from: ld.b  reason: case insensitive filesystem */
public final class C10009b {

    /* renamed from: a  reason: collision with root package name */
    private final int f75210a;

    /* renamed from: b  reason: collision with root package name */
    private final int f75211b;

    public int a() {
        return this.f75211b;
    }

    public int b() {
        return this.f75210a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10009b)) {
            return false;
        }
        C10009b bVar = (C10009b) obj;
        return this.f75210a == bVar.f75210a && this.f75211b == bVar.f75211b;
    }

    public int hashCode() {
        return (this.f75210a * 32713) + this.f75211b;
    }

    public String toString() {
        return this.f75210a + "x" + this.f75211b;
    }
}
