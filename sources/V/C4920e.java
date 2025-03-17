package V;

import V.C4929n;

/* renamed from: V.e  reason: case insensitive filesystem */
final class C4920e extends C4929n.a {

    /* renamed from: a  reason: collision with root package name */
    private final C4927l f14418a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14419b;

    C4920e(C4927l lVar, int i10) {
        if (lVar != null) {
            this.f14418a = lVar;
            this.f14419b = i10;
            return;
        }
        throw new NullPointerException("Null quality");
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f14419b;
    }

    /* access modifiers changed from: package-private */
    public C4927l b() {
        return this.f14418a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4929n.a)) {
            return false;
        }
        C4929n.a aVar = (C4929n.a) obj;
        return this.f14418a.equals(aVar.b()) && this.f14419b == aVar.a();
    }

    public int hashCode() {
        return ((this.f14418a.hashCode() ^ 1000003) * 1000003) ^ this.f14419b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.f14418a + ", aspectRatio=" + this.f14419b + "}";
    }
}
