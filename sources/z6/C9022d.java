package z6;

import I6.i;
import J6.a;
import J6.c;
import java.util.List;

/* renamed from: z6.d  reason: case insensitive filesystem */
public class C9022d extends C9025g<Float> {
    public C9022d(List<a<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    /* access modifiers changed from: package-private */
    public float q(a<Float> aVar, float f10) {
        if (aVar.f37351b == null || aVar.f37352c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c<A> cVar = this.f58423e;
        if (cVar != null) {
            Float f11 = (Float) cVar.b(aVar.f37356g, aVar.f37357h.floatValue(), (Float) aVar.f37351b, (Float) aVar.f37352c, f10, e(), f());
            if (f11 != null) {
                return f11.floatValue();
            }
        }
        return i.i(aVar.g(), aVar.d(), f10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Float i(a<Float> aVar, float f10) {
        return Float.valueOf(q(aVar, f10));
    }
}
