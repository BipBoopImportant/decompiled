package n2;

import java.util.Iterator;
import m2.C5573a;
import m2.e;
import m2.g;

/* renamed from: n2.a  reason: case insensitive filesystem */
public class C5641a extends e {

    /* renamed from: q0  reason: collision with root package name */
    private float f26515q0 = 0.5f;

    public C5641a(g gVar) {
        super(gVar, g.d.ALIGN_VERTICALLY);
    }

    public void apply() {
        Iterator<Object> it = this.f26153o0.iterator();
        while (it.hasNext()) {
            C5573a d10 = this.f26151m0.d(it.next());
            d10.u();
            Object obj = this.f26066O;
            if (obj != null) {
                d10.i0(obj);
            } else {
                Object obj2 = this.f26067P;
                if (obj2 != null) {
                    d10.h0(obj2);
                } else {
                    d10.i0(g.f26155k);
                }
            }
            Object obj3 = this.f26068Q;
            if (obj3 != null) {
                d10.A(obj3);
            } else {
                Object obj4 = this.f26069R;
                if (obj4 != null) {
                    d10.z(obj4);
                } else {
                    d10.z(g.f26155k);
                }
            }
            float f10 = this.f26515q0;
            if (f10 != 0.5f) {
                d10.F(f10);
            }
        }
    }
}
