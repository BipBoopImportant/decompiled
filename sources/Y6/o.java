package y6;

import B6.e;
import D6.l;
import D6.t;
import E6.b;
import I6.i;
import J6.c;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import w6.z;
import z6.C9019a;
import z6.C9022d;

public class o implements C9019a.b, k, m {

    /* renamed from: a  reason: collision with root package name */
    private final Path f57941a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f57942b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    private final String f57943c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f57944d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.o f57945e;

    /* renamed from: f  reason: collision with root package name */
    private final C9019a<?, PointF> f57946f;

    /* renamed from: g  reason: collision with root package name */
    private final C9019a<?, PointF> f57947g;

    /* renamed from: h  reason: collision with root package name */
    private final C9019a<?, Float> f57948h;

    /* renamed from: i  reason: collision with root package name */
    private final C8985b f57949i = new C8985b();

    /* renamed from: j  reason: collision with root package name */
    private C9019a<Float, Float> f57950j = null;

    /* renamed from: k  reason: collision with root package name */
    private boolean f57951k;

    public o(com.airbnb.lottie.o oVar, b bVar, l lVar) {
        this.f57943c = lVar.c();
        this.f57944d = lVar.f();
        this.f57945e = oVar;
        C9019a<PointF, PointF> h10 = lVar.d().h();
        this.f57946f = h10;
        C9019a<PointF, PointF> h11 = lVar.e().h();
        this.f57947g = h11;
        C9019a<Float, Float> h12 = lVar.b().h();
        this.f57948h = h12;
        bVar.i(h10);
        bVar.i(h11);
        bVar.i(h12);
        h10.a(this);
        h11.a(this);
        h12.a(this);
    }

    private void f() {
        this.f57951k = false;
        this.f57945e.invalidateSelf();
    }

    public void a() {
        f();
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C8986c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f57949i.a(uVar);
                    uVar.c(this);
                }
            }
            if (cVar instanceof q) {
                this.f57950j = ((q) cVar).h();
            }
        }
    }

    public void c(e eVar, int i10, List<e> list, e eVar2) {
        i.k(eVar, i10, list, eVar2, this);
    }

    public String getName() {
        return this.f57943c;
    }

    public <T> void h(T t10, c<T> cVar) {
        if (t10 == z.f57318l) {
            this.f57947g.n(cVar);
        } else if (t10 == z.f57320n) {
            this.f57946f.n(cVar);
        } else if (t10 == z.f57319m) {
            this.f57948h.n(cVar);
        }
    }

    public Path m() {
        C9019a<Float, Float> aVar;
        if (this.f57951k) {
            return this.f57941a;
        }
        this.f57941a.reset();
        if (this.f57944d) {
            this.f57951k = true;
            return this.f57941a;
        }
        PointF h10 = this.f57947g.h();
        float f10 = h10.x / 2.0f;
        float f11 = h10.y / 2.0f;
        C9019a<?, Float> aVar2 = this.f57948h;
        float p10 = aVar2 == null ? 0.0f : ((C9022d) aVar2).p();
        if (p10 == 0.0f && (aVar = this.f57950j) != null) {
            p10 = Math.min(aVar.h().floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (p10 > min) {
            p10 = min;
        }
        PointF h11 = this.f57946f.h();
        this.f57941a.moveTo(h11.x + f10, (h11.y - f11) + p10);
        this.f57941a.lineTo(h11.x + f10, (h11.y + f11) - p10);
        int i10 = (p10 > 0.0f ? 1 : (p10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF = this.f57942b;
            float f12 = h11.x;
            float f13 = p10 * 2.0f;
            float f14 = h11.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f57941a.arcTo(this.f57942b, 0.0f, 90.0f, false);
        }
        this.f57941a.lineTo((h11.x - f10) + p10, h11.y + f11);
        if (i10 > 0) {
            RectF rectF2 = this.f57942b;
            float f15 = h11.x;
            float f16 = h11.y;
            float f17 = p10 * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f57941a.arcTo(this.f57942b, 90.0f, 90.0f, false);
        }
        this.f57941a.lineTo(h11.x - f10, (h11.y - f11) + p10);
        if (i10 > 0) {
            RectF rectF3 = this.f57942b;
            float f18 = h11.x;
            float f19 = h11.y;
            float f20 = p10 * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f57941a.arcTo(this.f57942b, 180.0f, 90.0f, false);
        }
        this.f57941a.lineTo((h11.x + f10) - p10, h11.y - f11);
        if (i10 > 0) {
            RectF rectF4 = this.f57942b;
            float f21 = h11.x;
            float f22 = p10 * 2.0f;
            float f23 = h11.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f57941a.arcTo(this.f57942b, 270.0f, 90.0f, false);
        }
        this.f57941a.close();
        this.f57949i.b(this.f57941a);
        this.f57951k = true;
        return this.f57941a;
    }
}
