package G6;

import H6.c;
import android.graphics.Color;

/* renamed from: G6.g  reason: case insensitive filesystem */
public class C6512g implements N<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final C6512g f36186a = new C6512g();

    private C6512g() {
    }

    /* renamed from: b */
    public Integer a(c cVar, float f10) {
        boolean z10 = cVar.i() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.d();
        }
        double d22 = cVar.d2();
        double d23 = cVar.d2();
        double d24 = cVar.d2();
        double d25 = cVar.i() == c.b.NUMBER ? cVar.d2() : 1.0d;
        if (z10) {
            cVar.f();
        }
        if (d22 <= 1.0d && d23 <= 1.0d && d24 <= 1.0d) {
            d22 *= 255.0d;
            d23 *= 255.0d;
            d24 *= 255.0d;
            if (d25 <= 1.0d) {
                d25 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d25, (int) d22, (int) d23, (int) d24));
    }
}
