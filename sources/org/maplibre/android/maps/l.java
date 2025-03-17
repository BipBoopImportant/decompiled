package org.maplibre.android.maps;

import CL.C15522a;
import CL.d;
import CL.g;
import CL.k;
import CL.l;
import CL.m;
import CL.o;
import CL.p;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.o;

final class l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final G f145878a;

    /* renamed from: b  reason: collision with root package name */
    private final B f145879b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final H f145880c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C17733b f145881d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C17736e f145882e;

    /* renamed from: f  reason: collision with root package name */
    private final CopyOnWriteArrayList<o.C4251o> f145883f = new CopyOnWriteArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final CopyOnWriteArrayList<o.p> f145884g = new CopyOnWriteArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final CopyOnWriteArrayList<o.i> f145885h = new CopyOnWriteArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private final CopyOnWriteArrayList<o.q> f145886i = new CopyOnWriteArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private final CopyOnWriteArrayList<o.r> f145887j = new CopyOnWriteArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private final CopyOnWriteArrayList<o.s> f145888k = new CopyOnWriteArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private final CopyOnWriteArrayList<o.t> f145889l = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public PointF f145890m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public PointF f145891n = new PointF();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public C15522a f145892o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public Animator f145893p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public Animator f145894q;

    /* renamed from: r  reason: collision with root package name */
    private final List<Animator> f145895r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private Handler f145896s = new Handler(Looper.getMainLooper());

    /* renamed from: t  reason: collision with root package name */
    private boolean f145897t;

    /* renamed from: u  reason: collision with root package name */
    private final Runnable f145898u = new a();

    class a implements Runnable {
        a() {
        }

        public void run() {
            l.this.u();
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PointF f145900a;

        b(PointF pointF) {
            this.f145900a = pointF;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.this.f145878a.w((double) ((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f145900a);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationCancel(Animator animator) {
            l.this.f145878a.c();
        }

        public void onAnimationEnd(Animator animator) {
            l.this.x();
        }

        public void onAnimationStart(Animator animator) {
            l.this.f145878a.c();
            l.this.f145882e.d(1);
        }
    }

    private final class d extends d.b {
        public boolean a(CL.d dVar) {
            if (!l.this.f145880c.x()) {
                return false;
            }
            l.this.v();
            l.this.G(dVar);
            return true;
        }

        public void b(CL.d dVar, float f10, float f11) {
            l.this.x();
            l.this.H(dVar);
        }

        public boolean c(CL.d dVar, float f10, float f11) {
            if (Float.isNaN(f10) || Float.isNaN(f11)) {
                Logger.e("MapGestureDetector", String.format("Could not call onMove with parameters %s,%s", new Object[]{Float.valueOf(f10), Float.valueOf(f11)}));
            } else if (!(f10 == 0.0f && f11 == 0.0f)) {
                l.this.f145882e.d(1);
                if (!l.this.f145880c.r()) {
                    f10 = 0.0f;
                }
                l.this.f145878a.l((double) (-f10), (double) (-f11), 0);
                l.this.I(dVar);
            }
            return true;
        }

        private d() {
        }
    }

    private final class e extends l.b {

        /* renamed from: a  reason: collision with root package name */
        private final float f145904a;

        /* renamed from: b  reason: collision with root package name */
        private final float f145905b;

        /* renamed from: c  reason: collision with root package name */
        private final float f145906c;

        /* renamed from: d  reason: collision with root package name */
        private final double f145907d;

        /* renamed from: e  reason: collision with root package name */
        private final float f145908e;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PointF f145910a;

            a(PointF pointF) {
                this.f145910a = pointF;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PointF pointF = this.f145910a;
                l.this.f145878a.o(l.this.f145878a.f() + ((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()), pointF.x, pointF.y, 0);
            }
        }

        class b extends AnimatorListenerAdapter {
            b() {
            }

            public void onAnimationCancel(Animator animator) {
                l.this.f145878a.c();
            }

            public void onAnimationEnd(Animator animator) {
                l.this.x();
            }

            public void onAnimationStart(Animator animator) {
                l.this.f145878a.c();
                l.this.f145882e.d(1);
            }
        }

        e(float f10, double d10, float f11, float f12, float f13) {
            this.f145904a = f10;
            this.f145905b = f11;
            this.f145906c = f12;
            this.f145907d = d10 * 2.2000000000000003E-4d;
            this.f145908e = f13;
        }

        private Animator d(float f10, long j10, PointF pointF) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, 0.0f});
            ofFloat.setDuration(j10);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new a(pointF));
            ofFloat.addListener(new b());
            return ofFloat;
        }

        private PointF e(CL.l lVar) {
            return l.this.f145890m != null ? l.this.f145890m : lVar.n();
        }

        public boolean a(CL.l lVar) {
            if (!l.this.f145880c.u()) {
                return false;
            }
            float abs = Math.abs(lVar.E());
            double eventTime = (double) lVar.d().getEventTime();
            double eventTime2 = (double) lVar.f().getEventTime();
            if (eventTime == eventTime2) {
                return false;
            }
            double d10 = ((double) abs) / (eventTime - eventTime2);
            float abs2 = Math.abs(lVar.F());
            if (d10 < 0.04d || ((d10 > 0.07d && abs2 < 5.0f) || ((d10 > 0.15d && abs2 < 7.0f) || (d10 > 0.5d && abs2 < 15.0f)))) {
                return false;
            }
            if (l.this.f145880c.s()) {
                l.this.f145892o.f().K(this.f145904a);
                l.this.f145892o.f().A();
            }
            l.this.v();
            l.this.J(lVar);
            return true;
        }

        public void b(CL.l lVar, float f10, float f11, float f12) {
            if (l.this.f145880c.s()) {
                l.this.f145892o.f().K(this.f145908e);
            }
            l.this.K(lVar);
            float b10 = org.maplibre.android.utils.f.b(f12 * this.f145905b, -30.0f, 30.0f);
            double abs = (double) (Math.abs(lVar.E()) / (Math.abs(f10) + Math.abs(f11)));
            if (!l.this.f145880c.v() || Math.abs(b10) < this.f145906c || (l.this.f145892o.f().B() && abs < this.f145907d)) {
                l.this.x();
                return;
            }
            l.this.f145894q = d(b10, (long) ((Math.log(((double) Math.abs(b10)) + (1.0d / Math.pow(2.718281828459045d, 2.0d))) + 2.0d) * 150.0d), e(lVar));
            l lVar2 = l.this;
            lVar2.U(lVar2.f145894q);
        }

        public boolean c(CL.l lVar, float f10, float f11) {
            l.this.f145882e.d(1);
            double f12 = l.this.f145878a.f() + ((double) f10);
            PointF e10 = e(lVar);
            l.this.f145878a.n(f12, e10.x, e10.y);
            l.this.L(lVar);
            return true;
        }
    }

    private final class f extends p.b {

        /* renamed from: a  reason: collision with root package name */
        private final float f145913a;

        /* renamed from: b  reason: collision with root package name */
        private final float f145914b;

        /* renamed from: c  reason: collision with root package name */
        private final float f145915c;

        /* renamed from: d  reason: collision with root package name */
        private final double f145916d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f145917e;

        /* renamed from: f  reason: collision with root package name */
        private float f145918f;

        /* renamed from: g  reason: collision with root package name */
        private double f145919g;

        /* renamed from: h  reason: collision with root package name */
        private double f145920h;

        f(double d10, float f10, float f11, float f12) {
            this.f145913a = f10;
            this.f145914b = f11;
            this.f145915c = f12;
            this.f145916d = d10 * 0.004d;
        }

        private double d(double d10, boolean z10) {
            double a10 = org.maplibre.android.utils.f.a(d10 * 2.5d * 1.0E-4d, 0.0d, 2.5d);
            return z10 ? -a10 : a10;
        }

        private PointF e(p pVar) {
            return l.this.f145890m != null ? l.this.f145890m : this.f145917e ? new PointF(l.this.f145880c.g() / 2.0f, l.this.f145880c.e() / 2.0f) : pVar.n();
        }

        public boolean a(p pVar) {
            l.this.f145882e.d(1);
            PointF e10 = e(pVar);
            if (this.f145917e) {
                double abs = (double) Math.abs(pVar.d().getY() - l.this.f145891n.y);
                boolean z10 = pVar.d().getY() < l.this.f145891n.y;
                double c10 = org.maplibre.android.utils.f.c(abs, 0.0d, this.f145919g, 0.0d, 4.0d);
                double d10 = this.f145920h;
                l.this.f145878a.w((z10 ? d10 - c10 : d10 + c10) * ((double) l.this.f145880c.h()), e10);
            } else {
                l.this.f145878a.x((Math.log((double) pVar.I()) / Math.log(1.5707963267948966d)) * 0.6499999761581421d * ((double) l.this.f145880c.h()), e10);
            }
            l.this.O(pVar);
            this.f145918f = Math.abs(pVar.G() - pVar.H());
            return true;
        }

        public boolean b(p pVar) {
            this.f145917e = pVar.o() == 1;
            if (!l.this.f145880c.z()) {
                return false;
            }
            if (this.f145917e) {
                if (!l.this.f145880c.t()) {
                    return false;
                }
                l.this.f145892o.b().h(false);
            } else if (pVar.H() <= 0.0f) {
                return false;
            } else {
                float G10 = pVar.G();
                float H10 = pVar.H();
                double eventTime = (double) pVar.d().getEventTime();
                double eventTime2 = (double) pVar.f().getEventTime();
                if (eventTime == eventTime2) {
                    return false;
                }
                double abs = ((double) Math.abs(G10 - H10)) / (eventTime - eventTime2);
                if (abs < ((double) this.f145913a)) {
                    return false;
                }
                if (!l.this.f145892o.d().B()) {
                    if (((double) Math.abs(l.this.f145892o.d().E())) > 0.4d && abs < ((double) this.f145914b)) {
                        return false;
                    }
                    if (l.this.f145880c.o()) {
                        l.this.f145892o.d().h(false);
                    }
                }
            }
            this.f145919g = (double) Resources.getSystem().getDisplayMetrics().heightPixels;
            this.f145920h = l.this.f145878a.g();
            l.this.v();
            l.this.M(pVar);
            this.f145918f = Math.abs(pVar.G() - pVar.H());
            return true;
        }

        public void c(p pVar, float f10, float f11) {
            if (this.f145917e) {
                l.this.f145892o.b().h(true);
            } else {
                l.this.f145892o.d().h(true);
            }
            l.this.N(pVar);
            float abs = Math.abs(f10) + Math.abs(f11);
            if (!l.this.f145880c.w() || abs < this.f145915c || ((double) (this.f145918f / abs)) < this.f145916d) {
                l.this.x();
                return;
            }
            double d10 = d((double) abs, pVar.J());
            double g10 = l.this.f145878a.g();
            PointF e10 = e(pVar);
            long log = (long) ((Math.log(Math.abs(d10) + (1.0d / Math.pow(2.718281828459045d, 2.0d))) + 2.0d) * 150.0d);
            l lVar = l.this;
            lVar.f145893p = lVar.w(g10, d10, e10, log);
            l lVar2 = l.this;
            lVar2.U(lVar2.f145893p);
        }
    }

    private final class g extends m.b {
        public boolean a(m mVar) {
            if (!l.this.f145880c.y()) {
                return false;
            }
            l.this.v();
            l.this.f145892o.b().h(false);
            l.this.P(mVar);
            return true;
        }

        public void b(m mVar, float f10, float f11) {
            l.this.x();
            l.this.f145892o.b().h(true);
            l.this.Q(mVar);
        }

        public boolean c(m mVar, float f10, float f11) {
            l.this.f145882e.d(1);
            l.this.f145878a.v(Double.valueOf(org.maplibre.android.utils.f.a(l.this.f145878a.h() - ((double) (f10 * 0.1f)), 0.0d, 60.0d)));
            l.this.R(mVar);
            return true;
        }

        private g() {
        }
    }

    private final class h extends o.b {

        /* renamed from: a  reason: collision with root package name */
        private final float f145923a;

        h(float f10) {
            this.f145923a = f10;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                l.this.f145891n = new PointF(motionEvent.getX(), motionEvent.getY());
                l.this.z();
            }
            if (motionEvent.getActionMasked() != 1) {
                return super.onDoubleTapEvent(motionEvent);
            }
            float abs = Math.abs(motionEvent.getX() - l.this.f145891n.x);
            float abs2 = Math.abs(motionEvent.getY() - l.this.f145891n.y);
            float f10 = this.f145923a;
            if (abs > f10 || abs2 > f10 || !l.this.f145880c.z() || !l.this.f145880c.p()) {
                return false;
            }
            if (l.this.f145890m != null) {
                l lVar = l.this;
                lVar.f145891n = lVar.f145890m;
            }
            l lVar2 = l.this;
            lVar2.X(lVar2.f145891n, false);
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            double d10;
            if (!l.this.f145880c.x() || !l.this.f145880c.q()) {
                return false;
            }
            float f12 = l.this.f145880c.f();
            double hypot = Math.hypot((double) (f10 / f12), (double) (f11 / f12));
            if (hypot < ((double) l.this.f145880c.c())) {
                return false;
            }
            double h10 = l.this.f145878a.h();
            long b10 = (long) (((hypot / 7.0d) / ((h10 != 0.0d ? h10 / 10.0d : 0.0d) + 1.5d)) + ((double) l.this.f145880c.b()));
            float f13 = (float) b10;
            double d11 = (((double) (f10 * f13)) * 0.28d) / 1000.0d;
            double d12 = (((double) (f13 * f11)) * 0.28d) / 1000.0d;
            if (l.this.f145880c.r()) {
                d10 = d11;
            } else if (Math.abs(Math.toDegrees(Math.atan(d11 / d12))) > 75.0d) {
                return false;
            } else {
                d10 = 0.0d;
            }
            l.this.f145878a.c();
            l.this.D();
            l.this.f145882e.d(1);
            l.this.f145878a.l(d10, d12, b10);
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            l.this.F(new PointF(motionEvent.getX(), motionEvent.getY()));
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            if (l.this.f145881d.m(pointF)) {
                return true;
            }
            if (l.this.f145880c.n()) {
                l.this.f145881d.d();
            }
            l.this.E(pointF);
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            l.this.f145878a.c();
            return true;
        }
    }

    private final class i implements g.a {
        public boolean a(CL.g gVar, int i10) {
            if (!l.this.f145880c.z() || i10 != 2) {
                return false;
            }
            l.this.f145878a.c();
            l.this.f145882e.d(1);
            l.this.Y(l.this.f145890m != null ? l.this.f145890m : gVar.n(), false);
            return true;
        }

        private i() {
        }
    }

    l(Context context, G g10, B b10, H h10, C17733b bVar, C17736e eVar) {
        this.f145881d = bVar;
        this.f145878a = g10;
        this.f145879b = b10;
        this.f145880c = h10;
        this.f145882e = eVar;
        if (context != null) {
            B(new C15522a(context), true);
            A(context, true);
        }
    }

    private void A(Context context, boolean z10) {
        if (z10) {
            h hVar = new h(context.getResources().getDimension(k.f133633b));
            d dVar = new d();
            f fVar = new f((double) context.getResources().getDimension(org.maplibre.android.h.f145519b), context.getResources().getDimension(org.maplibre.android.h.f145527j), context.getResources().getDimension(org.maplibre.android.h.f145524g), context.getResources().getDimension(org.maplibre.android.h.f145528k));
            e eVar = new e(context.getResources().getDimension(org.maplibre.android.h.f145526i), (double) context.getResources().getDimension(org.maplibre.android.h.f145519b), context.getResources().getDimension(org.maplibre.android.h.f145518a), context.getResources().getDimension(org.maplibre.android.h.f145525h), context.getResources().getDimension(k.f133633b));
            g gVar = new g();
            i iVar = new i();
            this.f145892o.o(hVar);
            this.f145892o.i(dVar);
            this.f145892o.p(fVar);
            this.f145892o.m(eVar);
            this.f145892o.n(gVar);
            this.f145892o.j(iVar);
        }
    }

    private void B(C15522a aVar, boolean z10) {
        if (z10) {
            HashSet hashSet = new HashSet();
            hashSet.add(3);
            hashSet.add(1);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(3);
            hashSet2.add(2);
            HashSet hashSet3 = new HashSet();
            hashSet3.add(1);
            hashSet3.add(6);
            aVar.l(hashSet, hashSet2, hashSet3);
        }
        this.f145892o = aVar;
        aVar.d().H(3.0f);
    }

    private boolean C() {
        return (!this.f145880c.x() || !this.f145892o.b().B()) && (!this.f145880c.z() || !this.f145892o.f().B()) && ((!this.f145880c.u() || !this.f145892o.d().B()) && (!this.f145880c.y() || !this.f145892o.e().B()));
    }

    /* access modifiers changed from: private */
    public void U(Animator animator) {
        this.f145895r.add(animator);
        this.f145896s.removeCallbacksAndMessages((Object) null);
        this.f145896s.postDelayed(this.f145898u, 150);
    }

    private void W(boolean z10, PointF pointF, boolean z11) {
        t(this.f145893p);
        Animator w10 = w(this.f145878a.g(), z10 ? 1.0d : -1.0d, pointF, 300);
        this.f145893p = w10;
        if (z11) {
            w10.start();
        } else {
            U(w10);
        }
    }

    private void t(Animator animator) {
        if (animator != null && animator.isStarted()) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: private */
    public void v() {
        if (C()) {
            this.f145878a.c();
        }
    }

    /* access modifiers changed from: private */
    public Animator w(double d10, double d11, PointF pointF, long j10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) d10, (float) (d10 + d11)});
        ofFloat.setDuration(j10);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new b(pointF));
        ofFloat.addListener(new c());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public void x() {
        if (C()) {
            this.f145878a.j();
            this.f145882e.c();
        }
    }

    private void y() {
        if (this.f145897t) {
            this.f145892o.b().h(true);
            this.f145897t = false;
        }
    }

    /* access modifiers changed from: private */
    public void z() {
        this.f145892o.b().h(false);
        this.f145897t = true;
    }

    /* access modifiers changed from: package-private */
    public void D() {
        Iterator<o.i> it = this.f145885h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0006 A[LOOP:0: B:1:0x0006->B:4:0x001c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E(android.graphics.PointF r4) {
        /*
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<org.maplibre.android.maps.o$o> r0 = r3.f145883f
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r0.next()
            org.maplibre.android.maps.o$o r1 = (org.maplibre.android.maps.o.C4251o) r1
            org.maplibre.android.maps.B r2 = r3.f145879b
            org.maplibre.android.geometry.LatLng r2 = r2.a(r4)
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L_0x0006
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.maps.l.E(android.graphics.PointF):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0006 A[LOOP:0: B:1:0x0006->B:4:0x001c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F(android.graphics.PointF r4) {
        /*
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<org.maplibre.android.maps.o$p> r0 = r3.f145884g
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r0.next()
            org.maplibre.android.maps.o$p r1 = (org.maplibre.android.maps.o.p) r1
            org.maplibre.android.maps.B r2 = r3.f145879b
            org.maplibre.android.geometry.LatLng r2 = r2.a(r4)
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L_0x0006
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.maps.l.F(android.graphics.PointF):void");
    }

    /* access modifiers changed from: package-private */
    public void G(CL.d dVar) {
        Iterator<o.q> it = this.f145886i.iterator();
        while (it.hasNext()) {
            it.next().a(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void H(CL.d dVar) {
        Iterator<o.q> it = this.f145886i.iterator();
        while (it.hasNext()) {
            it.next().b(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(CL.d dVar) {
        Iterator<o.q> it = this.f145886i.iterator();
        while (it.hasNext()) {
            it.next().c(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(CL.l lVar) {
        Iterator<o.r> it = this.f145887j.iterator();
        while (it.hasNext()) {
            it.next().a(lVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(CL.l lVar) {
        Iterator<o.r> it = this.f145887j.iterator();
        while (it.hasNext()) {
            it.next().b(lVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void L(CL.l lVar) {
        Iterator<o.r> it = this.f145887j.iterator();
        while (it.hasNext()) {
            it.next().c(lVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void M(p pVar) {
        Iterator<o.s> it = this.f145888k.iterator();
        while (it.hasNext()) {
            it.next().b(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void N(p pVar) {
        Iterator<o.s> it = this.f145888k.iterator();
        while (it.hasNext()) {
            it.next().c(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void O(p pVar) {
        Iterator<o.s> it = this.f145888k.iterator();
        while (it.hasNext()) {
            it.next().a(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void P(m mVar) {
        Iterator<o.t> it = this.f145889l.iterator();
        while (it.hasNext()) {
            it.next().a(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(m mVar) {
        Iterator<o.t> it = this.f145889l.iterator();
        while (it.hasNext()) {
            it.next().c(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void R(m mVar) {
        Iterator<o.t> it = this.f145889l.iterator();
        while (it.hasNext()) {
            it.next().b(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean S(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 2 || motionEvent.getActionMasked() != 8 || !this.f145880c.z()) {
            return false;
        }
        this.f145878a.c();
        this.f145878a.x((double) motionEvent.getAxisValue(9), new PointF(motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean T(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getButtonState() != 0 && motionEvent.getButtonState() != 1) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            u();
            this.f145878a.p(true);
        }
        boolean h10 = this.f145892o.h(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            y();
            this.f145878a.p(false);
            if (!this.f145895r.isEmpty()) {
                this.f145896s.removeCallbacksAndMessages((Object) null);
                for (Animator start : this.f145895r) {
                    start.start();
                }
                this.f145895r.clear();
            }
        } else if (actionMasked == 3) {
            this.f145895r.clear();
            this.f145878a.p(false);
            y();
        } else if (actionMasked == 5) {
            y();
        }
        return h10;
    }

    /* access modifiers changed from: package-private */
    public void V(PointF pointF) {
        if (pointF == null && this.f145880c.d() != null) {
            pointF = this.f145880c.d();
        }
        this.f145890m = pointF;
    }

    /* access modifiers changed from: package-private */
    public void X(PointF pointF, boolean z10) {
        W(true, pointF, z10);
    }

    /* access modifiers changed from: package-private */
    public void Y(PointF pointF, boolean z10) {
        W(false, pointF, z10);
    }

    /* access modifiers changed from: package-private */
    public void r(o.C4251o oVar) {
        this.f145883f.add(oVar);
    }

    /* access modifiers changed from: package-private */
    public void s(o.p pVar) {
        this.f145884g.add(pVar);
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.f145896s.removeCallbacksAndMessages((Object) null);
        this.f145895r.clear();
        t(this.f145893p);
        t(this.f145894q);
        x();
    }
}
