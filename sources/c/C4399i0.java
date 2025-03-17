package C;

import android.graphics.PointF;
import android.util.Rational;

/* renamed from: C.i0  reason: case insensitive filesystem */
public abstract class C4399i0 {

    /* renamed from: a  reason: collision with root package name */
    private Rational f5360a;

    public C4399i0() {
        this((Rational) null);
    }

    /* access modifiers changed from: protected */
    public abstract PointF a(float f10, float f11);

    public final C4397h0 b(float f10, float f11, float f12) {
        PointF a10 = a(f10, f11);
        return new C4397h0(a10.x, a10.y, f12, this.f5360a);
    }

    /* access modifiers changed from: protected */
    public void c(Rational rational) {
        this.f5360a = rational;
    }

    public C4399i0(Rational rational) {
        this.f5360a = rational;
    }
}
