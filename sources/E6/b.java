package E6;

import B6.f;
import D6.h;
import D6.i;
import E6.e;
import G6.C6515j;
import I6.d;
import I6.j;
import J6.c;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w6.C8923e;
import w6.C8927i;
import x6.C8955a;
import y6.C8986c;
import y6.C8988e;
import z6.C9019a;
import z6.C9022d;
import z6.C9026h;
import z6.p;

public abstract class b implements C8988e, C9019a.b, f {

    /* renamed from: A  reason: collision with root package name */
    private Paint f34910A;

    /* renamed from: B  reason: collision with root package name */
    float f34911B;

    /* renamed from: C  reason: collision with root package name */
    BlurMaskFilter f34912C;

    /* renamed from: a  reason: collision with root package name */
    private final Path f34913a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f34914b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f34915c = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    private final Paint f34916d = new C8955a(1);

    /* renamed from: e  reason: collision with root package name */
    private final Paint f34917e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f34918f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f34919g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f34920h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f34921i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f34922j;

    /* renamed from: k  reason: collision with root package name */
    private final RectF f34923k;

    /* renamed from: l  reason: collision with root package name */
    private final RectF f34924l;

    /* renamed from: m  reason: collision with root package name */
    private final RectF f34925m;

    /* renamed from: n  reason: collision with root package name */
    private final String f34926n;

    /* renamed from: o  reason: collision with root package name */
    final Matrix f34927o;

    /* renamed from: p  reason: collision with root package name */
    final o f34928p;

    /* renamed from: q  reason: collision with root package name */
    final e f34929q;

    /* renamed from: r  reason: collision with root package name */
    private C9026h f34930r;

    /* renamed from: s  reason: collision with root package name */
    private C9022d f34931s;

    /* renamed from: t  reason: collision with root package name */
    private b f34932t;

    /* renamed from: u  reason: collision with root package name */
    private b f34933u;

    /* renamed from: v  reason: collision with root package name */
    private List<b> f34934v;

    /* renamed from: w  reason: collision with root package name */
    private final List<C9019a<?, ?>> f34935w;

    /* renamed from: x  reason: collision with root package name */
    final p f34936x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f34937y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f34938z;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34939a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f34940b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                D6.i$a[] r0 = D6.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34940b = r0
                r1 = 1
                D6.i$a r2 = D6.i.a.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f34940b     // Catch:{ NoSuchFieldError -> 0x001d }
                D6.i$a r3 = D6.i.a.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f34940b     // Catch:{ NoSuchFieldError -> 0x0028 }
                D6.i$a r4 = D6.i.a.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f34940b     // Catch:{ NoSuchFieldError -> 0x0033 }
                D6.i$a r5 = D6.i.a.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                E6.e$a[] r4 = E6.e.a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f34939a = r4
                E6.e$a r5 = E6.e.a.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f34939a     // Catch:{ NoSuchFieldError -> 0x004e }
                E6.e$a r4 = E6.e.a.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f34939a     // Catch:{ NoSuchFieldError -> 0x0058 }
                E6.e$a r1 = E6.e.a.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f34939a     // Catch:{ NoSuchFieldError -> 0x0062 }
                E6.e$a r1 = E6.e.a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f34939a     // Catch:{ NoSuchFieldError -> 0x006d }
                E6.e$a r1 = E6.e.a.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f34939a     // Catch:{ NoSuchFieldError -> 0x0078 }
                E6.e$a r1 = E6.e.a.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f34939a     // Catch:{ NoSuchFieldError -> 0x0083 }
                E6.e$a r1 = E6.e.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E6.b.a.<clinit>():void");
        }
    }

    b(o oVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f34917e = new C8955a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f34918f = new C8955a(1, mode2);
        C8955a aVar = new C8955a(1);
        this.f34919g = aVar;
        this.f34920h = new C8955a(PorterDuff.Mode.CLEAR);
        this.f34921i = new RectF();
        this.f34922j = new RectF();
        this.f34923k = new RectF();
        this.f34924l = new RectF();
        this.f34925m = new RectF();
        this.f34927o = new Matrix();
        this.f34935w = new ArrayList();
        this.f34937y = true;
        this.f34911B = 0.0f;
        this.f34928p = oVar;
        this.f34929q = eVar;
        this.f34926n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p b10 = eVar.x().b();
        this.f34936x = b10;
        b10.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            C9026h hVar = new C9026h(eVar.h());
            this.f34930r = hVar;
            for (C9019a<D6.o, Path> a10 : hVar.a()) {
                a10.a(this);
            }
            for (C9019a next : this.f34930r.c()) {
                i(next);
                next.a(this);
            }
        }
        P();
    }

    private void D(RectF rectF, Matrix matrix) {
        this.f34923k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f34930r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = this.f34930r.b().get(i10);
                Path path = (Path) this.f34930r.a().get(i10).h();
                if (path != null) {
                    this.f34913a.set(path);
                    this.f34913a.transform(matrix);
                    int i11 = a.f34940b[iVar.a().ordinal()];
                    if (i11 != 1 && i11 != 2) {
                        if ((i11 != 3 && i11 != 4) || !iVar.d()) {
                            this.f34913a.computeBounds(this.f34925m, false);
                            if (i10 == 0) {
                                this.f34923k.set(this.f34925m);
                            } else {
                                RectF rectF2 = this.f34923k;
                                rectF2.set(Math.min(rectF2.left, this.f34925m.left), Math.min(this.f34923k.top, this.f34925m.top), Math.max(this.f34923k.right, this.f34925m.right), Math.max(this.f34923k.bottom, this.f34925m.bottom));
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (!rectF.intersect(this.f34923k)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    private void E(RectF rectF, Matrix matrix) {
        if (C() && this.f34929q.i() != e.b.INVERT) {
            this.f34924l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f34932t.e(this.f34924l, matrix, true);
            if (!rectF.intersect(this.f34924l)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    private void F() {
        this.f34928p.invalidateSelf();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G() {
        O(this.f34931s.p() == 1.0f);
    }

    private void H(float f10) {
        this.f34928p.H().n().a(this.f34929q.j(), f10);
    }

    private void O(boolean z10) {
        if (z10 != this.f34937y) {
            this.f34937y = z10;
            F();
        }
    }

    private void P() {
        boolean z10 = true;
        if (!this.f34929q.f().isEmpty()) {
            C9022d dVar = new C9022d(this.f34929q.f());
            this.f34931s = dVar;
            dVar.l();
            this.f34931s.a(new a(this));
            if (((Float) this.f34931s.h()).floatValue() != 1.0f) {
                z10 = false;
            }
            O(z10);
            i(this.f34931s);
            return;
        }
        O(true);
    }

    private void j(Canvas canvas, Matrix matrix, C9019a<D6.o, Path> aVar, C9019a<Integer, Integer> aVar2) {
        this.f34913a.set(aVar.h());
        this.f34913a.transform(matrix);
        this.f34916d.setAlpha((int) (((float) aVar2.h().intValue()) * 2.55f));
        canvas.drawPath(this.f34913a, this.f34916d);
    }

    private void k(Canvas canvas, Matrix matrix, C9019a<D6.o, Path> aVar, C9019a<Integer, Integer> aVar2) {
        j.m(canvas, this.f34921i, this.f34917e);
        this.f34913a.set(aVar.h());
        this.f34913a.transform(matrix);
        this.f34916d.setAlpha((int) (((float) aVar2.h().intValue()) * 2.55f));
        canvas.drawPath(this.f34913a, this.f34916d);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, C9019a<D6.o, Path> aVar, C9019a<Integer, Integer> aVar2) {
        j.m(canvas, this.f34921i, this.f34916d);
        canvas.drawRect(this.f34921i, this.f34916d);
        this.f34913a.set(aVar.h());
        this.f34913a.transform(matrix);
        this.f34916d.setAlpha((int) (((float) aVar2.h().intValue()) * 2.55f));
        canvas.drawPath(this.f34913a, this.f34918f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, C9019a<D6.o, Path> aVar, C9019a<Integer, Integer> aVar2) {
        j.m(canvas, this.f34921i, this.f34917e);
        canvas.drawRect(this.f34921i, this.f34916d);
        this.f34918f.setAlpha((int) (((float) aVar2.h().intValue()) * 2.55f));
        this.f34913a.set(aVar.h());
        this.f34913a.transform(matrix);
        canvas.drawPath(this.f34913a, this.f34918f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix, C9019a<D6.o, Path> aVar, C9019a<Integer, Integer> aVar2) {
        j.m(canvas, this.f34921i, this.f34918f);
        canvas.drawRect(this.f34921i, this.f34916d);
        this.f34918f.setAlpha((int) (((float) aVar2.h().intValue()) * 2.55f));
        this.f34913a.set(aVar.h());
        this.f34913a.transform(matrix);
        canvas.drawPath(this.f34913a, this.f34918f);
        canvas.restore();
    }

    private void p(Canvas canvas, Matrix matrix) {
        C8923e.b("Layer#saveLayer");
        j.n(canvas, this.f34921i, this.f34917e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        C8923e.c("Layer#saveLayer");
        for (int i10 = 0; i10 < this.f34930r.b().size(); i10++) {
            i iVar = this.f34930r.b().get(i10);
            C9019a aVar = this.f34930r.a().get(i10);
            C9019a aVar2 = this.f34930r.c().get(i10);
            int i11 = a.f34940b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f34916d.setColor(-16777216);
                        this.f34916d.setAlpha(255);
                        canvas.drawRect(this.f34921i, this.f34916d);
                    }
                    if (iVar.d()) {
                        o(canvas, matrix, aVar, aVar2);
                    } else {
                        q(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (iVar.d()) {
                            l(canvas, matrix, aVar, aVar2);
                        } else {
                            j(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    n(canvas, matrix, aVar, aVar2);
                } else {
                    k(canvas, matrix, aVar, aVar2);
                }
            } else if (r()) {
                this.f34916d.setAlpha(255);
                canvas.drawRect(this.f34921i, this.f34916d);
            }
        }
        C8923e.b("Layer#restoreLayer");
        canvas.restore();
        C8923e.c("Layer#restoreLayer");
    }

    private void q(Canvas canvas, Matrix matrix, C9019a<D6.o, Path> aVar) {
        this.f34913a.set(aVar.h());
        this.f34913a.transform(matrix);
        canvas.drawPath(this.f34913a, this.f34918f);
    }

    private boolean r() {
        if (this.f34930r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f34930r.b().size(); i10++) {
            if (this.f34930r.b().get(i10).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        if (this.f34934v == null) {
            if (this.f34933u == null) {
                this.f34934v = Collections.emptyList();
                return;
            }
            this.f34934v = new ArrayList();
            for (b bVar = this.f34933u; bVar != null; bVar = bVar.f34933u) {
                this.f34934v.add(bVar);
            }
        }
    }

    private void t(Canvas canvas) {
        C8923e.b("Layer#clearLayer");
        RectF rectF = this.f34921i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f34920h);
        C8923e.c("Layer#clearLayer");
    }

    static b v(c cVar, e eVar, o oVar, C8927i iVar) {
        switch (a.f34939a[eVar.g().ordinal()]) {
            case 1:
                return new g(oVar, eVar, cVar, iVar);
            case 2:
                return new c(oVar, eVar, iVar.o(eVar.n()), iVar);
            case 3:
                return new h(oVar, eVar);
            case 4:
                return new d(oVar, eVar);
            case 5:
                return new f(oVar, eVar);
            case 6:
                return new i(oVar, eVar);
            default:
                d.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    public e A() {
        return this.f34929q;
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        C9026h hVar = this.f34930r;
        return hVar != null && !hVar.a().isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        return this.f34932t != null;
    }

    public void I(C9019a<?, ?> aVar) {
        this.f34935w.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    public void J(B6.e eVar, int i10, List<B6.e> list, B6.e eVar2) {
    }

    /* access modifiers changed from: package-private */
    public void K(b bVar) {
        this.f34932t = bVar;
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z10) {
        if (z10 && this.f34910A == null) {
            this.f34910A = new C8955a();
        }
        this.f34938z = z10;
    }

    /* access modifiers changed from: package-private */
    public void M(b bVar) {
        this.f34933u = bVar;
    }

    /* access modifiers changed from: package-private */
    public void N(float f10) {
        C8923e.b("BaseLayer#setProgress");
        C8923e.b("BaseLayer#setProgress.transform");
        this.f34936x.j(f10);
        C8923e.c("BaseLayer#setProgress.transform");
        if (this.f34930r != null) {
            C8923e.b("BaseLayer#setProgress.mask");
            for (int i10 = 0; i10 < this.f34930r.a().size(); i10++) {
                this.f34930r.a().get(i10).m(f10);
            }
            C8923e.c("BaseLayer#setProgress.mask");
        }
        if (this.f34931s != null) {
            C8923e.b("BaseLayer#setProgress.inout");
            this.f34931s.m(f10);
            C8923e.c("BaseLayer#setProgress.inout");
        }
        if (this.f34932t != null) {
            C8923e.b("BaseLayer#setProgress.matte");
            this.f34932t.N(f10);
            C8923e.c("BaseLayer#setProgress.matte");
        }
        C8923e.b("BaseLayer#setProgress.animations." + this.f34935w.size());
        for (int i11 = 0; i11 < this.f34935w.size(); i11++) {
            this.f34935w.get(i11).m(f10);
        }
        C8923e.c("BaseLayer#setProgress.animations." + this.f34935w.size());
        C8923e.c("BaseLayer#setProgress");
    }

    public void a() {
        F();
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
    }

    public void c(B6.e eVar, int i10, List<B6.e> list, B6.e eVar2) {
        b bVar = this.f34932t;
        if (bVar != null) {
            B6.e a10 = eVar2.a(bVar.getName());
            if (eVar.c(this.f34932t.getName(), i10)) {
                list.add(a10.i(this.f34932t));
            }
            if (eVar.h(getName(), i10)) {
                this.f34932t.J(eVar, eVar.e(this.f34932t.getName(), i10) + i10, list, a10);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                J(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f34921i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f34927o.set(matrix);
        if (z10) {
            List<b> list = this.f34934v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f34927o.preConcat(this.f34934v.get(size).f34936x.f());
                }
            } else {
                b bVar = this.f34933u;
                if (bVar != null) {
                    this.f34927o.preConcat(bVar.f34936x.f());
                }
            }
        }
        this.f34927o.preConcat(this.f34936x.f());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        r0 = r0.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(android.graphics.Canvas r7, android.graphics.Matrix r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f34926n
            w6.C8923e.b(r0)
            boolean r0 = r6.f34937y
            if (r0 == 0) goto L_0x01b8
            E6.e r0 = r6.f34929q
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0013
            goto L_0x01b8
        L_0x0013:
            r6.s()
            java.lang.String r0 = "Layer#parentMatrix"
            w6.C8923e.b(r0)
            android.graphics.Matrix r1 = r6.f34914b
            r1.reset()
            android.graphics.Matrix r1 = r6.f34914b
            r1.set(r8)
            java.util.List<E6.b> r1 = r6.f34934v
            int r1 = r1.size()
            int r1 = r1 + -1
        L_0x002d:
            if (r1 < 0) goto L_0x0045
            android.graphics.Matrix r2 = r6.f34914b
            java.util.List<E6.b> r3 = r6.f34934v
            java.lang.Object r3 = r3.get(r1)
            E6.b r3 = (E6.b) r3
            z6.p r3 = r3.f34936x
            android.graphics.Matrix r3 = r3.f()
            r2.preConcat(r3)
            int r1 = r1 + -1
            goto L_0x002d
        L_0x0045:
            w6.C8923e.c(r0)
            z6.p r0 = r6.f34936x
            z6.a r0 = r0.h()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r0.h()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x005d
            int r0 = r0.intValue()
            goto L_0x005f
        L_0x005d:
            r0 = 100
        L_0x005f:
            float r9 = (float) r9
            r1 = 1132396544(0x437f0000, float:255.0)
            float r9 = r9 / r1
            float r0 = (float) r0
            float r9 = r9 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 / r0
            float r9 = r9 * r1
            int r9 = (int) r9
            boolean r0 = r6.C()
            java.lang.String r1 = "Layer#drawLayer"
            if (r0 != 0) goto L_0x0098
            boolean r0 = r6.B()
            if (r0 != 0) goto L_0x0098
            android.graphics.Matrix r8 = r6.f34914b
            z6.p r0 = r6.f34936x
            android.graphics.Matrix r0 = r0.f()
            r8.preConcat(r0)
            w6.C8923e.b(r1)
            android.graphics.Matrix r8 = r6.f34914b
            r6.u(r7, r8, r9)
            w6.C8923e.c(r1)
            java.lang.String r7 = r6.f34926n
            float r7 = w6.C8923e.c(r7)
            r6.H(r7)
            return
        L_0x0098:
            java.lang.String r0 = "Layer#computeBounds"
            w6.C8923e.b(r0)
            android.graphics.RectF r2 = r6.f34921i
            android.graphics.Matrix r3 = r6.f34914b
            r4 = 0
            r6.e(r2, r3, r4)
            android.graphics.RectF r2 = r6.f34921i
            r6.E(r2, r8)
            android.graphics.Matrix r2 = r6.f34914b
            z6.p r3 = r6.f34936x
            android.graphics.Matrix r3 = r3.f()
            r2.preConcat(r3)
            android.graphics.RectF r2 = r6.f34921i
            android.graphics.Matrix r3 = r6.f34914b
            r6.D(r2, r3)
            android.graphics.RectF r2 = r6.f34922j
            int r3 = r7.getWidth()
            float r3 = (float) r3
            int r4 = r7.getHeight()
            float r4 = (float) r4
            r5 = 0
            r2.set(r5, r5, r3, r4)
            android.graphics.Matrix r2 = r6.f34915c
            r7.getMatrix(r2)
            android.graphics.Matrix r2 = r6.f34915c
            boolean r2 = r2.isIdentity()
            if (r2 != 0) goto L_0x00e5
            android.graphics.Matrix r2 = r6.f34915c
            r2.invert(r2)
            android.graphics.Matrix r2 = r6.f34915c
            android.graphics.RectF r3 = r6.f34922j
            r2.mapRect(r3)
        L_0x00e5:
            android.graphics.RectF r2 = r6.f34921i
            android.graphics.RectF r3 = r6.f34922j
            boolean r2 = r2.intersect(r3)
            if (r2 != 0) goto L_0x00f4
            android.graphics.RectF r2 = r6.f34921i
            r2.set(r5, r5, r5, r5)
        L_0x00f4:
            w6.C8923e.c(r0)
            android.graphics.RectF r0 = r6.f34921i
            float r0 = r0.width()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0175
            android.graphics.RectF r0 = r6.f34921i
            float r0 = r0.height()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0175
            java.lang.String r0 = "Layer#saveLayer"
            w6.C8923e.b(r0)
            android.graphics.Paint r2 = r6.f34916d
            r3 = 255(0xff, float:3.57E-43)
            r2.setAlpha(r3)
            android.graphics.RectF r2 = r6.f34921i
            android.graphics.Paint r3 = r6.f34916d
            I6.j.m(r7, r2, r3)
            w6.C8923e.c(r0)
            r6.t(r7)
            w6.C8923e.b(r1)
            android.graphics.Matrix r2 = r6.f34914b
            r6.u(r7, r2, r9)
            w6.C8923e.c(r1)
            boolean r1 = r6.B()
            if (r1 == 0) goto L_0x013c
            android.graphics.Matrix r1 = r6.f34914b
            r6.p(r7, r1)
        L_0x013c:
            boolean r1 = r6.C()
            java.lang.String r2 = "Layer#restoreLayer"
            if (r1 == 0) goto L_0x016c
            java.lang.String r1 = "Layer#drawMatte"
            w6.C8923e.b(r1)
            w6.C8923e.b(r0)
            android.graphics.RectF r3 = r6.f34921i
            android.graphics.Paint r4 = r6.f34919g
            r5 = 19
            I6.j.n(r7, r3, r4, r5)
            w6.C8923e.c(r0)
            r6.t(r7)
            E6.b r0 = r6.f34932t
            r0.g(r7, r8, r9)
            w6.C8923e.b(r2)
            r7.restore()
            w6.C8923e.c(r2)
            w6.C8923e.c(r1)
        L_0x016c:
            w6.C8923e.b(r2)
            r7.restore()
            w6.C8923e.c(r2)
        L_0x0175:
            boolean r8 = r6.f34938z
            if (r8 == 0) goto L_0x01ae
            android.graphics.Paint r8 = r6.f34910A
            if (r8 == 0) goto L_0x01ae
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.STROKE
            r8.setStyle(r9)
            android.graphics.Paint r8 = r6.f34910A
            r9 = -251901(0xfffffffffffc2803, float:NaN)
            r8.setColor(r9)
            android.graphics.Paint r8 = r6.f34910A
            r9 = 1082130432(0x40800000, float:4.0)
            r8.setStrokeWidth(r9)
            android.graphics.RectF r8 = r6.f34921i
            android.graphics.Paint r9 = r6.f34910A
            r7.drawRect(r8, r9)
            android.graphics.Paint r8 = r6.f34910A
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.FILL
            r8.setStyle(r9)
            android.graphics.Paint r8 = r6.f34910A
            r9 = 1357638635(0x50ebebeb, float:3.1664855E10)
            r8.setColor(r9)
            android.graphics.RectF r8 = r6.f34921i
            android.graphics.Paint r9 = r6.f34910A
            r7.drawRect(r8, r9)
        L_0x01ae:
            java.lang.String r7 = r6.f34926n
            float r7 = w6.C8923e.c(r7)
            r6.H(r7)
            return
        L_0x01b8:
            java.lang.String r7 = r6.f34926n
            w6.C8923e.c(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E6.b.g(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public String getName() {
        return this.f34929q.j();
    }

    public <T> void h(T t10, c<T> cVar) {
        this.f34936x.c(t10, cVar);
    }

    public void i(C9019a<?, ?> aVar) {
        if (aVar != null) {
            this.f34935w.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void u(Canvas canvas, Matrix matrix, int i10);

    public h w() {
        return this.f34929q.a();
    }

    public D6.a x() {
        return this.f34929q.b();
    }

    public BlurMaskFilter y(float f10) {
        if (this.f34911B == f10) {
            return this.f34912C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f34912C = blurMaskFilter;
        this.f34911B = f10;
        return blurMaskFilter;
    }

    public C6515j z() {
        return this.f34929q.d();
    }
}
