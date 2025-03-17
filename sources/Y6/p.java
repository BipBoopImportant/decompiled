package y6;

import B6.e;
import D6.m;
import E6.b;
import I6.i;
import J6.c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import java.util.List;
import w6.z;
import z6.C9019a;

public class p implements C8988e, m, j, C9019a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f57952a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Path f57953b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final o f57954c;

    /* renamed from: d  reason: collision with root package name */
    private final b f57955d;

    /* renamed from: e  reason: collision with root package name */
    private final String f57956e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f57957f;

    /* renamed from: g  reason: collision with root package name */
    private final C9019a<Float, Float> f57958g;

    /* renamed from: h  reason: collision with root package name */
    private final C9019a<Float, Float> f57959h;

    /* renamed from: i  reason: collision with root package name */
    private final z6.p f57960i;

    /* renamed from: j  reason: collision with root package name */
    private C8987d f57961j;

    public p(o oVar, b bVar, m mVar) {
        this.f57954c = oVar;
        this.f57955d = bVar;
        this.f57956e = mVar.c();
        this.f57957f = mVar.f();
        C9019a<Float, Float> h10 = mVar.b().h();
        this.f57958g = h10;
        bVar.i(h10);
        h10.a(this);
        C9019a<Float, Float> h11 = mVar.d().h();
        this.f57959h = h11;
        bVar.i(h11);
        h11.a(this);
        z6.p b10 = mVar.e().b();
        this.f57960i = b10;
        b10.a(bVar);
        b10.b(this);
    }

    public void a() {
        this.f57954c.invalidateSelf();
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
        this.f57961j.b(list, list2);
    }

    public void c(e eVar, int i10, List<e> list, e eVar2) {
        i.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f57961j.j().size(); i11++) {
            C8986c cVar = this.f57961j.j().get(i11);
            if (cVar instanceof k) {
                i.k(eVar, i10, list, eVar2, (k) cVar);
            }
        }
    }

    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f57961j.e(rectF, matrix, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.util.ListIterator<y6.C8986c> r9) {
        /*
            r8 = this;
            y6.d r0 = r8.f57961j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r9.previous()
            y6.c r0 = (y6.C8986c) r0
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x002a:
            java.util.Collections.reverse(r6)
            y6.d r9 = new y6.d
            com.airbnb.lottie.o r2 = r8.f57954c
            E6.b r3 = r8.f57955d
            boolean r5 = r8.f57957f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f57961j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.p.f(java.util.ListIterator):void");
    }

    public void g(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = this.f57958g.h().floatValue();
        float floatValue2 = this.f57959h.h().floatValue();
        float floatValue3 = this.f57960i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.f57960i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f57952a.set(matrix);
            float f10 = (float) i11;
            this.f57952a.preConcat(this.f57960i.g(f10 + floatValue2));
            this.f57961j.g(canvas, this.f57952a, (int) (((float) i10) * i.i(floatValue3, floatValue4, f10 / floatValue)));
        }
    }

    public String getName() {
        return this.f57956e;
    }

    public <T> void h(T t10, c<T> cVar) {
        if (!this.f57960i.c(t10, cVar)) {
            if (t10 == z.f57327u) {
                this.f57958g.n(cVar);
            } else if (t10 == z.f57328v) {
                this.f57959h.n(cVar);
            }
        }
    }

    public Path m() {
        Path m10 = this.f57961j.m();
        this.f57953b.reset();
        float floatValue = this.f57958g.h().floatValue();
        float floatValue2 = this.f57959h.h().floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.f57952a.set(this.f57960i.g(((float) i10) + floatValue2));
            this.f57953b.addPath(m10, this.f57952a);
        }
        return this.f57953b;
    }
}
