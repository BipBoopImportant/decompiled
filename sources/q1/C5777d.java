package q1;

import j0.E;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q1.C5775b;
import q1.C5781h;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000e\u001a*\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001aO\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aO\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a?\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0016\u001a?\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u001f\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\u0014\u0010 \u001a\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010&\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b(\u0010'\u001a\u001f\u0010!\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010'\u001a'\u0010\u0018\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\u0018\u0010,\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lq1/c;", "source", "destination", "Lq1/n;", "intent", "Lq1/h;", "j", "(Lq1/c;Lq1/c;I)Lq1/h;", "h", "Lq1/z;", "whitePoint", "Lq1/a;", "adaptation", "c", "(Lq1/c;Lq1/z;Lq1/a;)Lq1/c;", "", "x", "a", "b", "d", "g", "o", "(DDDDDD)D", "q", "e", "f", "p", "(DDDDDDDD)D", "r", "", "(Lq1/z;Lq1/z;)Z", "", "([F[F)Z", "m", "k", "([F)[F", "lhs", "rhs", "l", "([F[F)[F", "n", "matrix", "srcWhitePoint", "dstWhitePoint", "([F[F[F)[F", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: q1.d  reason: case insensitive filesystem */
public final class C5777d {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d10;
        return Math.copySign(o(d16 < 0.0d ? -d16 : d16, d11, d12, d13, d14, d15), d16);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d10;
        return Math.copySign(q(d16 < 0.0d ? -d16 : d16, d11, d12, d13, d14, d15), d16);
    }

    public static final C5776c c(C5776c cVar, z zVar, C5774a aVar) {
        if (!C5775b.e(cVar.g(), C5775b.f27655a.b())) {
            return cVar;
        }
        C17542s.h(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        x xVar = (x) cVar;
        if (f(xVar.R(), zVar)) {
            return cVar;
        }
        return new x(xVar, l(e(aVar.b(), xVar.R().c(), zVar.c()), xVar.Q()), zVar);
    }

    public static /* synthetic */ C5776c d(C5776c cVar, z zVar, C5774a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = C5774a.f27650b.a();
        }
        return c(cVar, zVar, aVar);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] n10 = n(fArr, fArr2);
        float[] n11 = n(fArr, fArr3);
        return l(k(fArr), m(new float[]{n11[0] / n10[0], n11[1] / n10[1], n11[2] / n10[2]}, fArr));
    }

    public static final boolean f(z zVar, z zVar2) {
        if (zVar == zVar2) {
            return true;
        }
        return Math.abs(zVar.a() - zVar2.a()) < 0.001f && Math.abs(zVar.b() - zVar2.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final C5781h h(C5776c cVar, C5776c cVar2, int i10) {
        int d10 = cVar.d();
        int d11 = cVar2.d();
        if ((d10 | d11) < 0) {
            return j(cVar, cVar2, i10);
        }
        E<C5781h> a10 = C5782i.a();
        int i11 = d10 | (d11 << 6) | (i10 << 12);
        C5781h c10 = a10.c(i11);
        if (c10 == null) {
            c10 = j(cVar, cVar2, i10);
            a10.t(i11, c10);
        }
        return c10;
    }

    public static /* synthetic */ C5781h i(C5776c cVar, C5776c cVar2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar2 = C5780g.f27664a.w();
        }
        if ((i11 & 2) != 0) {
            i10 = C5787n.f27716a.b();
        }
        return h(cVar, cVar2, i10);
    }

    private static final C5781h j(C5776c cVar, C5776c cVar2, int i10) {
        C5781h hVar;
        if (cVar == cVar2) {
            return C5781h.f27688g.c(cVar);
        }
        long g10 = cVar.g();
        C5775b.a aVar = C5775b.f27655a;
        if (!C5775b.e(g10, aVar.b()) || !C5775b.e(cVar2.g(), aVar.b())) {
            hVar = new C5781h(cVar, cVar2, i10, (DefaultConstructorMarker) null);
        } else {
            C17542s.h(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            C17542s.h(cVar2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            hVar = new C5781h.b((x) cVar, (x) cVar2, i10, (DefaultConstructorMarker) null);
        }
        return hVar;
    }

    public static final float[] k(float[] fArr) {
        float[] fArr2 = fArr;
        float f10 = fArr2[0];
        float f11 = fArr2[3];
        float f12 = fArr2[6];
        float f13 = fArr2[1];
        float f14 = fArr2[4];
        float f15 = fArr2[7];
        float f16 = fArr2[2];
        float f17 = fArr2[5];
        float f18 = fArr2[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr3 = new float[fArr2.length];
        fArr3[0] = f19 / f22;
        fArr3[1] = f20 / f22;
        fArr3[2] = f21 / f22;
        fArr3[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr3[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr3[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr3[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr3[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr3[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr3;
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[3];
        float f13 = fArr2[1];
        float f14 = fArr[6];
        float f15 = fArr2[2];
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = fArr[1];
        float f18 = fArr[4];
        float f19 = fArr[7];
        float f20 = (f17 * f11) + (f18 * f13) + (f19 * f15);
        float f21 = fArr[2];
        float f22 = fArr[5];
        float f23 = fArr[8];
        float f24 = (f11 * f21) + (f13 * f22) + (f15 * f23);
        float f25 = fArr2[3];
        float f26 = fArr2[4];
        float f27 = fArr2[5];
        float f28 = (f10 * f25) + (f12 * f26) + (f14 * f27);
        float f29 = (f25 * f21) + (f26 * f22) + (f27 * f23);
        float f30 = fArr2[6];
        float f31 = fArr2[7];
        float f32 = (f10 * f30) + (f12 * f31);
        float f33 = fArr2[8];
        return new float[]{f16, f20, f24, f28, (f17 * f25) + (f18 * f26) + (f19 * f27), f29, f32 + (f14 * f33), (f17 * f30) + (f18 * f31) + (f19 * f33), (f21 * f30) + (f22 * f31) + (f23 * f33)};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArr[1];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[2];
        return new float[]{f11, f13, fArr2[2] * f14, fArr2[3] * f10, fArr2[4] * f12, fArr2[5] * f14, f10 * fArr2[6], f12 * fArr2[7], f14 * fArr2[8]};
    }

    public static final float[] n(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        fArr2[1] = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        fArr2[2] = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        return fArr2;
    }

    public static final double o(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double p(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double q(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d10 * d13;
    }

    public static final double r(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }
}
