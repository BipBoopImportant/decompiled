package J6;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import w6.C8927i;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C8927i f37350a;

    /* renamed from: b  reason: collision with root package name */
    public final T f37351b;

    /* renamed from: c  reason: collision with root package name */
    public T f37352c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f37353d;

    /* renamed from: e  reason: collision with root package name */
    public final Interpolator f37354e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f37355f;

    /* renamed from: g  reason: collision with root package name */
    public final float f37356g;

    /* renamed from: h  reason: collision with root package name */
    public Float f37357h;

    /* renamed from: i  reason: collision with root package name */
    private float f37358i;

    /* renamed from: j  reason: collision with root package name */
    private float f37359j;

    /* renamed from: k  reason: collision with root package name */
    private int f37360k;

    /* renamed from: l  reason: collision with root package name */
    private int f37361l;

    /* renamed from: m  reason: collision with root package name */
    private float f37362m;

    /* renamed from: n  reason: collision with root package name */
    private float f37363n;

    /* renamed from: o  reason: collision with root package name */
    public PointF f37364o;

    /* renamed from: p  reason: collision with root package name */
    public PointF f37365p;

    public a(C8927i iVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.f37358i = -3987645.8f;
        this.f37359j = -3987645.8f;
        this.f37360k = 784923401;
        this.f37361l = 784923401;
        this.f37362m = Float.MIN_VALUE;
        this.f37363n = Float.MIN_VALUE;
        this.f37364o = null;
        this.f37365p = null;
        this.f37350a = iVar;
        this.f37351b = t10;
        this.f37352c = t11;
        this.f37353d = interpolator;
        this.f37354e = null;
        this.f37355f = null;
        this.f37356g = f10;
        this.f37357h = f11;
    }

    public boolean a(float f10) {
        return f10 >= f() && f10 < c();
    }

    public a<T> b(T t10, T t11) {
        return new a<>(t10, t11);
    }

    public float c() {
        if (this.f37350a == null) {
            return 1.0f;
        }
        if (this.f37363n == Float.MIN_VALUE) {
            if (this.f37357h == null) {
                this.f37363n = 1.0f;
            } else {
                this.f37363n = f() + ((this.f37357h.floatValue() - this.f37356g) / this.f37350a.e());
            }
        }
        return this.f37363n;
    }

    public float d() {
        if (this.f37359j == -3987645.8f) {
            this.f37359j = ((Float) this.f37352c).floatValue();
        }
        return this.f37359j;
    }

    public int e() {
        if (this.f37361l == 784923401) {
            this.f37361l = ((Integer) this.f37352c).intValue();
        }
        return this.f37361l;
    }

    public float f() {
        C8927i iVar = this.f37350a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f37362m == Float.MIN_VALUE) {
            this.f37362m = (this.f37356g - iVar.p()) / this.f37350a.e();
        }
        return this.f37362m;
    }

    public float g() {
        if (this.f37358i == -3987645.8f) {
            this.f37358i = ((Float) this.f37351b).floatValue();
        }
        return this.f37358i;
    }

    public int h() {
        if (this.f37360k == 784923401) {
            this.f37360k = ((Integer) this.f37351b).intValue();
        }
        return this.f37360k;
    }

    public boolean i() {
        return this.f37353d == null && this.f37354e == null && this.f37355f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f37351b + ", endValue=" + this.f37352c + ", startFrame=" + this.f37356g + ", endFrame=" + this.f37357h + ", interpolator=" + this.f37353d + '}';
    }

    public a(C8927i iVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f37358i = -3987645.8f;
        this.f37359j = -3987645.8f;
        this.f37360k = 784923401;
        this.f37361l = 784923401;
        this.f37362m = Float.MIN_VALUE;
        this.f37363n = Float.MIN_VALUE;
        this.f37364o = null;
        this.f37365p = null;
        this.f37350a = iVar;
        this.f37351b = t10;
        this.f37352c = t11;
        this.f37353d = null;
        this.f37354e = interpolator;
        this.f37355f = interpolator2;
        this.f37356g = f10;
        this.f37357h = f11;
    }

    protected a(C8927i iVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f37358i = -3987645.8f;
        this.f37359j = -3987645.8f;
        this.f37360k = 784923401;
        this.f37361l = 784923401;
        this.f37362m = Float.MIN_VALUE;
        this.f37363n = Float.MIN_VALUE;
        this.f37364o = null;
        this.f37365p = null;
        this.f37350a = iVar;
        this.f37351b = t10;
        this.f37352c = t11;
        this.f37353d = interpolator;
        this.f37354e = interpolator2;
        this.f37355f = interpolator3;
        this.f37356g = f10;
        this.f37357h = f11;
    }

    public a(T t10) {
        this.f37358i = -3987645.8f;
        this.f37359j = -3987645.8f;
        this.f37360k = 784923401;
        this.f37361l = 784923401;
        this.f37362m = Float.MIN_VALUE;
        this.f37363n = Float.MIN_VALUE;
        this.f37364o = null;
        this.f37365p = null;
        this.f37350a = null;
        this.f37351b = t10;
        this.f37352c = t10;
        this.f37353d = null;
        this.f37354e = null;
        this.f37355f = null;
        this.f37356g = Float.MIN_VALUE;
        this.f37357h = Float.valueOf(Float.MAX_VALUE);
    }

    private a(T t10, T t11) {
        this.f37358i = -3987645.8f;
        this.f37359j = -3987645.8f;
        this.f37360k = 784923401;
        this.f37361l = 784923401;
        this.f37362m = Float.MIN_VALUE;
        this.f37363n = Float.MIN_VALUE;
        this.f37364o = null;
        this.f37365p = null;
        this.f37350a = null;
        this.f37351b = t10;
        this.f37352c = t11;
        this.f37353d = null;
        this.f37354e = null;
        this.f37355f = null;
        this.f37356g = Float.MIN_VALUE;
        this.f37357h = Float.valueOf(Float.MAX_VALUE);
    }
}
