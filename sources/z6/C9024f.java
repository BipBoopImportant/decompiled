package z6;

import I6.i;
import J6.a;
import J6.c;
import java.util.List;

/* renamed from: z6.f  reason: case insensitive filesystem */
public class C9024f extends C9025g<Integer> {
    public C9024f(List<a<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    /* access modifiers changed from: package-private */
    public int q(a<Integer> aVar, float f10) {
        if (aVar.f37351b == null || aVar.f37352c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c<A> cVar = this.f58423e;
        if (cVar != null) {
            Integer num = (Integer) cVar.b(aVar.f37356g, aVar.f37357h.floatValue(), (Integer) aVar.f37351b, (Integer) aVar.f37352c, f10, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return i.j(aVar.h(), aVar.e(), f10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer i(a<Integer> aVar, float f10) {
        return Integer.valueOf(q(aVar, f10));
    }
}
