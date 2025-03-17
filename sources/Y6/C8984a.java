package y6;

import B6.e;
import C6.d;
import D6.t;
import I6.i;
import I6.j;
import J6.c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.List;
import w6.C8923e;
import w6.z;
import x6.C8955a;
import z6.C9019a;
import z6.C9021c;
import z6.C9022d;
import z6.C9024f;
import z6.q;

/* renamed from: y6.a  reason: case insensitive filesystem */
public abstract class C8984a implements C9019a.b, k, C8988e {

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f57834a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    private final Path f57835b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f57836c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f57837d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private final o f57838e;

    /* renamed from: f  reason: collision with root package name */
    protected final E6.b f57839f;

    /* renamed from: g  reason: collision with root package name */
    private final List<b> f57840g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f57841h;

    /* renamed from: i  reason: collision with root package name */
    final Paint f57842i;

    /* renamed from: j  reason: collision with root package name */
    private final C9019a<?, Float> f57843j;

    /* renamed from: k  reason: collision with root package name */
    private final C9019a<?, Integer> f57844k;

    /* renamed from: l  reason: collision with root package name */
    private final List<C9019a<?, Float>> f57845l;

    /* renamed from: m  reason: collision with root package name */
    private final C9019a<?, Float> f57846m;

    /* renamed from: n  reason: collision with root package name */
    private C9019a<ColorFilter, ColorFilter> f57847n;

    /* renamed from: o  reason: collision with root package name */
    private C9019a<Float, Float> f57848o;

    /* renamed from: p  reason: collision with root package name */
    float f57849p;

    /* renamed from: q  reason: collision with root package name */
    private C9021c f57850q;

    /* renamed from: y6.a$b */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<m> f57851a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final u f57852b;

        private b(u uVar) {
            this.f57851a = new ArrayList();
            this.f57852b = uVar;
        }
    }

    C8984a(o oVar, E6.b bVar, Paint.Cap cap, Paint.Join join, float f10, d dVar, C6.b bVar2, List<C6.b> list, C6.b bVar3) {
        C8955a aVar = new C8955a(1);
        this.f57842i = aVar;
        this.f57849p = 0.0f;
        this.f57838e = oVar;
        this.f57839f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f57844k = dVar.h();
        this.f57843j = bVar2.h();
        if (bVar3 == null) {
            this.f57846m = null;
        } else {
            this.f57846m = bVar3.h();
        }
        this.f57845l = new ArrayList(list.size());
        this.f57841h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f57845l.add(list.get(i10).h());
        }
        bVar.i(this.f57844k);
        bVar.i(this.f57843j);
        for (int i11 = 0; i11 < this.f57845l.size(); i11++) {
            bVar.i(this.f57845l.get(i11));
        }
        C9019a<?, Float> aVar2 = this.f57846m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.f57844k.a(this);
        this.f57843j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f57845l.get(i12).a(this);
        }
        C9019a<?, Float> aVar3 = this.f57846m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.x() != null) {
            C9019a<Float, Float> h10 = bVar.x().a().h();
            this.f57848o = h10;
            h10.a(this);
            bVar.i(this.f57848o);
        }
        if (bVar.z() != null) {
            this.f57850q = new C9021c(this, bVar, bVar.z());
        }
    }

    private void f(Matrix matrix) {
        C8923e.b("StrokeContent#applyDashPattern");
        if (this.f57845l.isEmpty()) {
            C8923e.c("StrokeContent#applyDashPattern");
            return;
        }
        float g10 = j.g(matrix);
        for (int i10 = 0; i10 < this.f57845l.size(); i10++) {
            this.f57841h[i10] = ((Float) this.f57845l.get(i10).h()).floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f57841h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f57841h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.f57841h;
            fArr3[i10] = fArr3[i10] * g10;
        }
        C9019a<?, Float> aVar = this.f57846m;
        this.f57842i.setPathEffect(new DashPathEffect(this.f57841h, aVar == null ? 0.0f : g10 * aVar.h().floatValue()));
        C8923e.c("StrokeContent#applyDashPattern");
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        C8923e.b("StrokeContent#applyTrimPath");
        if (bVar.f57852b == null) {
            C8923e.c("StrokeContent#applyTrimPath");
            return;
        }
        this.f57835b.reset();
        for (int size = bVar.f57851a.size() - 1; size >= 0; size--) {
            this.f57835b.addPath(((m) bVar.f57851a.get(size)).m(), matrix2);
        }
        float floatValue = bVar.f57852b.i().h().floatValue() / 100.0f;
        float floatValue2 = bVar.f57852b.f().h().floatValue() / 100.0f;
        float floatValue3 = bVar.f57852b.h().h().floatValue() / 360.0f;
        if (floatValue >= 0.01f || floatValue2 <= 0.99f) {
            this.f57834a.setPath(this.f57835b, false);
            float length = this.f57834a.getLength();
            while (this.f57834a.nextContour()) {
                length += this.f57834a.getLength();
            }
            float f10 = floatValue3 * length;
            float f11 = (floatValue * length) + f10;
            float min = Math.min((floatValue2 * length) + f10, (f11 + length) - 1.0f);
            float f12 = 0.0f;
            for (int size2 = bVar.f57851a.size() - 1; size2 >= 0; size2--) {
                this.f57836c.set(((m) bVar.f57851a.get(size2)).m());
                this.f57836c.transform(matrix2);
                this.f57834a.setPath(this.f57836c, false);
                float length2 = this.f57834a.getLength();
                if (min > length) {
                    float f13 = min - length;
                    if (f13 < f12 + length2 && f12 < f13) {
                        j.a(this.f57836c, f11 > length ? (f11 - length) / length2 : 0.0f, Math.min(f13 / length2, 1.0f), 0.0f);
                        canvas2.drawPath(this.f57836c, this.f57842i);
                        f12 += length2;
                    }
                }
                float f14 = f12 + length2;
                if (f14 >= f11 && f12 <= min) {
                    if (f14 > min || f11 >= f12) {
                        j.a(this.f57836c, f11 < f12 ? 0.0f : (f11 - f12) / length2, min > f14 ? 1.0f : (min - f12) / length2, 0.0f);
                        canvas2.drawPath(this.f57836c, this.f57842i);
                    } else {
                        canvas2.drawPath(this.f57836c, this.f57842i);
                    }
                }
                f12 += length2;
            }
            C8923e.c("StrokeContent#applyTrimPath");
            return;
        }
        canvas2.drawPath(this.f57835b, this.f57842i);
        C8923e.c("StrokeContent#applyTrimPath");
    }

    public void a() {
        this.f57838e.invalidateSelf();
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C8986c cVar = list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.j() == t.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C8986c cVar2 = list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.j() == t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f57840g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.c(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f57851a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f57840g.add(bVar);
        }
    }

    public void c(e eVar, int i10, List<e> list, e eVar2) {
        i.k(eVar, i10, list, eVar2, this);
    }

    public void e(RectF rectF, Matrix matrix, boolean z10) {
        C8923e.b("StrokeContent#getBounds");
        this.f57835b.reset();
        for (int i10 = 0; i10 < this.f57840g.size(); i10++) {
            b bVar = this.f57840g.get(i10);
            for (int i11 = 0; i11 < bVar.f57851a.size(); i11++) {
                this.f57835b.addPath(((m) bVar.f57851a.get(i11)).m(), matrix);
            }
        }
        this.f57835b.computeBounds(this.f57837d, false);
        float p10 = ((C9022d) this.f57843j).p();
        RectF rectF2 = this.f57837d;
        float f10 = p10 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f57837d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C8923e.c("StrokeContent#getBounds");
    }

    public void g(Canvas canvas, Matrix matrix, int i10) {
        C8923e.b("StrokeContent#draw");
        if (j.h(matrix)) {
            C8923e.c("StrokeContent#draw");
            return;
        }
        this.f57842i.setAlpha(i.c((int) ((((((float) i10) / 255.0f) * ((float) ((C9024f) this.f57844k).p())) / 100.0f) * 255.0f), 0, 255));
        this.f57842i.setStrokeWidth(((C9022d) this.f57843j).p() * j.g(matrix));
        if (this.f57842i.getStrokeWidth() <= 0.0f) {
            C8923e.c("StrokeContent#draw");
            return;
        }
        f(matrix);
        C9019a<ColorFilter, ColorFilter> aVar = this.f57847n;
        if (aVar != null) {
            this.f57842i.setColorFilter(aVar.h());
        }
        C9019a<Float, Float> aVar2 = this.f57848o;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f57842i.setMaskFilter((MaskFilter) null);
            } else if (floatValue != this.f57849p) {
                this.f57842i.setMaskFilter(this.f57839f.y(floatValue));
            }
            this.f57849p = floatValue;
        }
        C9021c cVar = this.f57850q;
        if (cVar != null) {
            cVar.b(this.f57842i);
        }
        for (int i11 = 0; i11 < this.f57840g.size(); i11++) {
            b bVar = this.f57840g.get(i11);
            if (bVar.f57852b != null) {
                i(canvas, bVar, matrix);
            } else {
                C8923e.b("StrokeContent#buildPath");
                this.f57835b.reset();
                for (int size = bVar.f57851a.size() - 1; size >= 0; size--) {
                    this.f57835b.addPath(((m) bVar.f57851a.get(size)).m(), matrix);
                }
                C8923e.c("StrokeContent#buildPath");
                C8923e.b("StrokeContent#drawPath");
                canvas.drawPath(this.f57835b, this.f57842i);
                C8923e.c("StrokeContent#drawPath");
            }
        }
        C8923e.c("StrokeContent#draw");
    }

    public <T> void h(T t10, c<T> cVar) {
        C9021c cVar2;
        C9021c cVar3;
        C9021c cVar4;
        C9021c cVar5;
        C9021c cVar6;
        if (t10 == z.f57310d) {
            this.f57844k.n(cVar);
        } else if (t10 == z.f57325s) {
            this.f57843j.n(cVar);
        } else if (t10 == z.f57302K) {
            C9019a<ColorFilter, ColorFilter> aVar = this.f57847n;
            if (aVar != null) {
                this.f57839f.I(aVar);
            }
            if (cVar == null) {
                this.f57847n = null;
                return;
            }
            q qVar = new q(cVar);
            this.f57847n = qVar;
            qVar.a(this);
            this.f57839f.i(this.f57847n);
        } else if (t10 == z.f57316j) {
            C9019a<Float, Float> aVar2 = this.f57848o;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            q qVar2 = new q(cVar);
            this.f57848o = qVar2;
            qVar2.a(this);
            this.f57839f.i(this.f57848o);
        } else if (t10 == z.f57311e && (cVar6 = this.f57850q) != null) {
            cVar6.c(cVar);
        } else if (t10 == z.f57298G && (cVar5 = this.f57850q) != null) {
            cVar5.f(cVar);
        } else if (t10 == z.f57299H && (cVar4 = this.f57850q) != null) {
            cVar4.d(cVar);
        } else if (t10 == z.f57300I && (cVar3 = this.f57850q) != null) {
            cVar3.e(cVar);
        } else if (t10 == z.f57301J && (cVar2 = this.f57850q) != null) {
            cVar2.g(cVar);
        }
    }
}
