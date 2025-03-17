package com.airbnb.lottie;

import B6.h;
import E6.c;
import G6.v;
import I6.d;
import I6.e;
import I6.g;
import I6.i;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w6.C8919a;
import w6.C8920b;
import w6.C8921c;
import w6.C8923e;
import w6.C8927i;
import w6.D;
import w6.G;
import w6.I;
import w6.s;
import w6.t;
import w6.u;
import w6.z;
import x6.C8955a;

public class o extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: Q  reason: collision with root package name */
    private static final boolean f46133Q = false;

    /* renamed from: R  reason: collision with root package name */
    private static final Executor f46134R = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new e());

    /* renamed from: A  reason: collision with root package name */
    private RectF f46135A;

    /* renamed from: B  reason: collision with root package name */
    private Paint f46136B;

    /* renamed from: C  reason: collision with root package name */
    private Rect f46137C;

    /* renamed from: D  reason: collision with root package name */
    private Rect f46138D;

    /* renamed from: E  reason: collision with root package name */
    private RectF f46139E;

    /* renamed from: F  reason: collision with root package name */
    private RectF f46140F;

    /* renamed from: G  reason: collision with root package name */
    private Matrix f46141G;

    /* renamed from: H  reason: collision with root package name */
    private Matrix f46142H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f46143I = false;

    /* renamed from: J  reason: collision with root package name */
    private C8919a f46144J;

    /* renamed from: K  reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f46145K;

    /* renamed from: L  reason: collision with root package name */
    private final Semaphore f46146L;

    /* renamed from: M  reason: collision with root package name */
    private Handler f46147M;

    /* renamed from: N  reason: collision with root package name */
    private Runnable f46148N;

    /* renamed from: O  reason: collision with root package name */
    private final Runnable f46149O;

    /* renamed from: P  reason: collision with root package name */
    private float f46150P;

    /* renamed from: a  reason: collision with root package name */
    private C8927i f46151a;

    /* renamed from: b  reason: collision with root package name */
    private final g f46152b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f46153c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f46154d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f46155e = false;

    /* renamed from: f  reason: collision with root package name */
    private b f46156f = b.NONE;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<a> f46157g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private A6.b f46158h;

    /* renamed from: i  reason: collision with root package name */
    private String f46159i;

    /* renamed from: j  reason: collision with root package name */
    private A6.a f46160j;

    /* renamed from: k  reason: collision with root package name */
    private Map<String, Typeface> f46161k;

    /* renamed from: l  reason: collision with root package name */
    String f46162l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f46163m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f46164n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f46165o = true;

    /* renamed from: p  reason: collision with root package name */
    private c f46166p;

    /* renamed from: q  reason: collision with root package name */
    private int f46167q = 255;

    /* renamed from: r  reason: collision with root package name */
    private boolean f46168r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f46169s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f46170t;

    /* renamed from: u  reason: collision with root package name */
    private G f46171u = G.AUTOMATIC;

    /* renamed from: v  reason: collision with root package name */
    private boolean f46172v = false;

    /* renamed from: w  reason: collision with root package name */
    private final Matrix f46173w = new Matrix();

    /* renamed from: x  reason: collision with root package name */
    private Bitmap f46174x;

    /* renamed from: y  reason: collision with root package name */
    private Canvas f46175y;

    /* renamed from: z  reason: collision with root package name */
    private Rect f46176z;

    private interface a {
        void a(C8927i iVar);
    }

    private enum b {
        NONE,
        PLAY,
        RESUME
    }

    public o() {
        g gVar = new g();
        this.f46152b = gVar;
        t tVar = new t(this);
        this.f46145K = tVar;
        this.f46146L = new Semaphore(1);
        this.f46149O = new u(this);
        this.f46150P = -3.4028235E38f;
        gVar.addUpdateListener(tVar);
    }

    private void B(int i10, int i11) {
        Bitmap bitmap = this.f46174x;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f46174x.getHeight() < i11) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f46174x = createBitmap;
            this.f46175y.setBitmap(createBitmap);
            this.f46143I = true;
        } else if (this.f46174x.getWidth() > i10 || this.f46174x.getHeight() > i11) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f46174x, 0, 0, i10, i11);
            this.f46174x = createBitmap2;
            this.f46175y.setBitmap(createBitmap2);
            this.f46143I = true;
        }
    }

    private void C() {
        if (this.f46175y == null) {
            this.f46175y = new Canvas();
            this.f46140F = new RectF();
            this.f46141G = new Matrix();
            this.f46142H = new Matrix();
            this.f46176z = new Rect();
            this.f46135A = new RectF();
            this.f46136B = new C8955a();
            this.f46137C = new Rect();
            this.f46138D = new Rect();
            this.f46139E = new RectF();
        }
    }

    private Context I() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private A6.a J() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f46160j == null) {
            A6.a aVar = new A6.a(getCallback(), (C8920b) null);
            this.f46160j = aVar;
            String str = this.f46162l;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f46160j;
    }

    private A6.b L() {
        A6.b bVar = this.f46158h;
        if (bVar != null && !bVar.b(I())) {
            this.f46158h = null;
        }
        if (this.f46158h == null) {
            this.f46158h = new A6.b(getCallback(), this.f46159i, (C8921c) null, this.f46151a.j());
        }
        return this.f46158h;
    }

    private boolean Z() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d0(B6.e eVar, Object obj, J6.c cVar, C8927i iVar) {
        q(eVar, obj, cVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e0(ValueAnimator valueAnimator) {
        if (E()) {
            invalidateSelf();
            return;
        }
        c cVar = this.f46166p;
        if (cVar != null) {
            cVar.N(this.f46152b.m());
        }
    }

    private boolean e1() {
        C8927i iVar = this.f46151a;
        if (iVar == null) {
            return false;
        }
        float f10 = this.f46150P;
        float m10 = this.f46152b.m();
        this.f46150P = m10;
        return Math.abs(m10 - f10) * iVar.d() >= 50.0f;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f0() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g0() {
        c cVar = this.f46166p;
        if (cVar != null) {
            try {
                this.f46146L.acquire();
                cVar.N(this.f46152b.m());
                if (f46133Q && this.f46143I) {
                    if (this.f46147M == null) {
                        this.f46147M = new Handler(Looper.getMainLooper());
                        this.f46148N = new s(this);
                    }
                    this.f46147M.post(this.f46148N);
                }
            } catch (InterruptedException unused) {
            } catch (Throwable th2) {
                this.f46146L.release();
                throw th2;
            }
            this.f46146L.release();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h0(C8927i iVar) {
        u0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i0(C8927i iVar) {
        x0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j0(int i10, C8927i iVar) {
        G0(i10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k0(String str, C8927i iVar) {
        M0(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l0(int i10, C8927i iVar) {
        L0(i10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m0(float f10, C8927i iVar) {
        N0(f10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n0(String str, C8927i iVar) {
        P0(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o0(int i10, int i11, C8927i iVar) {
        O0(i10, i11);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p0(int i10, C8927i iVar) {
        Q0(i10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q0(String str, C8927i iVar) {
        R0(str);
    }

    private boolean r() {
        return this.f46153c || this.f46154d;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r0(float f10, C8927i iVar) {
        S0(f10);
    }

    private void s() {
        C8927i iVar = this.f46151a;
        if (iVar != null) {
            c cVar = new c(this, v.b(iVar), iVar.k(), iVar);
            this.f46166p = cVar;
            if (this.f46169s) {
                cVar.L(true);
            }
            this.f46166p.R(this.f46165o);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s0(float f10, C8927i iVar) {
        V0(f10);
    }

    private void u() {
        C8927i iVar = this.f46151a;
        if (iVar != null) {
            this.f46172v = this.f46171u.b(Build.VERSION.SDK_INT, iVar.q(), iVar.m());
        }
    }

    private void v(Rect rect, RectF rectF) {
        rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    private void v0(Canvas canvas, c cVar) {
        if (this.f46151a != null && cVar != null) {
            C();
            canvas.getMatrix(this.f46141G);
            canvas.getClipBounds(this.f46176z);
            v(this.f46176z, this.f46135A);
            this.f46141G.mapRect(this.f46135A);
            w(this.f46135A, this.f46176z);
            if (this.f46165o) {
                this.f46140F.set(0.0f, 0.0f, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
            } else {
                cVar.e(this.f46140F, (Matrix) null, false);
            }
            this.f46141G.mapRect(this.f46140F);
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) getIntrinsicWidth());
            float height = ((float) bounds.height()) / ((float) getIntrinsicHeight());
            y0(this.f46140F, width, height);
            if (!Z()) {
                RectF rectF = this.f46140F;
                Rect rect = this.f46176z;
                rectF.intersect((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
            }
            int ceil = (int) Math.ceil((double) this.f46140F.width());
            int ceil2 = (int) Math.ceil((double) this.f46140F.height());
            if (ceil > 0 && ceil2 > 0) {
                B(ceil, ceil2);
                if (this.f46143I) {
                    this.f46173w.set(this.f46141G);
                    this.f46173w.preScale(width, height);
                    Matrix matrix = this.f46173w;
                    RectF rectF2 = this.f46140F;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.f46174x.eraseColor(0);
                    cVar.g(this.f46175y, this.f46173w, this.f46167q);
                    this.f46141G.invert(this.f46142H);
                    this.f46142H.mapRect(this.f46139E, this.f46140F);
                    w(this.f46139E, this.f46138D);
                }
                this.f46137C.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f46174x, this.f46137C, this.f46138D, this.f46136B);
            }
        }
    }

    private void w(RectF rectF, Rect rect) {
        rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
    }

    private void x(Canvas canvas) {
        c cVar = this.f46166p;
        C8927i iVar = this.f46151a;
        if (cVar != null && iVar != null) {
            this.f46173w.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                this.f46173w.preScale(((float) bounds.width()) / ((float) iVar.b().width()), ((float) bounds.height()) / ((float) iVar.b().height()));
                this.f46173w.preTranslate((float) bounds.left, (float) bounds.top);
            }
            cVar.g(canvas, this.f46173w, this.f46167q);
        }
    }

    private void y0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    public void A() {
        this.f46157g.clear();
        this.f46152b.l();
        if (!isVisible()) {
            this.f46156f = b.NONE;
        }
    }

    public void A0(C8919a aVar) {
        this.f46144J = aVar;
    }

    public void B0(boolean z10) {
        if (z10 != this.f46165o) {
            this.f46165o = z10;
            c cVar = this.f46166p;
            if (cVar != null) {
                cVar.R(z10);
            }
            invalidateSelf();
        }
    }

    public boolean C0(C8927i iVar) {
        if (this.f46151a == iVar) {
            return false;
        }
        this.f46143I = true;
        t();
        this.f46151a = iVar;
        s();
        this.f46152b.G(iVar);
        V0(this.f46152b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f46157g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(iVar);
            }
            it.remove();
        }
        this.f46157g.clear();
        iVar.v(this.f46168r);
        u();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable((Drawable) null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public C8919a D() {
        C8919a aVar = this.f46144J;
        return aVar != null ? aVar : C8923e.d();
    }

    public void D0(String str) {
        this.f46162l = str;
        A6.a J10 = J();
        if (J10 != null) {
            J10.c(str);
        }
    }

    public boolean E() {
        return D() == C8919a.ENABLED;
    }

    public void E0(C8920b bVar) {
        A6.a aVar = this.f46160j;
        if (aVar != null) {
            aVar.d(bVar);
        }
    }

    public Bitmap F(String str) {
        A6.b L10 = L();
        if (L10 != null) {
            return L10.a(str);
        }
        return null;
    }

    public void F0(Map<String, Typeface> map) {
        if (map != this.f46161k) {
            this.f46161k = map;
            invalidateSelf();
        }
    }

    public boolean G() {
        return this.f46165o;
    }

    public void G0(int i10) {
        if (this.f46151a == null) {
            this.f46157g.add(new n(this, i10));
        } else {
            this.f46152b.H((float) i10);
        }
    }

    public C8927i H() {
        return this.f46151a;
    }

    public void H0(boolean z10) {
        this.f46154d = z10;
    }

    public void I0(C8921c cVar) {
        A6.b bVar = this.f46158h;
        if (bVar != null) {
            bVar.d(cVar);
        }
    }

    public void J0(String str) {
        this.f46159i = str;
    }

    public int K() {
        return (int) this.f46152b.n();
    }

    public void K0(boolean z10) {
        this.f46164n = z10;
    }

    public void L0(int i10) {
        if (this.f46151a == null) {
            this.f46157g.add(new c(this, i10));
        } else {
            this.f46152b.I(((float) i10) + 0.99f);
        }
    }

    public String M() {
        return this.f46159i;
    }

    public void M0(String str) {
        C8927i iVar = this.f46151a;
        if (iVar == null) {
            this.f46157g.add(new i(this, str));
            return;
        }
        h l10 = iVar.l(str);
        if (l10 != null) {
            L0((int) (l10.f33239b + l10.f33240c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public w6.v N(String str) {
        C8927i iVar = this.f46151a;
        if (iVar == null) {
            return null;
        }
        return iVar.j().get(str);
    }

    public void N0(float f10) {
        C8927i iVar = this.f46151a;
        if (iVar == null) {
            this.f46157g.add(new f(this, f10));
        } else {
            this.f46152b.I(i.i(iVar.p(), this.f46151a.f(), f10));
        }
    }

    public boolean O() {
        return this.f46164n;
    }

    public void O0(int i10, int i11) {
        if (this.f46151a == null) {
            this.f46157g.add(new g(this, i10, i11));
        } else {
            this.f46152b.K((float) i10, ((float) i11) + 0.99f);
        }
    }

    public float P() {
        return this.f46152b.p();
    }

    public void P0(String str) {
        C8927i iVar = this.f46151a;
        if (iVar == null) {
            this.f46157g.add(new b(this, str));
            return;
        }
        h l10 = iVar.l(str);
        if (l10 != null) {
            int i10 = (int) l10.f33239b;
            O0(i10, ((int) l10.f33240c) + i10);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public float Q() {
        return this.f46152b.r();
    }

    public void Q0(int i10) {
        if (this.f46151a == null) {
            this.f46157g.add(new d(this, i10));
        } else {
            this.f46152b.L(i10);
        }
    }

    public D R() {
        C8927i iVar = this.f46151a;
        if (iVar != null) {
            return iVar.n();
        }
        return null;
    }

    public void R0(String str) {
        C8927i iVar = this.f46151a;
        if (iVar == null) {
            this.f46157g.add(new j(this, str));
            return;
        }
        h l10 = iVar.l(str);
        if (l10 != null) {
            Q0((int) l10.f33239b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public float S() {
        return this.f46152b.m();
    }

    public void S0(float f10) {
        C8927i iVar = this.f46151a;
        if (iVar == null) {
            this.f46157g.add(new l(this, f10));
        } else {
            Q0((int) i.i(iVar.p(), this.f46151a.f(), f10));
        }
    }

    public G T() {
        return this.f46172v ? G.SOFTWARE : G.HARDWARE;
    }

    public void T0(boolean z10) {
        if (this.f46169s != z10) {
            this.f46169s = z10;
            c cVar = this.f46166p;
            if (cVar != null) {
                cVar.L(z10);
            }
        }
    }

    public int U() {
        return this.f46152b.getRepeatCount();
    }

    public void U0(boolean z10) {
        this.f46168r = z10;
        C8927i iVar = this.f46151a;
        if (iVar != null) {
            iVar.v(z10);
        }
    }

    @SuppressLint({"WrongConstant"})
    public int V() {
        return this.f46152b.getRepeatMode();
    }

    public void V0(float f10) {
        if (this.f46151a == null) {
            this.f46157g.add(new m(this, f10));
            return;
        }
        C8923e.b("Drawable#setProgress");
        this.f46152b.H(this.f46151a.h(f10));
        C8923e.c("Drawable#setProgress");
    }

    public float W() {
        return this.f46152b.u();
    }

    public void W0(G g10) {
        this.f46171u = g10;
        u();
    }

    public I X() {
        return null;
    }

    public void X0(int i10) {
        this.f46152b.setRepeatCount(i10);
    }

    public Typeface Y(B6.c cVar) {
        Map<String, Typeface> map = this.f46161k;
        if (map != null) {
            String a10 = cVar.a();
            if (map.containsKey(a10)) {
                return map.get(a10);
            }
            String b10 = cVar.b();
            if (map.containsKey(b10)) {
                return map.get(b10);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        A6.a J10 = J();
        if (J10 != null) {
            return J10.b(cVar);
        }
        return null;
    }

    public void Y0(int i10) {
        this.f46152b.setRepeatMode(i10);
    }

    public void Z0(boolean z10) {
        this.f46155e = z10;
    }

    public boolean a0() {
        g gVar = this.f46152b;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    public void a1(float f10) {
        this.f46152b.M(f10);
    }

    /* access modifiers changed from: package-private */
    public boolean b0() {
        if (isVisible()) {
            return this.f46152b.isRunning();
        }
        b bVar = this.f46156f;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    public void b1(Boolean bool) {
        this.f46153c = bool.booleanValue();
    }

    public boolean c0() {
        return this.f46170t;
    }

    public void c1(I i10) {
    }

    public void d1(boolean z10) {
        this.f46152b.N(z10);
    }

    public void draw(Canvas canvas) {
        c cVar = this.f46166p;
        if (cVar != null) {
            boolean E10 = E();
            if (E10) {
                try {
                    this.f46146L.acquire();
                } catch (InterruptedException unused) {
                    C8923e.c("Drawable#draw");
                    if (E10) {
                        this.f46146L.release();
                        if (cVar.Q() == this.f46152b.m()) {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C8923e.c("Drawable#draw");
                    if (E10) {
                        this.f46146L.release();
                        if (cVar.Q() != this.f46152b.m()) {
                            f46134R.execute(this.f46149O);
                        }
                    }
                    throw th2;
                }
            }
            C8923e.b("Drawable#draw");
            if (E10 && e1()) {
                V0(this.f46152b.m());
            }
            if (this.f46155e) {
                try {
                    if (this.f46172v) {
                        v0(canvas, cVar);
                    } else {
                        x(canvas);
                    }
                } catch (Throwable th3) {
                    d.b("Lottie crashed in draw!", th3);
                }
            } else if (this.f46172v) {
                v0(canvas, cVar);
            } else {
                x(canvas);
            }
            this.f46143I = false;
            C8923e.c("Drawable#draw");
            if (E10) {
                this.f46146L.release();
                if (cVar.Q() == this.f46152b.m()) {
                    return;
                }
                f46134R.execute(this.f46149O);
            }
        }
    }

    public boolean f1() {
        return this.f46161k == null && this.f46151a.c().o() > 0;
    }

    public int getAlpha() {
        return this.f46167q;
    }

    public int getIntrinsicHeight() {
        C8927i iVar = this.f46151a;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().height();
    }

    public int getIntrinsicWidth() {
        C8927i iVar = this.f46151a;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().width();
    }

    public int getOpacity() {
        return -3;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        Drawable.Callback callback;
        if (!this.f46143I) {
            this.f46143I = true;
            if ((!f46133Q || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return a0();
    }

    public <T> void q(B6.e eVar, T t10, J6.c<T> cVar) {
        c cVar2 = this.f46166p;
        if (cVar2 == null) {
            this.f46157g.add(new e(this, eVar, t10, cVar));
            return;
        }
        boolean z10 = true;
        if (eVar == B6.e.f33233c) {
            cVar2.h(t10, cVar);
        } else if (eVar.d() != null) {
            eVar.d().h(t10, cVar);
        } else {
            List<B6.e> w02 = w0(eVar);
            for (int i10 = 0; i10 < w02.size(); i10++) {
                w02.get(i10).d().h(t10, cVar);
            }
            z10 = true ^ w02.isEmpty();
        }
        if (z10) {
            invalidateSelf();
            if (t10 == z.f57296E) {
                V0(S());
            }
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        this.f46167q = i10;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        d.c("Use addColorFilter instead.");
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f46156f;
            if (bVar == b.PLAY) {
                u0();
            } else if (bVar == b.RESUME) {
                x0();
            }
        } else if (this.f46152b.isRunning()) {
            t0();
            this.f46156f = b.RESUME;
        } else if (isVisible) {
            this.f46156f = b.NONE;
        }
        return visible;
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || !((View) callback).isInEditMode()) {
            u0();
        }
    }

    public void stop() {
        A();
    }

    public void t() {
        if (this.f46152b.isRunning()) {
            this.f46152b.cancel();
            if (!isVisible()) {
                this.f46156f = b.NONE;
            }
        }
        this.f46151a = null;
        this.f46166p = null;
        this.f46158h = null;
        this.f46150P = -3.4028235E38f;
        this.f46152b.k();
        invalidateSelf();
    }

    public void t0() {
        this.f46157g.clear();
        this.f46152b.w();
        if (!isVisible()) {
            this.f46156f = b.NONE;
        }
    }

    public void u0() {
        if (this.f46166p == null) {
            this.f46157g.add(new k(this));
            return;
        }
        u();
        if (r() || U() == 0) {
            if (isVisible()) {
                this.f46152b.y();
                this.f46156f = b.NONE;
            } else {
                this.f46156f = b.PLAY;
            }
        }
        if (!r()) {
            G0((int) (W() < 0.0f ? Q() : P()));
            this.f46152b.l();
            if (!isVisible()) {
                this.f46156f = b.NONE;
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public List<B6.e> w0(B6.e eVar) {
        if (this.f46166p == null) {
            d.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f46166p.c(eVar, 0, arrayList, new B6.e(new String[0]));
        return arrayList;
    }

    public void x0() {
        if (this.f46166p == null) {
            this.f46157g.add(new h(this));
            return;
        }
        u();
        if (r() || U() == 0) {
            if (isVisible()) {
                this.f46152b.D();
                this.f46156f = b.NONE;
            } else {
                this.f46156f = b.RESUME;
            }
        }
        if (!r()) {
            G0((int) (W() < 0.0f ? Q() : P()));
            this.f46152b.l();
            if (!isVisible()) {
                this.f46156f = b.NONE;
            }
        }
    }

    public void y(boolean z10) {
        if (this.f46163m != z10) {
            this.f46163m = z10;
            if (this.f46151a != null) {
                s();
            }
        }
    }

    public boolean z() {
        return this.f46163m;
    }

    public void z0(boolean z10) {
        this.f46170t = z10;
    }
}
