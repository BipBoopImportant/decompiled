package y6;

import D6.p;
import E6.b;
import I6.i;
import J6.c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.List;
import w6.C8923e;
import w6.z;
import x2.e;
import x6.C8955a;
import z6.C9019a;
import z6.C9020b;
import z6.C9021c;
import z6.q;

/* renamed from: y6.g  reason: case insensitive filesystem */
public class C8990g implements C8988e, C9019a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final Path f57873a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f57874b;

    /* renamed from: c  reason: collision with root package name */
    private final b f57875c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57876d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f57877e;

    /* renamed from: f  reason: collision with root package name */
    private final List<m> f57878f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final C9019a<Integer, Integer> f57879g;

    /* renamed from: h  reason: collision with root package name */
    private final C9019a<Integer, Integer> f57880h;

    /* renamed from: i  reason: collision with root package name */
    private C9019a<ColorFilter, ColorFilter> f57881i;

    /* renamed from: j  reason: collision with root package name */
    private final o f57882j;

    /* renamed from: k  reason: collision with root package name */
    private C9019a<Float, Float> f57883k;

    /* renamed from: l  reason: collision with root package name */
    float f57884l;

    /* renamed from: m  reason: collision with root package name */
    private C9021c f57885m;

    public C8990g(o oVar, b bVar, p pVar) {
        Path path = new Path();
        this.f57873a = path;
        C8955a aVar = new C8955a(1);
        this.f57874b = aVar;
        this.f57875c = bVar;
        this.f57876d = pVar.d();
        this.f57877e = pVar.f();
        this.f57882j = oVar;
        if (bVar.x() != null) {
            C9019a<Float, Float> h10 = bVar.x().a().h();
            this.f57883k = h10;
            h10.a(this);
            bVar.i(this.f57883k);
        }
        if (bVar.z() != null) {
            this.f57885m = new C9021c(this, bVar, bVar.z());
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f57879g = null;
            this.f57880h = null;
            return;
        }
        e.b(aVar, bVar.w().b());
        path.setFillType(pVar.c());
        C9019a<Integer, Integer> h11 = pVar.b().h();
        this.f57879g = h11;
        h11.a(this);
        bVar.i(h11);
        C9019a<Integer, Integer> h12 = pVar.e().h();
        this.f57880h = h12;
        h12.a(this);
        bVar.i(h12);
    }

    public void a() {
        this.f57882j.invalidateSelf();
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            C8986c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f57878f.add((m) cVar);
            }
        }
    }

    public void c(B6.e eVar, int i10, List<B6.e> list, B6.e eVar2) {
        i.k(eVar, i10, list, eVar2, this);
    }

    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f57873a.reset();
        for (int i10 = 0; i10 < this.f57878f.size(); i10++) {
            this.f57873a.addPath(this.f57878f.get(i10).m(), matrix);
        }
        this.f57873a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f57877e) {
            C8923e.b("FillContent#draw");
            this.f57874b.setColor((i.c((int) ((((((float) i10) / 255.0f) * ((float) this.f57880h.h().intValue())) / 100.0f) * 255.0f), 0, 255) << 24) | (((C9020b) this.f57879g).p() & 16777215));
            C9019a<ColorFilter, ColorFilter> aVar = this.f57881i;
            if (aVar != null) {
                this.f57874b.setColorFilter(aVar.h());
            }
            C9019a<Float, Float> aVar2 = this.f57883k;
            if (aVar2 != null) {
                float floatValue = aVar2.h().floatValue();
                if (floatValue == 0.0f) {
                    this.f57874b.setMaskFilter((MaskFilter) null);
                } else if (floatValue != this.f57884l) {
                    this.f57874b.setMaskFilter(this.f57875c.y(floatValue));
                }
                this.f57884l = floatValue;
            }
            C9021c cVar = this.f57885m;
            if (cVar != null) {
                cVar.b(this.f57874b);
            }
            this.f57873a.reset();
            for (int i11 = 0; i11 < this.f57878f.size(); i11++) {
                this.f57873a.addPath(this.f57878f.get(i11).m(), matrix);
            }
            canvas.drawPath(this.f57873a, this.f57874b);
            C8923e.c("FillContent#draw");
        }
    }

    public String getName() {
        return this.f57876d;
    }

    public <T> void h(T t10, c<T> cVar) {
        C9021c cVar2;
        C9021c cVar3;
        C9021c cVar4;
        C9021c cVar5;
        C9021c cVar6;
        if (t10 == z.f57307a) {
            this.f57879g.n(cVar);
        } else if (t10 == z.f57310d) {
            this.f57880h.n(cVar);
        } else if (t10 == z.f57302K) {
            C9019a<ColorFilter, ColorFilter> aVar = this.f57881i;
            if (aVar != null) {
                this.f57875c.I(aVar);
            }
            if (cVar == null) {
                this.f57881i = null;
                return;
            }
            q qVar = new q(cVar);
            this.f57881i = qVar;
            qVar.a(this);
            this.f57875c.i(this.f57881i);
        } else if (t10 == z.f57316j) {
            C9019a<Float, Float> aVar2 = this.f57883k;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            q qVar2 = new q(cVar);
            this.f57883k = qVar2;
            qVar2.a(this);
            this.f57875c.i(this.f57883k);
        } else if (t10 == z.f57311e && (cVar6 = this.f57885m) != null) {
            cVar6.c(cVar);
        } else if (t10 == z.f57298G && (cVar5 = this.f57885m) != null) {
            cVar5.f(cVar);
        } else if (t10 == z.f57299H && (cVar4 = this.f57885m) != null) {
            cVar4.d(cVar);
        } else if (t10 == z.f57300I && (cVar3 = this.f57885m) != null) {
            cVar3.e(cVar);
        } else if (t10 == z.f57301J && (cVar2 = this.f57885m) != null) {
            cVar2.g(cVar);
        }
    }
}
