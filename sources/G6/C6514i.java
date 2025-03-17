package G6;

import B6.b;
import H6.c;
import android.graphics.PointF;

/* renamed from: G6.i  reason: case insensitive filesystem */
public class C6514i implements N<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final C6514i f36188a = new C6514i();

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f36189b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private C6514i() {
    }

    /* renamed from: b */
    public b a(c cVar, float f10) {
        b.a aVar = b.a.CENTER;
        cVar.e();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        while (cVar.hasNext()) {
            switch (cVar.n(f36189b)) {
                case 0:
                    str = cVar.C1();
                    break;
                case 1:
                    str2 = cVar.C1();
                    break;
                case 2:
                    f11 = (float) cVar.d2();
                    break;
                case 3:
                    int G02 = cVar.G0();
                    aVar2 = b.a.CENTER;
                    if (G02 <= aVar2.ordinal() && G02 >= 0) {
                        aVar2 = b.a.values()[G02];
                        break;
                    }
                case 4:
                    i10 = cVar.G0();
                    break;
                case 5:
                    f12 = (float) cVar.d2();
                    break;
                case 6:
                    f13 = (float) cVar.d2();
                    break;
                case 7:
                    i11 = s.d(cVar);
                    break;
                case 8:
                    i12 = s.d(cVar);
                    break;
                case 9:
                    f14 = (float) cVar.d2();
                    break;
                case 10:
                    z10 = cVar.w1();
                    break;
                case 11:
                    cVar.d();
                    PointF pointF3 = new PointF(((float) cVar.d2()) * f10, ((float) cVar.d2()) * f10);
                    cVar.f();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.d();
                    PointF pointF4 = new PointF(((float) cVar.d2()) * f10, ((float) cVar.d2()) * f10);
                    cVar.f();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.o();
                    cVar.a0();
                    break;
            }
        }
        c cVar2 = cVar;
        cVar.g();
        return new b(str, str2, f11, aVar2, i10, f12, f13, i11, i12, f14, z10, pointF, pointF2);
    }
}
