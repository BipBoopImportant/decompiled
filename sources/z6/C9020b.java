package z6;

import I6.b;
import I6.i;
import J6.a;
import J6.c;
import java.util.List;

/* renamed from: z6.b  reason: case insensitive filesystem */
public class C9020b extends C9025g<Integer> {
    public C9020b(List<a<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(a<Integer> aVar, float f10) {
        Float f11;
        if (aVar.f37351b == null || aVar.f37352c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c<A> cVar = this.f58423e;
        if (!(cVar == null || (f11 = aVar.f37357h) == null)) {
            Integer num = (Integer) cVar.b(aVar.f37356g, f11.floatValue(), (Integer) aVar.f37351b, (Integer) aVar.f37352c, f10, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return b.c(i.b(f10, 0.0f, 1.0f), ((Integer) aVar.f37351b).intValue(), ((Integer) aVar.f37352c).intValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer i(a<Integer> aVar, float f10) {
        return Integer.valueOf(q(aVar, f10));
    }
}
