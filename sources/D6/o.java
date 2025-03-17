package D6;

import B6.a;
import I6.d;
import I6.i;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f34530a;

    /* renamed from: b  reason: collision with root package name */
    private PointF f34531b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f34532c;

    public o(PointF pointF, boolean z10, List<a> list) {
        this.f34531b = pointF;
        this.f34532c = z10;
        this.f34530a = new ArrayList(list);
    }

    public List<a> a() {
        return this.f34530a;
    }

    public PointF b() {
        return this.f34531b;
    }

    public void c(o oVar, o oVar2, float f10) {
        if (this.f34531b == null) {
            this.f34531b = new PointF();
        }
        this.f34532c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            d.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int min = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f34530a.size() < min) {
            for (int size = this.f34530a.size(); size < min; size++) {
                this.f34530a.add(new a());
            }
        } else if (this.f34530a.size() > min) {
            for (int size2 = this.f34530a.size() - 1; size2 >= min; size2--) {
                List<a> list = this.f34530a;
                list.remove(list.size() - 1);
            }
        }
        PointF b10 = oVar.b();
        PointF b11 = oVar2.b();
        f(i.i(b10.x, b11.x, f10), i.i(b10.y, b11.y, f10));
        for (int size3 = this.f34530a.size() - 1; size3 >= 0; size3--) {
            a aVar = oVar.a().get(size3);
            a aVar2 = oVar2.a().get(size3);
            PointF a10 = aVar.a();
            PointF b12 = aVar.b();
            PointF c10 = aVar.c();
            PointF a11 = aVar2.a();
            PointF b13 = aVar2.b();
            PointF c11 = aVar2.c();
            this.f34530a.get(size3).d(i.i(a10.x, a11.x, f10), i.i(a10.y, a11.y, f10));
            this.f34530a.get(size3).e(i.i(b12.x, b13.x, f10), i.i(b12.y, b13.y, f10));
            this.f34530a.get(size3).f(i.i(c10.x, c11.x, f10), i.i(c10.y, c11.y, f10));
        }
    }

    public boolean d() {
        return this.f34532c;
    }

    public void e(boolean z10) {
        this.f34532c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f34531b == null) {
            this.f34531b = new PointF();
        }
        this.f34531b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f34530a.size() + "closed=" + this.f34532c + '}';
    }

    public o() {
        this.f34530a = new ArrayList();
    }
}
