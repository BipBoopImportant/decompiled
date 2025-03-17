package androidx.constraintlayout.motion.widget;

import I2.G;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.f;

public class MotionLayout extends ConstraintLayout implements G {

    /* renamed from: W0  reason: collision with root package name */
    public static boolean f20008W0;

    /* renamed from: A  reason: collision with root package name */
    Interpolator f20009A;

    /* renamed from: A0  reason: collision with root package name */
    float f20010A0;

    /* renamed from: B  reason: collision with root package name */
    float f20011B;

    /* renamed from: B0  reason: collision with root package name */
    private boolean f20012B0;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public int f20013C;

    /* renamed from: C0  reason: collision with root package name */
    private ArrayList<MotionHelper> f20014C0;

    /* renamed from: D  reason: collision with root package name */
    int f20015D;

    /* renamed from: D0  reason: collision with root package name */
    private ArrayList<MotionHelper> f20016D0;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public int f20017E;

    /* renamed from: E0  reason: collision with root package name */
    private ArrayList<MotionHelper> f20018E0;

    /* renamed from: F  reason: collision with root package name */
    private boolean f20019F;

    /* renamed from: F0  reason: collision with root package name */
    private CopyOnWriteArrayList<c> f20020F0;

    /* renamed from: G  reason: collision with root package name */
    HashMap<View, g> f20021G;

    /* renamed from: G0  reason: collision with root package name */
    private int f20022G0;

    /* renamed from: H  reason: collision with root package name */
    private long f20023H;

    /* renamed from: H0  reason: collision with root package name */
    private float f20024H0;

    /* renamed from: I  reason: collision with root package name */
    private float f20025I;

    /* renamed from: I0  reason: collision with root package name */
    boolean f20026I0;

    /* renamed from: J  reason: collision with root package name */
    float f20027J;

    /* renamed from: J0  reason: collision with root package name */
    protected boolean f20028J0;

    /* renamed from: K  reason: collision with root package name */
    float f20029K;

    /* renamed from: K0  reason: collision with root package name */
    float f20030K0;

    /* renamed from: L  reason: collision with root package name */
    private long f20031L;

    /* renamed from: L0  reason: collision with root package name */
    private f f20032L0;

    /* renamed from: M  reason: collision with root package name */
    float f20033M;

    /* renamed from: M0  reason: collision with root package name */
    private boolean f20034M0;

    /* renamed from: N  reason: collision with root package name */
    private boolean f20035N;
    /* access modifiers changed from: private */

    /* renamed from: N0  reason: collision with root package name */
    public b f20036N0;

    /* renamed from: O  reason: collision with root package name */
    boolean f20037O;

    /* renamed from: O0  reason: collision with root package name */
    private Runnable f20038O0;

    /* renamed from: P  reason: collision with root package name */
    private c f20039P;

    /* renamed from: P0  reason: collision with root package name */
    private int[] f20040P0;

    /* renamed from: Q  reason: collision with root package name */
    int f20041Q;

    /* renamed from: Q0  reason: collision with root package name */
    int f20042Q0;

    /* renamed from: R  reason: collision with root package name */
    private boolean f20043R;

    /* renamed from: R0  reason: collision with root package name */
    private int f20044R0;

    /* renamed from: S  reason: collision with root package name */
    private b f20045S;

    /* renamed from: S0  reason: collision with root package name */
    private boolean f20046S0;

    /* renamed from: T  reason: collision with root package name */
    boolean f20047T;

    /* renamed from: T0  reason: collision with root package name */
    d f20048T0;

    /* renamed from: U  reason: collision with root package name */
    float f20049U;

    /* renamed from: U0  reason: collision with root package name */
    private boolean f20050U0;

    /* renamed from: V0  reason: collision with root package name */
    ArrayList<Integer> f20051V0;

    /* renamed from: y0  reason: collision with root package name */
    float f20052y0;

    /* renamed from: z  reason: collision with root package name */
    Interpolator f20053z;

    /* renamed from: z0  reason: collision with root package name */
    long f20054z0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            MotionLayout.this.f20036N0.a();
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        float f20056a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f20057b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        int f20058c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f20059d = -1;

        /* renamed from: e  reason: collision with root package name */
        final String f20060e = "motion.progress";

        /* renamed from: f  reason: collision with root package name */
        final String f20061f = "motion.velocity";

        /* renamed from: g  reason: collision with root package name */
        final String f20062g = "motion.StartState";

        /* renamed from: h  reason: collision with root package name */
        final String f20063h = "motion.EndState";

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i10 = this.f20058c;
            if (!(i10 == -1 && this.f20059d == -1)) {
                if (i10 == -1) {
                    MotionLayout.this.R(this.f20059d);
                } else {
                    int i11 = this.f20059d;
                    if (i11 == -1) {
                        MotionLayout.this.O(i10, -1, -1);
                    } else {
                        MotionLayout.this.P(i10, i11);
                    }
                }
                MotionLayout.this.setState(d.SETUP);
            }
            if (!Float.isNaN(this.f20057b)) {
                MotionLayout.this.N(this.f20056a, this.f20057b);
                this.f20056a = Float.NaN;
                this.f20057b = Float.NaN;
                this.f20058c = -1;
                this.f20059d = -1;
            } else if (!Float.isNaN(this.f20056a)) {
                MotionLayout.this.setProgress(this.f20056a);
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f20056a);
            bundle.putFloat("motion.velocity", this.f20057b);
            bundle.putInt("motion.StartState", this.f20058c);
            bundle.putInt("motion.EndState", this.f20059d);
            return bundle;
        }

        public void c() {
            this.f20059d = MotionLayout.this.f20017E;
            this.f20058c = MotionLayout.this.f20013C;
            this.f20057b = MotionLayout.this.getVelocity();
            this.f20056a = MotionLayout.this.getProgress();
        }

        public void d(int i10) {
            this.f20059d = i10;
        }

        public void e(float f10) {
            this.f20056a = f10;
        }

        public void f(int i10) {
            this.f20058c = i10;
        }

        public void g(Bundle bundle) {
            this.f20056a = bundle.getFloat("motion.progress");
            this.f20057b = bundle.getFloat("motion.velocity");
            this.f20058c = bundle.getInt("motion.StartState");
            this.f20059d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f20057b = f10;
        }
    }

    public interface c {
        void a(MotionLayout motionLayout, int i10, int i11, float f10);

        void b(MotionLayout motionLayout, int i10);

        void c(MotionLayout motionLayout, int i10, int i11);
    }

    enum d {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void I() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.f20039P != null || ((copyOnWriteArrayList = this.f20020F0) != null && !copyOnWriteArrayList.isEmpty())) && this.f20024H0 != this.f20027J) {
            if (this.f20022G0 != -1) {
                K();
                this.f20026I0 = true;
            }
            this.f20022G0 = -1;
            float f10 = this.f20027J;
            this.f20024H0 = f10;
            c cVar = this.f20039P;
            if (cVar != null) {
                cVar.a(this, this.f20013C, this.f20017E, f10);
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f20020F0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<c> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f20013C, this.f20017E, this.f20027J);
                }
            }
            this.f20026I0 = true;
        }
    }

    private void K() {
        c cVar = this.f20039P;
        if (cVar != null) {
            cVar.c(this, this.f20013C, this.f20017E);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f20020F0;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().c(this, this.f20013C, this.f20017E);
            }
        }
    }

    private void M() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if (this.f20039P != null || ((copyOnWriteArrayList = this.f20020F0) != null && !copyOnWriteArrayList.isEmpty())) {
            this.f20026I0 = false;
            Iterator<Integer> it = this.f20051V0.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                c cVar = this.f20039P;
                if (cVar != null) {
                    cVar.b(this, next.intValue());
                }
                CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f20020F0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<c> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(this, next.intValue());
                    }
                }
            }
            this.f20051V0.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public void G(float f10) {
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        float f10;
        boolean z15;
        if (this.f20031L == -1) {
            this.f20031L = getNanoTime();
        }
        float f11 = this.f20029K;
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f20015D = -1;
        }
        if (this.f20012B0 || (this.f20037O && (z10 || this.f20033M != f11))) {
            float signum = Math.signum(this.f20033M - f11);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f20053z;
            float f12 = !(interpolator instanceof h) ? ((((float) (nanoTime - this.f20031L)) * signum) * 1.0E-9f) / this.f20025I : 0.0f;
            float f13 = this.f20029K + f12;
            if (this.f20035N) {
                f13 = this.f20033M;
            }
            int i12 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i12 <= 0 || f13 < this.f20033M) && (signum > 0.0f || f13 > this.f20033M)) {
                z13 = false;
            } else {
                f13 = this.f20033M;
                this.f20037O = false;
                z13 = true;
            }
            this.f20029K = f13;
            this.f20027J = f13;
            this.f20031L = nanoTime;
            if (interpolator == null || z13) {
                this.f20011B = f12;
            } else {
                if (this.f20043R) {
                    f10 = interpolator.getInterpolation(((float) (nanoTime - this.f20023H)) * 1.0E-9f);
                    Interpolator interpolator2 = this.f20053z;
                    if (interpolator2 != null) {
                        this.f20029K = f10;
                        this.f20031L = nanoTime;
                        if (interpolator2 instanceof h) {
                            float a10 = ((h) interpolator2).a();
                            this.f20011B = a10;
                            Math.abs(a10);
                            if (a10 <= 0.0f || f10 < 1.0f) {
                                z15 = false;
                            } else {
                                this.f20029K = 1.0f;
                                z15 = false;
                                this.f20037O = false;
                                f10 = 1.0f;
                            }
                            if (a10 < 0.0f && f10 <= 0.0f) {
                                this.f20029K = 0.0f;
                                this.f20037O = z15;
                                f13 = 0.0f;
                            }
                        }
                    } else {
                        throw null;
                    }
                } else {
                    f10 = interpolator.getInterpolation(f13);
                    Interpolator interpolator3 = this.f20053z;
                    if (interpolator3 instanceof h) {
                        this.f20011B = ((h) interpolator3).a();
                    } else {
                        this.f20011B = ((interpolator3.getInterpolation(f13 + f12) - f10) * signum) / f12;
                    }
                }
                f13 = f10;
            }
            if (Math.abs(this.f20011B) > 1.0E-5f) {
                setState(d.MOVING);
            }
            if ((i12 > 0 && f13 >= this.f20033M) || (signum <= 0.0f && f13 <= this.f20033M)) {
                f13 = this.f20033M;
                this.f20037O = false;
            }
            if (f13 >= 1.0f || f13 <= 0.0f) {
                z14 = false;
                this.f20037O = false;
                setState(d.FINISHED);
            } else {
                z14 = false;
            }
            int childCount = getChildCount();
            this.f20012B0 = z14;
            long nanoTime2 = getNanoTime();
            this.f20030K0 = f13;
            Interpolator interpolator4 = this.f20009A;
            float interpolation = interpolator4 == null ? f13 : interpolator4.getInterpolation(f13);
            Interpolator interpolator5 = this.f20009A;
            if (interpolator5 != null) {
                float interpolation2 = interpolator5.getInterpolation((signum / this.f20025I) + f13);
                this.f20011B = interpolation2;
                this.f20011B = interpolation2 - this.f20009A.getInterpolation(f13);
            }
            for (int i13 = z14; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                g gVar = this.f20021G.get(childAt);
                if (gVar != null) {
                    this.f20012B0 |= gVar.c(childAt, interpolation, nanoTime2, this.f20032L0);
                }
            }
            boolean z16 = (i12 > 0 && f13 >= this.f20033M) || (signum <= 0.0f && f13 <= this.f20033M);
            if (!this.f20012B0 && !this.f20037O && z16) {
                setState(d.FINISHED);
            }
            if (this.f20028J0) {
                requestLayout();
            }
            z11 = true;
            boolean z17 = this.f20012B0 | (!z16);
            this.f20012B0 = z17;
            if (f13 <= 0.0f && (i11 = this.f20013C) != -1 && this.f20015D != i11) {
                this.f20015D = i11;
                throw null;
            } else if (((double) f13) < 1.0d || this.f20015D == (i10 = this.f20017E)) {
                if (z17 || this.f20037O) {
                    invalidate();
                } else if ((i12 > 0 && f13 == 1.0f) || (signum < 0.0f && f13 == 0.0f)) {
                    setState(d.FINISHED);
                }
                if (!this.f20012B0 && !this.f20037O && ((i12 > 0 && f13 == 1.0f) || (signum < 0.0f && f13 == 0.0f))) {
                    L();
                }
            } else {
                this.f20015D = i10;
                throw null;
            }
        } else {
            z11 = true;
        }
        float f14 = this.f20029K;
        if (f14 >= 1.0f) {
            int i14 = this.f20015D;
            int i15 = this.f20017E;
            if (i14 == i15) {
                z11 = false;
            }
            this.f20015D = i15;
        } else if (f14 <= 0.0f) {
            int i16 = this.f20015D;
            int i17 = this.f20013C;
            if (i16 == i17) {
                z11 = false;
            }
            this.f20015D = i17;
        } else {
            z12 = false;
            this.f20050U0 |= z12;
            if (z12 && !this.f20034M0) {
                requestLayout();
            }
            this.f20027J = this.f20029K;
        }
        z12 = z11;
        this.f20050U0 |= z12;
        requestLayout();
        this.f20027J = this.f20029K;
    }

    /* access modifiers changed from: protected */
    public void J() {
        int i10;
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.f20039P != null || ((copyOnWriteArrayList = this.f20020F0) != null && !copyOnWriteArrayList.isEmpty())) && this.f20022G0 == -1) {
            this.f20022G0 = this.f20015D;
            if (!this.f20051V0.isEmpty()) {
                ArrayList<Integer> arrayList = this.f20051V0;
                i10 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i10 = -1;
            }
            int i11 = this.f20015D;
            if (!(i10 == i11 || i11 == -1)) {
                this.f20051V0.add(Integer.valueOf(i11));
            }
        }
        M();
        Runnable runnable = this.f20038O0;
        if (runnable != null) {
            runnable.run();
            this.f20038O0 = null;
        }
        int[] iArr = this.f20040P0;
        if (iArr != null && this.f20042Q0 > 0) {
            R(iArr[0]);
            int[] iArr2 = this.f20040P0;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f20042Q0--;
        }
    }

    /* access modifiers changed from: package-private */
    public void L() {
    }

    public void N(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.f20036N0 == null) {
                this.f20036N0 = new b();
            }
            this.f20036N0.e(f10);
            this.f20036N0.h(f11);
            return;
        }
        setProgress(f10);
        setState(d.MOVING);
        this.f20011B = f11;
        float f12 = 0.0f;
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            if (i10 > 0) {
                f12 = 1.0f;
            }
            G(f12);
        } else if (f10 != 0.0f && f10 != 1.0f) {
            if (f10 > 0.5f) {
                f12 = 1.0f;
            }
            G(f12);
        }
    }

    public void O(int i10, int i11, int i12) {
        setState(d.SETUP);
        this.f20015D = i10;
        this.f20013C = -1;
        this.f20017E = -1;
        androidx.constraintlayout.widget.b bVar = this.f20167k;
        if (bVar != null) {
            bVar.d(i10, (float) i11, (float) i12);
        }
    }

    public void P(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f20036N0 == null) {
                this.f20036N0 = new b();
            }
            this.f20036N0.f(i10);
            this.f20036N0.d(i11);
        }
    }

    public void Q() {
        G(1.0f);
        this.f20038O0 = null;
    }

    public void R(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f20036N0 == null) {
                this.f20036N0 = new b();
            }
            this.f20036N0.d(i10);
            return;
        }
        S(i10, -1, -1);
    }

    public void S(int i10, int i11, int i12) {
        T(i10, i11, i12, -1);
    }

    public void T(int i10, int i11, int i12, int i13) {
        int i14 = this.f20015D;
        if (i14 != i10) {
            if (this.f20013C == i10) {
                G(0.0f);
                if (i13 > 0) {
                    this.f20025I = ((float) i13) / 1000.0f;
                }
            } else if (this.f20017E == i10) {
                G(1.0f);
                if (i13 > 0) {
                    this.f20025I = ((float) i13) / 1000.0f;
                }
            } else {
                this.f20017E = i10;
                if (i14 != -1) {
                    P(i14, i10);
                    G(1.0f);
                    this.f20029K = 0.0f;
                    Q();
                    if (i13 > 0) {
                        this.f20025I = ((float) i13) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.f20043R = false;
                this.f20033M = 1.0f;
                this.f20027J = 0.0f;
                this.f20029K = 0.0f;
                this.f20031L = getNanoTime();
                this.f20023H = getNanoTime();
                this.f20035N = false;
                this.f20053z = null;
                if (i13 == -1) {
                    throw null;
                }
                this.f20013C = -1;
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        ArrayList<MotionHelper> arrayList = this.f20018E0;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().w(canvas);
            }
        }
        H(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f20015D;
    }

    public ArrayList<j.a> getDefinedTransitions() {
        return null;
    }

    public b getDesignTool() {
        if (this.f20045S == null) {
            this.f20045S = new b(this);
        }
        return this.f20045S;
    }

    public int getEndState() {
        return this.f20017E;
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f20029K;
    }

    public j getScene() {
        return null;
    }

    public int getStartState() {
        return this.f20013C;
    }

    public float getTargetPosition() {
        return this.f20033M;
    }

    public Bundle getTransitionState() {
        if (this.f20036N0 == null) {
            this.f20036N0 = new b();
        }
        this.f20036N0.c();
        return this.f20036N0.b();
    }

    public long getTransitionTimeMs() {
        return (long) (this.f20025I * 1000.0f);
    }

    public float getVelocity() {
        return this.f20011B;
    }

    public void i(View view, View view2, int i10, int i11) {
        this.f20054z0 = getNanoTime();
        this.f20010A0 = 0.0f;
        this.f20049U = 0.0f;
        this.f20052y0 = 0.0f;
    }

    public void j(View view, int i10) {
    }

    public void k(View view, int i10, int i11, int[] iArr, int i12) {
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (!(!this.f20047T && i10 == 0 && i11 == 0)) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f20047T = false;
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f20044R0 = display.getRotation();
        }
        L();
        b bVar = this.f20036N0;
        if (bVar == null) {
            return;
        }
        if (this.f20046S0) {
            post(new a());
        } else {
            bVar.a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f20034M0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.f20034M0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onRtlPropertiesChanged(int i10) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f20020F0 == null) {
                this.f20020F0 = new CopyOnWriteArrayList<>();
            }
            this.f20020F0.add(motionHelper);
            if (motionHelper.v()) {
                if (this.f20014C0 == null) {
                    this.f20014C0 = new ArrayList<>();
                }
                this.f20014C0.add(motionHelper);
            }
            if (motionHelper.u()) {
                if (this.f20016D0 == null) {
                    this.f20016D0 = new ArrayList<>();
                }
                this.f20016D0.add(motionHelper);
            }
            if (motionHelper.t()) {
                if (this.f20018E0 == null) {
                    this.f20018E0 = new ArrayList<>();
                }
                this.f20018E0.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f20014C0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f20016D0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        this.f20041Q = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f20046S0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f20019F = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<MotionHelper> arrayList = this.f20016D0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f20016D0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<MotionHelper> arrayList = this.f20014C0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f20014C0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f20036N0 == null) {
                this.f20036N0 = new b();
            }
            this.f20036N0.e(f10);
        } else if (i10 <= 0) {
            if (this.f20029K == 1.0f && this.f20015D == this.f20017E) {
                setState(d.MOVING);
            }
            this.f20015D = this.f20013C;
            if (this.f20029K == 0.0f) {
                setState(d.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.f20029K == 0.0f && this.f20015D == this.f20013C) {
                setState(d.MOVING);
            }
            this.f20015D = this.f20017E;
            if (this.f20029K == 1.0f) {
                setState(d.FINISHED);
            }
        } else {
            this.f20015D = -1;
            setState(d.MOVING);
        }
    }

    public void setScene(j jVar) {
        t();
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void setStartState(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f20036N0 == null) {
                this.f20036N0 = new b();
            }
            this.f20036N0.f(i10);
            this.f20036N0.d(i10);
            return;
        }
        this.f20015D = i10;
    }

    /* access modifiers changed from: package-private */
    public void setState(d dVar) {
        d dVar2 = d.FINISHED;
        if (dVar != dVar2 || this.f20015D != -1) {
            d dVar3 = this.f20048T0;
            this.f20048T0 = dVar;
            d dVar4 = d.MOVING;
            if (dVar3 == dVar4 && dVar == dVar4) {
                I();
            }
            int ordinal = dVar3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (dVar == dVar4) {
                    I();
                }
                if (dVar == dVar2) {
                    J();
                }
            } else if (ordinal == 2 && dVar == dVar2) {
                J();
            }
        }
    }

    public void setTransition(int i10) {
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.f20039P = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f20036N0 == null) {
            this.f20036N0 = new b();
        }
        this.f20036N0.g(bundle);
        if (isAttachedToWindow()) {
            this.f20036N0.a();
        }
    }

    public String toString() {
        Context context = getContext();
        return a.a(context, this.f20013C) + "->" + a.a(context, this.f20017E) + " (pos:" + this.f20029K + " Dpos/Dt:" + this.f20011B;
    }

    /* access modifiers changed from: protected */
    public void v(int i10) {
        this.f20167k = null;
    }

    /* access modifiers changed from: protected */
    public void setTransition(j.a aVar) {
        throw null;
    }
}
