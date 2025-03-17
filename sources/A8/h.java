package a8;

import a8.C6752b;
import a8.g;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

class h {

    /* renamed from: i  reason: collision with root package name */
    private static HashSet<String> f41785i;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Canvas f41786a;

    /* renamed from: b  reason: collision with root package name */
    private float f41787b;

    /* renamed from: c  reason: collision with root package name */
    private g f41788c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C0737h f41789d;

    /* renamed from: e  reason: collision with root package name */
    private Stack<C0737h> f41790e;

    /* renamed from: f  reason: collision with root package name */
    private Stack<g.J> f41791f;

    /* renamed from: g  reason: collision with root package name */
    private Stack<Matrix> f41792g;

    /* renamed from: h  reason: collision with root package name */
    private C6752b.q f41793h = null;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41794a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f41795b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f41796c;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009e */
        static {
            /*
                a8.g$E$d[] r0 = a8.g.E.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41796c = r0
                r1 = 1
                a8.g$E$d r2 = a8.g.E.d.Miter     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f41796c     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.g$E$d r3 = a8.g.E.d.Round     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f41796c     // Catch:{ NoSuchFieldError -> 0x0028 }
                a8.g$E$d r4 = a8.g.E.d.Bevel     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                a8.g$E$c[] r3 = a8.g.E.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f41795b = r3
                a8.g$E$c r4 = a8.g.E.c.Butt     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f41795b     // Catch:{ NoSuchFieldError -> 0x0043 }
                a8.g$E$c r4 = a8.g.E.c.Round     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f41795b     // Catch:{ NoSuchFieldError -> 0x004d }
                a8.g$E$c r4 = a8.g.E.c.Square     // Catch:{ NoSuchFieldError -> 0x004d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                a8.e$a[] r3 = a8.e.a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f41794a = r3
                a8.e$a r4 = a8.e.a.xMidYMin     // Catch:{ NoSuchFieldError -> 0x005e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r1 = f41794a     // Catch:{ NoSuchFieldError -> 0x0068 }
                a8.e$a r3 = a8.e.a.xMidYMid     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = f41794a     // Catch:{ NoSuchFieldError -> 0x0072 }
                a8.e$a r1 = a8.e.a.xMidYMax     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = f41794a     // Catch:{ NoSuchFieldError -> 0x007d }
                a8.e$a r1 = a8.e.a.xMaxYMin     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = f41794a     // Catch:{ NoSuchFieldError -> 0x0088 }
                a8.e$a r1 = a8.e.a.xMaxYMid     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r0 = f41794a     // Catch:{ NoSuchFieldError -> 0x0093 }
                a8.e$a r1 = a8.e.a.xMaxYMax     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r0 = f41794a     // Catch:{ NoSuchFieldError -> 0x009e }
                a8.e$a r1 = a8.e.a.xMinYMid     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = f41794a     // Catch:{ NoSuchFieldError -> 0x00aa }
                a8.e$a r1 = a8.e.a.xMinYMax     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a8.h.a.<clinit>():void");
        }
    }

    private class b implements g.C6777x {

        /* renamed from: a  reason: collision with root package name */
        private List<c> f41797a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private float f41798b;

        /* renamed from: c  reason: collision with root package name */
        private float f41799c;

        /* renamed from: d  reason: collision with root package name */
        private c f41800d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f41801e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f41802f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f41803g = -1;

        /* renamed from: h  reason: collision with root package name */
        private boolean f41804h;

        b(g.C6776w wVar) {
            if (wVar != null) {
                wVar.h(this);
                if (this.f41804h) {
                    this.f41800d.b(this.f41797a.get(this.f41803g));
                    this.f41797a.set(this.f41803g, this.f41800d);
                    this.f41804h = false;
                }
                c cVar = this.f41800d;
                if (cVar != null) {
                    this.f41797a.add(cVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public List<c> a() {
            return this.f41797a;
        }

        public void b(float f10, float f11) {
            if (this.f41804h) {
                this.f41800d.b(this.f41797a.get(this.f41803g));
                this.f41797a.set(this.f41803g, this.f41800d);
                this.f41804h = false;
            }
            c cVar = this.f41800d;
            if (cVar != null) {
                this.f41797a.add(cVar);
            }
            this.f41798b = f10;
            this.f41799c = f11;
            this.f41800d = new c(f10, f11, 0.0f, 0.0f);
            this.f41803g = this.f41797a.size();
        }

        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f41802f || this.f41801e) {
                this.f41800d.a(f10, f11);
                this.f41797a.add(this.f41800d);
                this.f41801e = false;
            }
            this.f41800d = new c(f14, f15, f14 - f12, f15 - f13);
            this.f41804h = false;
        }

        public void close() {
            this.f41797a.add(this.f41800d);
            d(this.f41798b, this.f41799c);
            this.f41804h = true;
        }

        public void d(float f10, float f11) {
            this.f41800d.a(f10, f11);
            this.f41797a.add(this.f41800d);
            h hVar = h.this;
            c cVar = this.f41800d;
            this.f41800d = new c(f10, f11, f10 - cVar.f41806a, f11 - cVar.f41807b);
            this.f41804h = false;
        }

        public void e(float f10, float f11, float f12, float f13) {
            this.f41800d.a(f10, f11);
            this.f41797a.add(this.f41800d);
            this.f41800d = new c(f12, f13, f12 - f10, f13 - f11);
            this.f41804h = false;
        }

        public void f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f41801e = true;
            this.f41802f = false;
            c cVar = this.f41800d;
            h.h(cVar.f41806a, cVar.f41807b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f41802f = true;
            this.f41804h = false;
        }
    }

    private class c {

        /* renamed from: a  reason: collision with root package name */
        float f41806a;

        /* renamed from: b  reason: collision with root package name */
        float f41807b;

        /* renamed from: c  reason: collision with root package name */
        float f41808c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        float f41809d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        boolean f41810e = false;

        c(float f10, float f11, float f12, float f13) {
            this.f41806a = f10;
            this.f41807b = f11;
            double sqrt = Math.sqrt((double) ((f12 * f12) + (f13 * f13)));
            if (sqrt != 0.0d) {
                this.f41808c = (float) (((double) f12) / sqrt);
                this.f41809d = (float) (((double) f13) / sqrt);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(float f10, float f11) {
            float f12 = f10 - this.f41806a;
            float f13 = f11 - this.f41807b;
            double sqrt = Math.sqrt((double) ((f12 * f12) + (f13 * f13)));
            if (sqrt != 0.0d) {
                f12 = (float) (((double) f12) / sqrt);
                f13 = (float) (((double) f13) / sqrt);
            }
            float f14 = this.f41808c;
            if (f12 == (-f14) && f13 == (-this.f41809d)) {
                this.f41810e = true;
                this.f41808c = -f13;
                this.f41809d = f12;
                return;
            }
            this.f41808c = f14 + f12;
            this.f41809d += f13;
        }

        /* access modifiers changed from: package-private */
        public void b(c cVar) {
            float f10 = cVar.f41808c;
            float f11 = this.f41808c;
            if (f10 == (-f11)) {
                float f12 = cVar.f41809d;
                if (f12 == (-this.f41809d)) {
                    this.f41810e = true;
                    this.f41808c = -f12;
                    this.f41809d = cVar.f41808c;
                    return;
                }
            }
            this.f41808c = f11 + f10;
            this.f41809d += cVar.f41809d;
        }

        public String toString() {
            return "(" + this.f41806a + "," + this.f41807b + " " + this.f41808c + "," + this.f41809d + ")";
        }
    }

    private class d implements g.C6777x {

        /* renamed from: a  reason: collision with root package name */
        Path f41812a = new Path();

        /* renamed from: b  reason: collision with root package name */
        float f41813b;

        /* renamed from: c  reason: collision with root package name */
        float f41814c;

        d(g.C6776w wVar) {
            if (wVar != null) {
                wVar.h(this);
            }
        }

        /* access modifiers changed from: package-private */
        public Path a() {
            return this.f41812a;
        }

        public void b(float f10, float f11) {
            this.f41812a.moveTo(f10, f11);
            this.f41813b = f10;
            this.f41814c = f11;
        }

        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f41812a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f41813b = f14;
            this.f41814c = f15;
        }

        public void close() {
            this.f41812a.close();
        }

        public void d(float f10, float f11) {
            this.f41812a.lineTo(f10, f11);
            this.f41813b = f10;
            this.f41814c = f11;
        }

        public void e(float f10, float f11, float f12, float f13) {
            this.f41812a.quadTo(f10, f11, f12, f13);
            this.f41813b = f12;
            this.f41814c = f13;
        }

        public void f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            h.h(this.f41813b, this.f41814c, f10, f11, f12, z10, z11, f13, f14, this);
            this.f41813b = f13;
            this.f41814c = f14;
        }
    }

    private class e extends f {

        /* renamed from: e  reason: collision with root package name */
        private Path f41816e;

        e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f41816e = path;
        }

        public void b(String str) {
            if (h.this.Y0()) {
                if (h.this.f41789d.f41826b) {
                    h.this.f41786a.drawTextOnPath(str, this.f41816e, this.f41818b, this.f41819c, h.this.f41789d.f41828d);
                }
                if (h.this.f41789d.f41827c) {
                    h.this.f41786a.drawTextOnPath(str, this.f41816e, this.f41818b, this.f41819c, h.this.f41789d.f41829e);
                }
            }
            this.f41818b += h.this.f41789d.f41828d.measureText(str);
        }
    }

    private class f extends j {

        /* renamed from: b  reason: collision with root package name */
        float f41818b;

        /* renamed from: c  reason: collision with root package name */
        float f41819c;

        f(float f10, float f11) {
            super(h.this, (a) null);
            this.f41818b = f10;
            this.f41819c = f11;
        }

        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.f41789d.f41826b) {
                    h.this.f41786a.drawText(str, this.f41818b, this.f41819c, h.this.f41789d.f41828d);
                }
                if (h.this.f41789d.f41827c) {
                    h.this.f41786a.drawText(str, this.f41818b, this.f41819c, h.this.f41789d.f41829e);
                }
            }
            this.f41818b += h.this.f41789d.f41828d.measureText(str);
        }
    }

    private class g extends j {

        /* renamed from: b  reason: collision with root package name */
        float f41821b;

        /* renamed from: c  reason: collision with root package name */
        float f41822c;

        /* renamed from: d  reason: collision with root package name */
        Path f41823d;

        g(float f10, float f11, Path path) {
            super(h.this, (a) null);
            this.f41821b = f10;
            this.f41822c = f11;
            this.f41823d = path;
        }

        public boolean a(g.Y y10) {
            if (!(y10 instanceof g.Z)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        public void b(String str) {
            if (h.this.Y0()) {
                Path path = new Path();
                h.this.f41789d.f41828d.getTextPath(str, 0, str.length(), this.f41821b, this.f41822c, path);
                this.f41823d.addPath(path);
            }
            this.f41821b += h.this.f41789d.f41828d.measureText(str);
        }
    }

    private class i extends j {

        /* renamed from: b  reason: collision with root package name */
        float f41834b;

        /* renamed from: c  reason: collision with root package name */
        float f41835c;

        /* renamed from: d  reason: collision with root package name */
        RectF f41836d = new RectF();

        i(float f10, float f11) {
            super(h.this, (a) null);
            this.f41834b = f10;
            this.f41835c = f11;
        }

        public boolean a(g.Y y10) {
            if (!(y10 instanceof g.Z)) {
                return true;
            }
            g.Z z10 = (g.Z) y10;
            g.N u10 = y10.f41681a.u(z10.f41694o);
            if (u10 == null) {
                h.F("TextPath path reference '%s' not found", z10.f41694o);
                return false;
            }
            g.C6775v vVar = (g.C6775v) u10;
            Path a10 = new d(vVar.f41770o).a();
            Matrix matrix = vVar.f41742n;
            if (matrix != null) {
                a10.transform(matrix);
            }
            RectF rectF = new RectF();
            a10.computeBounds(rectF, true);
            this.f41836d.union(rectF);
            return false;
        }

        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.f41789d.f41828d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f41834b, this.f41835c);
                this.f41836d.union(rectF);
            }
            this.f41834b += h.this.f41789d.f41828d.measureText(str);
        }
    }

    private abstract class j {
        private j() {
        }

        public boolean a(g.Y y10) {
            return true;
        }

        public abstract void b(String str);

        /* synthetic */ j(h hVar, a aVar) {
            this();
        }
    }

    h(Canvas canvas, float f10) {
        this.f41786a = canvas;
        this.f41787b = f10;
    }

    private boolean A() {
        Boolean bool = this.f41789d.f41825a.f41616A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(g.N n10) {
        if (!(n10 instanceof g.C6773t)) {
            S0();
            u(n10);
            if (n10 instanceof g.F) {
                x0((g.F) n10);
            } else if (n10 instanceof g.e0) {
                E0((g.e0) n10);
            } else if (n10 instanceof g.S) {
                B0((g.S) n10);
            } else if (n10 instanceof g.C6766m) {
                q0((g.C6766m) n10);
            } else if (n10 instanceof g.C6768o) {
                r0((g.C6768o) n10);
            } else if (n10 instanceof g.C6775v) {
                t0((g.C6775v) n10);
            } else if (n10 instanceof g.B) {
                w0((g.B) n10);
            } else if (n10 instanceof g.C6758d) {
                o0((g.C6758d) n10);
            } else if (n10 instanceof g.C6762i) {
                p0((g.C6762i) n10);
            } else if (n10 instanceof g.C6770q) {
                s0((g.C6770q) n10);
            } else if (n10 instanceof g.A) {
                v0((g.A) n10);
            } else if (n10 instanceof g.C6779z) {
                u0((g.C6779z) n10);
            } else if (n10 instanceof g.W) {
                D0((g.W) n10);
            }
            R0();
        }
    }

    private void B(g.K k10, Path path) {
        g.O o10 = this.f41789d.f41825a.f41630b;
        if (o10 instanceof g.C6774u) {
            g.N u10 = this.f41788c.u(((g.C6774u) o10).f41768a);
            if (u10 instanceof g.C6778y) {
                L(k10, path, (g.C6778y) u10);
                return;
            }
        }
        this.f41786a.drawPath(path, this.f41789d.f41828d);
    }

    private void B0(g.S s10) {
        y("Switch render", new Object[0]);
        W0(this.f41789d, s10);
        if (A()) {
            Matrix matrix = s10.f41743o;
            if (matrix != null) {
                this.f41786a.concat(matrix);
            }
            p(s10);
            boolean m02 = m0();
            K0(s10);
            if (m02) {
                j0(s10);
            }
            U0(s10);
        }
    }

    private void C(Path path) {
        C0737h hVar = this.f41789d;
        if (hVar.f41825a.f41627L == g.E.i.NonScalingStroke) {
            Matrix matrix = this.f41786a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.f41786a.setMatrix(new Matrix());
            Shader shader = this.f41789d.f41829e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.f41786a.drawPath(path2, this.f41789d.f41829e);
            this.f41786a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.f41786a.drawPath(path, hVar.f41829e);
    }

    private void C0(g.T t10, g.C6756b bVar) {
        y("Symbol render", new Object[0]);
        if (bVar.f41704c != 0.0f && bVar.f41705d != 0.0f) {
            e eVar = t10.f41683o;
            if (eVar == null) {
                eVar = e.f41586e;
            }
            W0(this.f41789d, t10);
            C0737h hVar = this.f41789d;
            hVar.f41830f = bVar;
            if (!hVar.f41825a.f41650v.booleanValue()) {
                g.C6756b bVar2 = this.f41789d.f41830f;
                O0(bVar2.f41702a, bVar2.f41703b, bVar2.f41704c, bVar2.f41705d);
            }
            g.C6756b bVar3 = t10.f41689p;
            if (bVar3 != null) {
                this.f41786a.concat(o(this.f41789d.f41830f, bVar3, eVar));
                this.f41789d.f41831g = t10.f41689p;
            } else {
                Canvas canvas = this.f41786a;
                g.C6756b bVar4 = this.f41789d.f41830f;
                canvas.translate(bVar4.f41702a, bVar4.f41703b);
            }
            boolean m02 = m0();
            F0(t10, true);
            if (m02) {
                j0(t10);
            }
            U0(t10);
        }
    }

    private float D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    private void D0(g.W w10) {
        y("Text render", new Object[0]);
        W0(this.f41789d, w10);
        if (A()) {
            Matrix matrix = w10.f41693s;
            if (matrix != null) {
                this.f41786a.concat(matrix);
            }
            List<g.C6769p> list = w10.f41698o;
            float f10 = 0.0f;
            float e10 = (list == null || list.size() == 0) ? 0.0f : w10.f41698o.get(0).e(this);
            List<g.C6769p> list2 = w10.f41699p;
            float f11 = (list2 == null || list2.size() == 0) ? 0.0f : w10.f41699p.get(0).f(this);
            List<g.C6769p> list3 = w10.f41700q;
            float e11 = (list3 == null || list3.size() == 0) ? 0.0f : w10.f41700q.get(0).e(this);
            List<g.C6769p> list4 = w10.f41701r;
            if (!(list4 == null || list4.size() == 0)) {
                f10 = w10.f41701r.get(0).f(this);
            }
            g.E.f O10 = O();
            if (O10 != g.E.f.Start) {
                float n10 = n(w10);
                if (O10 == g.E.f.Middle) {
                    n10 /= 2.0f;
                }
                e10 -= n10;
            }
            if (w10.f41671h == null) {
                i iVar = new i(e10, f11);
                E(w10, iVar);
                RectF rectF = iVar.f41836d;
                w10.f41671h = new g.C6756b(rectF.left, rectF.top, rectF.width(), iVar.f41836d.height());
            }
            U0(w10);
            r(w10);
            p(w10);
            boolean m02 = m0();
            E(w10, new f(e10 + e11, f11 + f10));
            if (m02) {
                j0(w10);
            }
        }
    }

    private void E(g.Y y10, j jVar) {
        if (A()) {
            Iterator<g.N> it = y10.f41660i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                g.N next = it.next();
                if (next instanceof g.c0) {
                    jVar.b(T0(((g.c0) next).f41710c, z10, !it.hasNext()));
                } else {
                    l0(next, jVar);
                }
                z10 = false;
            }
        }
    }

    private void E0(g.e0 e0Var) {
        y("Use render", new Object[0]);
        g.C6769p pVar = e0Var.f41727s;
        if (pVar == null || !pVar.k()) {
            g.C6769p pVar2 = e0Var.f41728t;
            if (pVar2 == null || !pVar2.k()) {
                W0(this.f41789d, e0Var);
                if (A()) {
                    g.N u10 = e0Var.f41681a.u(e0Var.f41724p);
                    if (u10 == null) {
                        F("Use reference '%s' not found", e0Var.f41724p);
                        return;
                    }
                    Matrix matrix = e0Var.f41743o;
                    if (matrix != null) {
                        this.f41786a.concat(matrix);
                    }
                    g.C6769p pVar3 = e0Var.f41725q;
                    float f10 = 0.0f;
                    float e10 = pVar3 != null ? pVar3.e(this) : 0.0f;
                    g.C6769p pVar4 = e0Var.f41726r;
                    if (pVar4 != null) {
                        f10 = pVar4.f(this);
                    }
                    this.f41786a.translate(e10, f10);
                    p(e0Var);
                    boolean m02 = m0();
                    i0(e0Var);
                    if (u10 instanceof g.F) {
                        g.C6756b f02 = f0((g.C6769p) null, (g.C6769p) null, e0Var.f41727s, e0Var.f41728t);
                        S0();
                        y0((g.F) u10, f02);
                        R0();
                    } else if (u10 instanceof g.T) {
                        g.C6769p pVar5 = e0Var.f41727s;
                        if (pVar5 == null) {
                            pVar5 = new g.C6769p(100.0f, g.d0.percent);
                        }
                        g.C6769p pVar6 = e0Var.f41728t;
                        if (pVar6 == null) {
                            pVar6 = new g.C6769p(100.0f, g.d0.percent);
                        }
                        g.C6756b f03 = f0((g.C6769p) null, (g.C6769p) null, pVar5, pVar6);
                        S0();
                        C0((g.T) u10, f03);
                        R0();
                    } else {
                        A0(u10);
                    }
                    h0();
                    if (m02) {
                        j0(e0Var);
                    }
                    U0(e0Var);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void F0(g.J j10, boolean z10) {
        if (z10) {
            i0(j10);
        }
        for (g.N A02 : j10.e()) {
            A0(A02);
        }
        if (z10) {
            h0();
        }
    }

    private void G(g.Y y10, StringBuilder sb2) {
        Iterator<g.N> it = y10.f41660i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            g.N next = it.next();
            if (next instanceof g.Y) {
                G((g.Y) next, sb2);
            } else if (next instanceof g.c0) {
                sb2.append(T0(((g.c0) next).f41710c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    private void H(g.C6763j jVar, String str) {
        g.N u10 = jVar.f41681a.u(str);
        if (u10 == null) {
            Z0("Gradient reference '%s' not found", str);
        } else if (!(u10 instanceof g.C6763j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (u10 == jVar) {
            F("Circular reference in gradient href attribute '%s'", str);
        } else {
            g.C6763j jVar2 = (g.C6763j) u10;
            if (jVar.f41738i == null) {
                jVar.f41738i = jVar2.f41738i;
            }
            if (jVar.f41739j == null) {
                jVar.f41739j = jVar2.f41739j;
            }
            if (jVar.f41740k == null) {
                jVar.f41740k = jVar2.f41740k;
            }
            if (jVar.f41737h.isEmpty()) {
                jVar.f41737h = jVar2.f41737h;
            }
            try {
                if (jVar instanceof g.M) {
                    I((g.M) jVar, (g.M) u10);
                } else {
                    J((g.Q) jVar, (g.Q) u10);
                }
            } catch (ClassCastException unused) {
            }
            String str2 = jVar2.f41741l;
            if (str2 != null) {
                H(jVar, str2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
        r0 = 0.0f - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        r7 = r8[r7.a().ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        if (r7 == 2) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f4, code lost:
        if (r7 == 3) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        if (r7 == 5) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        if (r7 == 6) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fd, code lost:
        if (r7 == 7) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0101, code lost:
        if (r7 == 8) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0104, code lost:
        r13 = r4 - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0106, code lost:
        r1 = 0.0f - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0108, code lost:
        r13 = (r4 - r13) / 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0116, code lost:
        if (r11.f41789d.f41825a.f41650v.booleanValue() != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        O0(r0, r1, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011b, code lost:
        r3.reset();
        r3.preScale(r6, r5);
        r11.f41786a.concat(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void H0(a8.g.C6771r r12, a8.h.c r13) {
        /*
            r11 = this;
            r11.S0()
            java.lang.Float r0 = r12.f41761v
            r1 = 0
            if (r0 == 0) goto L_0x0033
            float r0 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x002c
            float r0 = r13.f41808c
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x001e
            float r2 = r13.f41809d
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
        L_0x001e:
            float r2 = r13.f41809d
            double r2 = (double) r2
            double r4 = (double) r0
            double r2 = java.lang.Math.atan2(r2, r4)
            double r2 = java.lang.Math.toDegrees(r2)
            float r0 = (float) r2
            goto L_0x0034
        L_0x002c:
            java.lang.Float r0 = r12.f41761v
            float r0 = r0.floatValue()
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            boolean r2 = r12.f41756q
            if (r2 == 0) goto L_0x003b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0047
        L_0x003b:
            a8.h$h r2 = r11.f41789d
            a8.g$E r2 = r2.f41825a
            a8.g$p r2 = r2.f41635g
            float r3 = r11.f41787b
            float r2 = r2.b(r3)
        L_0x0047:
            a8.h$h r3 = r11.M(r12)
            r11.f41789d = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r4 = r13.f41806a
            float r13 = r13.f41807b
            r3.preTranslate(r4, r13)
            r3.preRotate(r0)
            r3.preScale(r2, r2)
            a8.g$p r13 = r12.f41757r
            if (r13 == 0) goto L_0x0068
            float r13 = r13.e(r11)
            goto L_0x0069
        L_0x0068:
            r13 = r1
        L_0x0069:
            a8.g$p r0 = r12.f41758s
            if (r0 == 0) goto L_0x0072
            float r0 = r0.f(r11)
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            a8.g$p r2 = r12.f41759t
            r4 = 1077936128(0x40400000, float:3.0)
            if (r2 == 0) goto L_0x007e
            float r2 = r2.e(r11)
            goto L_0x007f
        L_0x007e:
            r2 = r4
        L_0x007f:
            a8.g$p r5 = r12.f41760u
            if (r5 == 0) goto L_0x0087
            float r4 = r5.f(r11)
        L_0x0087:
            a8.g$b r5 = r12.f41689p
            if (r5 == 0) goto L_0x0127
            float r6 = r5.f41704c
            float r6 = r2 / r6
            float r5 = r5.f41705d
            float r5 = r4 / r5
            a8.e r7 = r12.f41683o
            if (r7 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            a8.e r7 = a8.e.f41586e
        L_0x009a:
            a8.e r8 = a8.e.f41585d
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00b6
            a8.e$b r8 = r7.b()
            a8.e$b r9 = a8.e.b.slice
            if (r8 != r9) goto L_0x00b0
            float r5 = java.lang.Math.max(r6, r5)
        L_0x00ae:
            r6 = r5
            goto L_0x00b5
        L_0x00b0:
            float r5 = java.lang.Math.min(r6, r5)
            goto L_0x00ae
        L_0x00b5:
            r5 = r6
        L_0x00b6:
            float r13 = -r13
            float r13 = r13 * r6
            float r0 = -r0
            float r0 = r0 * r5
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.f41786a
            r13.concat(r3)
            a8.g$b r13 = r12.f41689p
            float r0 = r13.f41704c
            float r0 = r0 * r6
            float r13 = r13.f41705d
            float r13 = r13 * r5
            int[] r8 = a8.h.a.f41794a
            a8.e$a r9 = r7.a()
            int r9 = r9.ordinal()
            r9 = r8[r9]
            r10 = 1073741824(0x40000000, float:2.0)
            switch(r9) {
                case 1: goto L_0x00e2;
                case 2: goto L_0x00e2;
                case 3: goto L_0x00e2;
                case 4: goto L_0x00dd;
                case 5: goto L_0x00dd;
                case 6: goto L_0x00dd;
                default: goto L_0x00db;
            }
        L_0x00db:
            r0 = r1
            goto L_0x00e6
        L_0x00dd:
            float r0 = r2 - r0
        L_0x00df:
            float r0 = r1 - r0
            goto L_0x00e6
        L_0x00e2:
            float r0 = r2 - r0
            float r0 = r0 / r10
            goto L_0x00df
        L_0x00e6:
            a8.e$a r7 = r7.a()
            int r7 = r7.ordinal()
            r7 = r8[r7]
            r8 = 2
            if (r7 == r8) goto L_0x0108
            r8 = 3
            if (r7 == r8) goto L_0x0104
            r8 = 5
            if (r7 == r8) goto L_0x0108
            r8 = 6
            if (r7 == r8) goto L_0x0104
            r8 = 7
            if (r7 == r8) goto L_0x0108
            r8 = 8
            if (r7 == r8) goto L_0x0104
            goto L_0x010c
        L_0x0104:
            float r13 = r4 - r13
        L_0x0106:
            float r1 = r1 - r13
            goto L_0x010c
        L_0x0108:
            float r13 = r4 - r13
            float r13 = r13 / r10
            goto L_0x0106
        L_0x010c:
            a8.h$h r13 = r11.f41789d
            a8.g$E r13 = r13.f41825a
            java.lang.Boolean r13 = r13.f41650v
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x011b
            r11.O0(r0, r1, r2, r4)
        L_0x011b:
            r3.reset()
            r3.preScale(r6, r5)
            android.graphics.Canvas r13 = r11.f41786a
            r13.concat(r3)
            goto L_0x0140
        L_0x0127:
            float r13 = -r13
            float r0 = -r0
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.f41786a
            r13.concat(r3)
            a8.h$h r13 = r11.f41789d
            a8.g$E r13 = r13.f41825a
            java.lang.Boolean r13 = r13.f41650v
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0140
            r11.O0(r1, r1, r2, r4)
        L_0x0140:
            boolean r13 = r11.m0()
            r0 = 0
            r11.F0(r12, r0)
            if (r13 == 0) goto L_0x014d
            r11.j0(r12)
        L_0x014d:
            r11.R0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.H0(a8.g$r, a8.h$c):void");
    }

    private void I(g.M m10, g.M m11) {
        if (m10.f41677m == null) {
            m10.f41677m = m11.f41677m;
        }
        if (m10.f41678n == null) {
            m10.f41678n = m11.f41678n;
        }
        if (m10.f41679o == null) {
            m10.f41679o = m11.f41679o;
        }
        if (m10.f41680p == null) {
            m10.f41680p = m11.f41680p;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void I0(a8.g.C6765l r10) {
        /*
            r9 = this;
            a8.h$h r0 = r9.f41789d
            a8.g$E r0 = r0.f41825a
            java.lang.String r1 = r0.f41652x
            if (r1 != 0) goto L_0x0011
            java.lang.String r2 = r0.f41653y
            if (r2 != 0) goto L_0x0011
            java.lang.String r0 = r0.f41654z
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            java.lang.String r0 = "Marker reference '%s' not found"
            r2 = 0
            if (r1 == 0) goto L_0x002e
            a8.g r3 = r10.f41681a
            a8.g$N r1 = r3.u(r1)
            if (r1 == 0) goto L_0x0021
            a8.g$r r1 = (a8.g.C6771r) r1
            goto L_0x002f
        L_0x0021:
            a8.h$h r1 = r9.f41789d
            a8.g$E r1 = r1.f41825a
            java.lang.String r1 = r1.f41652x
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            F(r0, r1)
        L_0x002e:
            r1 = r2
        L_0x002f:
            a8.h$h r3 = r9.f41789d
            a8.g$E r3 = r3.f41825a
            java.lang.String r3 = r3.f41653y
            if (r3 == 0) goto L_0x004f
            a8.g r4 = r10.f41681a
            a8.g$N r3 = r4.u(r3)
            if (r3 == 0) goto L_0x0042
            a8.g$r r3 = (a8.g.C6771r) r3
            goto L_0x0050
        L_0x0042:
            a8.h$h r3 = r9.f41789d
            a8.g$E r3 = r3.f41825a
            java.lang.String r3 = r3.f41653y
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            F(r0, r3)
        L_0x004f:
            r3 = r2
        L_0x0050:
            a8.h$h r4 = r9.f41789d
            a8.g$E r4 = r4.f41825a
            java.lang.String r4 = r4.f41654z
            if (r4 == 0) goto L_0x0070
            a8.g r5 = r10.f41681a
            a8.g$N r4 = r5.u(r4)
            if (r4 == 0) goto L_0x0063
            a8.g$r r4 = (a8.g.C6771r) r4
            goto L_0x0071
        L_0x0063:
            a8.h$h r4 = r9.f41789d
            a8.g$E r4 = r4.f41825a
            java.lang.String r4 = r4.f41654z
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            F(r0, r4)
        L_0x0070:
            r4 = r2
        L_0x0071:
            boolean r0 = r10 instanceof a8.g.C6775v
            if (r0 == 0) goto L_0x0083
            a8.h$b r0 = new a8.h$b
            a8.g$v r10 = (a8.g.C6775v) r10
            a8.g$w r10 = r10.f41770o
            r0.<init>(r10)
            java.util.List r10 = r0.a()
            goto L_0x0094
        L_0x0083:
            boolean r0 = r10 instanceof a8.g.C6770q
            if (r0 == 0) goto L_0x008e
            a8.g$q r10 = (a8.g.C6770q) r10
            java.util.List r10 = r9.k(r10)
            goto L_0x0094
        L_0x008e:
            a8.g$z r10 = (a8.g.C6779z) r10
            java.util.List r10 = r9.l(r10)
        L_0x0094:
            if (r10 != 0) goto L_0x0097
            return
        L_0x0097:
            int r0 = r10.size()
            if (r0 != 0) goto L_0x009e
            return
        L_0x009e:
            a8.h$h r5 = r9.f41789d
            a8.g$E r5 = r5.f41825a
            r5.f41654z = r2
            r5.f41653y = r2
            r5.f41652x = r2
            r2 = 0
            if (r1 == 0) goto L_0x00b4
            java.lang.Object r5 = r10.get(r2)
            a8.h$c r5 = (a8.h.c) r5
            r9.H0(r1, r5)
        L_0x00b4:
            r1 = 1
            if (r3 == 0) goto L_0x00e6
            int r5 = r10.size()
            r6 = 2
            if (r5 <= r6) goto L_0x00e6
            java.lang.Object r2 = r10.get(r2)
            a8.h$c r2 = (a8.h.c) r2
            java.lang.Object r5 = r10.get(r1)
            a8.h$c r5 = (a8.h.c) r5
            r6 = r1
        L_0x00cb:
            int r7 = r0 + -1
            if (r6 >= r7) goto L_0x00e6
            int r6 = r6 + 1
            java.lang.Object r7 = r10.get(r6)
            a8.h$c r7 = (a8.h.c) r7
            boolean r8 = r5.f41810e
            if (r8 == 0) goto L_0x00e0
            a8.h$c r2 = r9.n0(r2, r5, r7)
            goto L_0x00e1
        L_0x00e0:
            r2 = r5
        L_0x00e1:
            r9.H0(r3, r2)
            r5 = r7
            goto L_0x00cb
        L_0x00e6:
            if (r4 == 0) goto L_0x00f2
            int r0 = r0 - r1
            java.lang.Object r10 = r10.get(r0)
            a8.h$c r10 = (a8.h.c) r10
            r9.H0(r4, r10)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.I0(a8.g$l):void");
    }

    private void J(g.Q q10, g.Q q11) {
        if (q10.f41684m == null) {
            q10.f41684m = q11.f41684m;
        }
        if (q10.f41685n == null) {
            q10.f41685n = q11.f41685n;
        }
        if (q10.f41686o == null) {
            q10.f41686o = q11.f41686o;
        }
        if (q10.f41687p == null) {
            q10.f41687p = q11.f41687p;
        }
        if (q10.f41688q == null) {
            q10.f41688q = q11.f41688q;
        }
    }

    private void J0(g.C6772s sVar, g.K k10, g.C6756b bVar) {
        float f10;
        float f11;
        y("Mask render", new Object[0]);
        Boolean bool = sVar.f41762o;
        if (bool == null || !bool.booleanValue()) {
            g.C6769p pVar = sVar.f41766s;
            float f12 = 1.2f;
            float d10 = pVar != null ? pVar.d(this, 1.0f) : 1.2f;
            g.C6769p pVar2 = sVar.f41767t;
            if (pVar2 != null) {
                f12 = pVar2.d(this, 1.0f);
            }
            f11 = d10 * bVar.f41704c;
            f10 = f12 * bVar.f41705d;
        } else {
            g.C6769p pVar3 = sVar.f41766s;
            f11 = pVar3 != null ? pVar3.e(this) : bVar.f41704c;
            g.C6769p pVar4 = sVar.f41767t;
            f10 = pVar4 != null ? pVar4.f(this) : bVar.f41705d;
        }
        if (f11 != 0.0f && f10 != 0.0f) {
            S0();
            C0737h M10 = M(sVar);
            this.f41789d = M10;
            M10.f41825a.f41641m = Float.valueOf(1.0f);
            boolean m02 = m0();
            this.f41786a.save();
            Boolean bool2 = sVar.f41763p;
            if (bool2 != null && !bool2.booleanValue()) {
                this.f41786a.translate(bVar.f41702a, bVar.f41703b);
                this.f41786a.scale(bVar.f41704c, bVar.f41705d);
            }
            F0(sVar, false);
            this.f41786a.restore();
            if (m02) {
                k0(k10, bVar);
            }
            R0();
        }
    }

    private void K(g.C6778y yVar, String str) {
        g.N u10 = yVar.f41681a.u(str);
        if (u10 == null) {
            Z0("Pattern reference '%s' not found", str);
        } else if (!(u10 instanceof g.C6778y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (u10 == yVar) {
            F("Circular reference in pattern href attribute '%s'", str);
        } else {
            g.C6778y yVar2 = (g.C6778y) u10;
            if (yVar.f41776q == null) {
                yVar.f41776q = yVar2.f41776q;
            }
            if (yVar.f41777r == null) {
                yVar.f41777r = yVar2.f41777r;
            }
            if (yVar.f41778s == null) {
                yVar.f41778s = yVar2.f41778s;
            }
            if (yVar.f41779t == null) {
                yVar.f41779t = yVar2.f41779t;
            }
            if (yVar.f41780u == null) {
                yVar.f41780u = yVar2.f41780u;
            }
            if (yVar.f41781v == null) {
                yVar.f41781v = yVar2.f41781v;
            }
            if (yVar.f41782w == null) {
                yVar.f41782w = yVar2.f41782w;
            }
            if (yVar.f41660i.isEmpty()) {
                yVar.f41660i = yVar2.f41660i;
            }
            if (yVar.f41689p == null) {
                yVar.f41689p = yVar2.f41689p;
            }
            if (yVar.f41683o == null) {
                yVar.f41683o = yVar2.f41683o;
            }
            String str2 = yVar2.f41783x;
            if (str2 != null) {
                K(yVar, str2);
            }
        }
    }

    private void K0(g.S s10) {
        Set<String> b10;
        String language = Locale.getDefault().getLanguage();
        i k10 = g.k();
        for (g.N next : s10.e()) {
            if (next instanceof g.G) {
                g.G g10 = (g.G) next;
                if (g10.c() == null && ((b10 = g10.b()) == null || (!b10.isEmpty() && b10.contains(language)))) {
                    Set<String> h10 = g10.h();
                    if (h10 != null) {
                        if (f41785i == null) {
                            V();
                        }
                        if (h10.isEmpty()) {
                            continue;
                        } else if (!f41785i.containsAll(h10)) {
                            continue;
                        }
                    }
                    Set<String> m10 = g10.m();
                    if (m10 != null) {
                        if (!m10.isEmpty() && k10 != null) {
                            Iterator<String> it = m10.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!k10.a(it.next())) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    Set<String> n10 = g10.n();
                    if (n10 != null) {
                        if (!n10.isEmpty() && k10 != null) {
                            for (String c10 : n10) {
                                if (k10.c(c10, this.f41789d.f41825a.f41645q.intValue(), String.valueOf(this.f41789d.f41825a.f41646r)) == null) {
                                }
                            }
                        }
                    }
                    A0(next);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01f6 A[LOOP:3: B:95:0x01f0->B:97:0x01f6, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void L(a8.g.K r20, android.graphics.Path r21, a8.g.C6778y r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            java.lang.Boolean r5 = r2.f41776q
            if (r5 == 0) goto L_0x0012
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0012
            r5 = 1
            goto L_0x0013
        L_0x0012:
            r5 = 0
        L_0x0013:
            java.lang.String r8 = r2.f41783x
            if (r8 == 0) goto L_0x001a
            r0.K(r2, r8)
        L_0x001a:
            r8 = 0
            if (r5 == 0) goto L_0x0046
            a8.g$p r5 = r2.f41779t
            if (r5 == 0) goto L_0x0026
            float r5 = r5.e(r0)
            goto L_0x0027
        L_0x0026:
            r5 = r8
        L_0x0027:
            a8.g$p r9 = r2.f41780u
            if (r9 == 0) goto L_0x0030
            float r9 = r9.f(r0)
            goto L_0x0031
        L_0x0030:
            r9 = r8
        L_0x0031:
            a8.g$p r10 = r2.f41781v
            if (r10 == 0) goto L_0x003a
            float r10 = r10.e(r0)
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            a8.g$p r11 = r2.f41782w
            if (r11 == 0) goto L_0x0044
            float r11 = r11.f(r0)
            goto L_0x0086
        L_0x0044:
            r11 = r8
            goto L_0x0086
        L_0x0046:
            a8.g$p r5 = r2.f41779t
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x0051
            float r5 = r5.d(r0, r9)
            goto L_0x0052
        L_0x0051:
            r5 = r8
        L_0x0052:
            a8.g$p r10 = r2.f41780u
            if (r10 == 0) goto L_0x005b
            float r10 = r10.d(r0, r9)
            goto L_0x005c
        L_0x005b:
            r10 = r8
        L_0x005c:
            a8.g$p r11 = r2.f41781v
            if (r11 == 0) goto L_0x0065
            float r11 = r11.d(r0, r9)
            goto L_0x0066
        L_0x0065:
            r11 = r8
        L_0x0066:
            a8.g$p r12 = r2.f41782w
            if (r12 == 0) goto L_0x006f
            float r9 = r12.d(r0, r9)
            goto L_0x0070
        L_0x006f:
            r9 = r8
        L_0x0070:
            a8.g$b r12 = r1.f41671h
            float r13 = r12.f41702a
            float r14 = r12.f41704c
            float r5 = r5 * r14
            float r5 = r5 + r13
            float r13 = r12.f41703b
            float r12 = r12.f41705d
            float r10 = r10 * r12
            float r10 = r10 + r13
            float r11 = r11 * r14
            float r9 = r9 * r12
            r18 = r11
            r11 = r9
            r9 = r10
            r10 = r18
        L_0x0086:
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0218
            int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x0090
            goto L_0x0218
        L_0x0090:
            a8.e r12 = r2.f41683o
            if (r12 == 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            a8.e r12 = a8.e.f41586e
        L_0x0097:
            r19.S0()
            android.graphics.Canvas r13 = r0.f41786a
            r14 = r21
            r13.clipPath(r14)
            a8.h$h r13 = new a8.h$h
            r13.<init>()
            a8.g$E r14 = a8.g.E.a()
            r0.V0(r13, r14)
            a8.g$E r14 = r13.f41825a
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r14.f41650v = r15
            a8.h$h r13 = r0.N(r2, r13)
            r0.f41789d = r13
            a8.g$b r13 = r1.f41671h
            android.graphics.Matrix r14 = r2.f41778s
            if (r14 == 0) goto L_0x015d
            android.graphics.Canvas r15 = r0.f41786a
            r15.concat(r14)
            android.graphics.Matrix r14 = new android.graphics.Matrix
            r14.<init>()
            android.graphics.Matrix r15 = r2.f41778s
            boolean r15 = r15.invert(r14)
            if (r15 == 0) goto L_0x015d
            a8.g$b r13 = r1.f41671h
            float r15 = r13.f41702a
            float r8 = r13.f41703b
            float r13 = r13.b()
            a8.g$b r3 = r1.f41671h
            float r4 = r3.f41703b
            float r3 = r3.b()
            a8.g$b r7 = r1.f41671h
            float r7 = r7.c()
            a8.g$b r6 = r1.f41671h
            float r1 = r6.f41702a
            float r6 = r6.c()
            r17 = r12
            r12 = 8
            float[] r12 = new float[r12]
            r16 = 0
            r12[r16] = r15
            r15 = 1
            r12[r15] = r8
            r8 = 2
            r12[r8] = r13
            r8 = 3
            r12[r8] = r4
            r4 = 4
            r12[r4] = r3
            r3 = 5
            r12[r3] = r7
            r3 = 6
            r12[r3] = r1
            r1 = 7
            r12[r1] = r6
            r14.mapPoints(r12)
            android.graphics.RectF r1 = new android.graphics.RectF
            r16 = 0
            r4 = r12[r16]
            r6 = 1
            r7 = r12[r6]
            r1.<init>(r4, r7, r4, r7)
            r8 = 2
        L_0x0120:
            if (r8 > r3) goto L_0x014c
            r4 = r12[r8]
            float r6 = r1.left
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x012c
            r1.left = r4
        L_0x012c:
            float r6 = r1.right
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0134
            r1.right = r4
        L_0x0134:
            r4 = 1
            int r7 = r8 + 1
            r6 = r12[r7]
            float r7 = r1.top
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0141
            r1.top = r6
        L_0x0141:
            float r7 = r1.bottom
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0149
            r1.bottom = r6
        L_0x0149:
            r6 = 2
            int r8 = r8 + r6
            goto L_0x0120
        L_0x014c:
            r4 = 1
            a8.g$b r13 = new a8.g$b
            float r3 = r1.left
            float r6 = r1.top
            float r7 = r1.right
            float r7 = r7 - r3
            float r1 = r1.bottom
            float r1 = r1 - r6
            r13.<init>(r3, r6, r7, r1)
            goto L_0x0162
        L_0x015d:
            r17 = r12
            r4 = 1
            r16 = 0
        L_0x0162:
            float r1 = r13.f41702a
            float r1 = r1 - r5
            float r1 = r1 / r10
            double r6 = (double) r1
            double r6 = java.lang.Math.floor(r6)
            float r1 = (float) r6
            float r1 = r1 * r10
            float r5 = r5 + r1
            float r1 = r13.f41703b
            float r1 = r1 - r9
            float r1 = r1 / r11
            double r6 = (double) r1
            double r6 = java.lang.Math.floor(r6)
            float r1 = (float) r6
            float r1 = r1 * r11
            float r9 = r9 + r1
            float r1 = r13.b()
            float r3 = r13.c()
            a8.g$b r6 = new a8.g$b
            r7 = 0
            r6.<init>(r7, r7, r10, r11)
            boolean r7 = r19.m0()
        L_0x018c:
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0210
            r8 = r5
        L_0x0191:
            int r12 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0208
            r6.f41702a = r8
            r6.f41703b = r9
            r19.S0()
            a8.h$h r12 = r0.f41789d
            a8.g$E r12 = r12.f41825a
            java.lang.Boolean r12 = r12.f41650v
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x01b3
            float r12 = r6.f41702a
            float r13 = r6.f41703b
            float r14 = r6.f41704c
            float r15 = r6.f41705d
            r0.O0(r12, r13, r14, r15)
        L_0x01b3:
            a8.g$b r12 = r2.f41689p
            if (r12 == 0) goto L_0x01c5
            android.graphics.Canvas r13 = r0.f41786a
            r14 = r17
            android.graphics.Matrix r12 = r0.o(r6, r12, r14)
            r13.concat(r12)
        L_0x01c2:
            r13 = r20
            goto L_0x01ea
        L_0x01c5:
            r14 = r17
            java.lang.Boolean r12 = r2.f41777r
            if (r12 == 0) goto L_0x01d5
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x01d2
            goto L_0x01d5
        L_0x01d2:
            r12 = r16
            goto L_0x01d6
        L_0x01d5:
            r12 = r4
        L_0x01d6:
            android.graphics.Canvas r13 = r0.f41786a
            r13.translate(r8, r9)
            if (r12 != 0) goto L_0x01c2
            android.graphics.Canvas r12 = r0.f41786a
            r13 = r20
            a8.g$b r15 = r13.f41671h
            float r4 = r15.f41704c
            float r15 = r15.f41705d
            r12.scale(r4, r15)
        L_0x01ea:
            java.util.List<a8.g$N> r4 = r2.f41660i
            java.util.Iterator r4 = r4.iterator()
        L_0x01f0:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x0200
            java.lang.Object r12 = r4.next()
            a8.g$N r12 = (a8.g.N) r12
            r0.A0(r12)
            goto L_0x01f0
        L_0x0200:
            r19.R0()
            float r8 = r8 + r10
            r17 = r14
            r4 = 1
            goto L_0x0191
        L_0x0208:
            r13 = r20
            r14 = r17
            float r9 = r9 + r11
            r4 = 1
            goto L_0x018c
        L_0x0210:
            if (r7 == 0) goto L_0x0215
            r0.j0(r2)
        L_0x0215:
            r19.R0()
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.L(a8.g$K, android.graphics.Path, a8.g$y):void");
    }

    private void L0(g.Z z10) {
        y("TextPath render", new Object[0]);
        W0(this.f41789d, z10);
        if (A() && Y0()) {
            g.N u10 = z10.f41681a.u(z10.f41694o);
            if (u10 == null) {
                F("TextPath reference '%s' not found", z10.f41694o);
                return;
            }
            g.C6775v vVar = (g.C6775v) u10;
            Path a10 = new d(vVar.f41770o).a();
            Matrix matrix = vVar.f41742n;
            if (matrix != null) {
                a10.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(a10, false);
            g.C6769p pVar = z10.f41695p;
            float d10 = pVar != null ? pVar.d(this, pathMeasure.getLength()) : 0.0f;
            g.E.f O10 = O();
            if (O10 != g.E.f.Start) {
                float n10 = n(z10);
                if (O10 == g.E.f.Middle) {
                    n10 /= 2.0f;
                }
                d10 -= n10;
            }
            r((g.K) z10.f());
            boolean m02 = m0();
            E(z10, new e(a10, d10, 0.0f));
            if (m02) {
                j0(z10);
            }
        }
    }

    private C0737h M(g.N n10) {
        C0737h hVar = new C0737h();
        V0(hVar, g.E.a());
        return N(n10, hVar);
    }

    private boolean M0() {
        return this.f41789d.f41825a.f41641m.floatValue() < 1.0f || this.f41789d.f41825a.f41622G != null;
    }

    private C0737h N(g.N n10, C0737h hVar) {
        ArrayList<g.L> arrayList = new ArrayList<>();
        while (true) {
            if (n10 instanceof g.L) {
                arrayList.add(0, (g.L) n10);
            }
            g.J j10 = n10.f41682b;
            if (j10 == null) {
                break;
            }
            n10 = (g.N) j10;
        }
        for (g.L W02 : arrayList) {
            W0(hVar, W02);
        }
        C0737h hVar2 = this.f41789d;
        hVar.f41831g = hVar2.f41831g;
        hVar.f41830f = hVar2.f41830f;
        return hVar;
    }

    private void N0() {
        this.f41789d = new C0737h();
        this.f41790e = new Stack<>();
        V0(this.f41789d, g.E.a());
        C0737h hVar = this.f41789d;
        hVar.f41830f = null;
        hVar.f41832h = false;
        this.f41790e.push(new C0737h(hVar));
        this.f41792g = new Stack<>();
        this.f41791f = new Stack<>();
    }

    private g.E.f O() {
        g.E.f fVar;
        g.E e10 = this.f41789d.f41825a;
        if (e10.f41648t == g.E.h.LTR || (fVar = e10.f41649u) == g.E.f.Middle) {
            return e10.f41649u;
        }
        g.E.f fVar2 = g.E.f.Start;
        return fVar == fVar2 ? g.E.f.End : fVar2;
    }

    private void O0(float f10, float f11, float f12, float f13) {
        float f14 = f12 + f10;
        float f15 = f13 + f11;
        g.C6757c cVar = this.f41789d.f41825a.f41651w;
        if (cVar != null) {
            f10 += cVar.f41709d.e(this);
            f11 += this.f41789d.f41825a.f41651w.f41706a.f(this);
            f14 -= this.f41789d.f41825a.f41651w.f41707b.e(this);
            f15 -= this.f41789d.f41825a.f41651w.f41708c.f(this);
        }
        this.f41786a.clipRect(f10, f11, f14, f15);
    }

    private Path.FillType P() {
        g.E.a aVar = this.f41789d.f41825a.f41621F;
        return (aVar == null || aVar != g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(C0737h hVar, boolean z10, g.O o10) {
        int i10;
        g.E e10 = hVar.f41825a;
        float floatValue = (z10 ? e10.f41632d : e10.f41634f).floatValue();
        if (o10 instanceof g.C6760f) {
            i10 = ((g.C6760f) o10).f41731a;
        } else if (o10 instanceof g.C0736g) {
            i10 = hVar.f41825a.f41642n.f41731a;
        } else {
            return;
        }
        int x10 = x(i10, floatValue);
        if (z10) {
            hVar.f41828d.setColor(x10);
        } else {
            hVar.f41829e.setColor(x10);
        }
    }

    private void Q0(boolean z10, g.C c10) {
        boolean z11 = false;
        if (z10) {
            if (W(c10.f41674e, 2147483648L)) {
                C0737h hVar = this.f41789d;
                g.E e10 = hVar.f41825a;
                g.O o10 = c10.f41674e.f41623H;
                e10.f41630b = o10;
                if (o10 != null) {
                    z11 = true;
                }
                hVar.f41826b = z11;
            }
            if (W(c10.f41674e, 4294967296L)) {
                this.f41789d.f41825a.f41632d = c10.f41674e.f41624I;
            }
            if (W(c10.f41674e, 6442450944L)) {
                C0737h hVar2 = this.f41789d;
                P0(hVar2, z10, hVar2.f41825a.f41630b);
                return;
            }
            return;
        }
        if (W(c10.f41674e, 2147483648L)) {
            C0737h hVar3 = this.f41789d;
            g.E e11 = hVar3.f41825a;
            g.O o11 = c10.f41674e.f41623H;
            e11.f41633e = o11;
            if (o11 != null) {
                z11 = true;
            }
            hVar3.f41827c = z11;
        }
        if (W(c10.f41674e, 4294967296L)) {
            this.f41789d.f41825a.f41634f = c10.f41674e.f41624I;
        }
        if (W(c10.f41674e, 6442450944L)) {
            C0737h hVar4 = this.f41789d;
            P0(hVar4, z10, hVar4.f41825a.f41633e);
        }
    }

    private void R0() {
        this.f41786a.restore();
        this.f41789d = this.f41790e.pop();
    }

    private void S0() {
        this.f41786a.save();
        this.f41790e.push(this.f41789d);
        this.f41789d = new C0737h(this.f41789d);
    }

    private String T0(String str, boolean z10, boolean z11) {
        if (this.f41789d.f41832h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z10) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        g.E.a aVar = this.f41789d.f41825a.f41631c;
        return (aVar == null || aVar != g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(g.K k10) {
        if (k10.f41682b != null && k10.f41671h != null) {
            Matrix matrix = new Matrix();
            if (this.f41792g.peek().invert(matrix)) {
                g.C6756b bVar = k10.f41671h;
                float f10 = bVar.f41702a;
                float f11 = bVar.f41703b;
                float b10 = bVar.b();
                g.C6756b bVar2 = k10.f41671h;
                float f12 = bVar2.f41703b;
                float b11 = bVar2.b();
                float c10 = k10.f41671h.c();
                g.C6756b bVar3 = k10.f41671h;
                float[] fArr = {f10, f11, b10, f12, b11, c10, bVar3.f41702a, bVar3.c()};
                matrix.preConcat(this.f41786a.getMatrix());
                matrix.mapPoints(fArr);
                float f13 = fArr[0];
                float f14 = fArr[1];
                RectF rectF = new RectF(f13, f14, f13, f14);
                for (int i10 = 2; i10 <= 6; i10 += 2) {
                    float f15 = fArr[i10];
                    if (f15 < rectF.left) {
                        rectF.left = f15;
                    }
                    if (f15 > rectF.right) {
                        rectF.right = f15;
                    }
                    float f16 = fArr[i10 + 1];
                    if (f16 < rectF.top) {
                        rectF.top = f16;
                    }
                    if (f16 > rectF.bottom) {
                        rectF.bottom = f16;
                    }
                }
                g.K k11 = (g.K) this.f41791f.peek();
                g.C6756b bVar4 = k11.f41671h;
                if (bVar4 == null) {
                    k11.f41671h = g.C6756b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                } else {
                    bVar4.e(g.C6756b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
                }
            }
        }
    }

    private static synchronized void V() {
        synchronized (h.class) {
            HashSet<String> hashSet = new HashSet<>();
            f41785i = hashSet;
            hashSet.add("Structure");
            f41785i.add("BasicStructure");
            f41785i.add("ConditionalProcessing");
            f41785i.add("Image");
            f41785i.add("Style");
            f41785i.add("ViewportAttribute");
            f41785i.add("Shape");
            f41785i.add("BasicText");
            f41785i.add("PaintAttribute");
            f41785i.add("BasicPaintAttribute");
            f41785i.add("OpacityAttribute");
            f41785i.add("BasicGraphicsAttribute");
            f41785i.add("Marker");
            f41785i.add("Gradient");
            f41785i.add("Pattern");
            f41785i.add("Clip");
            f41785i.add("BasicClip");
            f41785i.add("Mask");
            f41785i.add("View");
        }
    }

    private void V0(C0737h hVar, g.E e10) {
        if (W(e10, 4096)) {
            hVar.f41825a.f41642n = e10.f41642n;
        }
        if (W(e10, 2048)) {
            hVar.f41825a.f41641m = e10.f41641m;
        }
        boolean z10 = false;
        if (W(e10, 1)) {
            hVar.f41825a.f41630b = e10.f41630b;
            g.O o10 = e10.f41630b;
            hVar.f41826b = (o10 == null || o10 == g.C6760f.f41730c) ? false : true;
        }
        if (W(e10, 4)) {
            hVar.f41825a.f41632d = e10.f41632d;
        }
        if (W(e10, 6149)) {
            P0(hVar, true, hVar.f41825a.f41630b);
        }
        if (W(e10, 2)) {
            hVar.f41825a.f41631c = e10.f41631c;
        }
        if (W(e10, 8)) {
            hVar.f41825a.f41633e = e10.f41633e;
            g.O o11 = e10.f41633e;
            hVar.f41827c = (o11 == null || o11 == g.C6760f.f41730c) ? false : true;
        }
        if (W(e10, 16)) {
            hVar.f41825a.f41634f = e10.f41634f;
        }
        if (W(e10, 6168)) {
            P0(hVar, false, hVar.f41825a.f41633e);
        }
        if (W(e10, 34359738368L)) {
            hVar.f41825a.f41627L = e10.f41627L;
        }
        if (W(e10, 32)) {
            g.E e11 = hVar.f41825a;
            g.C6769p pVar = e10.f41635g;
            e11.f41635g = pVar;
            hVar.f41829e.setStrokeWidth(pVar.c(this));
        }
        if (W(e10, 64)) {
            hVar.f41825a.f41636h = e10.f41636h;
            int i10 = a.f41795b[e10.f41636h.ordinal()];
            if (i10 == 1) {
                hVar.f41829e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                hVar.f41829e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                hVar.f41829e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e10, 128)) {
            hVar.f41825a.f41637i = e10.f41637i;
            int i11 = a.f41796c[e10.f41637i.ordinal()];
            if (i11 == 1) {
                hVar.f41829e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                hVar.f41829e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                hVar.f41829e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e10, 256)) {
            hVar.f41825a.f41638j = e10.f41638j;
            hVar.f41829e.setStrokeMiter(e10.f41638j.floatValue());
        }
        if (W(e10, 512)) {
            hVar.f41825a.f41639k = e10.f41639k;
        }
        if (W(e10, 1024)) {
            hVar.f41825a.f41640l = e10.f41640l;
        }
        Typeface typeface = null;
        if (W(e10, 1536)) {
            g.C6769p[] pVarArr = hVar.f41825a.f41639k;
            if (pVarArr == null) {
                hVar.f41829e.setPathEffect((PathEffect) null);
            } else {
                int length = pVarArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float c10 = hVar.f41825a.f41639k[i13 % length].c(this);
                    fArr[i13] = c10;
                    f10 += c10;
                }
                if (f10 == 0.0f) {
                    hVar.f41829e.setPathEffect((PathEffect) null);
                } else {
                    float c11 = hVar.f41825a.f41640l.c(this);
                    if (c11 < 0.0f) {
                        c11 = (c11 % f10) + f10;
                    }
                    hVar.f41829e.setPathEffect(new DashPathEffect(fArr, c11));
                }
            }
        }
        if (W(e10, 16384)) {
            float Q10 = Q();
            hVar.f41825a.f41644p = e10.f41644p;
            hVar.f41828d.setTextSize(e10.f41644p.d(this, Q10));
            hVar.f41829e.setTextSize(e10.f41644p.d(this, Q10));
        }
        if (W(e10, 8192)) {
            hVar.f41825a.f41643o = e10.f41643o;
        }
        if (W(e10, 32768)) {
            if (e10.f41645q.intValue() == -1 && hVar.f41825a.f41645q.intValue() > 100) {
                g.E e12 = hVar.f41825a;
                e12.f41645q = Integer.valueOf(e12.f41645q.intValue() - 100);
            } else if (e10.f41645q.intValue() != 1 || hVar.f41825a.f41645q.intValue() >= 900) {
                hVar.f41825a.f41645q = e10.f41645q;
            } else {
                g.E e13 = hVar.f41825a;
                e13.f41645q = Integer.valueOf(e13.f41645q.intValue() + 100);
            }
        }
        if (W(e10, 65536)) {
            hVar.f41825a.f41646r = e10.f41646r;
        }
        if (W(e10, 106496)) {
            if (hVar.f41825a.f41643o != null && this.f41788c != null) {
                i k10 = g.k();
                for (String next : hVar.f41825a.f41643o) {
                    g.E e14 = hVar.f41825a;
                    Typeface t10 = t(next, e14.f41645q, e14.f41646r);
                    if (t10 != null || k10 == null) {
                        typeface = t10;
                        continue;
                    } else {
                        typeface = k10.c(next, hVar.f41825a.f41645q.intValue(), String.valueOf(hVar.f41825a.f41646r));
                        continue;
                    }
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                g.E e15 = hVar.f41825a;
                typeface = t("serif", e15.f41645q, e15.f41646r);
            }
            hVar.f41828d.setTypeface(typeface);
            hVar.f41829e.setTypeface(typeface);
        }
        if (W(e10, 131072)) {
            hVar.f41825a.f41647s = e10.f41647s;
            Paint paint = hVar.f41828d;
            g.E.C0735g gVar = e10.f41647s;
            g.E.C0735g gVar2 = g.E.C0735g.LineThrough;
            paint.setStrikeThruText(gVar == gVar2);
            Paint paint2 = hVar.f41828d;
            g.E.C0735g gVar3 = e10.f41647s;
            g.E.C0735g gVar4 = g.E.C0735g.Underline;
            paint2.setUnderlineText(gVar3 == gVar4);
            hVar.f41829e.setStrikeThruText(e10.f41647s == gVar2);
            Paint paint3 = hVar.f41829e;
            if (e10.f41647s == gVar4) {
                z10 = true;
            }
            paint3.setUnderlineText(z10);
        }
        if (W(e10, 68719476736L)) {
            hVar.f41825a.f41648t = e10.f41648t;
        }
        if (W(e10, 262144)) {
            hVar.f41825a.f41649u = e10.f41649u;
        }
        if (W(e10, 524288)) {
            hVar.f41825a.f41650v = e10.f41650v;
        }
        if (W(e10, 2097152)) {
            hVar.f41825a.f41652x = e10.f41652x;
        }
        if (W(e10, 4194304)) {
            hVar.f41825a.f41653y = e10.f41653y;
        }
        if (W(e10, 8388608)) {
            hVar.f41825a.f41654z = e10.f41654z;
        }
        if (W(e10, 16777216)) {
            hVar.f41825a.f41616A = e10.f41616A;
        }
        if (W(e10, 33554432)) {
            hVar.f41825a.f41617B = e10.f41617B;
        }
        if (W(e10, 1048576)) {
            hVar.f41825a.f41651w = e10.f41651w;
        }
        if (W(e10, 268435456)) {
            hVar.f41825a.f41620E = e10.f41620E;
        }
        if (W(e10, 536870912)) {
            hVar.f41825a.f41621F = e10.f41621F;
        }
        if (W(e10, 1073741824)) {
            hVar.f41825a.f41622G = e10.f41622G;
        }
        if (W(e10, 67108864)) {
            hVar.f41825a.f41618C = e10.f41618C;
        }
        if (W(e10, 134217728)) {
            hVar.f41825a.f41619D = e10.f41619D;
        }
        if (W(e10, 8589934592L)) {
            hVar.f41825a.f41625J = e10.f41625J;
        }
        if (W(e10, 17179869184L)) {
            hVar.f41825a.f41626K = e10.f41626K;
        }
        if (W(e10, 137438953472L)) {
            hVar.f41825a.f41628M = e10.f41628M;
        }
    }

    private boolean W(g.E e10, long j10) {
        return (e10.f41629a & j10) != 0;
    }

    private void W0(C0737h hVar, g.L l10) {
        hVar.f41825a.b(l10.f41682b == null);
        g.E e10 = l10.f41674e;
        if (e10 != null) {
            V0(hVar, e10);
        }
        if (this.f41788c.n()) {
            for (C6752b.p next : this.f41788c.d()) {
                if (C6752b.l(this.f41793h, next.f41568a, l10)) {
                    V0(hVar, next.f41569b);
                }
            }
        }
        g.E e11 = l10.f41675f;
        if (e11 != null) {
            V0(hVar, e11);
        }
    }

    private void X(boolean z10, g.C6756b bVar, g.M m10) {
        float f10;
        float f11;
        float f12;
        float f13;
        g.C6756b bVar2 = bVar;
        g.M m11 = m10;
        String str = m11.f41741l;
        if (str != null) {
            H(m11, str);
        }
        Boolean bool = m11.f41738i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0737h hVar = this.f41789d;
        Paint paint = z10 ? hVar.f41828d : hVar.f41829e;
        if (z11) {
            g.C6756b S10 = S();
            g.C6769p pVar = m11.f41677m;
            float e10 = pVar != null ? pVar.e(this) : 0.0f;
            g.C6769p pVar2 = m11.f41678n;
            float f14 = pVar2 != null ? pVar2.f(this) : 0.0f;
            g.C6769p pVar3 = m11.f41679o;
            float e11 = pVar3 != null ? pVar3.e(this) : S10.f41704c;
            g.C6769p pVar4 = m11.f41680p;
            f11 = e11;
            f13 = e10;
            f12 = f14;
            f10 = pVar4 != null ? pVar4.f(this) : 0.0f;
        } else {
            g.C6769p pVar5 = m11.f41677m;
            float d10 = pVar5 != null ? pVar5.d(this, 1.0f) : 0.0f;
            g.C6769p pVar6 = m11.f41678n;
            float d11 = pVar6 != null ? pVar6.d(this, 1.0f) : 0.0f;
            g.C6769p pVar7 = m11.f41679o;
            float d12 = pVar7 != null ? pVar7.d(this, 1.0f) : 1.0f;
            g.C6769p pVar8 = m11.f41680p;
            f13 = d10;
            f10 = pVar8 != null ? pVar8.d(this, 1.0f) : 0.0f;
            f12 = d11;
            f11 = d12;
        }
        S0();
        this.f41789d = M(m11);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar2.f41702a, bVar2.f41703b);
            matrix.preScale(bVar2.f41704c, bVar2.f41705d);
        }
        Matrix matrix2 = m11.f41739j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m11.f41737h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f41789d.f41826b = false;
            } else {
                this.f41789d.f41827c = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator<g.N> it = m11.f41737h.iterator();
            float f15 = -1.0f;
            while (it.hasNext()) {
                g.D d13 = (g.D) it.next();
                Float f16 = d13.f41615h;
                float floatValue = f16 != null ? f16.floatValue() : 0.0f;
                if (i10 == 0 || floatValue >= f15) {
                    fArr[i10] = floatValue;
                    f15 = floatValue;
                } else {
                    fArr[i10] = f15;
                }
                S0();
                W0(this.f41789d, d13);
                g.E e12 = this.f41789d.f41825a;
                g.C6760f fVar = (g.C6760f) e12.f41618C;
                if (fVar == null) {
                    fVar = g.C6760f.f41729b;
                }
                iArr[i10] = x(fVar.f41731a, e12.f41619D.floatValue());
                i10++;
                R0();
            }
            if ((f13 == f11 && f12 == f10) || size == 1) {
                R0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            g.C6764k kVar = m11.f41740k;
            if (kVar != null) {
                if (kVar == g.C6764k.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (kVar == g.C6764k.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            R0();
            LinearGradient linearGradient = new LinearGradient(f13, f12, f11, f10, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(w(this.f41789d.f41825a.f41632d.floatValue()));
        }
    }

    private void X0() {
        int i10;
        g.E e10 = this.f41789d.f41825a;
        g.O o10 = e10.f41625J;
        if (o10 instanceof g.C6760f) {
            i10 = ((g.C6760f) o10).f41731a;
        } else if (o10 instanceof g.C0736g) {
            i10 = e10.f41642n.f41731a;
        } else {
            return;
        }
        Float f10 = e10.f41626K;
        if (f10 != null) {
            i10 = x(i10, f10.floatValue());
        }
        this.f41786a.drawColor(i10);
    }

    private Path Y(g.C6758d dVar) {
        g.C6758d dVar2 = dVar;
        g.C6769p pVar = dVar2.f41712o;
        float f10 = 0.0f;
        float e10 = pVar != null ? pVar.e(this) : 0.0f;
        g.C6769p pVar2 = dVar2.f41713p;
        if (pVar2 != null) {
            f10 = pVar2.f(this);
        }
        float c10 = dVar2.f41714q.c(this);
        float f11 = e10 - c10;
        float f12 = f10 - c10;
        float f13 = e10 + c10;
        float f14 = f10 + c10;
        if (dVar2.f41671h == null) {
            float f15 = 2.0f * c10;
            dVar2.f41671h = new g.C6756b(f11, f12, f15, f15);
        }
        float f16 = 0.5522848f * c10;
        Path path = new Path();
        path.moveTo(e10, f12);
        float f17 = e10 + f16;
        float f18 = f10 - f16;
        Path path2 = path;
        path2.cubicTo(f17, f12, f13, f18, f13, f10);
        float f19 = f10 + f16;
        path2.cubicTo(f13, f19, f17, f14, e10, f14);
        float f20 = e10 - f16;
        path2.cubicTo(f20, f14, f11, f19, f11, f10);
        path2.cubicTo(f11, f18, f20, f12, e10, f12);
        path.close();
        return path;
    }

    /* access modifiers changed from: private */
    public boolean Y0() {
        Boolean bool = this.f41789d.f41825a.f41617B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(g.C6762i iVar) {
        g.C6762i iVar2 = iVar;
        g.C6769p pVar = iVar2.f41733o;
        float f10 = 0.0f;
        float e10 = pVar != null ? pVar.e(this) : 0.0f;
        g.C6769p pVar2 = iVar2.f41734p;
        if (pVar2 != null) {
            f10 = pVar2.f(this);
        }
        float e11 = iVar2.f41735q.e(this);
        float f11 = iVar2.f41736r.f(this);
        float f12 = e10 - e11;
        float f13 = f10 - f11;
        float f14 = e10 + e11;
        float f15 = f10 + f11;
        if (iVar2.f41671h == null) {
            iVar2.f41671h = new g.C6756b(f12, f13, e11 * 2.0f, 2.0f * f11);
        }
        float f16 = e11 * 0.5522848f;
        float f17 = 0.5522848f * f11;
        Path path = new Path();
        path.moveTo(e10, f13);
        float f18 = e10 + f16;
        float f19 = f10 - f17;
        Path path2 = path;
        path.cubicTo(f18, f13, f14, f19, f14, f10);
        float f20 = f17 + f10;
        Path path3 = path2;
        path3.cubicTo(f14, f20, f18, f15, e10, f15);
        float f21 = e10 - f16;
        path3.cubicTo(f21, f15, f12, f20, f12, f10);
        path3.cubicTo(f12, f19, f21, f13, e10, f13);
        path2.close();
        return path2;
    }

    /* access modifiers changed from: private */
    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private Path a0(g.C6770q qVar) {
        g.C6769p pVar = qVar.f41752o;
        float f10 = 0.0f;
        float e10 = pVar == null ? 0.0f : pVar.e(this);
        g.C6769p pVar2 = qVar.f41753p;
        float f11 = pVar2 == null ? 0.0f : pVar2.f(this);
        g.C6769p pVar3 = qVar.f41754q;
        float e11 = pVar3 == null ? 0.0f : pVar3.e(this);
        g.C6769p pVar4 = qVar.f41755r;
        if (pVar4 != null) {
            f10 = pVar4.f(this);
        }
        if (qVar.f41671h == null) {
            qVar.f41671h = new g.C6756b(Math.min(e10, e11), Math.min(f11, f10), Math.abs(e11 - e10), Math.abs(f10 - f11));
        }
        Path path = new Path();
        path.moveTo(e10, f11);
        path.lineTo(e11, f10);
        return path;
    }

    private Path b0(g.C6779z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f41784o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = zVar.f41784o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (zVar instanceof g.A) {
            path.close();
        }
        if (zVar.f41671h == null) {
            zVar.f41671h = m(path);
        }
        return path;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Path c0(a8.g.B r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            a8.g$p r2 = r1.f41613s
            r3 = 0
            if (r2 != 0) goto L_0x0010
            a8.g$p r4 = r1.f41614t
            if (r4 != 0) goto L_0x0010
            r2 = r3
        L_0x000e:
            r4 = r2
            goto L_0x002c
        L_0x0010:
            if (r2 != 0) goto L_0x0019
            a8.g$p r2 = r1.f41614t
            float r2 = r2.f(r0)
            goto L_0x000e
        L_0x0019:
            a8.g$p r4 = r1.f41614t
            if (r4 != 0) goto L_0x0022
            float r2 = r2.e(r0)
            goto L_0x000e
        L_0x0022:
            float r2 = r2.e(r0)
            a8.g$p r4 = r1.f41614t
            float r4 = r4.f(r0)
        L_0x002c:
            a8.g$p r5 = r1.f41611q
            float r5 = r5.e(r0)
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r2 = java.lang.Math.min(r2, r5)
            a8.g$p r5 = r1.f41612r
            float r5 = r5.f(r0)
            float r5 = r5 / r6
            float r4 = java.lang.Math.min(r4, r5)
            a8.g$p r5 = r1.f41609o
            if (r5 == 0) goto L_0x004d
            float r5 = r5.e(r0)
            goto L_0x004e
        L_0x004d:
            r5 = r3
        L_0x004e:
            a8.g$p r6 = r1.f41610p
            if (r6 == 0) goto L_0x0058
            float r6 = r6.f(r0)
            r13 = r6
            goto L_0x0059
        L_0x0058:
            r13 = r3
        L_0x0059:
            a8.g$p r6 = r1.f41611q
            float r6 = r6.e(r0)
            a8.g$p r7 = r1.f41612r
            float r7 = r7.f(r0)
            a8.g$b r8 = r1.f41671h
            if (r8 != 0) goto L_0x0070
            a8.g$b r8 = new a8.g$b
            r8.<init>(r5, r13, r6, r7)
            r1.f41671h = r8
        L_0x0070:
            float r15 = r5 + r6
            float r1 = r13 + r7
            android.graphics.Path r14 = new android.graphics.Path
            r14.<init>()
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0081
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0084
        L_0x0081:
            r3 = r14
            goto L_0x00de
        L_0x0084:
            r3 = 1057841801(0x3f0d6289, float:0.5522848)
            float r16 = r2 * r3
            float r3 = r3 * r4
            float r12 = r13 + r4
            r14.moveTo(r5, r12)
            float r17 = r12 - r3
            float r11 = r5 + r2
            float r21 = r11 - r16
            r6 = r14
            r7 = r5
            r8 = r17
            r9 = r21
            r10 = r13
            r24 = r11
            r22 = r12
            r12 = r13
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            float r2 = r15 - r2
            r14.lineTo(r2, r13)
            float r6 = r2 + r16
            r7 = r14
            r8 = r6
            r9 = r13
            r10 = r15
            r11 = r17
            r12 = r15
            r13 = r22
            r7.cubicTo(r8, r9, r10, r11, r12, r13)
            float r12 = r1 - r4
            r14.lineTo(r15, r12)
            float r10 = r12 + r3
            r3 = r14
            r16 = r10
            r17 = r6
            r18 = r1
            r19 = r2
            r20 = r1
            r14.cubicTo(r15, r16, r17, r18, r19, r20)
            r2 = r24
            r3.lineTo(r2, r1)
            r6 = r3
            r7 = r21
            r8 = r1
            r9 = r5
            r11 = r5
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            r3.lineTo(r5, r13)
            goto L_0x00ed
        L_0x00de:
            r3.moveTo(r5, r13)
            r3.lineTo(r15, r13)
            r3.lineTo(r15, r1)
            r3.lineTo(r5, r1)
            r3.lineTo(r5, r13)
        L_0x00ed:
            r3.close()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.c0(a8.g$B):android.graphics.Path");
    }

    private Path d0(g.W w10) {
        List<g.C6769p> list = w10.f41698o;
        float f10 = 0.0f;
        float e10 = (list == null || list.size() == 0) ? 0.0f : w10.f41698o.get(0).e(this);
        List<g.C6769p> list2 = w10.f41699p;
        float f11 = (list2 == null || list2.size() == 0) ? 0.0f : w10.f41699p.get(0).f(this);
        List<g.C6769p> list3 = w10.f41700q;
        float e11 = (list3 == null || list3.size() == 0) ? 0.0f : w10.f41700q.get(0).e(this);
        List<g.C6769p> list4 = w10.f41701r;
        if (!(list4 == null || list4.size() == 0)) {
            f10 = w10.f41701r.get(0).f(this);
        }
        if (this.f41789d.f41825a.f41649u != g.E.f.Start) {
            float n10 = n(w10);
            if (this.f41789d.f41825a.f41649u == g.E.f.Middle) {
                n10 /= 2.0f;
            }
            e10 -= n10;
        }
        if (w10.f41671h == null) {
            i iVar = new i(e10, f11);
            E(w10, iVar);
            RectF rectF = iVar.f41836d;
            w10.f41671h = new g.C6756b(rectF.left, rectF.top, rectF.width(), iVar.f41836d.height());
        }
        Path path = new Path();
        E(w10, new g(e10 + e11, f11 + f10, path));
        return path;
    }

    private void e0(boolean z10, g.C6756b bVar, g.Q q10) {
        float f10;
        float f11;
        float f12;
        g.C6756b bVar2 = bVar;
        g.Q q11 = q10;
        String str = q11.f41741l;
        if (str != null) {
            H(q11, str);
        }
        Boolean bool = q11.f41738i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0737h hVar = this.f41789d;
        Paint paint = z10 ? hVar.f41828d : hVar.f41829e;
        if (z11) {
            g.C6769p pVar = new g.C6769p(50.0f, g.d0.percent);
            g.C6769p pVar2 = q11.f41684m;
            float e10 = pVar2 != null ? pVar2.e(this) : pVar.e(this);
            g.C6769p pVar3 = q11.f41685n;
            float f13 = pVar3 != null ? pVar3.f(this) : pVar.f(this);
            g.C6769p pVar4 = q11.f41686o;
            f10 = pVar4 != null ? pVar4.c(this) : pVar.c(this);
            f12 = e10;
            f11 = f13;
        } else {
            g.C6769p pVar5 = q11.f41684m;
            float f14 = 0.5f;
            float d10 = pVar5 != null ? pVar5.d(this, 1.0f) : 0.5f;
            g.C6769p pVar6 = q11.f41685n;
            float d11 = pVar6 != null ? pVar6.d(this, 1.0f) : 0.5f;
            g.C6769p pVar7 = q11.f41686o;
            if (pVar7 != null) {
                f14 = pVar7.d(this, 1.0f);
            }
            f12 = d10;
            f10 = f14;
            f11 = d11;
        }
        S0();
        this.f41789d = M(q11);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar2.f41702a, bVar2.f41703b);
            matrix.preScale(bVar2.f41704c, bVar2.f41705d);
        }
        Matrix matrix2 = q11.f41739j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q11.f41737h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f41789d.f41826b = false;
            } else {
                this.f41789d.f41827c = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator<g.N> it = q11.f41737h.iterator();
            float f15 = -1.0f;
            while (true) {
                float f16 = 0.0f;
                if (!it.hasNext()) {
                    break;
                }
                g.D d12 = (g.D) it.next();
                Float f17 = d12.f41615h;
                if (f17 != null) {
                    f16 = f17.floatValue();
                }
                if (i10 == 0 || f16 >= f15) {
                    fArr[i10] = f16;
                    f15 = f16;
                } else {
                    fArr[i10] = f15;
                }
                S0();
                W0(this.f41789d, d12);
                g.E e11 = this.f41789d.f41825a;
                g.C6760f fVar = (g.C6760f) e11.f41618C;
                if (fVar == null) {
                    fVar = g.C6760f.f41729b;
                }
                iArr[i10] = x(fVar.f41731a, e11.f41619D.floatValue());
                i10++;
                R0();
            }
            if (f10 == 0.0f || size == 1) {
                R0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            g.C6764k kVar = q11.f41740k;
            if (kVar != null) {
                if (kVar == g.C6764k.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (kVar == g.C6764k.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            R0();
            RadialGradient radialGradient = new RadialGradient(f12, f11, f10, iArr, fArr, tileMode2);
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
            paint.setAlpha(w(this.f41789d.f41825a.f41632d.floatValue()));
        }
    }

    private g.C6756b f0(g.C6769p pVar, g.C6769p pVar2, g.C6769p pVar3, g.C6769p pVar4) {
        float f10 = 0.0f;
        float e10 = pVar != null ? pVar.e(this) : 0.0f;
        if (pVar2 != null) {
            f10 = pVar2.f(this);
        }
        g.C6756b S10 = S();
        return new g.C6756b(e10, f10, pVar3 != null ? pVar3.e(this) : S10.f41704c, pVar4 != null ? pVar4.f(this) : S10.f41705d);
    }

    @TargetApi(19)
    private Path g0(g.K k10, boolean z10) {
        Path path;
        Path j10;
        this.f41790e.push(this.f41789d);
        C0737h hVar = new C0737h(this.f41789d);
        this.f41789d = hVar;
        W0(hVar, k10);
        if (!A() || !Y0()) {
            this.f41789d = this.f41790e.pop();
            return null;
        }
        if (k10 instanceof g.e0) {
            if (!z10) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            g.e0 e0Var = (g.e0) k10;
            g.N u10 = k10.f41681a.u(e0Var.f41724p);
            if (u10 == null) {
                F("Use reference '%s' not found", e0Var.f41724p);
                this.f41789d = this.f41790e.pop();
                return null;
            } else if (!(u10 instanceof g.K)) {
                this.f41789d = this.f41790e.pop();
                return null;
            } else {
                path = g0((g.K) u10, false);
                if (path == null) {
                    return null;
                }
                if (e0Var.f41671h == null) {
                    e0Var.f41671h = m(path);
                }
                Matrix matrix = e0Var.f41743o;
                if (matrix != null) {
                    path.transform(matrix);
                }
            }
        } else if (k10 instanceof g.C6765l) {
            g.C6765l lVar = (g.C6765l) k10;
            if (k10 instanceof g.C6775v) {
                path = new d(((g.C6775v) k10).f41770o).a();
                if (k10.f41671h == null) {
                    k10.f41671h = m(path);
                }
            } else {
                path = k10 instanceof g.B ? c0((g.B) k10) : k10 instanceof g.C6758d ? Y((g.C6758d) k10) : k10 instanceof g.C6762i ? Z((g.C6762i) k10) : k10 instanceof g.C6779z ? b0((g.C6779z) k10) : null;
            }
            if (path == null) {
                return null;
            }
            if (lVar.f41671h == null) {
                lVar.f41671h = m(path);
            }
            Matrix matrix2 = lVar.f41742n;
            if (matrix2 != null) {
                path.transform(matrix2);
            }
            path.setFillType(P());
        } else if (k10 instanceof g.W) {
            g.W w10 = (g.W) k10;
            path = d0(w10);
            if (path == null) {
                return null;
            }
            Matrix matrix3 = w10.f41693s;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            path.setFillType(P());
        } else {
            F("Invalid %s element found in clipPath definition", k10.o());
            return null;
        }
        if (!(this.f41789d.f41825a.f41620E == null || (j10 = j(k10, k10.f41671h)) == null)) {
            path.op(j10, Path.Op.INTERSECT);
        }
        this.f41789d = this.f41790e.pop();
        return path;
    }

    /* access modifiers changed from: private */
    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, g.C6777x xVar) {
        float f17;
        g.C6777x xVar2;
        float f18 = f14;
        boolean z12 = z11;
        float f19 = f15;
        float f20 = f16;
        if (f10 != f19 || f11 != f20) {
            if (f12 == 0.0f) {
                f17 = f19;
                xVar2 = xVar;
            } else if (f13 == 0.0f) {
                xVar2 = xVar;
                f17 = f19;
            } else {
                float abs = Math.abs(f12);
                float abs2 = Math.abs(f13);
                double radians = Math.toRadians(((double) f18) % 360.0d);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d10 = ((double) (f10 - f19)) / 2.0d;
                double d11 = ((double) (f11 - f20)) / 2.0d;
                double d12 = (cos * d10) + (sin * d11);
                double d13 = ((-sin) * d10) + (d11 * cos);
                double d14 = (double) (abs * abs);
                double d15 = (double) (abs2 * abs2);
                double d16 = d12 * d12;
                double d17 = d13 * d13;
                double d18 = (d16 / d14) + (d17 / d15);
                if (d18 > 0.99999d) {
                    double sqrt = Math.sqrt(d18) * 1.00001d;
                    abs = (float) (((double) abs) * sqrt);
                    abs2 = (float) (sqrt * ((double) abs2));
                    d14 = (double) (abs * abs);
                    d15 = (double) (abs2 * abs2);
                }
                double d19 = 1.0d;
                double d20 = z10 == z12 ? -1.0d : 1.0d;
                double d21 = d14 * d15;
                double d22 = d14 * d17;
                double d23 = d15 * d16;
                double d24 = ((d21 - d22) - d23) / (d22 + d23);
                if (d24 < 0.0d) {
                    d24 = 0.0d;
                }
                double sqrt2 = d20 * Math.sqrt(d24);
                double d25 = (double) abs;
                double d26 = (double) abs2;
                double d27 = ((d25 * d13) / d26) * sqrt2;
                float f21 = abs2;
                double d28 = sqrt2 * (-((d26 * d12) / d25));
                float f22 = abs;
                double d29 = (((double) (f10 + f15)) / 2.0d) + ((cos * d27) - (sin * d28));
                double d30 = (((double) (f11 + f16)) / 2.0d) + (sin * d27) + (cos * d28);
                double d31 = (d12 - d27) / d25;
                double d32 = (d13 - d28) / d26;
                double d33 = ((-d12) - d27) / d25;
                double d34 = ((-d13) - d28) / d26;
                double d35 = (d31 * d31) + (d32 * d32);
                double acos = (d32 < 0.0d ? -1.0d : 1.0d) * Math.acos(d31 / Math.sqrt(d35));
                double sqrt3 = Math.sqrt(d35 * ((d33 * d33) + (d34 * d34)));
                double d36 = (d31 * d33) + (d32 * d34);
                if ((d31 * d34) - (d32 * d33) < 0.0d) {
                    d19 = -1.0d;
                }
                double v10 = d19 * v(d36 / sqrt3);
                if (!z11 && v10 > 0.0d) {
                    v10 -= 6.283185307179586d;
                } else if (z11 && v10 < 0.0d) {
                    v10 += 6.283185307179586d;
                }
                float[] i10 = i(acos % 6.283185307179586d, v10 % 6.283185307179586d);
                Matrix matrix = new Matrix();
                matrix.postScale(f22, f21);
                matrix.postRotate(f14);
                matrix.postTranslate((float) d29, (float) d30);
                matrix.mapPoints(i10);
                i10[i10.length - 2] = f15;
                i10[i10.length - 1] = f16;
                for (int i11 = 0; i11 < i10.length; i11 += 6) {
                    xVar.c(i10[i11], i10[i11 + 1], i10[i11 + 2], i10[i11 + 3], i10[i11 + 4], i10[i11 + 5]);
                }
                return;
            }
            xVar2.d(f17, f20);
        }
    }

    private void h0() {
        this.f41791f.pop();
        this.f41792g.pop();
    }

    private static float[] i(double d10, double d11) {
        int ceil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ((double) ceil);
        double d13 = d12 / 2.0d;
        double sin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[(ceil * 6)];
        int i10 = 0;
        int i11 = 0;
        while (i10 < ceil) {
            double d14 = d10 + (((double) i10) * d12);
            double cos = Math.cos(d14);
            double sin2 = Math.sin(d14);
            fArr[i11] = (float) (cos - (sin * sin2));
            fArr[i11 + 1] = (float) (sin2 + (cos * sin));
            double d15 = d12;
            double d16 = d14 + d15;
            double cos2 = Math.cos(d16);
            double sin3 = Math.sin(d16);
            fArr[i11 + 2] = (float) ((sin * sin3) + cos2);
            fArr[i11 + 3] = (float) (sin3 - (sin * cos2));
            int i12 = i11 + 5;
            fArr[i11 + 4] = (float) cos2;
            i11 += 6;
            fArr[i12] = (float) sin3;
            i10++;
            d12 = d15;
        }
        return fArr;
    }

    private void i0(g.J j10) {
        this.f41791f.push(j10);
        this.f41792g.push(this.f41786a.getMatrix());
    }

    @TargetApi(19)
    private Path j(g.K k10, g.C6756b bVar) {
        Path g02;
        g.N u10 = k10.f41681a.u(this.f41789d.f41825a.f41620E);
        if (u10 == null) {
            F("ClipPath reference '%s' not found", this.f41789d.f41825a.f41620E);
            return null;
        }
        g.C6759e eVar = (g.C6759e) u10;
        this.f41790e.push(this.f41789d);
        this.f41789d = M(eVar);
        Boolean bool = eVar.f41723p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(bVar.f41702a, bVar.f41703b);
            matrix.preScale(bVar.f41704c, bVar.f41705d);
        }
        Matrix matrix2 = eVar.f41743o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (g.N next : eVar.f41660i) {
            if ((next instanceof g.K) && (g02 = g0((g.K) next, true)) != null) {
                path.op(g02, Path.Op.UNION);
            }
        }
        if (this.f41789d.f41825a.f41620E != null) {
            if (eVar.f41671h == null) {
                eVar.f41671h = m(path);
            }
            Path j10 = j(eVar, eVar.f41671h);
            if (j10 != null) {
                path.op(j10, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f41789d = this.f41790e.pop();
        return path;
    }

    private void j0(g.K k10) {
        k0(k10, k10.f41671h);
    }

    private List<c> k(g.C6770q qVar) {
        g.C6769p pVar = qVar.f41752o;
        float f10 = 0.0f;
        float e10 = pVar != null ? pVar.e(this) : 0.0f;
        g.C6769p pVar2 = qVar.f41753p;
        float f11 = pVar2 != null ? pVar2.f(this) : 0.0f;
        g.C6769p pVar3 = qVar.f41754q;
        float e11 = pVar3 != null ? pVar3.e(this) : 0.0f;
        g.C6769p pVar4 = qVar.f41755r;
        if (pVar4 != null) {
            f10 = pVar4.f(this);
        }
        float f12 = f10;
        ArrayList arrayList = new ArrayList(2);
        float f13 = e11 - e10;
        float f14 = f12 - f11;
        arrayList.add(new c(e10, f11, f13, f14));
        arrayList.add(new c(e11, f12, f13, f14));
        return arrayList;
    }

    private void k0(g.K k10, g.C6756b bVar) {
        if (this.f41789d.f41825a.f41622G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f41786a.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f41786a.saveLayer((RectF) null, paint2, 31);
            g.C6772s sVar = (g.C6772s) this.f41788c.u(this.f41789d.f41825a.f41622G);
            J0(sVar, k10, bVar);
            this.f41786a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f41786a.saveLayer((RectF) null, paint3, 31);
            J0(sVar, k10, bVar);
            this.f41786a.restore();
            this.f41786a.restore();
        }
        R0();
    }

    private List<c> l(g.C6779z zVar) {
        g.C6779z zVar2 = zVar;
        int length = zVar2.f41784o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = zVar2.f41784o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = zVar2.f41784o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f41806a, f13 - cVar.f41807b);
            float f14 = f12;
            f11 = f13;
            f10 = f14;
        }
        if (zVar2 instanceof g.A) {
            float[] fArr3 = zVar2.f41784o;
            float f15 = fArr3[0];
            if (f10 != f15) {
                float f16 = fArr3[1];
                if (f11 != f16) {
                    cVar.a(f15, f16);
                    arrayList.add(cVar);
                    c cVar2 = new c(f15, f16, f15 - cVar.f41806a, f16 - cVar.f41807b);
                    cVar2.b((c) arrayList.get(0));
                    arrayList.add(cVar2);
                    arrayList.set(0, cVar2);
                }
            }
        } else {
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private void l0(g.N n10, j jVar) {
        float f10;
        float f11;
        float f12;
        g.E.f O10;
        if (jVar.a((g.Y) n10)) {
            if (n10 instanceof g.Z) {
                S0();
                L0((g.Z) n10);
                R0();
            } else if (n10 instanceof g.V) {
                y("TSpan render", new Object[0]);
                S0();
                g.V v10 = (g.V) n10;
                W0(this.f41789d, v10);
                if (A()) {
                    List<g.C6769p> list = v10.f41698o;
                    boolean z10 = list != null && list.size() > 0;
                    boolean z11 = jVar instanceof f;
                    float f13 = 0.0f;
                    if (z11) {
                        float e10 = !z10 ? ((f) jVar).f41818b : v10.f41698o.get(0).e(this);
                        List<g.C6769p> list2 = v10.f41699p;
                        f11 = (list2 == null || list2.size() == 0) ? ((f) jVar).f41819c : v10.f41699p.get(0).f(this);
                        List<g.C6769p> list3 = v10.f41700q;
                        f10 = (list3 == null || list3.size() == 0) ? 0.0f : v10.f41700q.get(0).e(this);
                        List<g.C6769p> list4 = v10.f41701r;
                        if (!(list4 == null || list4.size() == 0)) {
                            f13 = v10.f41701r.get(0).f(this);
                        }
                        f12 = f13;
                        f13 = e10;
                    } else {
                        f12 = 0.0f;
                        f11 = 0.0f;
                        f10 = 0.0f;
                    }
                    if (z10 && (O10 = O()) != g.E.f.Start) {
                        float n11 = n(v10);
                        if (O10 == g.E.f.Middle) {
                            n11 /= 2.0f;
                        }
                        f13 -= n11;
                    }
                    r((g.K) v10.f());
                    if (z11) {
                        f fVar = (f) jVar;
                        fVar.f41818b = f13 + f10;
                        fVar.f41819c = f11 + f12;
                    }
                    boolean m02 = m0();
                    E(v10, jVar);
                    if (m02) {
                        j0(v10);
                    }
                }
                R0();
            } else if (n10 instanceof g.U) {
                S0();
                g.U u10 = (g.U) n10;
                W0(this.f41789d, u10);
                if (A()) {
                    r((g.K) u10.f());
                    g.N u11 = n10.f41681a.u(u10.f41690o);
                    if (u11 == null || !(u11 instanceof g.Y)) {
                        F("Tref reference '%s' not found", u10.f41690o);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        G((g.Y) u11, sb2);
                        if (sb2.length() > 0) {
                            jVar.b(sb2.toString());
                        }
                    }
                }
                R0();
            }
        }
    }

    private g.C6756b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new g.C6756b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        g.N u10;
        if (!M0()) {
            return false;
        }
        this.f41786a.saveLayerAlpha((RectF) null, w(this.f41789d.f41825a.f41641m.floatValue()), 31);
        this.f41790e.push(this.f41789d);
        C0737h hVar = new C0737h(this.f41789d);
        this.f41789d = hVar;
        String str = hVar.f41825a.f41622G;
        if (str != null && ((u10 = this.f41788c.u(str)) == null || !(u10 instanceof g.C6772s))) {
            F("Mask reference '%s' not found", this.f41789d.f41825a.f41622G);
            this.f41789d.f41825a.f41622G = null;
        }
        return true;
    }

    private float n(g.Y y10) {
        k kVar = new k(this, (a) null);
        E(y10, kVar);
        return kVar.f41839b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float D10 = D(cVar2.f41808c, cVar2.f41809d, cVar2.f41806a - cVar.f41806a, cVar2.f41807b - cVar.f41807b);
        if (D10 == 0.0f) {
            D10 = D(cVar2.f41808c, cVar2.f41809d, cVar3.f41806a - cVar2.f41806a, cVar3.f41807b - cVar2.f41807b);
        }
        int i10 = (D10 > 0.0f ? 1 : (D10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            return cVar2;
        }
        if (i10 == 0 && (cVar2.f41808c > 0.0f || cVar2.f41809d >= 0.0f)) {
            return cVar2;
        }
        cVar2.f41808c = -cVar2.f41808c;
        cVar2.f41809d = -cVar2.f41809d;
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        r3 = r3 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r12 != 8) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Matrix o(a8.g.C6756b r10, a8.g.C6756b r11, a8.e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L_0x009d
            a8.e$a r1 = r12.a()
            if (r1 != 0) goto L_0x000f
            goto L_0x009d
        L_0x000f:
            float r1 = r10.f41704c
            float r2 = r11.f41704c
            float r1 = r1 / r2
            float r2 = r10.f41705d
            float r3 = r11.f41705d
            float r2 = r2 / r3
            float r3 = r11.f41702a
            float r3 = -r3
            float r4 = r11.f41703b
            float r4 = -r4
            a8.e r5 = a8.e.f41585d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x0035
            float r11 = r10.f41702a
            float r10 = r10.f41703b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L_0x0035:
            a8.e$b r5 = r12.b()
            a8.e$b r6 = a8.e.b.slice
            if (r5 != r6) goto L_0x0042
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x0046
        L_0x0042:
            float r1 = java.lang.Math.min(r1, r2)
        L_0x0046:
            float r2 = r10.f41704c
            float r2 = r2 / r1
            float r5 = r10.f41705d
            float r5 = r5 / r1
            int[] r6 = a8.h.a.f41794a
            a8.e$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L_0x0063;
                case 2: goto L_0x0063;
                case 3: goto L_0x0063;
                case 4: goto L_0x005e;
                case 5: goto L_0x005e;
                case 6: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0068
        L_0x005e:
            float r7 = r11.f41704c
            float r7 = r7 - r2
        L_0x0061:
            float r3 = r3 - r7
            goto L_0x0068
        L_0x0063:
            float r7 = r11.f41704c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L_0x0061
        L_0x0068:
            a8.e$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L_0x008b
            r2 = 3
            if (r12 == r2) goto L_0x0086
            r2 = 5
            if (r12 == r2) goto L_0x008b
            r2 = 6
            if (r12 == r2) goto L_0x0086
            r2 = 7
            if (r12 == r2) goto L_0x008b
            r2 = 8
            if (r12 == r2) goto L_0x0086
            goto L_0x0090
        L_0x0086:
            float r11 = r11.f41705d
            float r11 = r11 - r5
        L_0x0089:
            float r4 = r4 - r11
            goto L_0x0090
        L_0x008b:
            float r11 = r11.f41705d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L_0x0089
        L_0x0090:
            float r11 = r10.f41702a
            float r10 = r10.f41703b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L_0x009d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.o(a8.g$b, a8.g$b, a8.e):android.graphics.Matrix");
    }

    private void o0(g.C6758d dVar) {
        y("Circle render", new Object[0]);
        g.C6769p pVar = dVar.f41714q;
        if (pVar != null && !pVar.k()) {
            W0(this.f41789d, dVar);
            if (A() && Y0()) {
                Matrix matrix = dVar.f41742n;
                if (matrix != null) {
                    this.f41786a.concat(matrix);
                }
                Path Y10 = Y(dVar);
                U0(dVar);
                r(dVar);
                p(dVar);
                boolean m02 = m0();
                if (this.f41789d.f41826b) {
                    B(dVar, Y10);
                }
                if (this.f41789d.f41827c) {
                    C(Y10);
                }
                if (m02) {
                    j0(dVar);
                }
            }
        }
    }

    private void p(g.K k10) {
        q(k10, k10.f41671h);
    }

    private void p0(g.C6762i iVar) {
        y("Ellipse render", new Object[0]);
        g.C6769p pVar = iVar.f41735q;
        if (pVar != null && iVar.f41736r != null && !pVar.k() && !iVar.f41736r.k()) {
            W0(this.f41789d, iVar);
            if (A() && Y0()) {
                Matrix matrix = iVar.f41742n;
                if (matrix != null) {
                    this.f41786a.concat(matrix);
                }
                Path Z10 = Z(iVar);
                U0(iVar);
                r(iVar);
                p(iVar);
                boolean m02 = m0();
                if (this.f41789d.f41826b) {
                    B(iVar, Z10);
                }
                if (this.f41789d.f41827c) {
                    C(Z10);
                }
                if (m02) {
                    j0(iVar);
                }
            }
        }
    }

    private void q(g.K k10, g.C6756b bVar) {
        Path j10;
        if (this.f41789d.f41825a.f41620E != null && (j10 = j(k10, bVar)) != null) {
            this.f41786a.clipPath(j10);
        }
    }

    private void q0(g.C6766m mVar) {
        y("Group render", new Object[0]);
        W0(this.f41789d, mVar);
        if (A()) {
            Matrix matrix = mVar.f41743o;
            if (matrix != null) {
                this.f41786a.concat(matrix);
            }
            p(mVar);
            boolean m02 = m0();
            F0(mVar, true);
            if (m02) {
                j0(mVar);
            }
            U0(mVar);
        }
    }

    private void r(g.K k10) {
        g.O o10 = this.f41789d.f41825a.f41630b;
        if (o10 instanceof g.C6774u) {
            z(true, k10.f41671h, (g.C6774u) o10);
        }
        g.O o11 = this.f41789d.f41825a.f41633e;
        if (o11 instanceof g.C6774u) {
            z(false, k10.f41671h, (g.C6774u) o11);
        }
    }

    private void r0(g.C6768o oVar) {
        g.C6769p pVar;
        String str;
        int i10 = 0;
        y("Image render", new Object[0]);
        g.C6769p pVar2 = oVar.f41747s;
        if (pVar2 != null && !pVar2.k() && (pVar = oVar.f41748t) != null && !pVar.k() && (str = oVar.f41744p) != null) {
            e eVar = oVar.f41683o;
            if (eVar == null) {
                eVar = e.f41586e;
            }
            Bitmap s10 = s(str);
            if (s10 == null) {
                i k10 = g.k();
                if (k10 != null) {
                    s10 = k10.d(oVar.f41744p);
                } else {
                    return;
                }
            }
            if (s10 == null) {
                F("Could not locate image '%s'", oVar.f41744p);
                return;
            }
            g.C6756b bVar = new g.C6756b(0.0f, 0.0f, (float) s10.getWidth(), (float) s10.getHeight());
            W0(this.f41789d, oVar);
            if (A() && Y0()) {
                Matrix matrix = oVar.f41749u;
                if (matrix != null) {
                    this.f41786a.concat(matrix);
                }
                g.C6769p pVar3 = oVar.f41745q;
                float e10 = pVar3 != null ? pVar3.e(this) : 0.0f;
                g.C6769p pVar4 = oVar.f41746r;
                this.f41789d.f41830f = new g.C6756b(e10, pVar4 != null ? pVar4.f(this) : 0.0f, oVar.f41747s.e(this), oVar.f41748t.e(this));
                if (!this.f41789d.f41825a.f41650v.booleanValue()) {
                    g.C6756b bVar2 = this.f41789d.f41830f;
                    O0(bVar2.f41702a, bVar2.f41703b, bVar2.f41704c, bVar2.f41705d);
                }
                oVar.f41671h = this.f41789d.f41830f;
                U0(oVar);
                p(oVar);
                boolean m02 = m0();
                X0();
                this.f41786a.save();
                this.f41786a.concat(o(this.f41789d.f41830f, bVar, eVar));
                if (this.f41789d.f41825a.f41628M != g.E.e.optimizeSpeed) {
                    i10 = 2;
                }
                this.f41786a.drawBitmap(s10, 0.0f, 0.0f, new Paint(i10));
                this.f41786a.restore();
                if (m02) {
                    j0(oVar);
                }
            }
        }
    }

    private Bitmap s(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e10) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
            return null;
        }
    }

    private void s0(g.C6770q qVar) {
        y("Line render", new Object[0]);
        W0(this.f41789d, qVar);
        if (A() && Y0() && this.f41789d.f41827c) {
            Matrix matrix = qVar.f41742n;
            if (matrix != null) {
                this.f41786a.concat(matrix);
            }
            Path a02 = a0(qVar);
            U0(qVar);
            r(qVar);
            p(qVar);
            boolean m02 = m0();
            C(a02);
            I0(qVar);
            if (m02) {
                j0(qVar);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r6.equals("fantasy") == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Typeface t(java.lang.String r6, java.lang.Integer r7, a8.g.E.b r8) {
        /*
            r5 = this;
            r0 = 2
            r1 = 3
            a8.g$E$b r2 = a8.g.E.b.Italic
            r3 = 0
            r4 = 1
            if (r8 != r2) goto L_0x000a
            r8 = r4
            goto L_0x000b
        L_0x000a:
            r8 = r3
        L_0x000b:
            int r7 = r7.intValue()
            r2 = 500(0x1f4, float:7.0E-43)
            if (r7 <= r2) goto L_0x0019
            if (r8 == 0) goto L_0x0017
            r7 = r1
            goto L_0x001e
        L_0x0017:
            r7 = r4
            goto L_0x001e
        L_0x0019:
            if (r8 == 0) goto L_0x001d
            r7 = r0
            goto L_0x001e
        L_0x001d:
            r7 = r3
        L_0x001e:
            r6.hashCode()
            r8 = -1
            int r2 = r6.hashCode()
            switch(r2) {
                case -1536685117: goto L_0x0055;
                case -1431958525: goto L_0x004a;
                case -1081737434: goto L_0x0041;
                case 109326717: goto L_0x0036;
                case 1126973893: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r0 = r8
            goto L_0x005f
        L_0x002b:
            java.lang.String r0 = "cursive"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r0 = 4
            goto L_0x005f
        L_0x0036:
            java.lang.String r0 = "serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r0 = r1
            goto L_0x005f
        L_0x0041:
            java.lang.String r1 = "fantasy"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x005f
            goto L_0x0029
        L_0x004a:
            java.lang.String r0 = "monospace"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0053
            goto L_0x0029
        L_0x0053:
            r0 = r4
            goto L_0x005f
        L_0x0055:
            java.lang.String r0 = "sans-serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x005e
            goto L_0x0029
        L_0x005e:
            r0 = r3
        L_0x005f:
            switch(r0) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0079;
                case 2: goto L_0x0072;
                case 3: goto L_0x006b;
                case 4: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            r6 = 0
            goto L_0x0086
        L_0x0064:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x006b:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x0072:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x0079:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x0080:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
        L_0x0086:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.t(java.lang.String, java.lang.Integer, a8.g$E$b):android.graphics.Typeface");
    }

    private void t0(g.C6775v vVar) {
        y("Path render", new Object[0]);
        if (vVar.f41770o != null) {
            W0(this.f41789d, vVar);
            if (A() && Y0()) {
                C0737h hVar = this.f41789d;
                if (hVar.f41827c || hVar.f41826b) {
                    Matrix matrix = vVar.f41742n;
                    if (matrix != null) {
                        this.f41786a.concat(matrix);
                    }
                    Path a10 = new d(vVar.f41770o).a();
                    if (vVar.f41671h == null) {
                        vVar.f41671h = m(a10);
                    }
                    U0(vVar);
                    r(vVar);
                    p(vVar);
                    boolean m02 = m0();
                    if (this.f41789d.f41826b) {
                        a10.setFillType(U());
                        B(vVar, a10);
                    }
                    if (this.f41789d.f41827c) {
                        C(a10);
                    }
                    I0(vVar);
                    if (m02) {
                        j0(vVar);
                    }
                }
            }
        }
    }

    private void u(g.N n10) {
        Boolean bool;
        if ((n10 instanceof g.L) && (bool = ((g.L) n10).f41673d) != null) {
            this.f41789d.f41832h = bool.booleanValue();
        }
    }

    private void u0(g.C6779z zVar) {
        y("PolyLine render", new Object[0]);
        W0(this.f41789d, zVar);
        if (A() && Y0()) {
            C0737h hVar = this.f41789d;
            if (hVar.f41827c || hVar.f41826b) {
                Matrix matrix = zVar.f41742n;
                if (matrix != null) {
                    this.f41786a.concat(matrix);
                }
                if (zVar.f41784o.length >= 2) {
                    Path b02 = b0(zVar);
                    U0(zVar);
                    b02.setFillType(U());
                    r(zVar);
                    p(zVar);
                    boolean m02 = m0();
                    if (this.f41789d.f41826b) {
                        B(zVar, b02);
                    }
                    if (this.f41789d.f41827c) {
                        C(b02);
                    }
                    I0(zVar);
                    if (m02) {
                        j0(zVar);
                    }
                }
            }
        }
    }

    private static double v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    private void v0(g.A a10) {
        y("Polygon render", new Object[0]);
        W0(this.f41789d, a10);
        if (A() && Y0()) {
            C0737h hVar = this.f41789d;
            if (hVar.f41827c || hVar.f41826b) {
                Matrix matrix = a10.f41742n;
                if (matrix != null) {
                    this.f41786a.concat(matrix);
                }
                if (a10.f41784o.length >= 2) {
                    Path b02 = b0(a10);
                    U0(a10);
                    r(a10);
                    p(a10);
                    boolean m02 = m0();
                    if (this.f41789d.f41826b) {
                        B(a10, b02);
                    }
                    if (this.f41789d.f41827c) {
                        C(b02);
                    }
                    I0(a10);
                    if (m02) {
                        j0(a10);
                    }
                }
            }
        }
    }

    private static int w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    private void w0(g.B b10) {
        y("Rect render", new Object[0]);
        g.C6769p pVar = b10.f41611q;
        if (pVar != null && b10.f41612r != null && !pVar.k() && !b10.f41612r.k()) {
            W0(this.f41789d, b10);
            if (A() && Y0()) {
                Matrix matrix = b10.f41742n;
                if (matrix != null) {
                    this.f41786a.concat(matrix);
                }
                Path c02 = c0(b10);
                U0(b10);
                r(b10);
                p(b10);
                boolean m02 = m0();
                if (this.f41789d.f41826b) {
                    B(b10, c02);
                }
                if (this.f41789d.f41827c) {
                    C(c02);
                }
                if (m02) {
                    j0(b10);
                }
            }
        }
    }

    private static int x(int i10, float f10) {
        int i11 = 255;
        int round = Math.round(((float) ((i10 >> 24) & 255)) * f10);
        if (round < 0) {
            i11 = 0;
        } else if (round <= 255) {
            i11 = round;
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    private void x0(g.F f10) {
        z0(f10, f0(f10.f41655q, f10.f41656r, f10.f41657s, f10.f41658t), f10.f41689p, f10.f41683o);
    }

    /* access modifiers changed from: private */
    public static void y(String str, Object... objArr) {
    }

    private void y0(g.F f10, g.C6756b bVar) {
        z0(f10, bVar, f10.f41689p, f10.f41683o);
    }

    private void z(boolean z10, g.C6756b bVar, g.C6774u uVar) {
        g.N u10 = this.f41788c.u(uVar.f41768a);
        if (u10 == null) {
            F("%s reference '%s' not found", z10 ? "Fill" : "Stroke", uVar.f41768a);
            g.O o10 = uVar.f41769b;
            if (o10 != null) {
                P0(this.f41789d, z10, o10);
            } else if (z10) {
                this.f41789d.f41826b = false;
            } else {
                this.f41789d.f41827c = false;
            }
        } else if (u10 instanceof g.M) {
            X(z10, bVar, (g.M) u10);
        } else if (u10 instanceof g.Q) {
            e0(z10, bVar, (g.Q) u10);
        } else if (u10 instanceof g.C) {
            Q0(z10, (g.C) u10);
        }
    }

    private void z0(g.F f10, g.C6756b bVar, g.C6756b bVar2, e eVar) {
        y("Svg render", new Object[0]);
        if (bVar.f41704c != 0.0f && bVar.f41705d != 0.0f) {
            if (eVar == null && (eVar = f10.f41683o) == null) {
                eVar = e.f41586e;
            }
            W0(this.f41789d, f10);
            if (A()) {
                C0737h hVar = this.f41789d;
                hVar.f41830f = bVar;
                if (!hVar.f41825a.f41650v.booleanValue()) {
                    g.C6756b bVar3 = this.f41789d.f41830f;
                    O0(bVar3.f41702a, bVar3.f41703b, bVar3.f41704c, bVar3.f41705d);
                }
                q(f10, this.f41789d.f41830f);
                if (bVar2 != null) {
                    this.f41786a.concat(o(this.f41789d.f41830f, bVar2, eVar));
                    this.f41789d.f41831g = f10.f41689p;
                } else {
                    Canvas canvas = this.f41786a;
                    g.C6756b bVar4 = this.f41789d.f41830f;
                    canvas.translate(bVar4.f41702a, bVar4.f41703b);
                }
                boolean m02 = m0();
                X0();
                F0(f10, true);
                if (m02) {
                    j0(f10);
                }
                U0(f10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void G0(g gVar, f fVar) {
        g.C6756b bVar;
        e eVar;
        if (fVar != null) {
            this.f41788c = gVar;
            g.F m10 = gVar.m();
            if (m10 == null) {
                Z0("Nothing to render. Document is empty.", new Object[0]);
                return;
            }
            if (fVar.e()) {
                g.L j10 = this.f41788c.j(fVar.f41599e);
                if (j10 == null || !(j10 instanceof g.f0)) {
                    Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", new Object[]{fVar.f41599e}));
                    return;
                }
                g.f0 f0Var = (g.f0) j10;
                bVar = f0Var.f41689p;
                if (bVar == null) {
                    Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", new Object[]{fVar.f41599e}));
                    return;
                }
                eVar = f0Var.f41683o;
            } else {
                bVar = fVar.f() ? fVar.f41598d : m10.f41689p;
                eVar = fVar.c() ? fVar.f41596b : m10.f41683o;
            }
            if (fVar.b()) {
                gVar.a(fVar.f41595a);
            }
            if (fVar.d()) {
                C6752b.q qVar = new C6752b.q();
                this.f41793h = qVar;
                qVar.f41571a = gVar.j(fVar.f41597c);
            }
            N0();
            u(m10);
            S0();
            g.C6756b bVar2 = new g.C6756b(fVar.f41600f);
            g.C6769p pVar = m10.f41657s;
            if (pVar != null) {
                bVar2.f41704c = pVar.d(this, bVar2.f41704c);
            }
            g.C6769p pVar2 = m10.f41658t;
            if (pVar2 != null) {
                bVar2.f41705d = pVar2.d(this, bVar2.f41705d);
            }
            z0(m10, bVar2, bVar, eVar);
            R0();
            if (fVar.b()) {
                gVar.b();
                return;
            }
            return;
        }
        throw new NullPointerException("renderOptions shouldn't be null");
    }

    /* access modifiers changed from: package-private */
    public float Q() {
        return this.f41789d.f41828d.getTextSize();
    }

    /* access modifiers changed from: package-private */
    public float R() {
        return this.f41789d.f41828d.getTextSize() / 2.0f;
    }

    /* access modifiers changed from: package-private */
    public g.C6756b S() {
        C0737h hVar = this.f41789d;
        g.C6756b bVar = hVar.f41831g;
        return bVar != null ? bVar : hVar.f41830f;
    }

    /* access modifiers changed from: package-private */
    public float T() {
        return this.f41787b;
    }

    private class k extends j {

        /* renamed from: b  reason: collision with root package name */
        float f41839b;

        private k() {
            super(h.this, (a) null);
            this.f41839b = 0.0f;
        }

        public void b(String str) {
            this.f41839b += h.this.f41789d.f41828d.measureText(str);
        }

        /* synthetic */ k(h hVar, a aVar) {
            this();
        }
    }

    /* renamed from: a8.h$h  reason: collision with other inner class name */
    private class C0737h {

        /* renamed from: a  reason: collision with root package name */
        g.E f41825a;

        /* renamed from: b  reason: collision with root package name */
        boolean f41826b;

        /* renamed from: c  reason: collision with root package name */
        boolean f41827c;

        /* renamed from: d  reason: collision with root package name */
        Paint f41828d;

        /* renamed from: e  reason: collision with root package name */
        Paint f41829e;

        /* renamed from: f  reason: collision with root package name */
        g.C6756b f41830f;

        /* renamed from: g  reason: collision with root package name */
        g.C6756b f41831g;

        /* renamed from: h  reason: collision with root package name */
        boolean f41832h;

        C0737h() {
            Paint paint = new Paint();
            this.f41828d = paint;
            paint.setFlags(193);
            this.f41828d.setHinting(0);
            this.f41828d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f41828d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f41829e = paint3;
            paint3.setFlags(193);
            this.f41829e.setHinting(0);
            this.f41829e.setStyle(Paint.Style.STROKE);
            this.f41829e.setTypeface(typeface);
            this.f41825a = g.E.a();
        }

        C0737h(C0737h hVar) {
            this.f41826b = hVar.f41826b;
            this.f41827c = hVar.f41827c;
            this.f41828d = new Paint(hVar.f41828d);
            this.f41829e = new Paint(hVar.f41829e);
            g.C6756b bVar = hVar.f41830f;
            if (bVar != null) {
                this.f41830f = new g.C6756b(bVar);
            }
            g.C6756b bVar2 = hVar.f41831g;
            if (bVar2 != null) {
                this.f41831g = new g.C6756b(bVar2);
            }
            this.f41832h = hVar.f41832h;
            try {
                this.f41825a = (g.E) hVar.f41825a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f41825a = g.E.a();
            }
        }
    }
}
