package E;

import E.O;
import O.C4710u;

/* renamed from: E.e  reason: case insensitive filesystem */
final class C4422e extends O.a {

    /* renamed from: a  reason: collision with root package name */
    private final C4710u<O.b> f5621a;

    /* renamed from: b  reason: collision with root package name */
    private final C4710u<O.b> f5622b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5623c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5624d;

    C4422e(C4710u<O.b> uVar, C4710u<O.b> uVar2, int i10, int i11) {
        if (uVar != null) {
            this.f5621a = uVar;
            if (uVar2 != null) {
                this.f5622b = uVar2;
                this.f5623c = i10;
                this.f5624d = i11;
                return;
            }
            throw new NullPointerException("Null postviewEdge");
        }
        throw new NullPointerException("Null edge");
    }

    /* access modifiers changed from: package-private */
    public C4710u<O.b> a() {
        return this.f5621a;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f5623c;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f5624d;
    }

    /* access modifiers changed from: package-private */
    public C4710u<O.b> d() {
        return this.f5622b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O.a)) {
            return false;
        }
        O.a aVar = (O.a) obj;
        return this.f5621a.equals(aVar.a()) && this.f5622b.equals(aVar.d()) && this.f5623c == aVar.b() && this.f5624d == aVar.c();
    }

    public int hashCode() {
        return ((((((this.f5621a.hashCode() ^ 1000003) * 1000003) ^ this.f5622b.hashCode()) * 1000003) ^ this.f5623c) * 1000003) ^ this.f5624d;
    }

    public String toString() {
        return "In{edge=" + this.f5621a + ", postviewEdge=" + this.f5622b + ", inputFormat=" + this.f5623c + ", outputFormat=" + this.f5624d + "}";
    }
}
