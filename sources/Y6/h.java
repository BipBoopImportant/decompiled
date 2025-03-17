package y6;

import D6.d;
import D6.e;
import D6.g;
import E6.b;
import I6.i;
import J6.c;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.o;
import j0.C5468y;
import java.util.ArrayList;
import java.util.List;
import w6.C8923e;
import w6.C8927i;
import w6.z;
import x6.C8955a;
import z6.C9019a;
import z6.C9021c;
import z6.q;

public class h implements C8988e, C9019a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final String f57886a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f57887b;

    /* renamed from: c  reason: collision with root package name */
    private final b f57888c;

    /* renamed from: d  reason: collision with root package name */
    private final C5468y<LinearGradient> f57889d = new C5468y<>();

    /* renamed from: e  reason: collision with root package name */
    private final C5468y<RadialGradient> f57890e = new C5468y<>();

    /* renamed from: f  reason: collision with root package name */
    private final Path f57891f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f57892g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f57893h;

    /* renamed from: i  reason: collision with root package name */
    private final List<m> f57894i;

    /* renamed from: j  reason: collision with root package name */
    private final g f57895j;

    /* renamed from: k  reason: collision with root package name */
    private final C9019a<d, d> f57896k;

    /* renamed from: l  reason: collision with root package name */
    private final C9019a<Integer, Integer> f57897l;

    /* renamed from: m  reason: collision with root package name */
    private final C9019a<PointF, PointF> f57898m;

    /* renamed from: n  reason: collision with root package name */
    private final C9019a<PointF, PointF> f57899n;

    /* renamed from: o  reason: collision with root package name */
    private C9019a<ColorFilter, ColorFilter> f57900o;

    /* renamed from: p  reason: collision with root package name */
    private q f57901p;

    /* renamed from: q  reason: collision with root package name */
    private final o f57902q;

    /* renamed from: r  reason: collision with root package name */
    private final int f57903r;

    /* renamed from: s  reason: collision with root package name */
    private C9019a<Float, Float> f57904s;

    /* renamed from: t  reason: collision with root package name */
    float f57905t;

    /* renamed from: u  reason: collision with root package name */
    private C9021c f57906u;

    public h(o oVar, C8927i iVar, b bVar, e eVar) {
        Path path = new Path();
        this.f57891f = path;
        this.f57892g = new C8955a(1);
        this.f57893h = new RectF();
        this.f57894i = new ArrayList();
        this.f57905t = 0.0f;
        this.f57888c = bVar;
        this.f57886a = eVar.f();
        this.f57887b = eVar.i();
        this.f57902q = oVar;
        this.f57895j = eVar.e();
        path.setFillType(eVar.c());
        this.f57903r = (int) (iVar.d() / 32.0f);
        C9019a<d, d> h10 = eVar.d().h();
        this.f57896k = h10;
        h10.a(this);
        bVar.i(h10);
        C9019a<Integer, Integer> h11 = eVar.g().h();
        this.f57897l = h11;
        h11.a(this);
        bVar.i(h11);
        C9019a<PointF, PointF> h12 = eVar.h().h();
        this.f57898m = h12;
        h12.a(this);
        bVar.i(h12);
        C9019a<PointF, PointF> h13 = eVar.b().h();
        this.f57899n = h13;
        h13.a(this);
        bVar.i(h13);
        if (bVar.x() != null) {
            C9019a<Float, Float> h14 = bVar.x().a().h();
            this.f57904s = h14;
            h14.a(this);
            bVar.i(this.f57904s);
        }
        if (bVar.z() != null) {
            this.f57906u = new C9021c(this, bVar, bVar.z());
        }
    }

    private int[] f(int[] iArr) {
        q qVar = this.f57901p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int round = Math.round(this.f57898m.f() * ((float) this.f57903r));
        int round2 = Math.round(this.f57899n.f() * ((float) this.f57903r));
        int round3 = Math.round(this.f57896k.f() * ((float) this.f57903r));
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    private LinearGradient j() {
        long i10 = (long) i();
        LinearGradient d10 = this.f57889d.d(i10);
        if (d10 != null) {
            return d10;
        }
        PointF h10 = this.f57898m.h();
        PointF h11 = this.f57899n.h();
        d h12 = this.f57896k.h();
        LinearGradient linearGradient = new LinearGradient(h10.x, h10.y, h11.x, h11.y, f(h12.c()), h12.d(), Shader.TileMode.CLAMP);
        this.f57889d.k(i10, linearGradient);
        return linearGradient;
    }

    private RadialGradient k() {
        long i10 = (long) i();
        RadialGradient d10 = this.f57890e.d(i10);
        if (d10 != null) {
            return d10;
        }
        PointF h10 = this.f57898m.h();
        PointF h11 = this.f57899n.h();
        d h12 = this.f57896k.h();
        int[] f10 = f(h12.c());
        float[] d11 = h12.d();
        float f11 = h10.x;
        float f12 = h10.y;
        float hypot = (float) Math.hypot((double) (h11.x - f11), (double) (h11.y - f12));
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f11, f12, hypot, f10, d11, Shader.TileMode.CLAMP);
        this.f57890e.k(i10, radialGradient);
        return radialGradient;
    }

    public void a() {
        this.f57902q.invalidateSelf();
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            C8986c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f57894i.add((m) cVar);
            }
        }
    }

    public void c(B6.e eVar, int i10, List<B6.e> list, B6.e eVar2) {
        i.k(eVar, i10, list, eVar2, this);
    }

    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f57891f.reset();
        for (int i10 = 0; i10 < this.f57894i.size(); i10++) {
            this.f57891f.addPath(this.f57894i.get(i10).m(), matrix);
        }
        this.f57891f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f57887b) {
            C8923e.b("GradientFillContent#draw");
            this.f57891f.reset();
            for (int i11 = 0; i11 < this.f57894i.size(); i11++) {
                this.f57891f.addPath(this.f57894i.get(i11).m(), matrix);
            }
            this.f57891f.computeBounds(this.f57893h, false);
            Shader j10 = this.f57895j == g.LINEAR ? j() : k();
            j10.setLocalMatrix(matrix);
            this.f57892g.setShader(j10);
            C9019a<ColorFilter, ColorFilter> aVar = this.f57900o;
            if (aVar != null) {
                this.f57892g.setColorFilter(aVar.h());
            }
            C9019a<Float, Float> aVar2 = this.f57904s;
            if (aVar2 != null) {
                float floatValue = aVar2.h().floatValue();
                if (floatValue == 0.0f) {
                    this.f57892g.setMaskFilter((MaskFilter) null);
                } else if (floatValue != this.f57905t) {
                    this.f57892g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
                }
                this.f57905t = floatValue;
            }
            C9021c cVar = this.f57906u;
            if (cVar != null) {
                cVar.b(this.f57892g);
            }
            this.f57892g.setAlpha(i.c((int) ((((((float) i10) / 255.0f) * ((float) this.f57897l.h().intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f57891f, this.f57892g);
            C8923e.c("GradientFillContent#draw");
        }
    }

    public String getName() {
        return this.f57886a;
    }

    public <T> void h(T t10, c<T> cVar) {
        C9021c cVar2;
        C9021c cVar3;
        C9021c cVar4;
        C9021c cVar5;
        C9021c cVar6;
        if (t10 == z.f57310d) {
            this.f57897l.n(cVar);
        } else if (t10 == z.f57302K) {
            C9019a<ColorFilter, ColorFilter> aVar = this.f57900o;
            if (aVar != null) {
                this.f57888c.I(aVar);
            }
            if (cVar == null) {
                this.f57900o = null;
                return;
            }
            q qVar = new q(cVar);
            this.f57900o = qVar;
            qVar.a(this);
            this.f57888c.i(this.f57900o);
        } else if (t10 == z.f57303L) {
            q qVar2 = this.f57901p;
            if (qVar2 != null) {
                this.f57888c.I(qVar2);
            }
            if (cVar == null) {
                this.f57901p = null;
                return;
            }
            this.f57889d.a();
            this.f57890e.a();
            q qVar3 = new q(cVar);
            this.f57901p = qVar3;
            qVar3.a(this);
            this.f57888c.i(this.f57901p);
        } else if (t10 == z.f57316j) {
            C9019a<Float, Float> aVar2 = this.f57904s;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            q qVar4 = new q(cVar);
            this.f57904s = qVar4;
            qVar4.a(this);
            this.f57888c.i(this.f57904s);
        } else if (t10 == z.f57311e && (cVar6 = this.f57906u) != null) {
            cVar6.c(cVar);
        } else if (t10 == z.f57298G && (cVar5 = this.f57906u) != null) {
            cVar5.f(cVar);
        } else if (t10 == z.f57299H && (cVar4 = this.f57906u) != null) {
            cVar4.d(cVar);
        } else if (t10 == z.f57300I && (cVar3 = this.f57906u) != null) {
            cVar3.e(cVar);
        } else if (t10 == z.f57301J && (cVar2 = this.f57906u) != null) {
            cVar2.g(cVar);
        }
    }
}
