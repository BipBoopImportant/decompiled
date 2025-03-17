package Ua;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

class p extends o {

    /* renamed from: f  reason: collision with root package name */
    private boolean f64135f = false;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public float f64136g = 0.0f;

    class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            p pVar = p.this;
            if (pVar.f64132c != null && !pVar.f64133d.isEmpty()) {
                p pVar2 = p.this;
                RectF rectF = pVar2.f64133d;
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, pVar2.f64136g);
            }
        }
    }

    p(View view) {
        m(view);
    }

    private float l() {
        RectF rectF;
        k kVar = this.f64132c;
        if (kVar == null || (rectF = this.f64133d) == null) {
            return 0.0f;
        }
        return kVar.f64065f.a(rectF);
    }

    private void m(View view) {
        view.setOutlineProvider(new a());
    }

    private boolean n() {
        k kVar;
        if (this.f64133d.isEmpty() || (kVar = this.f64132c) == null) {
            return false;
        }
        return kVar.u(this.f64133d);
    }

    private boolean o() {
        k kVar;
        if (!this.f64133d.isEmpty() && (kVar = this.f64132c) != null && this.f64131b && !kVar.u(this.f64133d) && p(this.f64132c)) {
            float a10 = this.f64132c.r().a(this.f64133d);
            float a11 = this.f64132c.t().a(this.f64133d);
            float a12 = this.f64132c.j().a(this.f64133d);
            float a13 = this.f64132c.l().a(this.f64133d);
            int i10 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i10 == 0 && a12 == 0.0f && a11 == a13) {
                RectF rectF = this.f64133d;
                rectF.set(rectF.left - a11, rectF.top, rectF.right, rectF.bottom);
                this.f64136g = a11;
                return true;
            } else if (i10 == 0 && a11 == 0.0f && a12 == a13) {
                RectF rectF2 = this.f64133d;
                rectF2.set(rectF2.left, rectF2.top - a12, rectF2.right, rectF2.bottom);
                this.f64136g = a12;
                return true;
            } else if (a11 == 0.0f && a13 == 0.0f && a10 == a12) {
                RectF rectF3 = this.f64133d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + a10, rectF3.bottom);
                this.f64136g = a10;
                return true;
            } else if (a12 == 0.0f && a13 == 0.0f && a10 == a11) {
                RectF rectF4 = this.f64133d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + a10);
                this.f64136g = a10;
                return true;
            }
        }
        return false;
    }

    private static boolean p(k kVar) {
        return (kVar.q() instanceof j) && (kVar.s() instanceof j) && (kVar.i() instanceof j) && (kVar.k() instanceof j);
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        this.f64136g = l();
        this.f64135f = n() || o();
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return !this.f64135f || this.f64130a;
    }
}
