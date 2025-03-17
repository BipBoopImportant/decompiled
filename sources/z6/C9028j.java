package z6;

import J6.a;
import J6.c;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: z6.j  reason: case insensitive filesystem */
public class C9028j extends C9025g<PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f58448i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    private final float[] f58449j = new float[2];

    /* renamed from: k  reason: collision with root package name */
    private final PathMeasure f58450k = new PathMeasure();

    /* renamed from: l  reason: collision with root package name */
    private C9027i f58451l;

    public C9028j(List<? extends a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF i(a<PointF> aVar, float f10) {
        C9027i iVar = (C9027i) aVar;
        Path k10 = iVar.k();
        if (k10 == null) {
            return (PointF) aVar.f37351b;
        }
        c<A> cVar = this.f58423e;
        if (cVar != null) {
            PointF pointF = (PointF) cVar.b(iVar.f37356g, iVar.f37357h.floatValue(), (PointF) iVar.f37351b, (PointF) iVar.f37352c, e(), f10, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f58451l != iVar) {
            this.f58450k.setPath(k10, false);
            this.f58451l = iVar;
        }
        PathMeasure pathMeasure = this.f58450k;
        pathMeasure.getPosTan(f10 * pathMeasure.getLength(), this.f58449j, (float[]) null);
        PointF pointF2 = this.f58448i;
        float[] fArr = this.f58449j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f58448i;
    }
}
