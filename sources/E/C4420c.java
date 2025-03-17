package E;

import E.C4439w;
import O.B;
import androidx.camera.core.n;

/* renamed from: E.c  reason: case insensitive filesystem */
final class C4420c extends C4439w.a {

    /* renamed from: a  reason: collision with root package name */
    private final B<n> f5613a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5614b;

    C4420c(B<n> b10, int i10) {
        if (b10 != null) {
            this.f5613a = b10;
            this.f5614b = i10;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f5614b;
    }

    /* access modifiers changed from: package-private */
    public B<n> b() {
        return this.f5613a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4439w.a)) {
            return false;
        }
        C4439w.a aVar = (C4439w.a) obj;
        return this.f5613a.equals(aVar.b()) && this.f5614b == aVar.a();
    }

    public int hashCode() {
        return ((this.f5613a.hashCode() ^ 1000003) * 1000003) ^ this.f5614b;
    }

    public String toString() {
        return "In{packet=" + this.f5613a + ", jpegQuality=" + this.f5614b + "}";
    }
}
