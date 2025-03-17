package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.D;
import i.C5421a;
import i.C5423c;
import i.C5424d;
import i.C5425e;
import j.C5443a;
import x2.C6244c;

/* renamed from: androidx.appcompat.widget.e  reason: case insensitive filesystem */
public final class C4993e {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f16509b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static C4993e f16510c;

    /* renamed from: a  reason: collision with root package name */
    private D f16511a;

    /* renamed from: androidx.appcompat.widget.e$a */
    class a implements D.c {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f16512a = {C5425e.f23947R, C5425e.f23945P, C5425e.f23949a};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f16513b = {C5425e.f23963o, C5425e.f23931B, C5425e.f23968t, C5425e.f23964p, C5425e.f23965q, C5425e.f23967s, C5425e.f23966r};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f16514c = {C5425e.f23944O, C5425e.f23946Q, C5425e.f23959k, C5425e.f23940K, C5425e.f23941L, C5425e.f23942M, C5425e.f23943N};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f16515d = {C5425e.f23971w, C5425e.f23957i, C5425e.f23970v};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f16516e = {C5425e.f23939J, C5425e.f23948S};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f16517f = {C5425e.f23951c, C5425e.f23955g, C5425e.f23952d, C5425e.f23956h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = H.c(context, C5421a.f23908w);
            int b10 = H.b(context, C5421a.f23906u);
            return new ColorStateList(new int[][]{H.f16237b, H.f16240e, H.f16238c, H.f16244i}, new int[]{b10, C6244c.k(c10, i10), C6244c.k(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, H.c(context, C5421a.f23905t));
        }

        private ColorStateList j(Context context) {
            return h(context, H.c(context, C5421a.f23906u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList e10 = H.e(context, C5421a.f23911z);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = H.f16237b;
                iArr2[0] = H.b(context, C5421a.f23911z);
                iArr[1] = H.f16241f;
                iArr2[1] = H.c(context, C5421a.f23907v);
                iArr[2] = H.f16244i;
                iArr2[2] = H.c(context, C5421a.f23911z);
            } else {
                int[] iArr3 = H.f16237b;
                iArr[0] = iArr3;
                iArr2[0] = e10.getColorForState(iArr3, 0);
                iArr[1] = H.f16241f;
                iArr2[1] = H.c(context, C5421a.f23907v);
                iArr[2] = H.f16244i;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(D d10, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable i11 = d10.i(context, C5425e.f23935F);
            Drawable i12 = d10.i(context, C5425e.f23936G);
            if ((i11 instanceof BitmapDrawable) && i11.getIntrinsicWidth() == dimensionPixelSize && i11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) i11;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i11.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((i12 instanceof BitmapDrawable) && i12.getIntrinsicWidth() == dimensionPixelSize && i12.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i12;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i12.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i12.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C4993e.f16509b;
            }
            mutate.setColorFilter(C4993e.e(i10, mode));
        }

        public Drawable a(D d10, Context context, int i10) {
            if (i10 == C5425e.f23958j) {
                return new LayerDrawable(new Drawable[]{d10.i(context, C5425e.f23957i), d10.i(context, C5425e.f23959k)});
            }
            if (i10 == C5425e.f23973y) {
                return l(d10, context, C5424d.f23927g);
            }
            if (i10 == C5425e.f23972x) {
                return l(d10, context, C5424d.f23928h);
            }
            if (i10 == C5425e.f23974z) {
                return l(d10, context, C5424d.f23929i);
            }
            return null;
        }

        public ColorStateList b(Context context, int i10) {
            if (i10 == C5425e.f23961m) {
                return C5443a.a(context, C5423c.f23917e);
            }
            if (i10 == C5425e.f23938I) {
                return C5443a.a(context, C5423c.f23920h);
            }
            if (i10 == C5425e.f23937H) {
                return k(context);
            }
            if (i10 == C5425e.f23954f) {
                return j(context);
            }
            if (i10 == C5425e.f23950b) {
                return g(context);
            }
            if (i10 == C5425e.f23953e) {
                return i(context);
            }
            if (i10 == C5425e.f23933D || i10 == C5425e.f23934E) {
                return C5443a.a(context, C5423c.f23919g);
            }
            if (f(this.f16513b, i10)) {
                return H.e(context, C5421a.f23909x);
            }
            if (f(this.f16516e, i10)) {
                return C5443a.a(context, C5423c.f23916d);
            }
            if (f(this.f16517f, i10)) {
                return C5443a.a(context, C5423c.f23915c);
            }
            if (i10 == C5425e.f23930A) {
                return C5443a.a(context, C5423c.f23918f);
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C4993e.f16509b
                int[] r1 = r7.f16512a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L_0x0015
                int r9 = i.C5421a.f23909x
            L_0x0011:
                r1 = r0
                r5 = r2
            L_0x0013:
                r0 = r4
                goto L_0x004f
            L_0x0015:
                int[] r1 = r7.f16514c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L_0x0020
                int r9 = i.C5421a.f23907v
                goto L_0x0011
            L_0x0020:
                int[] r1 = r7.f16515d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L_0x0032
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L_0x002d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L_0x004f
            L_0x0032:
                int r1 = i.C5425e.f23969u
                if (r9 != r1) goto L_0x0046
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L_0x004f
            L_0x0046:
                int r1 = i.C5425e.f23960l
                if (r9 != r1) goto L_0x004b
                goto L_0x002d
            L_0x004b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L_0x0013
            L_0x004f:
                if (r5 == 0) goto L_0x0066
                android.graphics.drawable.Drawable r10 = r10.mutate()
                int r8 = androidx.appcompat.widget.H.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C4993e.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L_0x0065
                r10.setAlpha(r0)
            L_0x0065:
                return r2
            L_0x0066:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C4993e.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        public PorterDuff.Mode d(int i10) {
            if (i10 == C5425e.f23937H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == C5425e.f23932C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(16908288), H.c(context, C5421a.f23909x), C4993e.f16509b);
                m(layerDrawable.findDrawableByLayerId(16908303), H.c(context, C5421a.f23909x), C4993e.f16509b);
                m(layerDrawable.findDrawableByLayerId(16908301), H.c(context, C5421a.f23907v), C4993e.f16509b);
                return true;
            } else if (i10 != C5425e.f23973y && i10 != C5425e.f23972x && i10 != C5425e.f23974z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), H.b(context, C5421a.f23909x), C4993e.f16509b);
                m(layerDrawable2.findDrawableByLayerId(16908303), H.c(context, C5421a.f23907v), C4993e.f16509b);
                m(layerDrawable2.findDrawableByLayerId(16908301), H.c(context, C5421a.f23907v), C4993e.f16509b);
                return true;
            }
        }
    }

    public static synchronized C4993e b() {
        C4993e eVar;
        synchronized (C4993e.class) {
            try {
                if (f16510c == null) {
                    h();
                }
                eVar = f16510c;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return eVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter k10;
        synchronized (C4993e.class) {
            k10 = D.k(i10, mode);
        }
        return k10;
    }

    public static synchronized void h() {
        synchronized (C4993e.class) {
            if (f16510c == null) {
                C4993e eVar = new C4993e();
                f16510c = eVar;
                eVar.f16511a = D.g();
                f16510c.f16511a.t(new a());
            }
        }
    }

    static void i(Drawable drawable, K k10, int[] iArr) {
        D.v(drawable, k10, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f16511a.i(context, i10);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f16511a.j(context, i10, z10);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i10) {
        return this.f16511a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f16511a.r(context);
    }
}
