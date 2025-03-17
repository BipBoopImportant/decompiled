package Ua;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f64084a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f64085b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f64086c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f64087d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final Path f64088e = new Path();

    /* renamed from: f  reason: collision with root package name */
    private final Path f64089f = new Path();

    /* renamed from: g  reason: collision with root package name */
    private final m f64090g = new m();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f64091h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    private final float[] f64092i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    private final Path f64093j = new Path();

    /* renamed from: k  reason: collision with root package name */
    private final Path f64094k = new Path();

    /* renamed from: l  reason: collision with root package name */
    private boolean f64095l = true;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final l f64096a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final k f64097a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f64098b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f64099c;

        /* renamed from: d  reason: collision with root package name */
        public final b f64100d;

        /* renamed from: e  reason: collision with root package name */
        public final float f64101e;

        c(k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f64100d = bVar;
            this.f64097a = kVar;
            this.f64101e = f10;
            this.f64099c = rectF;
            this.f64098b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f64084a[i10] = new m();
            this.f64085b[i10] = new Matrix();
            this.f64086c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return (float) (((i10 + 1) % 4) * 90);
    }

    private void b(c cVar, int i10) {
        this.f64091h[0] = this.f64084a[i10].k();
        this.f64091h[1] = this.f64084a[i10].l();
        this.f64085b[i10].mapPoints(this.f64091h);
        if (i10 == 0) {
            Path path = cVar.f64098b;
            float[] fArr = this.f64091h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f64098b;
            float[] fArr2 = this.f64091h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f64084a[i10].d(this.f64085b[i10], cVar.f64098b);
        b bVar = cVar.f64100d;
        if (bVar != null) {
            bVar.a(this.f64084a[i10], this.f64085b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f64091h[0] = this.f64084a[i10].i();
        this.f64091h[1] = this.f64084a[i10].j();
        this.f64085b[i10].mapPoints(this.f64091h);
        this.f64092i[0] = this.f64084a[i11].k();
        this.f64092i[1] = this.f64084a[i11].l();
        this.f64085b[i11].mapPoints(this.f64092i);
        float[] fArr = this.f64091h;
        float f10 = fArr[0];
        float[] fArr2 = this.f64092i;
        float max = Math.max(((float) Math.hypot((double) (f10 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i12 = i(cVar.f64099c, i10);
        this.f64090g.n(0.0f, 0.0f);
        C9285f j10 = j(i10, cVar.f64097a);
        j10.b(max, i12, cVar.f64101e, this.f64090g);
        this.f64093j.reset();
        this.f64090g.d(this.f64086c[i10], this.f64093j);
        if (!this.f64095l || (!j10.a() && !l(this.f64093j, i10) && !l(this.f64093j, i11))) {
            this.f64090g.d(this.f64086c[i10], cVar.f64098b);
        } else {
            Path path = this.f64093j;
            path.op(path, this.f64089f, Path.Op.DIFFERENCE);
            this.f64091h[0] = this.f64090g.k();
            this.f64091h[1] = this.f64090g.l();
            this.f64086c[i10].mapPoints(this.f64091h);
            Path path2 = this.f64088e;
            float[] fArr3 = this.f64091h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f64090g.d(this.f64086c[i10], this.f64088e);
        }
        b bVar = cVar.f64100d;
        if (bVar != null) {
            bVar.b(this.f64090g, this.f64086c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private C9282c g(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private C9283d h(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f64091h;
        m mVar = this.f64084a[i10];
        fArr[0] = mVar.f64104c;
        fArr[1] = mVar.f64105d;
        this.f64085b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f64091h[0]) : Math.abs(rectF.centerY() - this.f64091h[1]);
    }

    private C9285f j(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public static l k() {
        return a.f64096a;
    }

    private boolean l(Path path, int i10) {
        this.f64094k.reset();
        this.f64084a[i10].d(this.f64085b[i10], this.f64094k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f64094k.computeBounds(rectF, true);
        path.op(this.f64094k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f64097a).b(this.f64084a[i10], 90.0f, cVar.f64101e, cVar.f64099c, g(i10, cVar.f64097a));
        float a10 = a(i10);
        this.f64085b[i10].reset();
        f(i10, cVar.f64099c, this.f64087d);
        Matrix matrix = this.f64085b[i10];
        PointF pointF = this.f64087d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f64085b[i10].preRotate(a10);
    }

    private void n(int i10) {
        this.f64091h[0] = this.f64084a[i10].i();
        this.f64091h[1] = this.f64084a[i10].j();
        this.f64085b[i10].mapPoints(this.f64091h);
        float a10 = a(i10);
        this.f64086c[i10].reset();
        Matrix matrix = this.f64086c[i10];
        float[] fArr = this.f64091h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f64086c[i10].preRotate(a10);
    }

    public void d(k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f64088e.rewind();
        this.f64089f.rewind();
        this.f64089f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f64088e.close();
        if (!this.f64088e.isEmpty()) {
            path.op(this.f64088e, Path.Op.UNION);
        }
    }

    public void e(k kVar, float f10, RectF rectF, Path path) {
        d(kVar, f10, rectF, (b) null, path);
    }
}
