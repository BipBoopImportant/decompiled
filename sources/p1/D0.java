package p1;

import android.graphics.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import q1.C5776c;
import q1.C5780g;
import q1.x;
import q1.y;
import q1.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp1/D0;", "", "<init>", "()V", "Lq1/c;", "Landroid/graphics/ColorSpace;", "e", "(Lq1/c;)Landroid/graphics/ColorSpace;", "h", "(Landroid/graphics/ColorSpace;)Lq1/c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class D0 {

    /* renamed from: a  reason: collision with root package name */
    public static final D0 f27182a = new D0();

    private D0() {
    }

    public static final ColorSpace e(C5776c cVar) {
        C5776c cVar2 = cVar;
        C5780g gVar = C5780g.f27664a;
        if (C17542s.e(cVar2, gVar.w())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (C17542s.e(cVar2, gVar.e())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (C17542s.e(cVar2, gVar.f())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (C17542s.e(cVar2, gVar.g())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (C17542s.e(cVar2, gVar.h())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (C17542s.e(cVar2, gVar.i())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (C17542s.e(cVar2, gVar.j())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (C17542s.e(cVar2, gVar.k())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (C17542s.e(cVar2, gVar.m())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (C17542s.e(cVar2, gVar.n())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (C17542s.e(cVar2, gVar.o())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (C17542s.e(cVar2, gVar.p())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (C17542s.e(cVar2, gVar.q())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (C17542s.e(cVar2, gVar.r())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (C17542s.e(cVar2, gVar.u())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (C17542s.e(cVar2, gVar.v())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(cVar2 instanceof x)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        x xVar = (x) cVar2;
        float[] c10 = xVar.R().c();
        y P10 = xVar.P();
        ColorSpace.Rgb.TransferParameters transferParameters = P10 != null ? new ColorSpace.Rgb.TransferParameters(P10.a(), P10.b(), P10.c(), P10.d(), P10.e(), P10.f(), P10.g()) : null;
        return transferParameters != null ? new ColorSpace.Rgb(cVar.h(), xVar.O(), c10, transferParameters) : new ColorSpace.Rgb(cVar.h(), xVar.O(), c10, new C5755z0(xVar.L()), new A0(xVar.H()), cVar2.f(0), cVar2.e(0));
    }

    /* access modifiers changed from: private */
    public static final double f(C17642l lVar, double d10) {
        return ((Number) lVar.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* access modifiers changed from: private */
    public static final double g(C17642l lVar, double d10) {
        return ((Number) lVar.invoke(Double.valueOf(d10))).doubleValue();
    }

    public static final C5776c h(ColorSpace colorSpace) {
        z zVar;
        y yVar;
        ColorSpace colorSpace2 = colorSpace;
        int id2 = colorSpace.getId();
        if (id2 == ColorSpace.Named.SRGB.ordinal()) {
            return C5780g.f27664a.w();
        }
        if (id2 == ColorSpace.Named.ACES.ordinal()) {
            return C5780g.f27664a.e();
        }
        if (id2 == ColorSpace.Named.ACESCG.ordinal()) {
            return C5780g.f27664a.f();
        }
        if (id2 == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return C5780g.f27664a.g();
        }
        if (id2 == ColorSpace.Named.BT2020.ordinal()) {
            return C5780g.f27664a.h();
        }
        if (id2 == ColorSpace.Named.BT709.ordinal()) {
            return C5780g.f27664a.i();
        }
        if (id2 == ColorSpace.Named.CIE_LAB.ordinal()) {
            return C5780g.f27664a.j();
        }
        if (id2 == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return C5780g.f27664a.k();
        }
        if (id2 == ColorSpace.Named.DCI_P3.ordinal()) {
            return C5780g.f27664a.m();
        }
        if (id2 == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return C5780g.f27664a.n();
        }
        if (id2 == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return C5780g.f27664a.o();
        }
        if (id2 == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return C5780g.f27664a.p();
        }
        if (id2 == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return C5780g.f27664a.q();
        }
        if (id2 == ColorSpace.Named.NTSC_1953.ordinal()) {
            return C5780g.f27664a.r();
        }
        if (id2 == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return C5780g.f27664a.u();
        }
        if (id2 == ColorSpace.Named.SMPTE_C.ordinal()) {
            return C5780g.f27664a.v();
        }
        if (!(colorSpace2 instanceof ColorSpace.Rgb)) {
            return C5780g.f27664a.w();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace2;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        z zVar2 = rgb.getWhitePoint().length == 3 ? new z(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new z(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        if (transferParameters != null) {
            zVar = zVar2;
            yVar = new y(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f);
        } else {
            zVar = zVar2;
            yVar = null;
        }
        return new x(rgb.getName(), rgb.getPrimaries(), zVar, rgb.getTransform(), new B0(colorSpace2), new C0(colorSpace2), colorSpace2.getMinValue(0), colorSpace2.getMaxValue(0), yVar, rgb.getId());
    }

    /* access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d10) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d10);
    }

    /* access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d10) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d10);
    }
}
