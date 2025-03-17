package z6;

import I6.i;
import J6.a;
import J6.c;
import J6.d;
import java.util.List;

/* renamed from: z6.l  reason: case insensitive filesystem */
public class C9030l extends C9025g<d> {

    /* renamed from: i  reason: collision with root package name */
    private final d f58453i = new d();

    public C9030l(List<a<d>> list) {
        super(list);
    }

    /* renamed from: p */
    public d i(a<d> aVar, float f10) {
        T t10;
        T t11 = aVar.f37351b;
        if (t11 == null || (t10 = aVar.f37352c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        d dVar = (d) t11;
        d dVar2 = (d) t10;
        c<A> cVar = this.f58423e;
        if (cVar != null) {
            d dVar3 = (d) cVar.b(aVar.f37356g, aVar.f37357h.floatValue(), dVar, dVar2, f10, e(), f());
            if (dVar3 != null) {
                return dVar3;
            }
        }
        this.f58453i.d(i.i(dVar.b(), dVar2.b(), f10), i.i(dVar.c(), dVar2.c(), f10));
        return this.f58453i;
    }
}
