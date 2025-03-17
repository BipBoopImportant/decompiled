package B6;

import android.annotation.SuppressLint;
import android.graphics.PointF;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final PointF f33206a;

    /* renamed from: b  reason: collision with root package name */
    private final PointF f33207b;

    /* renamed from: c  reason: collision with root package name */
    private final PointF f33208c;

    public a() {
        this.f33206a = new PointF();
        this.f33207b = new PointF();
        this.f33208c = new PointF();
    }

    public PointF a() {
        return this.f33206a;
    }

    public PointF b() {
        return this.f33207b;
    }

    public PointF c() {
        return this.f33208c;
    }

    public void d(float f10, float f11) {
        this.f33206a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f33207b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f33208c.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", new Object[]{Float.valueOf(this.f33208c.x), Float.valueOf(this.f33208c.y), Float.valueOf(this.f33206a.x), Float.valueOf(this.f33206a.y), Float.valueOf(this.f33207b.x), Float.valueOf(this.f33207b.y)});
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f33206a = pointF;
        this.f33207b = pointF2;
        this.f33208c = pointF3;
    }
}
