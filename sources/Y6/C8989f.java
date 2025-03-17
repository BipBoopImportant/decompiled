package y6;

import B6.e;
import D6.b;
import D6.t;
import I6.i;
import J6.c;
import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.o;
import java.util.List;
import w6.z;
import z6.C9019a;

/* renamed from: y6.f  reason: case insensitive filesystem */
public class C8989f implements m, C9019a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final Path f57865a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f57866b;

    /* renamed from: c  reason: collision with root package name */
    private final o f57867c;

    /* renamed from: d  reason: collision with root package name */
    private final C9019a<?, PointF> f57868d;

    /* renamed from: e  reason: collision with root package name */
    private final C9019a<?, PointF> f57869e;

    /* renamed from: f  reason: collision with root package name */
    private final b f57870f;

    /* renamed from: g  reason: collision with root package name */
    private final C8985b f57871g = new C8985b();

    /* renamed from: h  reason: collision with root package name */
    private boolean f57872h;

    public C8989f(o oVar, E6.b bVar, b bVar2) {
        this.f57866b = bVar2.b();
        this.f57867c = oVar;
        C9019a<PointF, PointF> h10 = bVar2.d().h();
        this.f57868d = h10;
        C9019a<PointF, PointF> h11 = bVar2.c().h();
        this.f57869e = h11;
        this.f57870f = bVar2;
        bVar.i(h10);
        bVar.i(h11);
        h10.a(this);
        h11.a(this);
    }

    private void f() {
        this.f57872h = false;
        this.f57867c.invalidateSelf();
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
                    this.f57871g.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    public void c(e eVar, int i10, List<e> list, e eVar2) {
        i.k(eVar, i10, list, eVar2, this);
    }

    public String getName() {
        return this.f57866b;
    }

    public <T> void h(T t10, c<T> cVar) {
        if (t10 == z.f57317k) {
            this.f57868d.n(cVar);
        } else if (t10 == z.f57320n) {
            this.f57869e.n(cVar);
        }
    }

    public Path m() {
        if (this.f57872h) {
            return this.f57865a;
        }
        this.f57865a.reset();
        if (this.f57870f.e()) {
            this.f57872h = true;
            return this.f57865a;
        }
        PointF h10 = this.f57868d.h();
        float f10 = h10.x / 2.0f;
        float f11 = h10.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f57865a.reset();
        if (this.f57870f.f()) {
            float f14 = -f11;
            this.f57865a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f57865a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            float f19 = f14;
            this.f57865a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f20 = f12 + 0.0f;
            this.f57865a.cubicTo(f20, f11, f10, f18, f10, 0.0f);
            this.f57865a.cubicTo(f10, f17, f20, f19, 0.0f, f19);
        } else {
            float f21 = -f11;
            this.f57865a.moveTo(0.0f, f21);
            float f22 = f12 + 0.0f;
            float f23 = 0.0f - f13;
            this.f57865a.cubicTo(f22, f21, f10, f23, f10, 0.0f);
            float f24 = f13 + 0.0f;
            this.f57865a.cubicTo(f10, f24, f22, f11, 0.0f, f11);
            float f25 = 0.0f - f12;
            float f26 = -f10;
            this.f57865a.cubicTo(f25, f11, f26, f24, f26, 0.0f);
            float f27 = f21;
            this.f57865a.cubicTo(f26, f23, f25, f27, 0.0f, f27);
        }
        PointF h11 = this.f57869e.h();
        this.f57865a.offset(h11.x, h11.y);
        this.f57865a.close();
        this.f57871g.b(this.f57865a);
        this.f57872h = true;
        return this.f57865a;
    }
}
