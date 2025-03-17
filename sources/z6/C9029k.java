package z6;

import J6.a;
import J6.c;
import android.graphics.PointF;
import java.util.List;

/* renamed from: z6.k  reason: case insensitive filesystem */
public class C9029k extends C9025g<PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f58452i = new PointF();

    public C9029k(List<a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF i(a<PointF> aVar, float f10) {
        return j(aVar, f10, f10, f10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public PointF j(a<PointF> aVar, float f10, float f11, float f12) {
        T t10;
        T t11 = aVar.f37351b;
        if (t11 == null || (t10 = aVar.f37352c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t11;
        PointF pointF2 = (PointF) t10;
        c<A> cVar = this.f58423e;
        if (cVar != null) {
            PointF pointF3 = (PointF) cVar.b(aVar.f37356g, aVar.f37357h.floatValue(), pointF, pointF2, f10, e(), f());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f58452i;
        float f13 = pointF.x;
        float f14 = f13 + (f11 * (pointF2.x - f13));
        float f15 = pointF.y;
        pointF4.set(f14, f15 + (f12 * (pointF2.y - f15)));
        return this.f58452i;
    }
}
