package I6;

import B6.a;
import B6.e;
import D6.o;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import y6.k;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final PointF f36971a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    public static boolean d(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    private static int e(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    static int f(float f10, float f11) {
        return g((int) f10, (int) f11);
    }

    private static int g(int i10, int i11) {
        return i10 - (i11 * e(i10, i11));
    }

    public static void h(o oVar, Path path) {
        path.reset();
        PointF b10 = oVar.b();
        path.moveTo(b10.x, b10.y);
        f36971a.set(b10.x, b10.y);
        for (int i10 = 0; i10 < oVar.a().size(); i10++) {
            a aVar = oVar.a().get(i10);
            PointF a10 = aVar.a();
            PointF b11 = aVar.b();
            PointF c10 = aVar.c();
            PointF pointF = f36971a;
            if (!a10.equals(pointF) || !b11.equals(c10)) {
                path.cubicTo(a10.x, a10.y, b11.x, b11.y, c10.x, c10.y);
            } else {
                path.lineTo(c10.x, c10.y);
            }
            pointF.set(c10.x, c10.y);
        }
        if (oVar.d()) {
            path.close();
        }
    }

    public static float i(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static int j(int i10, int i11, float f10) {
        return (int) (((float) i10) + (f10 * ((float) (i11 - i10))));
    }

    public static void k(e eVar, int i10, List<e> list, e eVar2, k kVar) {
        if (eVar.c(kVar.getName(), i10)) {
            list.add(eVar2.a(kVar.getName()).i(kVar));
        }
    }
}
