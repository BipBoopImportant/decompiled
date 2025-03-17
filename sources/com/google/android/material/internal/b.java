package com.google.android.material.internal;

import Fa.C9081a;
import G2.s;
import H2.i;
import I2.C4600b0;
import I2.C4632s;
import La.C9138a;
import Ra.C9268a;
import Ra.d;
import Ra.h;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;

public final class b {

    /* renamed from: t0  reason: collision with root package name */
    private static final boolean f66869t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    private static final Paint f66870u0 = null;

    /* renamed from: A  reason: collision with root package name */
    private Typeface f66871A;

    /* renamed from: B  reason: collision with root package name */
    private Typeface f66872B;

    /* renamed from: C  reason: collision with root package name */
    private Typeface f66873C;

    /* renamed from: D  reason: collision with root package name */
    private C9268a f66874D;

    /* renamed from: E  reason: collision with root package name */
    private C9268a f66875E;

    /* renamed from: F  reason: collision with root package name */
    private TextUtils.TruncateAt f66876F = TextUtils.TruncateAt.END;

    /* renamed from: G  reason: collision with root package name */
    private CharSequence f66877G;

    /* renamed from: H  reason: collision with root package name */
    private CharSequence f66878H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f66879I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f66880J = true;

    /* renamed from: K  reason: collision with root package name */
    private boolean f66881K;

    /* renamed from: L  reason: collision with root package name */
    private Bitmap f66882L;

    /* renamed from: M  reason: collision with root package name */
    private Paint f66883M;

    /* renamed from: N  reason: collision with root package name */
    private float f66884N;

    /* renamed from: O  reason: collision with root package name */
    private float f66885O;

    /* renamed from: P  reason: collision with root package name */
    private float f66886P;

    /* renamed from: Q  reason: collision with root package name */
    private float f66887Q;

    /* renamed from: R  reason: collision with root package name */
    private float f66888R;

    /* renamed from: S  reason: collision with root package name */
    private int f66889S;

    /* renamed from: T  reason: collision with root package name */
    private int[] f66890T;

    /* renamed from: U  reason: collision with root package name */
    private boolean f66891U;

    /* renamed from: V  reason: collision with root package name */
    private final TextPaint f66892V;

    /* renamed from: W  reason: collision with root package name */
    private final TextPaint f66893W;

    /* renamed from: X  reason: collision with root package name */
    private TimeInterpolator f66894X;

    /* renamed from: Y  reason: collision with root package name */
    private TimeInterpolator f66895Y;

    /* renamed from: Z  reason: collision with root package name */
    private float f66896Z;

    /* renamed from: a  reason: collision with root package name */
    private final View f66897a;

    /* renamed from: a0  reason: collision with root package name */
    private float f66898a0;

    /* renamed from: b  reason: collision with root package name */
    private float f66899b;

    /* renamed from: b0  reason: collision with root package name */
    private float f66900b0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f66901c;

    /* renamed from: c0  reason: collision with root package name */
    private ColorStateList f66902c0;

    /* renamed from: d  reason: collision with root package name */
    private float f66903d;

    /* renamed from: d0  reason: collision with root package name */
    private float f66904d0;

    /* renamed from: e  reason: collision with root package name */
    private float f66905e;

    /* renamed from: e0  reason: collision with root package name */
    private float f66906e0;

    /* renamed from: f  reason: collision with root package name */
    private int f66907f;

    /* renamed from: f0  reason: collision with root package name */
    private float f66908f0;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f66909g;

    /* renamed from: g0  reason: collision with root package name */
    private ColorStateList f66910g0;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f66911h;

    /* renamed from: h0  reason: collision with root package name */
    private float f66912h0;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f66913i;

    /* renamed from: i0  reason: collision with root package name */
    private float f66914i0;

    /* renamed from: j  reason: collision with root package name */
    private int f66915j = 16;

    /* renamed from: j0  reason: collision with root package name */
    private float f66916j0;

    /* renamed from: k  reason: collision with root package name */
    private int f66917k = 16;

    /* renamed from: k0  reason: collision with root package name */
    private StaticLayout f66918k0;

    /* renamed from: l  reason: collision with root package name */
    private float f66919l = 15.0f;

    /* renamed from: l0  reason: collision with root package name */
    private float f66920l0;

    /* renamed from: m  reason: collision with root package name */
    private float f66921m = 15.0f;

    /* renamed from: m0  reason: collision with root package name */
    private float f66922m0;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f66923n;

    /* renamed from: n0  reason: collision with root package name */
    private float f66924n0;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f66925o;

    /* renamed from: o0  reason: collision with root package name */
    private CharSequence f66926o0;

    /* renamed from: p  reason: collision with root package name */
    private int f66927p;

    /* renamed from: p0  reason: collision with root package name */
    private int f66928p0 = 1;

    /* renamed from: q  reason: collision with root package name */
    private float f66929q;

    /* renamed from: q0  reason: collision with root package name */
    private float f66930q0 = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    private float f66931r;

    /* renamed from: r0  reason: collision with root package name */
    private float f66932r0 = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    private float f66933s;

    /* renamed from: s0  reason: collision with root package name */
    private int f66934s0 = o.f66999n;

    /* renamed from: t  reason: collision with root package name */
    private float f66935t;

    /* renamed from: u  reason: collision with root package name */
    private float f66936u;

    /* renamed from: v  reason: collision with root package name */
    private float f66937v;

    /* renamed from: w  reason: collision with root package name */
    private Typeface f66938w;

    /* renamed from: x  reason: collision with root package name */
    private Typeface f66939x;

    /* renamed from: y  reason: collision with root package name */
    private Typeface f66940y;

    /* renamed from: z  reason: collision with root package name */
    private Typeface f66941z;

    class a implements C9268a.C1076a {
        a() {
        }

        public void a(Typeface typeface) {
            b.this.T(typeface);
        }
    }

    public b(View view) {
        this.f66897a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f66892V = textPaint;
        this.f66893W = new TextPaint(textPaint);
        this.f66911h = new Rect();
        this.f66909g = new Rect();
        this.f66913i = new RectF();
        this.f66905e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f66919l);
        textPaint.setTypeface(this.f66941z);
        textPaint.setLetterSpacing(this.f66914i0);
    }

    private void B(float f10) {
        if (this.f66901c) {
            this.f66913i.set(f10 < this.f66905e ? this.f66909g : this.f66911h);
            return;
        }
        this.f66913i.left = G((float) this.f66909g.left, (float) this.f66911h.left, f10, this.f66894X);
        this.f66913i.top = G(this.f66929q, this.f66931r, f10, this.f66894X);
        this.f66913i.right = G((float) this.f66909g.right, (float) this.f66911h.right, f10, this.f66894X);
        this.f66913i.bottom = G((float) this.f66909g.bottom, (float) this.f66911h.bottom, f10, this.f66894X);
    }

    private static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean D() {
        return C4600b0.z(this.f66897a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z10) {
        return (z10 ? s.f6645d : s.f6644c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return C9081a.a(f10, f11, f12);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean L(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void Q(float f10) {
        this.f66922m0 = f10;
        C4600b0.f0(this.f66897a);
    }

    private boolean U(Typeface typeface) {
        C9268a aVar = this.f66875E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f66940y == typeface) {
            return false;
        }
        this.f66940y = typeface;
        Typeface b10 = h.b(this.f66897a.getContext().getResources().getConfiguration(), typeface);
        this.f66939x = b10;
        if (b10 == null) {
            b10 = this.f66940y;
        }
        this.f66938w = b10;
        return true;
    }

    private void Y(float f10) {
        this.f66924n0 = f10;
        C4600b0.f0(this.f66897a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((((float) Color.alpha(i10)) * f11) + (((float) Color.alpha(i11)) * f10)), Math.round((((float) Color.red(i10)) * f11) + (((float) Color.red(i11)) * f10)), Math.round((((float) Color.green(i10)) * f11) + (((float) Color.green(i11)) * f10)), Math.round((((float) Color.blue(i10)) * f11) + (((float) Color.blue(i11)) * f10)));
    }

    private void b(boolean z10) {
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.f66878H;
        if (!(charSequence == null || (staticLayout = this.f66918k0) == null)) {
            this.f66926o0 = TextUtils.ellipsize(charSequence, this.f66892V, (float) staticLayout.getWidth(), this.f66876F);
        }
        CharSequence charSequence2 = this.f66926o0;
        float f10 = 0.0f;
        if (charSequence2 != null) {
            this.f66920l0 = I(this.f66892V, charSequence2);
        } else {
            this.f66920l0 = 0.0f;
        }
        int b10 = C4632s.b(this.f66917k, this.f66879I ? 1 : 0);
        int i10 = b10 & 112;
        if (i10 == 48) {
            this.f66931r = (float) this.f66911h.top;
        } else if (i10 != 80) {
            this.f66931r = ((float) this.f66911h.centerY()) - ((this.f66892V.descent() - this.f66892V.ascent()) / 2.0f);
        } else {
            this.f66931r = ((float) this.f66911h.bottom) + this.f66892V.ascent();
        }
        int i11 = b10 & 8388615;
        if (i11 == 1) {
            this.f66935t = ((float) this.f66911h.centerX()) - (this.f66920l0 / 2.0f);
        } else if (i11 != 5) {
            this.f66935t = (float) this.f66911h.left;
        } else {
            this.f66935t = ((float) this.f66911h.right) - this.f66920l0;
        }
        i(0.0f, z10);
        StaticLayout staticLayout2 = this.f66918k0;
        float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f66918k0;
        if (staticLayout3 == null || this.f66928p0 <= 1) {
            CharSequence charSequence3 = this.f66878H;
            if (charSequence3 != null) {
                f10 = I(this.f66892V, charSequence3);
            }
        } else {
            f10 = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f66918k0;
        this.f66927p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int b11 = C4632s.b(this.f66915j, this.f66879I ? 1 : 0);
        int i12 = b11 & 112;
        if (i12 == 48) {
            this.f66929q = (float) this.f66909g.top;
        } else if (i12 != 80) {
            this.f66929q = ((float) this.f66909g.centerY()) - (height / 2.0f);
        } else {
            this.f66929q = (((float) this.f66909g.bottom) - height) + this.f66892V.descent();
        }
        int i13 = b11 & 8388615;
        if (i13 == 1) {
            this.f66933s = ((float) this.f66909g.centerX()) - (f10 / 2.0f);
        } else if (i13 != 5) {
            this.f66933s = (float) this.f66909g.left;
        } else {
            this.f66933s = ((float) this.f66909g.right) - f10;
        }
        j();
        d0(this.f66899b);
    }

    private boolean b0(Typeface typeface) {
        C9268a aVar = this.f66874D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f66872B == typeface) {
            return false;
        }
        this.f66872B = typeface;
        Typeface b10 = h.b(this.f66897a.getContext().getResources().getConfiguration(), typeface);
        this.f66871A = b10;
        if (b10 == null) {
            b10 = this.f66872B;
        }
        this.f66941z = b10;
        return true;
    }

    private void c() {
        g(this.f66899b);
    }

    private float d(float f10) {
        float f11 = this.f66905e;
        return f10 <= f11 ? C9081a.b(1.0f, 0.0f, this.f66903d, f11, f10) : C9081a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private void d0(float f10) {
        h(f10);
        boolean z10 = f66869t0 && this.f66884N != 1.0f;
        this.f66881K = z10;
        if (z10) {
            n();
        }
        C4600b0.f0(this.f66897a);
    }

    private float e() {
        float f10 = this.f66903d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean D10 = D();
        return this.f66880J ? F(charSequence, D10) : D10;
    }

    private void g(float f10) {
        float f11;
        B(f10);
        if (!this.f66901c) {
            this.f66936u = G(this.f66933s, this.f66935t, f10, this.f66894X);
            this.f66937v = G(this.f66929q, this.f66931r, f10, this.f66894X);
            d0(f10);
            f11 = f10;
        } else if (f10 < this.f66905e) {
            this.f66936u = this.f66933s;
            this.f66937v = this.f66929q;
            d0(0.0f);
            f11 = 0.0f;
        } else {
            this.f66936u = this.f66935t;
            this.f66937v = this.f66931r - ((float) Math.max(0, this.f66907f));
            d0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C9081a.f60372b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f66925o != this.f66923n) {
            this.f66892V.setColor(a(v(), t(), f11));
        } else {
            this.f66892V.setColor(t());
        }
        int i10 = Build.VERSION.SDK_INT;
        float f12 = this.f66912h0;
        float f13 = this.f66914i0;
        if (f12 != f13) {
            this.f66892V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.f66892V.setLetterSpacing(f12);
        }
        this.f66886P = G(this.f66904d0, this.f66896Z, f10, (TimeInterpolator) null);
        this.f66887Q = G(this.f66906e0, this.f66898a0, f10, (TimeInterpolator) null);
        this.f66888R = G(this.f66908f0, this.f66900b0, f10, (TimeInterpolator) null);
        int a10 = a(u(this.f66910g0), u(this.f66902c0), f10);
        this.f66889S = a10;
        this.f66892V.setShadowLayer(this.f66886P, this.f66887Q, this.f66888R, a10);
        if (this.f66901c) {
            this.f66892V.setAlpha((int) (d(f10) * ((float) this.f66892V.getAlpha())));
            if (i10 >= 31) {
                TextPaint textPaint = this.f66892V;
                textPaint.setShadowLayer(this.f66886P, this.f66887Q, this.f66888R, C9138a.a(this.f66889S, textPaint.getAlpha()));
            }
        }
        C4600b0.f0(this.f66897a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.f66877G != null) {
            float width = (float) this.f66911h.width();
            float width2 = (float) this.f66909g.width();
            if (C(f10, 1.0f)) {
                f12 = this.f66921m;
                f11 = this.f66912h0;
                this.f66884N = 1.0f;
                typeface = this.f66938w;
            } else {
                float f13 = this.f66919l;
                float f14 = this.f66914i0;
                Typeface typeface2 = this.f66941z;
                if (C(f10, 0.0f)) {
                    this.f66884N = 1.0f;
                } else {
                    this.f66884N = G(this.f66919l, this.f66921m, f10, this.f66895Y) / this.f66919l;
                }
                float f15 = this.f66921m / this.f66919l;
                width = (z10 || this.f66901c || width2 * f15 <= width) ? width2 : Math.min(width / f15, width2);
                f12 = f13;
                f11 = f14;
                typeface = typeface2;
            }
            int i10 = 1;
            boolean z11 = false;
            if (width > 0.0f) {
                boolean z12 = this.f66885O != f12;
                boolean z13 = this.f66916j0 != f11;
                boolean z14 = this.f66873C != typeface;
                StaticLayout staticLayout = this.f66918k0;
                boolean z15 = z12 || z13 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.f66891U;
                this.f66885O = f12;
                this.f66916j0 = f11;
                this.f66873C = typeface;
                this.f66891U = false;
                TextPaint textPaint = this.f66892V;
                if (this.f66884N != 1.0f) {
                    z11 = true;
                }
                textPaint.setLinearText(z11);
                z11 = z15;
            }
            if (this.f66878H == null || z11) {
                this.f66892V.setTextSize(this.f66885O);
                this.f66892V.setTypeface(this.f66873C);
                this.f66892V.setLetterSpacing(this.f66916j0);
                this.f66879I = f(this.f66877G);
                if (j0()) {
                    i10 = this.f66928p0;
                }
                StaticLayout k10 = k(i10, width, this.f66879I);
                this.f66918k0 = k10;
                this.f66878H = k10.getText();
            }
        }
    }

    private void j() {
        Bitmap bitmap = this.f66882L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f66882L = null;
        }
    }

    private boolean j0() {
        return this.f66928p0 > 1 && (!this.f66879I || this.f66901c) && !this.f66881K;
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        return (StaticLayout) i.g(o.b(this.f66877G, this.f66892V, (int) f10).d(this.f66876F).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i10).h(this.f66930q0, this.f66932r0).e(this.f66934s0).j((p) null).a());
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.f66892V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f66901c) {
            this.f66892V.setAlpha((int) (this.f66924n0 * ((float) alpha)));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f66892V;
                textPaint.setShadowLayer(this.f66886P, this.f66887Q, this.f66888R, C9138a.a(this.f66889S, textPaint.getAlpha()));
            }
            Canvas canvas2 = canvas;
            this.f66918k0.draw(canvas);
        } else {
            Canvas canvas3 = canvas;
        }
        if (!this.f66901c) {
            this.f66892V.setAlpha((int) (this.f66922m0 * ((float) alpha)));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f66892V;
            textPaint2.setShadowLayer(this.f66886P, this.f66887Q, this.f66888R, C9138a.a(this.f66889S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f66918k0.getLineBaseline(0);
        CharSequence charSequence = this.f66926o0;
        float f12 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.f66892V);
        if (i10 >= 31) {
            this.f66892V.setShadowLayer(this.f66886P, this.f66887Q, this.f66888R, this.f66889S);
        }
        if (!this.f66901c) {
            String trim = this.f66926o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f66892V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f66918k0.getLineEnd(0), str.length()), 0.0f, f12, this.f66892V);
        }
    }

    private void n() {
        if (this.f66882L == null && !this.f66909g.isEmpty() && !TextUtils.isEmpty(this.f66878H)) {
            g(0.0f);
            int width = this.f66918k0.getWidth();
            int height = this.f66918k0.getHeight();
            if (width > 0 && height > 0) {
                this.f66882L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f66918k0.draw(new Canvas(this.f66882L));
                if (this.f66883M == null) {
                    this.f66883M = new Paint(3);
                }
            }
        }
    }

    private float r(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (((float) i10) / 2.0f) - (this.f66920l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f66879I ? (float) this.f66911h.left : ((float) this.f66911h.right) - this.f66920l0 : this.f66879I ? ((float) this.f66911h.right) - this.f66920l0 : (float) this.f66911h.left;
    }

    private float s(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (((float) i10) / 2.0f) + (this.f66920l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f66879I ? rectF.left + this.f66920l0 : (float) this.f66911h.right : this.f66879I ? (float) this.f66911h.right : rectF.left + this.f66920l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f66890T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f66923n);
    }

    private Layout.Alignment y() {
        int b10 = C4632s.b(this.f66915j, this.f66879I ? 1 : 0) & 7;
        return b10 != 1 ? b10 != 5 ? this.f66879I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f66879I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f66921m);
        textPaint.setTypeface(this.f66938w);
        textPaint.setLetterSpacing(this.f66912h0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f66923n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f66925o
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f66923n
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.b.E():boolean");
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f66940y;
            if (typeface != null) {
                this.f66939x = h.b(configuration, typeface);
            }
            Typeface typeface2 = this.f66872B;
            if (typeface2 != null) {
                this.f66871A = h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f66939x;
            if (typeface3 == null) {
                typeface3 = this.f66940y;
            }
            this.f66938w = typeface3;
            Typeface typeface4 = this.f66871A;
            if (typeface4 == null) {
                typeface4 = this.f66872B;
            }
            this.f66941z = typeface4;
            K(true);
        }
    }

    public void J() {
        K(false);
    }

    public void K(boolean z10) {
        if ((this.f66897a.getHeight() > 0 && this.f66897a.getWidth() > 0) || z10) {
            b(z10);
            c();
        }
    }

    public void M(ColorStateList colorStateList) {
        if (this.f66925o != colorStateList || this.f66923n != colorStateList) {
            this.f66925o = colorStateList;
            this.f66923n = colorStateList;
            J();
        }
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (!L(this.f66911h, i10, i11, i12, i13)) {
            this.f66911h.set(i10, i11, i12, i13);
            this.f66891U = true;
        }
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        d dVar = new d(this.f66897a.getContext(), i10);
        if (dVar.i() != null) {
            this.f66925o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f66921m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f63148c;
        if (colorStateList != null) {
            this.f66902c0 = colorStateList;
        }
        this.f66898a0 = dVar.f63153h;
        this.f66900b0 = dVar.f63154i;
        this.f66896Z = dVar.f63155j;
        this.f66912h0 = dVar.f63157l;
        C9268a aVar = this.f66875E;
        if (aVar != null) {
            aVar.c();
        }
        this.f66875E = new C9268a(new a(), dVar.e());
        dVar.g(this.f66897a.getContext(), this.f66875E);
        J();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f66925o != colorStateList) {
            this.f66925o = colorStateList;
            J();
        }
    }

    public void S(int i10) {
        if (this.f66917k != i10) {
            this.f66917k = i10;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (!L(this.f66909g, i10, i11, i12, i13)) {
            this.f66909g.set(i10, i11, i12, i13);
            this.f66891U = true;
        }
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f66914i0 != f10) {
            this.f66914i0 = f10;
            J();
        }
    }

    public void Z(int i10) {
        if (this.f66915j != i10) {
            this.f66915j = i10;
            J();
        }
    }

    public void a0(float f10) {
        if (this.f66919l != f10) {
            this.f66919l = f10;
            J();
        }
    }

    public void c0(float f10) {
        float b10 = B2.a.b(f10, 0.0f, 1.0f);
        if (b10 != this.f66899b) {
            this.f66899b = b10;
            c();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.f66894X = timeInterpolator;
        J();
    }

    public final boolean f0(int[] iArr) {
        this.f66890T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f66877G, charSequence)) {
            this.f66877G = charSequence;
            this.f66878H = null;
            j();
            J();
        }
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.f66895Y = timeInterpolator;
        J();
    }

    public void i0(Typeface typeface) {
        boolean U10 = U(typeface);
        boolean b02 = b0(typeface);
        if (U10 || b02) {
            J();
        }
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        if (this.f66878H != null && this.f66913i.width() > 0.0f && this.f66913i.height() > 0.0f) {
            this.f66892V.setTextSize(this.f66885O);
            float f10 = this.f66936u;
            float f11 = this.f66937v;
            boolean z10 = this.f66881K && this.f66882L != null;
            float f12 = this.f66884N;
            if (f12 != 1.0f && !this.f66901c) {
                canvas.scale(f12, f12, f10, f11);
            }
            if (z10) {
                canvas.drawBitmap(this.f66882L, f10, f11, this.f66883M);
                canvas.restoreToCount(save);
                return;
            }
            if (!j0() || (this.f66901c && this.f66899b <= this.f66905e)) {
                canvas.translate(f10, f11);
                this.f66918k0.draw(canvas);
            } else {
                m(canvas, this.f66936u - ((float) this.f66918k0.getLineStart(0)), f11);
            }
            canvas.restoreToCount(save);
        }
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f66879I = f(this.f66877G);
        rectF.left = Math.max(r(i10, i11), (float) this.f66911h.left);
        rectF.top = (float) this.f66911h.top;
        rectF.right = Math.min(s(rectF, i10, i11), (float) this.f66911h.right);
        rectF.bottom = ((float) this.f66911h.top) + q();
    }

    public ColorStateList p() {
        return this.f66925o;
    }

    public float q() {
        z(this.f66893W);
        return -this.f66893W.ascent();
    }

    public int t() {
        return u(this.f66925o);
    }

    public float w() {
        A(this.f66893W);
        return -this.f66893W.ascent();
    }

    public float x() {
        return this.f66899b;
    }
}
