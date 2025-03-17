package n2;

import java.util.Iterator;
import m2.C5573a;
import m2.e;
import m2.g;

/* renamed from: n2.b  reason: case insensitive filesystem */
public class C5642b extends e {

    /* renamed from: q0  reason: collision with root package name */
    private float f26516q0 = 0.5f;

    public C5642b(g gVar) {
        super(gVar, g.d.ALIGN_VERTICALLY);
    }

    public void apply() {
        Iterator<Object> it = this.f26153o0.iterator();
        while (it.hasNext()) {
            C5573a d10 = this.f26151m0.d(it.next());
            d10.v();
            Object obj = this.f26070S;
            if (obj != null) {
                d10.m0(obj);
            } else {
                Object obj2 = this.f26071T;
                if (obj2 != null) {
                    d10.l0(obj2);
                } else {
                    d10.m0(g.f26155k);
                }
            }
            Object obj3 = this.f26073V;
            if (obj3 != null) {
                d10.q(obj3);
            } else {
                Object obj4 = this.f26074W;
                if (obj4 != null) {
                    d10.p(obj4);
                } else {
                    d10.p(g.f26155k);
                }
            }
            float f10 = this.f26516q0;
            if (f10 != 0.5f) {
                d10.q0(f10);
            }
        }
    }
}
