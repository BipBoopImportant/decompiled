package ch;

import U0.C4889m;
import U0.C4895p;
import java.util.List;
import kotlin.Metadata;
import u1.C6008f;
import u1.C6010h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0007\u001a3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0007\u001a3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"", "dx", "dy", "radius", "", "Lu1/h;", "a", "(FFF)Ljava/util/List;", "width", "height", "cornerRadius", "y", "x", "h", "(FFFFFLU0/m;II)Ljava/util/List;", "f", "b", "d", "giftcard-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ch.b  reason: case insensitive filesystem */
public final class C9472b {
    public static final List<C6010h> a(float f10, float f11, float f12) {
        C6008f fVar = new C6008f();
        fVar.k(f10, f11);
        C6008f fVar2 = fVar;
        float f13 = f12;
        float f14 = f12;
        fVar2.a(f13, f14, 0.0f, false, true, ((float) 2) * f12, 0.0f);
        fVar2.a(f13, f14, 0.0f, false, true, ((float) -2) * f12, 0.0f);
        fVar.b();
        return fVar.e();
    }

    public static final List<C6010h> b(float f10, float f11, float f12) {
        C6008f fVar = new C6008f();
        fVar.j(f11, f12 + (0.05f * f10));
        float f13 = 0.2f * f10;
        fVar.i(f13, -0.15f * f10);
        fVar.g(f13);
        fVar.m(1.0f * f10);
        float f14 = -0.2f * f10;
        fVar.g(f14);
        fVar.m(-0.85f * f10);
        fVar.i(f14, f10 * 0.15f);
        fVar.b();
        return fVar.e();
    }

    public static /* synthetic */ List c(float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 5.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        return b(f10, f11, f12);
    }

    public static final List<C6010h> d(float f10, float f11, float f12) {
        C6008f fVar = new C6008f();
        fVar.j(f11, f12);
        float f13 = f10 * 0.5f;
        C6008f fVar2 = fVar;
        fVar2.a(f10 * 0.44f, f10 * 0.3f, 330.0f, true, true, f13, f13);
        float f14 = -0.2f * f10;
        float f15 = 0.2f * f10;
        fVar2.a(15.0f, 15.0f, 200.0f, false, false, f14, f15);
        fVar.g(0.45f * f10);
        fVar.m(f15);
        fVar.g(-0.75f * f10);
        fVar.m(f14);
        fVar.i(0.4f * f10, -0.34f * f10);
        fVar.a(0.35f, 0.15f, 320.0f, false, false, f10 * -0.3f, f10 * -0.15f);
        fVar.b();
        return fVar.e();
    }

    public static /* synthetic */ List e(float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 5.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        return d(f10, f11, f12);
    }

    public static final List<C6010h> f(float f10, float f11, float f12) {
        C6008f fVar = new C6008f();
        float f13 = 0.9f * f10;
        float f14 = 0.3f * f10;
        float f15 = (float) 2;
        float f16 = (f10 - (f15 * f14)) / f15;
        float f17 = 0.267f * f10;
        float f18 = f10 * 0.35f;
        fVar.j(f11, f12);
        fVar.g(f14);
        fVar.i(f16, f17);
        float f19 = -f17;
        fVar.i(f16, f19);
        fVar.g(f14);
        float f20 = -f18;
        float f21 = f13 / f15;
        fVar.i(f20, f21);
        fVar.i(f18, f21);
        float f22 = -f14;
        fVar.g(f22);
        float f23 = -f16;
        fVar.i(f23, f19);
        fVar.i(f23, f17);
        fVar.g(f22);
        float f24 = (-f13) / f15;
        fVar.i(f18, f24);
        fVar.i(f20, f24);
        fVar.b();
        return fVar.e();
    }

    public static /* synthetic */ List g(float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 5.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        return f(f10, f11, f12);
    }

    public static final List<C6010h> h(float f10, float f11, float f12, float f13, float f14, C4889m mVar, int i10, int i11) {
        float f15 = f12;
        mVar.W(-1201749238);
        float f16 = (i11 & 8) != 0 ? 0.0f : f13;
        float f17 = (i11 & 16) != 0 ? 0.0f : f14;
        if (C4895p.J()) {
            C4895p.S(-1201749238, i10, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.vector.createRoundedCornerPath (GeometryExtensions.kt:57)");
        }
        C6008f fVar = new C6008f();
        fVar.j(f17, f16 + f15);
        float f18 = -f15;
        float f19 = f12;
        float f20 = f12;
        float f21 = f12;
        fVar.a(f19, f20, 0.0f, false, true, f21, f18);
        float f22 = ((float) 2) * f15;
        float f23 = f10 - f22;
        fVar.i(f23, 0.0f);
        float f24 = f12;
        fVar.a(f19, f20, 0.0f, false, true, f21, f24);
        fVar.i(0.0f, f11 - f22);
        float f25 = f18;
        fVar.a(f19, f20, 0.0f, false, true, f25, f24);
        fVar.i(-f23, 0.0f);
        fVar.a(f19, f20, 0.0f, false, true, f25, f18);
        fVar.b();
        List<C6010h> e10 = fVar.e();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return e10;
    }
}
