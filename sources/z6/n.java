package z6;

import J6.a;
import J6.c;
import android.graphics.PointF;
import java.util.Collections;

public class n extends C9019a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f58457i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    private final PointF f58458j = new PointF();

    /* renamed from: k  reason: collision with root package name */
    private final C9019a<Float, Float> f58459k;

    /* renamed from: l  reason: collision with root package name */
    private final C9019a<Float, Float> f58460l;

    /* renamed from: m  reason: collision with root package name */
    protected c<Float> f58461m;

    /* renamed from: n  reason: collision with root package name */
    protected c<Float> f58462n;

    public n(C9019a<Float, Float> aVar, C9019a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f58459k = aVar;
        this.f58460l = aVar2;
        m(f());
    }

    public void m(float f10) {
        this.f58459k.m(f10);
        this.f58460l.m(f10);
        this.f58457i.set(this.f58459k.h().floatValue(), this.f58460l.h().floatValue());
        for (int i10 = 0; i10 < this.f58419a.size(); i10++) {
            this.f58419a.get(i10).a();
        }
    }

    /* renamed from: p */
    public PointF h() {
        return i((a<PointF>) null, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public PointF i(a<PointF> aVar, float f10) {
        Float f11;
        a<Float> b10;
        a<Float> b11;
        Float f12 = null;
        if (this.f58461m == null || (b11 = this.f58459k.b()) == null) {
            f11 = null;
        } else {
            float d10 = this.f58459k.d();
            Float f13 = b11.f37357h;
            c<Float> cVar = this.f58461m;
            float f14 = b11.f37356g;
            f11 = cVar.b(f14, f13 == null ? f14 : f13.floatValue(), (Float) b11.f37351b, (Float) b11.f37352c, f10, f10, d10);
        }
        if (!(this.f58462n == null || (b10 = this.f58460l.b()) == null)) {
            float d11 = this.f58460l.d();
            Float f15 = b10.f37357h;
            c<Float> cVar2 = this.f58462n;
            float f16 = b10.f37356g;
            f12 = cVar2.b(f16, f15 == null ? f16 : f15.floatValue(), (Float) b10.f37351b, (Float) b10.f37352c, f10, f10, d11);
        }
        if (f11 == null) {
            this.f58458j.set(this.f58457i.x, 0.0f);
        } else {
            this.f58458j.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            PointF pointF = this.f58458j;
            pointF.set(pointF.x, this.f58457i.y);
        } else {
            PointF pointF2 = this.f58458j;
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return this.f58458j;
    }

    public void r(c<Float> cVar) {
        c<Float> cVar2 = this.f58461m;
        if (cVar2 != null) {
            cVar2.c((C9019a<?, ?>) null);
        }
        this.f58461m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void s(c<Float> cVar) {
        c<Float> cVar2 = this.f58462n;
        if (cVar2 != null) {
            cVar2.c((C9019a<?, ?>) null);
        }
        this.f58462n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
