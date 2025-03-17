package com.contentsquare.android.sdk;

import G8.t;
import a9.C6979y6;
import a9.Z2;
import android.app.Application;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.contentsquare.android.sdk.C7118c0;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.u0  reason: case insensitive filesystem */
public final class C7154u0 implements C7118c0.a {

    /* renamed from: a  reason: collision with root package name */
    public final t f47652a;

    /* renamed from: b  reason: collision with root package name */
    public final C7118c0 f47653b;

    /* renamed from: c  reason: collision with root package name */
    public long f47654c;

    /* renamed from: d  reason: collision with root package name */
    public C6979y6 f47655d;

    public C7154u0(Application application, t tVar) {
        C7118c0 c0Var = new C7118c0(application, tVar);
        C17542s.j(application, "application");
        C17542s.j(tVar, "systemInstantiable");
        C17542s.j(c0Var, "genericGestureDetector");
        this.f47652a = tVar;
        this.f47653b = c0Var;
        c0Var.f47342p = this;
    }

    public final void a(B0 b02) {
        Z2 z22;
        C6979y6 y6Var;
        C17542s.j(b02, "result");
        switch (b02.f46905b) {
            case 6:
            case 8:
            case 9:
            case 10:
                z22 = new Z2(this.f47654c, b02);
                break;
            default:
                z22 = null;
                break;
        }
        if (z22 != null && (y6Var = this.f47655d) != null) {
            y6Var.b(z22);
        }
    }

    public final void b(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        C17542s.j(motionEvent, "event");
        if (motionEvent.getPointerCount() <= 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f47654c = this.f47652a.a();
                this.f47653b.a();
                this.f47653b.b(motionEvent);
            } else if (actionMasked == 1) {
                this.f47653b.d(motionEvent);
            } else if (actionMasked != 2) {
                this.f47653b.a();
            } else {
                C7118c0 c0Var = this.f47653b;
                c0Var.getClass();
                C17542s.j(motionEvent, "event");
                if (c0Var.f47339m != Long.MIN_VALUE && (velocityTracker = c0Var.f47329c) != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        }
    }
}
