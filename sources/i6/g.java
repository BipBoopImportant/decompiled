package I6;

import android.view.Choreographer;
import w6.C8923e;
import w6.C8927i;

public class g extends a implements Choreographer.FrameCallback {

    /* renamed from: d  reason: collision with root package name */
    private float f36958d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36959e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f36960f = 0;

    /* renamed from: g  reason: collision with root package name */
    private float f36961g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f36962h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    private int f36963i = 0;

    /* renamed from: j  reason: collision with root package name */
    private float f36964j = -2.14748365E9f;

    /* renamed from: k  reason: collision with root package name */
    private float f36965k = 2.14748365E9f;

    /* renamed from: l  reason: collision with root package name */
    private C8927i f36966l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f36967m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f36968n = false;

    private void O() {
        if (this.f36966l != null) {
            float f10 = this.f36962h;
            if (f10 < this.f36964j || f10 > this.f36965k) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f36964j), Float.valueOf(this.f36965k), Float.valueOf(this.f36962h)}));
            }
        }
    }

    private float o() {
        C8927i iVar = this.f36966l;
        if (iVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / iVar.i()) / Math.abs(this.f36958d);
    }

    private boolean v() {
        return u() < 0.0f;
    }

    /* access modifiers changed from: protected */
    public void A() {
        C(true);
    }

    /* access modifiers changed from: protected */
    public void C(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f36967m = false;
        }
    }

    public void D() {
        this.f36967m = true;
        z();
        this.f36960f = 0;
        if (v() && n() == r()) {
            H(p());
        } else if (!v() && n() == p()) {
            H(r());
        }
        e();
    }

    public void E() {
        M(-u());
    }

    public void G(C8927i iVar) {
        boolean z10 = this.f36966l == null;
        this.f36966l = iVar;
        if (z10) {
            K(Math.max(this.f36964j, iVar.p()), Math.min(this.f36965k, iVar.f()));
        } else {
            K((float) ((int) iVar.p()), (float) ((int) iVar.f()));
        }
        float f10 = this.f36962h;
        this.f36962h = 0.0f;
        this.f36961g = 0.0f;
        H((float) ((int) f10));
        j();
    }

    public void H(float f10) {
        if (this.f36961g != f10) {
            float b10 = i.b(f10, r(), p());
            this.f36961g = b10;
            if (this.f36968n) {
                b10 = (float) Math.floor((double) b10);
            }
            this.f36962h = b10;
            this.f36960f = 0;
            j();
        }
    }

    public void I(float f10) {
        K(this.f36964j, f10);
    }

    public void K(float f10, float f11) {
        if (f10 <= f11) {
            C8927i iVar = this.f36966l;
            float p10 = iVar == null ? -3.4028235E38f : iVar.p();
            C8927i iVar2 = this.f36966l;
            float f12 = iVar2 == null ? Float.MAX_VALUE : iVar2.f();
            float b10 = i.b(f10, p10, f12);
            float b11 = i.b(f11, p10, f12);
            if (b10 != this.f36964j || b11 != this.f36965k) {
                this.f36964j = b10;
                this.f36965k = b11;
                H((float) ((int) i.b(this.f36962h, b10, b11)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f10), Float.valueOf(f11)}));
    }

    public void L(int i10) {
        K((float) i10, (float) ((int) this.f36965k));
    }

    public void M(float f10) {
        this.f36958d = f10;
    }

    public void N(boolean z10) {
        this.f36968n = z10;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        super.a();
        b(v());
    }

    public void cancel() {
        a();
        A();
    }

    public void doFrame(long j10) {
        z();
        if (this.f36966l != null && isRunning()) {
            C8923e.b("LottieValueAnimator#doFrame");
            long j11 = this.f36960f;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float o10 = ((float) j12) / o();
            float f10 = this.f36961g;
            if (v()) {
                o10 = -o10;
            }
            float f11 = f10 + o10;
            boolean d10 = i.d(f11, r(), p());
            float f12 = this.f36961g;
            float b10 = i.b(f11, r(), p());
            this.f36961g = b10;
            if (this.f36968n) {
                b10 = (float) Math.floor((double) b10);
            }
            this.f36962h = b10;
            this.f36960f = j10;
            if (!this.f36968n || this.f36961g != f12) {
                j();
            }
            if (!d10) {
                if (getRepeatCount() == -1 || this.f36963i < getRepeatCount()) {
                    d();
                    this.f36963i++;
                    if (getRepeatMode() == 2) {
                        this.f36959e = !this.f36959e;
                        E();
                    } else {
                        float p10 = v() ? p() : r();
                        this.f36961g = p10;
                        this.f36962h = p10;
                    }
                    this.f36960f = j10;
                } else {
                    float r10 = this.f36958d < 0.0f ? r() : p();
                    this.f36961g = r10;
                    this.f36962h = r10;
                    A();
                    b(v());
                }
            }
            O();
            C8923e.c("LottieValueAnimator#doFrame");
        }
    }

    public float getAnimatedFraction() {
        float r10;
        float p10;
        float r11;
        if (this.f36966l == null) {
            return 0.0f;
        }
        if (v()) {
            r10 = p() - this.f36962h;
            p10 = p();
            r11 = r();
        } else {
            r10 = this.f36962h - r();
            p10 = p();
            r11 = r();
        }
        return r10 / (p10 - r11);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(m());
    }

    public long getDuration() {
        C8927i iVar = this.f36966l;
        if (iVar == null) {
            return 0;
        }
        return (long) iVar.d();
    }

    public boolean isRunning() {
        return this.f36967m;
    }

    public void k() {
        this.f36966l = null;
        this.f36964j = -2.14748365E9f;
        this.f36965k = 2.14748365E9f;
    }

    public void l() {
        A();
        b(v());
    }

    public float m() {
        C8927i iVar = this.f36966l;
        if (iVar == null) {
            return 0.0f;
        }
        return (this.f36962h - iVar.p()) / (this.f36966l.f() - this.f36966l.p());
    }

    public float n() {
        return this.f36962h;
    }

    public float p() {
        C8927i iVar = this.f36966l;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f36965k;
        return f10 == 2.14748365E9f ? iVar.f() : f10;
    }

    public float r() {
        C8927i iVar = this.f36966l;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f36964j;
        return f10 == -2.14748365E9f ? iVar.p() : f10;
    }

    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f36959e) {
            this.f36959e = false;
            E();
        }
    }

    public float u() {
        return this.f36958d;
    }

    public void w() {
        A();
        c();
    }

    public void y() {
        this.f36967m = true;
        f(v());
        H((float) ((int) (v() ? p() : r())));
        this.f36960f = 0;
        this.f36963i = 0;
        z();
    }

    /* access modifiers changed from: protected */
    public void z() {
        if (isRunning()) {
            C(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
