package G6;

import H6.c;
import J6.d;

public class G implements N<d> {

    /* renamed from: a  reason: collision with root package name */
    public static final G f36169a = new G();

    private G() {
    }

    /* renamed from: b */
    public d a(c cVar, float f10) {
        boolean z10 = cVar.i() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.d();
        }
        float d22 = (float) cVar.d2();
        float d23 = (float) cVar.d2();
        while (cVar.hasNext()) {
            cVar.a0();
        }
        if (z10) {
            cVar.f();
        }
        return new d((d22 / 100.0f) * f10, (d23 / 100.0f) * f10);
    }
}
