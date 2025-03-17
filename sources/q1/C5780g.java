package q1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010 \u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010#\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0017\u0010%\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010'\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010*\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019R\u0017\u0010,\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b+\u0010\u0019R\u0017\u0010.\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b+\u0010\u0017\u001a\u0004\b-\u0010\u0019R\u0017\u00100\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b/\u0010\u0019R\u0017\u00101\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u00103\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b2\u0010\u0019R\u0017\u00104\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b-\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019R\u0017\u00105\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b&\u00109R\u0017\u0010;\u001a\u0002068\u0006¢\u0006\f\n\u0004\b2\u00108\u001a\u0004\b$\u00109R\u001a\u0010=\u001a\u00020\u00158\u0000X\u0004¢\u0006\f\n\u0004\b/\u0010\u0017\u001a\u0004\b<\u0010\u0019R\u0017\u0010>\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b7\u00109R \u0010B\u001a\b\u0012\u0004\u0012\u0002060?8\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\b(\u0010A¨\u0006C"}, d2 = {"Lq1/g;", "", "<init>", "()V", "", "b", "[F", "x", "()[F", "SrgbPrimaries", "c", "s", "Ntsc1953Primaries", "Lq1/y;", "d", "Lq1/y;", "getSrgbTransferParameters$ui_graphics_release", "()Lq1/y;", "SrgbTransferParameters", "e", "NoneTransferParameters", "Lq1/x;", "f", "Lq1/x;", "w", "()Lq1/x;", "Srgb", "g", "q", "LinearSrgb", "h", "o", "ExtendedSrgb", "i", "p", "LinearExtendedSrgb", "j", "Bt709", "k", "Bt2020", "l", "m", "DciP3", "n", "DisplayP3", "r", "Ntsc1953", "v", "SmpteC", "AdobeRgb", "u", "ProPhotoRgb", "Aces", "Acescg", "Lq1/c;", "t", "Lq1/c;", "()Lq1/c;", "CieXyz", "CieLab", "y", "Unspecified", "Oklab", "", "[Lq1/c;", "()[Lq1/c;", "ColorSpacesArray", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: q1.g  reason: case insensitive filesystem */
public final class C5780g {

    /* renamed from: a  reason: collision with root package name */
    public static final C5780g f27664a = new C5780g();

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f27665b;

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f27666c;

    /* renamed from: d  reason: collision with root package name */
    private static final y f27667d;

    /* renamed from: e  reason: collision with root package name */
    private static final y f27668e;

    /* renamed from: f  reason: collision with root package name */
    private static final x f27669f;

    /* renamed from: g  reason: collision with root package name */
    private static final x f27670g;

    /* renamed from: h  reason: collision with root package name */
    private static final x f27671h;

    /* renamed from: i  reason: collision with root package name */
    private static final x f27672i;

    /* renamed from: j  reason: collision with root package name */
    private static final x f27673j;

    /* renamed from: k  reason: collision with root package name */
    private static final x f27674k;

    /* renamed from: l  reason: collision with root package name */
    private static final x f27675l;

    /* renamed from: m  reason: collision with root package name */
    private static final x f27676m;

    /* renamed from: n  reason: collision with root package name */
    private static final x f27677n;

    /* renamed from: o  reason: collision with root package name */
    private static final x f27678o;

    /* renamed from: p  reason: collision with root package name */
    private static final x f27679p;

    /* renamed from: q  reason: collision with root package name */
    private static final x f27680q;

    /* renamed from: r  reason: collision with root package name */
    private static final x f27681r;

    /* renamed from: s  reason: collision with root package name */
    private static final x f27682s;

    /* renamed from: t  reason: collision with root package name */
    private static final C5776c f27683t;

    /* renamed from: u  reason: collision with root package name */
    private static final C5776c f27684u;

    /* renamed from: v  reason: collision with root package name */
    private static final x f27685v;

    /* renamed from: w  reason: collision with root package name */
    private static final C5776c f27686w;

    /* renamed from: x  reason: collision with root package name */
    private static final C5776c[] f27687x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f27665b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f27666c = fArr2;
        y yVar = new y(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null);
        f27667d = yVar;
        y yVar2 = new y(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null);
        f27668e = yVar2;
        C5784k kVar = C5784k.f27699a;
        float[] fArr3 = fArr;
        x xVar = new x("sRGB IEC61966-2.1", fArr3, kVar.e(), yVar, 0);
        f27669f = xVar;
        x xVar2 = new x("sRGB IEC61966-2.1 (Linear)", fArr3, kVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f27670g = xVar2;
        x xVar3 = new x("scRGB-nl IEC 61966-2-2:2003", fArr3, kVar.e(), (float[]) null, new C5778e(), new C5779f(), -0.799f, 2.399f, yVar, 2);
        f27671h = xVar3;
        x xVar4 = new x("scRGB IEC 61966-2-2:2003", fArr3, kVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f27672i = xVar4;
        x xVar5 = new x("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, kVar.e(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 4);
        f27673j = xVar5;
        x xVar6 = new x("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, kVar.e(), new y(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 5);
        f27674k = xVar6;
        x xVar7 = new x("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new z(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f27675l = xVar7;
        x xVar8 = new x("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, kVar.e(), yVar, 7);
        f27676m = xVar8;
        x xVar9 = new x("NTSC (1953)", fArr2, kVar.a(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 8);
        f27677n = xVar9;
        x xVar10 = new x("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, kVar.e(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 9);
        f27678o = xVar10;
        x xVar11 = new x("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, kVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f27679p = xVar11;
        x xVar12 = new x("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, kVar.b(), new y(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 11);
        f27680q = xVar12;
        x xVar13 = new x("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f27681r = xVar13;
        x xVar14 = new x("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f27682s = xVar14;
        C5773A a10 = new C5773A("Generic XYZ", 14);
        f27683t = a10;
        C5785l lVar = new C5785l("Generic L*a*b*", 15);
        f27684u = lVar;
        float[] fArr4 = fArr;
        x xVar15 = new x("None", fArr4, kVar.e(), yVar2, 16);
        f27685v = xVar15;
        C5786m mVar = new C5786m("Oklab", 17);
        f27686w = mVar;
        f27687x = new C5776c[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10, xVar11, xVar12, xVar13, xVar14, a10, lVar, xVar15, mVar};
    }

    private C5780g() {
    }

    /* access modifiers changed from: private */
    public static final double c(double d10) {
        return C5777d.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* access modifiers changed from: private */
    public static final double d(double d10) {
        return C5777d.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final x e() {
        return f27681r;
    }

    public final x f() {
        return f27682s;
    }

    public final x g() {
        return f27679p;
    }

    public final x h() {
        return f27674k;
    }

    public final x i() {
        return f27673j;
    }

    public final C5776c j() {
        return f27684u;
    }

    public final C5776c k() {
        return f27683t;
    }

    public final C5776c[] l() {
        return f27687x;
    }

    public final x m() {
        return f27675l;
    }

    public final x n() {
        return f27676m;
    }

    public final x o() {
        return f27671h;
    }

    public final x p() {
        return f27672i;
    }

    public final x q() {
        return f27670g;
    }

    public final x r() {
        return f27677n;
    }

    public final float[] s() {
        return f27666c;
    }

    public final C5776c t() {
        return f27686w;
    }

    public final x u() {
        return f27680q;
    }

    public final x v() {
        return f27678o;
    }

    public final x w() {
        return f27669f;
    }

    public final float[] x() {
        return f27665b;
    }

    public final x y() {
        return f27685v;
    }
}
