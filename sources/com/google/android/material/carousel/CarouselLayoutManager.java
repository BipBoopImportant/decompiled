package com.google.android.material.carousel;

import Ea.C9070d;
import Ea.C9078l;
import Fa.C9081a;
import H2.i;
import Ja.C9123a;
import Ja.C9124b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.google.android.material.carousel.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import x2.C6244c;

public class CarouselLayoutManager extends RecyclerView.q implements b, RecyclerView.B.b {

    /* renamed from: A  reason: collision with root package name */
    private int f66281A;

    /* renamed from: B  reason: collision with root package name */
    private Map<Integer, f> f66282B;

    /* renamed from: C  reason: collision with root package name */
    private c f66283C;

    /* renamed from: D  reason: collision with root package name */
    private final View.OnLayoutChangeListener f66284D;

    /* renamed from: E  reason: collision with root package name */
    private int f66285E;

    /* renamed from: F  reason: collision with root package name */
    private int f66286F;

    /* renamed from: G  reason: collision with root package name */
    private int f66287G;

    /* renamed from: s  reason: collision with root package name */
    int f66288s;

    /* renamed from: t  reason: collision with root package name */
    int f66289t;

    /* renamed from: u  reason: collision with root package name */
    int f66290u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f66291v;

    /* renamed from: w  reason: collision with root package name */
    private final c f66292w;

    /* renamed from: x  reason: collision with root package name */
    private d f66293x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public g f66294y;

    /* renamed from: z  reason: collision with root package name */
    private f f66295z;

    class a extends p {
        a(Context context) {
            super(context);
        }

        public PointF a(int i10) {
            return CarouselLayoutManager.this.h(i10);
        }

        public int t(View view, int i10) {
            if (CarouselLayoutManager.this.f66294y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.C2(carouselLayoutManager.E0(view));
        }

        public int u(View view, int i10) {
            if (CarouselLayoutManager.this.f66294y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.C2(carouselLayoutManager.E0(view));
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        final View f66297a;

        /* renamed from: b  reason: collision with root package name */
        final float f66298b;

        /* renamed from: c  reason: collision with root package name */
        final float f66299c;

        /* renamed from: d  reason: collision with root package name */
        final d f66300d;

        b(View view, float f10, float f11, d dVar) {
            this.f66297a = view;
            this.f66298b = f10;
            this.f66299c = f11;
            this.f66300d = dVar;
        }
    }

    private static class c extends RecyclerView.p {

        /* renamed from: a  reason: collision with root package name */
        private final Paint f66301a;

        /* renamed from: b  reason: collision with root package name */
        private List<f.c> f66302b = Collections.unmodifiableList(new ArrayList());

        c() {
            Paint paint = new Paint();
            this.f66301a = paint;
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
            super.k(canvas, recyclerView, c10);
            this.f66301a.setStrokeWidth(recyclerView.getResources().getDimension(C9070d.f59438u));
            for (f.c next : this.f66302b) {
                this.f66301a.setColor(C6244c.d(-65281, -16776961, next.f66333c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    canvas.drawLine(next.f66332b, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).W2(), next.f66332b, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).R2(), this.f66301a);
                } else {
                    canvas.drawLine((float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).T2(), next.f66332b, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).U2(), next.f66332b, this.f66301a);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void l(List<f.c> list) {
            this.f66302b = Collections.unmodifiableList(list);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final f.c f66303a;

        /* renamed from: b  reason: collision with root package name */
        final f.c f66304b;

        d(f.c cVar, f.c cVar2) {
            i.a(cVar.f66331a <= cVar2.f66331a);
            this.f66303a = cVar;
            this.f66304b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new i());
    }

    private float A2(int i10) {
        return u2((float) (V2() - this.f66288s), this.f66295z.f() * ((float) i10));
    }

    private int B2(RecyclerView.C c10, g gVar) {
        boolean b32 = b3();
        f l10 = b32 ? gVar.l() : gVar.h();
        f.c a10 = b32 ? l10.a() : l10.h();
        int b10 = (int) ((((((float) (c10.b() - 1)) * l10.f()) * (b32 ? -1.0f : 1.0f)) - (a10.f66331a - ((float) V2()))) + (((float) S2()) - a10.f66331a) + (b32 ? -a10.f66337g : a10.f66338h));
        return b32 ? Math.min(0, b10) : Math.max(0, b10);
    }

    private static int D2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        return i14 < i12 ? i12 - i11 : i14 > i13 ? i13 - i11 : i10;
    }

    private int E2(g gVar) {
        boolean b32 = b3();
        f h10 = b32 ? gVar.h() : gVar.l();
        return (int) (((float) V2()) - v2((b32 ? h10.h() : h10.a()).f66331a, h10.f() / 2.0f));
    }

    private int F2(int i10) {
        int Q22 = Q2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 17) {
            if (i10 == 33) {
                return Q22 == 1 ? -1 : Integer.MIN_VALUE;
            }
            if (i10 != 66) {
                if (i10 == 130) {
                    return Q22 == 1 ? 1 : Integer.MIN_VALUE;
                }
                Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
                return Integer.MIN_VALUE;
            } else if (Q22 == 0) {
                return b3() ? -1 : 1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (Q22 == 0) {
            return b3() ? 1 : -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    private void G2(RecyclerView.x xVar, RecyclerView.C c10) {
        k3(xVar);
        if (l0() == 0) {
            y2(xVar, this.f66281A - 1);
            x2(xVar, c10, this.f66281A);
        } else {
            int E02 = E0(k0(0));
            int E03 = E0(k0(l0() - 1));
            y2(xVar, E02 - 1);
            x2(xVar, c10, E03 + 1);
        }
        u3();
    }

    private View H2() {
        return k0(b3() ? 0 : l0() - 1);
    }

    private View I2() {
        return k0(b3() ? l0() - 1 : 0);
    }

    private int J2() {
        return f() ? b() : e();
    }

    private float K2(View view) {
        Rect rect = new Rect();
        super.r0(view, rect);
        return (float) (f() ? rect.centerX() : rect.centerY());
    }

    private int L2() {
        int i10;
        int i11;
        if (l0() <= 0) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) k0(0).getLayoutParams();
        if (this.f66283C.f66313a == 0) {
            i10 = rVar.leftMargin;
            i11 = rVar.rightMargin;
        } else {
            i10 = rVar.topMargin;
            i11 = rVar.bottomMargin;
        }
        return i10 + i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = r0.get(java.lang.Integer.valueOf(B2.a.c(r4, 0, java.lang.Math.max(0, a() - 1))));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.material.carousel.f M2(int r4) {
        /*
            r3 = this;
            java.util.Map<java.lang.Integer, com.google.android.material.carousel.f> r0 = r3.f66282B
            if (r0 == 0) goto L_0x0020
            int r1 = r3.a()
            int r1 = r1 + -1
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            int r4 = B2.a.c(r4, r2, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            com.google.android.material.carousel.f r4 = (com.google.android.material.carousel.f) r4
            if (r4 == 0) goto L_0x0020
            return r4
        L_0x0020:
            com.google.android.material.carousel.g r4 = r3.f66294y
            com.google.android.material.carousel.f r4 = r4.g()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.M2(int):com.google.android.material.carousel.f");
    }

    private int N2() {
        if (o0() || !this.f66293x.f()) {
            return 0;
        }
        return Q2() == 1 ? s() : t();
    }

    private float O2(float f10, d dVar) {
        f.c cVar = dVar.f66303a;
        float f11 = cVar.f66334d;
        f.c cVar2 = dVar.f66304b;
        return C9081a.b(f11, cVar2.f66334d, cVar.f66332b, cVar2.f66332b, f10);
    }

    /* access modifiers changed from: private */
    public int R2() {
        return this.f66283C.g();
    }

    private int S2() {
        return this.f66283C.h();
    }

    /* access modifiers changed from: private */
    public int T2() {
        return this.f66283C.i();
    }

    /* access modifiers changed from: private */
    public int U2() {
        return this.f66283C.j();
    }

    private int V2() {
        return this.f66283C.k();
    }

    /* access modifiers changed from: private */
    public int W2() {
        return this.f66283C.l();
    }

    private int X2() {
        if (o0() || !this.f66293x.f()) {
            return 0;
        }
        return Q2() == 1 ? c() : o();
    }

    private int Y2(int i10, f fVar) {
        return b3() ? (int) (((((float) J2()) - fVar.h().f66331a) - (((float) i10) * fVar.f())) - (fVar.f() / 2.0f)) : (int) (((((float) i10) * fVar.f()) - fVar.a().f66331a) + (fVar.f() / 2.0f));
    }

    private int Z2(int i10, f fVar) {
        int i11 = Integer.MAX_VALUE;
        for (f.c next : fVar.e()) {
            float f10 = (((float) i10) * fVar.f()) + (fVar.f() / 2.0f);
            int J22 = (b3() ? (int) ((((float) J2()) - next.f66331a) - f10) : (int) (f10 - next.f66331a)) - this.f66288s;
            if (Math.abs(i11) > Math.abs(J22)) {
                i11 = J22;
            }
        }
        return i11;
    }

    private static d a3(List<f.c> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            f.c cVar = list.get(i14);
            float f15 = z10 ? cVar.f66332b : cVar.f66331a;
            float abs = Math.abs(f15 - f10);
            if (f15 <= f10 && abs <= f11) {
                i10 = i14;
                f11 = abs;
            }
            if (f15 > f10 && abs <= f13) {
                i12 = i14;
                f13 = abs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d(list.get(i10), list.get(i12));
    }

    private boolean c3(float f10, d dVar) {
        float v22 = v2(f10, O2(f10, dVar) / 2.0f);
        if (b3()) {
            if (v22 >= 0.0f) {
                return false;
            }
        } else if (v22 <= ((float) J2())) {
            return false;
        }
        return true;
    }

    private boolean d3(float f10, d dVar) {
        float u22 = u2(f10, O2(f10, dVar) / 2.0f);
        if (b3()) {
            if (u22 <= ((float) J2())) {
                return false;
            }
        } else if (u22 >= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e3(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 != i14 || i11 != i15 || i12 != i16 || i13 != i17) {
            view.post(new C9124b(this));
        }
    }

    private void f3() {
        if (this.f66291v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < l0(); i10++) {
                View k02 = k0(i10);
                float K22 = K2(k02);
                Log.d("CarouselLayoutManager", "item position " + E0(k02) + ", center:" + K22 + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b g3(RecyclerView.x xVar, float f10, int i10) {
        View o10 = xVar.o(i10);
        Z0(o10, 0, 0);
        float u22 = u2(f10, this.f66295z.f() / 2.0f);
        d a32 = a3(this.f66295z.g(), u22, false);
        return new b(o10, u22, z2(o10, u22, a32), a32);
    }

    private float h3(View view, float f10, float f11, Rect rect) {
        float u22 = u2(f10, f11);
        d a32 = a3(this.f66295z.g(), u22, false);
        float z22 = z2(view, u22, a32);
        super.r0(view, rect);
        r3(view, u22, a32);
        this.f66283C.o(view, rect, f11, z22);
        return z22;
    }

    private void i3(RecyclerView.x xVar) {
        View o10 = xVar.o(0);
        Z0(o10, 0, 0);
        f g10 = this.f66293x.g(this, o10);
        if (b3()) {
            g10 = f.n(g10, (float) J2());
        }
        this.f66294y = g.f(this, g10, (float) L2(), (float) N2(), (float) X2());
    }

    /* access modifiers changed from: private */
    public void j3() {
        this.f66294y = null;
        T1();
    }

    private void k3(RecyclerView.x xVar) {
        while (l0() > 0) {
            View k02 = k0(0);
            float K22 = K2(k02);
            if (!d3(K22, a3(this.f66295z.g(), K22, true))) {
                break;
            }
            M1(k02, xVar);
        }
        while (l0() - 1 >= 0) {
            View k03 = k0(l0() - 1);
            float K23 = K2(k03);
            if (c3(K23, a3(this.f66295z.g(), K23, true))) {
                M1(k03, xVar);
            } else {
                return;
            }
        }
    }

    private int l3(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (l0() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f66294y == null) {
            i3(xVar);
        }
        int D22 = D2(i10, this.f66288s, this.f66289t, this.f66290u);
        this.f66288s += D22;
        s3(this.f66294y);
        float f10 = this.f66295z.f() / 2.0f;
        float A22 = A2(E0(k0(0)));
        Rect rect = new Rect();
        float f11 = b3() ? this.f66295z.h().f66332b : this.f66295z.a().f66332b;
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < l0(); i11++) {
            View k02 = k0(i11);
            float abs = Math.abs(f11 - h3(k02, A22, f10, rect));
            if (k02 != null && abs < f12) {
                this.f66286F = E0(k02);
                f12 = abs;
            }
            A22 = u2(A22, this.f66295z.f());
        }
        G2(xVar, c10);
        return D22;
    }

    private void m3(RecyclerView recyclerView, int i10) {
        if (f()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    private void o3(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9078l.f59750M0);
            n3(obtainStyledAttributes.getInt(C9078l.f59761N0, 0));
            q3(obtainStyledAttributes.getInt(C9078l.f60007k6, 0));
            obtainStyledAttributes.recycle();
        }
    }

    private void r3(View view, float f10, d dVar) {
        if (view instanceof h) {
            f.c cVar = dVar.f66303a;
            float f11 = cVar.f66333c;
            f.c cVar2 = dVar.f66304b;
            float b10 = C9081a.b(f11, cVar2.f66333c, cVar.f66331a, cVar2.f66331a, f10);
            float height = (float) view.getHeight();
            float width = (float) view.getWidth();
            float b11 = C9081a.b(0.0f, width / 2.0f, 0.0f, 1.0f, b10);
            RectF f12 = this.f66283C.f(height, width, C9081a.b(0.0f, height / 2.0f, 0.0f, 1.0f, b10), b11);
            float z22 = z2(view, f10, dVar);
            float height2 = (f12.height() / 2.0f) + z22;
            RectF rectF = new RectF(z22 - (f12.width() / 2.0f), z22 - (f12.height() / 2.0f), z22 + (f12.width() / 2.0f), height2);
            RectF rectF2 = new RectF((float) T2(), (float) W2(), (float) U2(), (float) R2());
            if (this.f66293x.f()) {
                this.f66283C.a(f12, rectF, rectF2);
            }
            this.f66283C.n(f12, rectF, rectF2);
            ((h) view).a(f12);
        }
    }

    private void s3(g gVar) {
        int i10 = this.f66290u;
        int i11 = this.f66289t;
        if (i10 <= i11) {
            this.f66295z = b3() ? gVar.h() : gVar.l();
        } else {
            this.f66295z = gVar.j((float) this.f66288s, (float) i11, (float) i10);
        }
        this.f66292w.l(this.f66295z.g());
    }

    private void t2(View view, int i10, b bVar) {
        float f10 = this.f66295z.f() / 2.0f;
        G(view, i10);
        float f11 = bVar.f66299c;
        this.f66283C.m(view, (int) (f11 - f10), (int) (f11 + f10));
        r3(view, bVar.f66298b, bVar.f66300d);
    }

    private void t3() {
        int a10 = a();
        int i10 = this.f66285E;
        if (a10 != i10 && this.f66294y != null) {
            if (this.f66293x.h(this, i10)) {
                j3();
            }
            this.f66285E = a10;
        }
    }

    private float u2(float f10, float f11) {
        return b3() ? f10 - f11 : f10 + f11;
    }

    private void u3() {
        if (this.f66291v && l0() >= 1) {
            int i10 = 0;
            while (i10 < l0() - 1) {
                int E02 = E0(k0(i10));
                int i11 = i10 + 1;
                int E03 = E0(k0(i11));
                if (E02 <= E03) {
                    i10 = i11;
                } else {
                    f3();
                    throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + E02 + "] and child at index [" + i11 + "] had adapter position [" + E03 + "].");
                }
            }
        }
    }

    private float v2(float f10, float f11) {
        return b3() ? f10 + f11 : f10 - f11;
    }

    private void w2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 >= 0 && i10 < a()) {
            b g32 = g3(xVar, A2(i10), i10);
            t2(g32.f66297a, i11, g32);
        }
    }

    private void x2(RecyclerView.x xVar, RecyclerView.C c10, int i10) {
        float A22 = A2(i10);
        while (i10 < c10.b()) {
            b g32 = g3(xVar, A22, i10);
            if (!c3(g32.f66299c, g32.f66300d)) {
                A22 = u2(A22, this.f66295z.f());
                if (!d3(g32.f66299c, g32.f66300d)) {
                    t2(g32.f66297a, -1, g32);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void y2(RecyclerView.x xVar, int i10) {
        float A22 = A2(i10);
        while (i10 >= 0) {
            b g32 = g3(xVar, A22, i10);
            if (!d3(g32.f66299c, g32.f66300d)) {
                A22 = v2(A22, this.f66295z.f());
                if (!c3(g32.f66299c, g32.f66300d)) {
                    t2(g32.f66297a, 0, g32);
                }
                i10--;
            } else {
                return;
            }
        }
    }

    private float z2(View view, float f10, d dVar) {
        f.c cVar = dVar.f66303a;
        float f11 = cVar.f66332b;
        f.c cVar2 = dVar.f66304b;
        float b10 = C9081a.b(f11, cVar2.f66332b, cVar.f66331a, cVar2.f66331a, f10);
        if (dVar.f66304b != this.f66295z.c() && dVar.f66303a != this.f66295z.j()) {
            return b10;
        }
        float e10 = this.f66283C.e((RecyclerView.r) view.getLayoutParams()) / this.f66295z.f();
        f.c cVar3 = dVar.f66304b;
        return b10 + ((f10 - cVar3.f66331a) * ((1.0f - cVar3.f66333c) + e10));
    }

    /* access modifiers changed from: package-private */
    public int C2(int i10) {
        return (int) (((float) this.f66288s) - ((float) Y2(i10, M2(i10))));
    }

    public boolean M() {
        return f();
    }

    public boolean N() {
        return !f();
    }

    public boolean P0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public int P2(int i10, f fVar) {
        return Y2(i10, fVar) - this.f66288s;
    }

    public int Q2() {
        return this.f66283C.f66313a;
    }

    public int S(RecyclerView.C c10) {
        if (l0() == 0 || this.f66294y == null || a() <= 1) {
            return 0;
        }
        return (int) (((float) L0()) * (this.f66294y.g().f() / ((float) U(c10))));
    }

    public boolean S1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int Z22;
        if (this.f66294y == null || (Z22 = Z2(E0(view), M2(E0(view)))) == 0) {
            return false;
        }
        m3(recyclerView, Z2(E0(view), this.f66294y.j((float) (this.f66288s + D2(Z22, this.f66288s, this.f66289t, this.f66290u)), (float) this.f66289t, (float) this.f66290u)));
        return true;
    }

    public int T(RecyclerView.C c10) {
        return this.f66288s;
    }

    public int U(RecyclerView.C c10) {
        return this.f66290u - this.f66289t;
    }

    public int V(RecyclerView.C c10) {
        if (l0() == 0 || this.f66294y == null || a() <= 1) {
            return 0;
        }
        return (int) (((float) y0()) * (this.f66294y.g().f() / ((float) X(c10))));
    }

    public int W(RecyclerView.C c10) {
        return this.f66288s;
    }

    public int W1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (M()) {
            return l3(i10, xVar, c10);
        }
        return 0;
    }

    public int X(RecyclerView.C c10) {
        return this.f66290u - this.f66289t;
    }

    public void X1(int i10) {
        this.f66286F = i10;
        if (this.f66294y != null) {
            this.f66288s = Y2(i10, M2(i10));
            this.f66281A = B2.a.c(i10, 0, Math.max(0, a() - 1));
            s3(this.f66294y);
            T1();
        }
    }

    public int Y1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (N()) {
            return l3(i10, xVar, c10);
        }
        return 0;
    }

    public void Z0(View view, int i10, int i11) {
        if (view instanceof h) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            Rect rect = new Rect();
            L(view, rect);
            int i12 = i10 + rect.left + rect.right;
            int i13 = i11 + rect.top + rect.bottom;
            g gVar = this.f66294y;
            float f10 = (gVar == null || this.f66283C.f66313a != 0) ? (float) rVar.width : gVar.g().f();
            g gVar2 = this.f66294y;
            view.measure(RecyclerView.q.m0(L0(), M0(), t() + o() + rVar.leftMargin + rVar.rightMargin + i12, (int) f10, M()), RecyclerView.q.m0(y0(), z0(), s() + c() + rVar.topMargin + rVar.bottomMargin + i13, (int) ((gVar2 == null || this.f66283C.f66313a != 1) ? (float) rVar.height : gVar2.g().f()), N()));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public int b() {
        return L0();
    }

    /* access modifiers changed from: package-private */
    public boolean b3() {
        return f() && A0() == 1;
    }

    public int e() {
        return y0();
    }

    public boolean f() {
        return this.f66283C.f66313a == 0;
    }

    public RecyclerView.r f0() {
        return new RecyclerView.r(-2, -2);
    }

    public void f1(RecyclerView recyclerView) {
        super.f1(recyclerView);
        this.f66293x.e(recyclerView.getContext());
        j3();
        recyclerView.addOnLayoutChangeListener(this.f66284D);
    }

    public PointF h(int i10) {
        if (this.f66294y == null) {
            return null;
        }
        int P22 = P2(i10, M2(i10));
        return f() ? new PointF((float) P22, 0.0f) : new PointF(0.0f, (float) P22);
    }

    public void h1(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.h1(recyclerView, xVar);
        recyclerView.removeOnLayoutChangeListener(this.f66284D);
    }

    public View i1(View view, int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        int F22;
        if (l0() == 0 || (F22 = F2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (F22 == -1) {
            if (E0(view) == 0) {
                return null;
            }
            w2(xVar, E0(k0(0)) - 1, 0);
            return I2();
        } else if (E0(view) == a() - 1) {
            return null;
        } else {
            w2(xVar, E0(k0(l0() - 1)) + 1, -1);
            return H2();
        }
    }

    public void i2(RecyclerView recyclerView, RecyclerView.C c10, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        j2(aVar);
    }

    public void j1(AccessibilityEvent accessibilityEvent) {
        super.j1(accessibilityEvent);
        if (l0() > 0) {
            accessibilityEvent.setFromIndex(E0(k0(0)));
            accessibilityEvent.setToIndex(E0(k0(l0() - 1)));
        }
    }

    public void n3(int i10) {
        this.f66287G = i10;
        j3();
    }

    public int p() {
        return this.f66287G;
    }

    public void p3(d dVar) {
        this.f66293x = dVar;
        j3();
    }

    public void q1(RecyclerView recyclerView, int i10, int i11) {
        super.q1(recyclerView, i10, i11);
        t3();
    }

    public void q3(int i10) {
        if (i10 == 0 || i10 == 1) {
            I((String) null);
            c cVar = this.f66283C;
            if (cVar == null || i10 != cVar.f66313a) {
                this.f66283C = c.c(this, i10);
                j3();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i10);
    }

    public void r0(View view, Rect rect) {
        super.r0(view, rect);
        float centerY = (float) rect.centerY();
        if (f()) {
            centerY = (float) rect.centerX();
        }
        float O22 = O2(centerY, a3(this.f66295z.g(), centerY, true));
        float f10 = 0.0f;
        float width = f() ? (((float) rect.width()) - O22) / 2.0f : 0.0f;
        if (!f()) {
            f10 = (((float) rect.height()) - O22) / 2.0f;
        }
        rect.set((int) (((float) rect.left) + width), (int) (((float) rect.top) + f10), (int) (((float) rect.right) - width), (int) (((float) rect.bottom) - f10));
    }

    public void t1(RecyclerView recyclerView, int i10, int i11) {
        super.t1(recyclerView, i10, i11);
        t3();
    }

    public void w1(RecyclerView.x xVar, RecyclerView.C c10) {
        if (c10.b() <= 0 || ((float) J2()) <= 0.0f) {
            K1(xVar);
            this.f66281A = 0;
            return;
        }
        boolean b32 = b3();
        boolean z10 = this.f66294y == null;
        if (z10) {
            i3(xVar);
        }
        int E22 = E2(this.f66294y);
        int B22 = B2(c10, this.f66294y);
        this.f66289t = b32 ? B22 : E22;
        if (b32) {
            B22 = E22;
        }
        this.f66290u = B22;
        if (z10) {
            this.f66288s = E22;
            this.f66282B = this.f66294y.i(a(), this.f66289t, this.f66290u, b3());
            int i10 = this.f66286F;
            if (i10 != -1) {
                this.f66288s = Y2(i10, M2(i10));
            }
        }
        int i11 = this.f66288s;
        this.f66288s = i11 + D2(0, i11, this.f66289t, this.f66290u);
        this.f66281A = B2.a.c(this.f66281A, 0, c10.b());
        s3(this.f66294y);
        Y(xVar);
        G2(xVar, c10);
        this.f66285E = a();
    }

    public void x1(RecyclerView.C c10) {
        super.x1(c10);
        if (l0() == 0) {
            this.f66281A = 0;
        } else {
            this.f66281A = E0(k0(0));
        }
        u3();
    }

    public CarouselLayoutManager(d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(d dVar, int i10) {
        this.f66291v = false;
        this.f66292w = new c();
        this.f66281A = 0;
        this.f66284D = new C9123a(this);
        this.f66286F = -1;
        this.f66287G = 0;
        p3(dVar);
        q3(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f66291v = false;
        this.f66292w = new c();
        this.f66281A = 0;
        this.f66284D = new C9123a(this);
        this.f66286F = -1;
        this.f66287G = 0;
        p3(new i());
        o3(context, attributeSet);
    }
}
