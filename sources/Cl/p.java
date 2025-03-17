package CL;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.Set;

public class p extends j<c> {

    /* renamed from: L  reason: collision with root package name */
    private static final Set<Integer> f133653L;

    /* renamed from: A  reason: collision with root package name */
    private float f133654A;

    /* renamed from: B  reason: collision with root package name */
    private float f133655B;

    /* renamed from: C  reason: collision with root package name */
    private float f133656C;

    /* renamed from: D  reason: collision with root package name */
    private float f133657D;

    /* renamed from: E  reason: collision with root package name */
    private float f133658E;

    /* renamed from: F  reason: collision with root package name */
    private float f133659F;

    /* renamed from: G  reason: collision with root package name */
    private float f133660G;

    /* renamed from: H  reason: collision with root package name */
    private float f133661H;

    /* renamed from: I  reason: collision with root package name */
    private float f133662I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f133663J;

    /* renamed from: K  reason: collision with root package name */
    private float f133664K;

    /* renamed from: v  reason: collision with root package name */
    private final GestureDetector f133665v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f133666w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public PointF f133667x;

    /* renamed from: y  reason: collision with root package name */
    private float f133668y;

    /* renamed from: z  reason: collision with root package name */
    private float f133669z;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                p.this.f133666w = true;
                p.this.f133667x = new PointF(motionEvent.getX(), motionEvent.getY());
            }
            return true;
        }
    }

    public static class b implements c {
    }

    public interface c {
        boolean a(p pVar);

        boolean b(p pVar);

        void c(p pVar, float f10, float f11);
    }

    static {
        HashSet hashSet = new HashSet();
        f133653L = hashSet;
        hashSet.add(1);
        hashSet.add(15);
    }

    public p(Context context, C15522a aVar) {
        super(context, aVar);
        this.f133665v = new GestureDetector(context, new a());
    }

    private float F() {
        if (this.f133666w) {
            boolean z10 = (d().getY() < this.f133667x.y && this.f133655B < this.f133658E) || (d().getY() > this.f133667x.y && this.f133655B > this.f133658E);
            float abs = Math.abs(1.0f - (this.f133655B / this.f133658E)) * 0.5f;
            if (this.f133658E <= 0.0f) {
                return 1.0f;
            }
            return z10 ? 1.0f + abs : 1.0f - abs;
        }
        float f10 = this.f133658E;
        if (f10 > 0.0f) {
            return this.f133655B / f10;
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public Set<Integer> C() {
        return f133653L;
    }

    public float G() {
        return this.f133655B;
    }

    public float H() {
        return this.f133658E;
    }

    public float I() {
        return this.f133664K;
    }

    public boolean J() {
        return this.f133663J;
    }

    public void K(float f10) {
        this.f133662I = f10;
    }

    public void L(int i10) {
        K(this.f133582a.getResources().getDimension(i10));
    }

    /* access modifiers changed from: protected */
    public boolean b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f133666w) {
            if (actionMasked == 5 || actionMasked == 3) {
                if (B()) {
                    A();
                } else {
                    this.f133666w = false;
                }
            } else if (!B() && actionMasked == 1) {
                this.f133666w = false;
            }
        }
        return this.f133665v.onTouchEvent(motionEvent) | super.b(motionEvent);
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        super.j();
        boolean z10 = false;
        int i10 = 1;
        if (!B() || !this.f133666w || o() <= 1) {
            PointF n10 = this.f133666w ? this.f133667x : n();
            this.f133656C = 0.0f;
            this.f133657D = 0.0f;
            for (int i11 = 0; i11 < o(); i11++) {
                this.f133656C += Math.abs(d().getX(i11) - n10.x);
                this.f133657D += Math.abs(d().getY(i11) - n10.y);
            }
            float f10 = this.f133656C * 2.0f;
            this.f133656C = f10;
            float f11 = this.f133657D * 2.0f;
            this.f133657D = f11;
            if (this.f133666w) {
                this.f133655B = f11;
            } else {
                this.f133655B = (float) Math.hypot((double) f10, (double) f11);
            }
            if (this.f133668y == 0.0f) {
                this.f133668y = this.f133655B;
                this.f133669z = this.f133656C;
                this.f133654A = this.f133657D;
            }
            this.f133661H = Math.abs(this.f133668y - this.f133655B);
            float F10 = F();
            this.f133664K = F10;
            this.f133663J = F10 < 1.0f;
            if (!B() || this.f133655B <= 0.0f) {
                if (this.f133666w) {
                    i10 = 15;
                }
                if (c(i10) && this.f133661H >= this.f133662I && (z10 = ((c) this.f133589h).b(this))) {
                    x();
                }
            } else {
                z10 = ((c) this.f133589h).a(this);
            }
            this.f133658E = this.f133655B;
            this.f133659F = this.f133656C;
            this.f133660G = this.f133657D;
            return z10;
        }
        y();
        return false;
    }

    /* access modifiers changed from: protected */
    public int p() {
        return (!B() || this.f133666w) ? 1 : 2;
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        return super.r() || (!this.f133666w && o() < 2);
    }

    /* access modifiers changed from: protected */
    public void t() {
        super.t();
        this.f133668y = 0.0f;
        this.f133661H = 0.0f;
        this.f133655B = 0.0f;
        this.f133658E = 0.0f;
        this.f133664K = 1.0f;
    }

    /* access modifiers changed from: protected */
    public void y() {
        super.y();
        ((c) this.f133589h).c(this, this.f133630t, this.f133631u);
        this.f133666w = false;
    }
}
