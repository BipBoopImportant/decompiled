package ed;

import android.graphics.Point;
import android.graphics.Rect;
import dd.C9619a;
import ha.C8166v8;

/* renamed from: ed.n  reason: case insensitive filesystem */
public final class C9646n implements C9619a {

    /* renamed from: a  reason: collision with root package name */
    private final C8166v8 f72624a;

    public C9646n(C8166v8 v8Var) {
        this.f72624a = v8Var;
    }

    public final Rect a() {
        C8166v8 v8Var = this.f72624a;
        if (v8Var.f52858e == null) {
            return null;
        }
        int i10 = 0;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = v8Var.f52858e;
            if (i10 >= pointArr.length) {
                return new Rect(i12, i13, i11, i14);
            }
            Point point = pointArr[i10];
            i12 = Math.min(i12, point.x);
            i11 = Math.max(i11, point.x);
            i13 = Math.min(i13, point.y);
            i14 = Math.max(i14, point.y);
            i10++;
        }
    }

    public final String b() {
        return this.f72624a.f52855b;
    }

    public final int c() {
        return this.f72624a.f52857d;
    }

    public final Point[] d() {
        return this.f72624a.f52858e;
    }

    public final int getFormat() {
        return this.f72624a.f52854a;
    }
}
