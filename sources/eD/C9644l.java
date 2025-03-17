package ed;

import android.graphics.Point;
import android.graphics.Rect;
import dd.C9619a;
import ha.V8;

/* renamed from: ed.l  reason: case insensitive filesystem */
public final class C9644l implements C9619a {

    /* renamed from: a  reason: collision with root package name */
    private final V8 f72615a;

    public C9644l(V8 v82) {
        this.f72615a = v82;
    }

    public final Rect a() {
        Point[] J10 = this.f72615a.J();
        if (J10 == null) {
            return null;
        }
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        for (Point point : J10) {
            i11 = Math.min(i11, point.x);
            i10 = Math.max(i10, point.x);
            i12 = Math.min(i12, point.y);
            i13 = Math.max(i13, point.y);
        }
        return new Rect(i11, i12, i10, i13);
    }

    public final String b() {
        return this.f72615a.F();
    }

    public final int c() {
        return this.f72615a.B();
    }

    public final Point[] d() {
        return this.f72615a.J();
    }

    public final int getFormat() {
        return this.f72615a.x();
    }
}
