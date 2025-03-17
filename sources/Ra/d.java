package Ra;

import Ea.C9078l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import w2.C6214h;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f63146a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f63147b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f63148c;

    /* renamed from: d  reason: collision with root package name */
    public final String f63149d;

    /* renamed from: e  reason: collision with root package name */
    public final int f63150e;

    /* renamed from: f  reason: collision with root package name */
    public final int f63151f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f63152g;

    /* renamed from: h  reason: collision with root package name */
    public final float f63153h;

    /* renamed from: i  reason: collision with root package name */
    public final float f63154i;

    /* renamed from: j  reason: collision with root package name */
    public final float f63155j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f63156k;

    /* renamed from: l  reason: collision with root package name */
    public final float f63157l;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f63158m;

    /* renamed from: n  reason: collision with root package name */
    private float f63159n;

    /* renamed from: o  reason: collision with root package name */
    private final int f63160o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f63161p = false;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public Typeface f63162q;

    class a extends C6214h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f63163a;

        a(f fVar) {
            this.f63163a = fVar;
        }

        public void h(int i10) {
            boolean unused = d.this.f63161p = true;
            this.f63163a.a(i10);
        }

        public void i(Typeface typeface) {
            d dVar = d.this;
            Typeface unused = dVar.f63162q = Typeface.create(typeface, dVar.f63150e);
            boolean unused2 = d.this.f63161p = true;
            this.f63163a.b(d.this.f63162q, false);
        }
    }

    class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f63165a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextPaint f63166b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f63167c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f63165a = context;
            this.f63166b = textPaint;
            this.f63167c = fVar;
        }

        public void a(int i10) {
            this.f63167c.a(i10);
        }

        public void b(Typeface typeface, boolean z10) {
            d.this.p(this.f63165a, this.f63166b, typeface);
            this.f63167c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, C9078l.f59788P7);
        l(obtainStyledAttributes.getDimension(C9078l.f59798Q7, 0.0f));
        k(c.a(context, obtainStyledAttributes, C9078l.f59828T7));
        this.f63146a = c.a(context, obtainStyledAttributes, C9078l.f59838U7);
        this.f63147b = c.a(context, obtainStyledAttributes, C9078l.f59848V7);
        this.f63150e = obtainStyledAttributes.getInt(C9078l.f59818S7, 0);
        this.f63151f = obtainStyledAttributes.getInt(C9078l.f59808R7, 1);
        int f10 = c.f(obtainStyledAttributes, C9078l.f59910b8, C9078l.f59899a8);
        this.f63160o = obtainStyledAttributes.getResourceId(f10, 0);
        this.f63149d = obtainStyledAttributes.getString(f10);
        this.f63152g = obtainStyledAttributes.getBoolean(C9078l.f59921c8, false);
        this.f63148c = c.a(context, obtainStyledAttributes, C9078l.f59858W7);
        this.f63153h = obtainStyledAttributes.getFloat(C9078l.f59868X7, 0.0f);
        this.f63154i = obtainStyledAttributes.getFloat(C9078l.f59878Y7, 0.0f);
        this.f63155j = obtainStyledAttributes.getFloat(C9078l.f59888Z7, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, C9078l.f59805R4);
        this.f63156k = obtainStyledAttributes2.hasValue(C9078l.f59815S4);
        this.f63157l = obtainStyledAttributes2.getFloat(C9078l.f59815S4, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f63162q == null && (str = this.f63149d) != null) {
            this.f63162q = Typeface.create(str, this.f63150e);
        }
        if (this.f63162q == null) {
            int i10 = this.f63151f;
            if (i10 == 1) {
                this.f63162q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f63162q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f63162q = Typeface.DEFAULT;
            } else {
                this.f63162q = Typeface.MONOSPACE;
            }
            this.f63162q = Typeface.create(this.f63162q, this.f63150e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f63160o;
        return (i10 != 0 ? C6214h.c(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f63162q;
    }

    public Typeface f(Context context) {
        if (this.f63161p) {
            return this.f63162q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g10 = C6214h.g(context, this.f63160o);
                this.f63162q = g10;
                if (g10 != null) {
                    this.f63162q = Typeface.create(g10, this.f63150e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f63149d, e10);
            }
        }
        d();
        this.f63161p = true;
        return this.f63162q;
    }

    public void g(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f63160o;
        if (i10 == 0) {
            this.f63161p = true;
        }
        if (this.f63161p) {
            fVar.b(this.f63162q, true);
            return;
        }
        try {
            C6214h.i(context, i10, new a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f63161p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f63149d, e10);
            this.f63161p = true;
            fVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        g(context, new b(context, textPaint, fVar));
    }

    public ColorStateList i() {
        return this.f63158m;
    }

    public float j() {
        return this.f63159n;
    }

    public void k(ColorStateList colorStateList) {
        this.f63158m = colorStateList;
    }

    public void l(float f10) {
        this.f63159n = f10;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f63158m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f63155j;
        float f11 = this.f63153h;
        float f12 = this.f63154i;
        ColorStateList colorStateList2 = this.f63148c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a10 = h.a(context, typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f63150e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f63159n);
        if (this.f63156k) {
            textPaint.setLetterSpacing(this.f63157l);
        }
    }
}
