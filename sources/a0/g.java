package A0;

import c2.h;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0017\u001a\u00020\u00022\b\b\u0003\u0010\u0013\u001a\u00020\t2\b\b\u0003\u0010\u0014\u001a\u00020\t2\b\b\u0003\u0010\u0015\u001a\u00020\t2\b\b\u0003\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"LA0/b;", "corner", "LA0/f;", "c", "(LA0/b;)LA0/f;", "Lc2/h;", "size", "e", "(F)LA0/f;", "", "percent", "a", "(I)LA0/f;", "topStart", "topEnd", "bottomEnd", "bottomStart", "f", "(FFFF)LA0/f;", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "b", "(IIII)LA0/f;", "LA0/f;", "h", "()LA0/f;", "CircleShape", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final f f4304a = a(50);

    public static final f a(int i10) {
        return c(c.a(i10));
    }

    public static final f b(int i10, int i11, int i12, int i13) {
        return new f(c.a(i10), c.a(i11), c.a(i12), c.a(i13));
    }

    public static final f c(b bVar) {
        return new f(bVar, bVar, bVar, bVar);
    }

    public static /* synthetic */ f d(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return b(i10, i11, i12, i13);
    }

    public static final f e(float f10) {
        return c(c.b(f10));
    }

    public static final f f(float f10, float f11, float f12, float f13) {
        return new f(c.b(f10), c.b(f11), c.b(f12), c.b(f13));
    }

    public static /* synthetic */ f g(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.B((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.B((float) 0);
        }
        if ((i10 & 4) != 0) {
            f12 = h.B((float) 0);
        }
        if ((i10 & 8) != 0) {
            f13 = h.B((float) 0);
        }
        return f(f10, f11, f12, f13);
    }

    public static final f h() {
        return f4304a;
    }
}
