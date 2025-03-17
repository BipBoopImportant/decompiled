package y6;

import D6.d;
import D6.f;
import D6.g;
import E6.b;
import J6.c;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.o;
import j0.C5468y;
import w6.z;
import z6.C9019a;
import z6.q;

public class i extends C8984a {

    /* renamed from: A  reason: collision with root package name */
    private final C9019a<PointF, PointF> f57907A;

    /* renamed from: B  reason: collision with root package name */
    private q f57908B;

    /* renamed from: r  reason: collision with root package name */
    private final String f57909r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f57910s;

    /* renamed from: t  reason: collision with root package name */
    private final C5468y<LinearGradient> f57911t = new C5468y<>();

    /* renamed from: u  reason: collision with root package name */
    private final C5468y<RadialGradient> f57912u = new C5468y<>();

    /* renamed from: v  reason: collision with root package name */
    private final RectF f57913v = new RectF();

    /* renamed from: w  reason: collision with root package name */
    private final g f57914w;

    /* renamed from: x  reason: collision with root package name */
    private final int f57915x;

    /* renamed from: y  reason: collision with root package name */
    private final C9019a<d, d> f57916y;

    /* renamed from: z  reason: collision with root package name */
    private final C9019a<PointF, PointF> f57917z;

    public i(o oVar, b bVar, f fVar) {
        super(oVar, bVar, fVar.b().b(), fVar.g().b(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f57909r = fVar.j();
        this.f57914w = fVar.f();
        this.f57910s = fVar.n();
        this.f57915x = (int) (oVar.H().d() / 32.0f);
        C9019a<d, d> h10 = fVar.e().h();
        this.f57916y = h10;
        h10.a(this);
        bVar.i(h10);
        C9019a<PointF, PointF> h11 = fVar.l().h();
        this.f57917z = h11;
        h11.a(this);
        bVar.i(h11);
        C9019a<PointF, PointF> h12 = fVar.d().h();
        this.f57907A = h12;
        h12.a(this);
        bVar.i(h12);
    }

    private int[] j(int[] iArr) {
        q qVar = this.f57908B;
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

    private int k() {
        int round = Math.round(this.f57917z.f() * ((float) this.f57915x));
        int round2 = Math.round(this.f57907A.f() * ((float) this.f57915x));
        int round3 = Math.round(this.f57916y.f() * ((float) this.f57915x));
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    private LinearGradient l() {
        long k10 = (long) k();
        LinearGradient d10 = this.f57911t.d(k10);
        if (d10 != null) {
            return d10;
        }
        PointF h10 = this.f57917z.h();
        PointF h11 = this.f57907A.h();
        d h12 = this.f57916y.h();
        LinearGradient linearGradient = new LinearGradient(h10.x, h10.y, h11.x, h11.y, j(h12.c()), h12.d(), Shader.TileMode.CLAMP);
        this.f57911t.k(k10, linearGradient);
        return linearGradient;
    }

    private RadialGradient n() {
        long k10 = (long) k();
        RadialGradient d10 = this.f57912u.d(k10);
        if (d10 != null) {
            return d10;
        }
        PointF h10 = this.f57917z.h();
        PointF h11 = this.f57907A.h();
        d h12 = this.f57916y.h();
        int[] j10 = j(h12.c());
        float[] d11 = h12.d();
        float f10 = h10.x;
        float f11 = h10.y;
        RadialGradient radialGradient = new RadialGradient(f10, f11, (float) Math.hypot((double) (h11.x - f10), (double) (h11.y - f11)), j10, d11, Shader.TileMode.CLAMP);
        this.f57912u.k(k10, radialGradient);
        return radialGradient;
    }

    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f57910s) {
            e(this.f57913v, matrix, false);
            Shader l10 = this.f57914w == g.LINEAR ? l() : n();
            l10.setLocalMatrix(matrix);
            this.f57842i.setShader(l10);
            super.g(canvas, matrix, i10);
        }
    }

    public String getName() {
        return this.f57909r;
    }

    public <T> void h(T t10, c<T> cVar) {
        super.h(t10, cVar);
        if (t10 == z.f57303L) {
            q qVar = this.f57908B;
            if (qVar != null) {
                this.f57839f.I(qVar);
            }
            if (cVar == null) {
                this.f57908B = null;
                return;
            }
            q qVar2 = new q(cVar);
            this.f57908B = qVar2;
            qVar2.a(this);
            this.f57839f.i(this.f57908B);
        }
    }
}
