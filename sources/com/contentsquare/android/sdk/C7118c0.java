package com.contentsquare.android.sdk;

import G8.t;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.contentsquare.android.sdk.o1;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.c0  reason: case insensitive filesystem */
public class C7118c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f47327a;

    /* renamed from: b  reason: collision with root package name */
    public final t f47328b;

    /* renamed from: c  reason: collision with root package name */
    public VelocityTracker f47329c;

    /* renamed from: d  reason: collision with root package name */
    public double f47330d;

    /* renamed from: e  reason: collision with root package name */
    public int f47331e;

    /* renamed from: f  reason: collision with root package name */
    public int f47332f;

    /* renamed from: g  reason: collision with root package name */
    public int f47333g;

    /* renamed from: h  reason: collision with root package name */
    public int f47334h;

    /* renamed from: i  reason: collision with root package name */
    public int f47335i;

    /* renamed from: j  reason: collision with root package name */
    public int f47336j;

    /* renamed from: k  reason: collision with root package name */
    public int f47337k;

    /* renamed from: l  reason: collision with root package name */
    public int f47338l;

    /* renamed from: m  reason: collision with root package name */
    public long f47339m = Long.MIN_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public double f47340n;

    /* renamed from: o  reason: collision with root package name */
    public long f47341o;

    /* renamed from: p  reason: collision with root package name */
    public a f47342p;

    /* renamed from: com.contentsquare.android.sdk.c0$a */
    public interface a {
        void a(B0 b02);
    }

    public C7118c0(Context context, t tVar) {
        C17542s.j(tVar, "systemInstantiable");
        this.f47327a = context;
        this.f47328b = tVar;
    }

    public void a() {
        VelocityTracker velocityTracker = this.f47329c;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        this.f47339m = Long.MIN_VALUE;
    }

    public final void b(MotionEvent motionEvent) {
        C17542s.j(motionEvent, "event");
        C17542s.j(motionEvent, "event");
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        this.f47331e = rawX;
        this.f47332f = rawY;
        this.f47333g = o1.a.a(rawX, this.f47327a);
        this.f47334h = o1.a.a(rawY, this.f47327a);
        this.f47339m = this.f47328b.a();
        VelocityTracker velocityTracker = this.f47329c;
        if (velocityTracker == null) {
            this.f47329c = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        VelocityTracker velocityTracker2 = this.f47329c;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
    }

    public void c(B0 b02) {
        C17542s.j(b02, "gestureResult");
    }

    public final void d(MotionEvent motionEvent) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Resources resources2;
        DisplayMetrics displayMetrics2;
        C17542s.j(motionEvent, "event");
        if (this.f47339m != Long.MIN_VALUE) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            VelocityTracker velocityTracker = this.f47329c;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            VelocityTracker velocityTracker2 = this.f47329c;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
                VelocityTracker velocityTracker3 = this.f47329c;
                int xVelocity = (int) ((velocityTracker3 != null ? velocityTracker3.getXVelocity(pointerId) : 0.0f) + 0.5f);
                VelocityTracker velocityTracker4 = this.f47329c;
                int yVelocity = (int) ((velocityTracker4 != null ? velocityTracker4.getYVelocity(pointerId) : 0.0f) + 0.5f);
                Context context = this.f47327a;
                int i10 = 160;
                float f10 = (float) 160;
                int i11 = (int) ((((float) xVelocity) / (((float) ((context == null || (resources2 = context.getResources()) == null || (displayMetrics2 = resources2.getDisplayMetrics()) == null) ? 160 : displayMetrics2.densityDpi)) / f10)) + 0.5f);
                Context context2 = this.f47327a;
                if (!(context2 == null || (resources = context2.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
                    i10 = displayMetrics.densityDpi;
                }
                this.f47330d = Math.sqrt(Math.pow((double) ((int) ((((float) yVelocity) / (((float) i10) / f10)) + 0.5f)), 2.0d) + Math.pow((double) i11, 2.0d));
            }
            this.f47335i = o1.a.a(rawX, this.f47327a);
            int a10 = o1.a.a(rawY, this.f47327a);
            this.f47336j = a10;
            this.f47337k = rawX;
            this.f47338l = rawY;
            float f11 = ((float) this.f47335i) - ((float) this.f47333g);
            float f12 = ((float) a10) - ((float) this.f47334h);
            this.f47340n = Math.sqrt((double) ((f12 * f12) + (f11 * f11)));
            this.f47341o = this.f47328b.a() - this.f47339m;
            B0 b02 = new B0();
            b02.f46908e = this.f47340n;
            b02.f46909f = this.f47330d;
            double d10 = (double) this.f47337k;
            b02.f46910g = d10;
            b02.f46911h = (double) this.f47338l;
            b02.f46912i = o1.a.a((int) d10, this.f47327a);
            b02.f46913j = o1.a.a((int) b02.f46911h, this.f47327a);
            if (this.f47340n > 24.0d) {
                b02.f46905b = this.f47330d > 1000.0d ? 10 : 9;
                float f13 = (float) this.f47335i;
                float f14 = (float) this.f47336j;
                float f15 = f13 - ((float) this.f47333g);
                float f16 = f14 - ((float) this.f47334h);
                b02.f46907d = Math.abs(f15) > Math.abs(f16) ? f15 > 0.0f ? 4 : 3 : f16 > 0.0f ? 2 : 1;
            } else {
                b02.f46905b = this.f47341o < 500 ? 6 : 8;
            }
            c(b02);
            a aVar = this.f47342p;
            if (aVar != null) {
                aVar.a(b02);
            }
            a();
        }
    }
}
