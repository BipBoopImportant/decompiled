package com.google.android.material.textfield;

import Na.C9152a;
import Ua.C9286g;
import Ua.k;
import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class h extends C9286g {

    /* renamed from: z  reason: collision with root package name */
    b f67490z;

    @TargetApi(18)
    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: protected */
        public void r(Canvas canvas) {
            if (this.f67490z.f67491w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f67490z.f67491w);
            super.r(canvas);
            canvas.restore();
        }
    }

    static h p0(k kVar) {
        if (kVar == null) {
            kVar = new k();
        }
        return q0(new b(kVar, new RectF()));
    }

    /* access modifiers changed from: private */
    public static h q0(b bVar) {
        return new c(bVar);
    }

    public Drawable mutate() {
        this.f67490z = new b(this.f67490z);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean r0() {
        return !this.f67490z.f67491w.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void s0() {
        t0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void t0(float f10, float f11, float f12, float f13) {
        if (f10 != this.f67490z.f67491w.left || f11 != this.f67490z.f67491w.top || f12 != this.f67490z.f67491w.right || f13 != this.f67490z.f67491w.bottom) {
            this.f67490z.f67491w.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void u0(RectF rectF) {
        t0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    private static final class b extends C9286g.c {
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public final RectF f67491w;

        public Drawable newDrawable() {
            h o02 = h.q0(this);
            o02.invalidateSelf();
            return o02;
        }

        private b(k kVar, RectF rectF) {
            super(kVar, (C9152a) null);
            this.f67491w = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f67491w = bVar.f67491w;
        }
    }

    private h(b bVar) {
        super((C9286g.c) bVar);
        this.f67490z = bVar;
    }
}
