package x2;

import android.graphics.Insets;
import android.graphics.Rect;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final d f31835e = new d(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f31836a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31837b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31838c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31839d;

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private d(int i10, int i11, int i12, int i13) {
        this.f31836a = i10;
        this.f31837b = i11;
        this.f31838c = i12;
        this.f31839d = i13;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f31836a, dVar2.f31836a), Math.max(dVar.f31837b, dVar2.f31837b), Math.max(dVar.f31838c, dVar2.f31838c), Math.max(dVar.f31839d, dVar2.f31839d));
    }

    public static d b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f31835e : new d(i10, i11, i12, i13);
    }

    public static d c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static d d(d dVar, d dVar2) {
        return b(dVar.f31836a - dVar2.f31836a, dVar.f31837b - dVar2.f31837b, dVar.f31838c - dVar2.f31838c, dVar.f31839d - dVar2.f31839d);
    }

    public static d e(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f31839d == dVar.f31839d && this.f31836a == dVar.f31836a && this.f31838c == dVar.f31838c && this.f31837b == dVar.f31837b;
    }

    public Insets f() {
        return a.a(this.f31836a, this.f31837b, this.f31838c, this.f31839d);
    }

    public int hashCode() {
        return (((((this.f31836a * 31) + this.f31837b) * 31) + this.f31838c) * 31) + this.f31839d;
    }

    public String toString() {
        return "Insets{left=" + this.f31836a + ", top=" + this.f31837b + ", right=" + this.f31838c + ", bottom=" + this.f31839d + '}';
    }
}
