package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class p extends RecyclerView.B {

    /* renamed from: i  reason: collision with root package name */
    protected final LinearInterpolator f44169i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    protected final DecelerateInterpolator f44170j = new DecelerateInterpolator();
    @SuppressLint({"UnknownNullness"})

    /* renamed from: k  reason: collision with root package name */
    protected PointF f44171k;

    /* renamed from: l  reason: collision with root package name */
    private final DisplayMetrics f44172l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f44173m = false;

    /* renamed from: n  reason: collision with root package name */
    private float f44174n;

    /* renamed from: o  reason: collision with root package name */
    protected int f44175o = 0;

    /* renamed from: p  reason: collision with root package name */
    protected int f44176p = 0;

    @SuppressLint({"UnknownNullness"})
    public p(Context context) {
        this.f44172l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f44173m) {
            this.f44174n = v(this.f44172l);
            this.f44173m = true;
        }
        return this.f44174n;
    }

    private int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    /* access modifiers changed from: protected */
    public int B() {
        PointF pointF = this.f44171k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"UnknownNullness"})
    public void C(RecyclerView.B.a aVar) {
        PointF a10 = a(f());
        if (a10 == null || (a10.x == 0.0f && a10.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a10);
        this.f44171k = a10;
        this.f44175o = (int) (a10.x * 10000.0f);
        this.f44176p = (int) (a10.y * 10000.0f);
        aVar.d((int) (((float) this.f44175o) * 1.2f), (int) (((float) this.f44176p) * 1.2f), (int) (((float) x(10000)) * 1.2f), this.f44169i);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"UnknownNullness"})
    public void l(int i10, int i11, RecyclerView.C c10, RecyclerView.B.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f44175o = y(this.f44175o, i10);
        int y10 = y(this.f44176p, i11);
        this.f44176p = y10;
        if (this.f44175o == 0 && y10 == 0) {
            C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void n() {
        this.f44176p = 0;
        this.f44175o = 0;
        this.f44171k = null;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"UnknownNullness"})
    public void o(View view, RecyclerView.C c10, RecyclerView.B.a aVar) {
        int t10 = t(view, z());
        int u10 = u(view, B());
        int w10 = w((int) Math.sqrt((double) ((t10 * t10) + (u10 * u10))));
        if (w10 > 0) {
            aVar.d(-t10, -u10, w10, this.f44170j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 == 0) {
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        } else if (i14 == 1) {
            return i13 - i11;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    @SuppressLint({"UnknownNullness"})
    public int t(View view, int i10) {
        RecyclerView.q e10 = e();
        if (e10 == null || !e10.M()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(e10.s0(view) - rVar.leftMargin, e10.v0(view) + rVar.rightMargin, e10.t(), e10.L0() - e10.o(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    public int u(View view, int i10) {
        RecyclerView.q e10 = e();
        if (e10 == null || !e10.N()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(e10.w0(view) - rVar.topMargin, e10.q0(view) + rVar.bottomMargin, e10.s(), e10.y0() - e10.c(), i10);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"UnknownNullness"})
    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public int w(int i10) {
        return (int) Math.ceil(((double) x(i10)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int x(int i10) {
        return (int) Math.ceil((double) (((float) Math.abs(i10)) * A()));
    }

    /* access modifiers changed from: protected */
    public int z() {
        PointF pointF = this.f44171k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
