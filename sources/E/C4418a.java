package E;

import E.C4426i;
import O.B;
import android.graphics.Bitmap;

/* renamed from: E.a  reason: case insensitive filesystem */
final class C4418a extends C4426i.b {

    /* renamed from: a  reason: collision with root package name */
    private final B<Bitmap> f5598a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5599b;

    C4418a(B<Bitmap> b10, int i10) {
        if (b10 != null) {
            this.f5598a = b10;
            this.f5599b = i10;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f5599b;
    }

    /* access modifiers changed from: package-private */
    public B<Bitmap> b() {
        return this.f5598a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4426i.b)) {
            return false;
        }
        C4426i.b bVar = (C4426i.b) obj;
        return this.f5598a.equals(bVar.b()) && this.f5599b == bVar.a();
    }

    public int hashCode() {
        return ((this.f5598a.hashCode() ^ 1000003) * 1000003) ^ this.f5599b;
    }

    public String toString() {
        return "In{packet=" + this.f5598a + ", jpegQuality=" + this.f5599b + "}";
    }
}
