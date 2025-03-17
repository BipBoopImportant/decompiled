package Ua;

import Ta.C9271a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class m {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f64102a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f64103b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f64104c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f64105d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f64106e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f64107f;

    /* renamed from: g  reason: collision with root package name */
    private final List<f> f64108g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<g> f64109h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f64110i;

    class a extends g {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f64111c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Matrix f64112d;

        a(List list, Matrix matrix) {
            this.f64111c = list;
            this.f64112d = matrix;
        }

        public void b(Matrix matrix, C9271a aVar, int i10, Canvas canvas) {
            for (g b10 : this.f64111c) {
                b10.b(this.f64112d, aVar, i10, canvas);
            }
        }
    }

    static class b extends g {

        /* renamed from: c  reason: collision with root package name */
        private final d f64114c;

        public b(d dVar) {
            this.f64114c = dVar;
        }

        public void b(Matrix matrix, C9271a aVar, int i10, Canvas canvas) {
            float h10 = this.f64114c.m();
            float i11 = this.f64114c.n();
            aVar.a(canvas, matrix, new RectF(this.f64114c.k(), this.f64114c.o(), this.f64114c.l(), this.f64114c.j()), i10, h10, i11);
        }
    }

    static class c extends g {

        /* renamed from: c  reason: collision with root package name */
        private final e f64115c;

        /* renamed from: d  reason: collision with root package name */
        private final float f64116d;

        /* renamed from: e  reason: collision with root package name */
        private final float f64117e;

        public c(e eVar, float f10, float f11) {
            this.f64115c = eVar;
            this.f64116d = f10;
            this.f64117e = f11;
        }

        public void b(Matrix matrix, C9271a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f64115c.f64126c - this.f64117e), (double) (this.f64115c.f64125b - this.f64116d)), 0.0f);
            this.f64129a.set(matrix);
            this.f64129a.preTranslate(this.f64116d, this.f64117e);
            this.f64129a.preRotate(c());
            aVar.b(canvas, this.f64129a, rectF, i10);
        }

        /* access modifiers changed from: package-private */
        public float c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f64115c.f64126c - this.f64117e) / (this.f64115c.f64125b - this.f64116d))));
        }
    }

    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f64118h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f64119b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f64120c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f64121d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f64122e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f64123f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f64124g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* access modifiers changed from: private */
        public float j() {
            return this.f64122e;
        }

        /* access modifiers changed from: private */
        public float k() {
            return this.f64119b;
        }

        /* access modifiers changed from: private */
        public float l() {
            return this.f64121d;
        }

        /* access modifiers changed from: private */
        public float m() {
            return this.f64123f;
        }

        /* access modifiers changed from: private */
        public float n() {
            return this.f64124g;
        }

        /* access modifiers changed from: private */
        public float o() {
            return this.f64120c;
        }

        private void p(float f10) {
            this.f64122e = f10;
        }

        private void q(float f10) {
            this.f64119b = f10;
        }

        private void r(float f10) {
            this.f64121d = f10;
        }

        /* access modifiers changed from: private */
        public void s(float f10) {
            this.f64123f = f10;
        }

        /* access modifiers changed from: private */
        public void t(float f10) {
            this.f64124g = f10;
        }

        private void u(float f10) {
            this.f64120c = f10;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f64127a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f64118h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f64125b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public float f64126c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f64127a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f64125b, this.f64126c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f64127a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* renamed from: b  reason: collision with root package name */
        static final Matrix f64128b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        final Matrix f64129a = new Matrix();

        g() {
        }

        public final void a(C9271a aVar, int i10, Canvas canvas) {
            b(f64128b, aVar, i10, canvas);
        }

        public abstract void b(Matrix matrix, C9271a aVar, int i10, Canvas canvas);
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() != f10) {
            float g10 = ((f10 - g()) + 360.0f) % 360.0f;
            if (g10 <= 180.0f) {
                d dVar = new d(i(), j(), i(), j());
                dVar.s(g());
                dVar.t(g10);
                this.f64109h.add(new b(dVar));
                p(f10);
            }
        }
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f64109h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f64106e;
    }

    private float h() {
        return this.f64107f;
    }

    private void p(float f10) {
        this.f64106e = f10;
    }

    private void q(float f10) {
        this.f64107f = f10;
    }

    private void r(float f10) {
        this.f64104c = f10;
    }

    private void s(float f10) {
        this.f64105d = f10;
    }

    private void t(float f10) {
        this.f64102a = f10;
    }

    private void u(float f10) {
        this.f64103b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f64108g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = (double) f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f64108g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f64108g.get(i10).a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f64110i;
    }

    /* access modifiers changed from: package-private */
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f64109h), new Matrix(matrix));
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f64104c;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f64105d;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f64102a;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f64103b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        float unused = eVar.f64125b = f10;
        float unused2 = eVar.f64126c = f11;
        this.f64108g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f64108g.clear();
        this.f64109h.clear();
        this.f64110i = false;
    }
}
