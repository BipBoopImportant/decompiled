package V;

import V.C4925j;

/* renamed from: V.c  reason: case insensitive filesystem */
final class C4918c extends C4925j.b {

    /* renamed from: b  reason: collision with root package name */
    private final C4927l f14402b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14403c;

    C4918c(C4927l lVar, int i10) {
        if (lVar != null) {
            this.f14402b = lVar;
            this.f14403c = i10;
            return;
        }
        throw new NullPointerException("Null fallbackQuality");
    }

    /* access modifiers changed from: package-private */
    public C4927l b() {
        return this.f14402b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f14403c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4925j.b)) {
            return false;
        }
        C4925j.b bVar = (C4925j.b) obj;
        return this.f14402b.equals(bVar.b()) && this.f14403c == bVar.c();
    }

    public int hashCode() {
        return ((this.f14402b.hashCode() ^ 1000003) * 1000003) ^ this.f14403c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.f14402b + ", fallbackRule=" + this.f14403c + "}";
    }
}
