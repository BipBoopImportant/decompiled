package C;

import C.v0;

/* renamed from: C.g  reason: case insensitive filesystem */
final class C4394g extends v0.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f5344a;

    /* renamed from: b  reason: collision with root package name */
    private final v0 f5345b;

    C4394g(int i10, v0 v0Var) {
        this.f5344a = i10;
        if (v0Var != null) {
            this.f5345b = v0Var;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }

    public int a() {
        return this.f5344a;
    }

    public v0 b() {
        return this.f5345b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0.b)) {
            return false;
        }
        v0.b bVar = (v0.b) obj;
        return this.f5344a == bVar.a() && this.f5345b.equals(bVar.b());
    }

    public int hashCode() {
        return ((this.f5344a ^ 1000003) * 1000003) ^ this.f5345b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f5344a + ", surfaceOutput=" + this.f5345b + "}";
    }
}
