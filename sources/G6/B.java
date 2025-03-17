package G6;

import H6.c;
import android.graphics.PointF;

public class B implements N<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final B f36164a = new B();

    private B() {
    }

    /* renamed from: b */
    public PointF a(c cVar, float f10) {
        c.b i10 = cVar.i();
        if (i10 == c.b.BEGIN_ARRAY) {
            return s.e(cVar, f10);
        }
        if (i10 == c.b.BEGIN_OBJECT) {
            return s.e(cVar, f10);
        }
        if (i10 == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.d2()) * f10, ((float) cVar.d2()) * f10);
            while (cVar.hasNext()) {
                cVar.a0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + i10);
    }
}
