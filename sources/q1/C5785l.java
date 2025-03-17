package q1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5751x0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lq1/l;", "Lq1/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Lp1/v0;", "n", "(FFFFLq1/c;)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: q1.l  reason: case insensitive filesystem */
public final class C5785l extends C5776c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f27710e = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lq1/l$a;", "", "<init>", "()V", "", "A", "F", "B", "C", "D", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: q1.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C5785l(String str, int i10) {
        super(str, C5775b.f27655a.a(), i10, (DefaultConstructorMarker) null);
    }

    public float[] b(float[] fArr) {
        float f10 = fArr[0];
        C5784k kVar = C5784k.f27699a;
        float f11 = f10 / kVar.c()[0];
        float f12 = fArr[1] / kVar.c()[1];
        float f13 = fArr[2] / kVar.c()[2];
        float cbrt = f11 > 0.008856452f ? (float) Math.cbrt((double) f11) : (f11 * 7.787037f) + 0.13793103f;
        float cbrt2 = f12 > 0.008856452f ? (float) Math.cbrt((double) f12) : (f12 * 7.787037f) + 0.13793103f;
        float cbrt3 = f13 > 0.008856452f ? (float) Math.cbrt((double) f13) : (f13 * 7.787037f) + 0.13793103f;
        float f14 = (116.0f * cbrt2) - 16.0f;
        float f15 = (cbrt - cbrt2) * 500.0f;
        float f16 = (cbrt2 - cbrt3) * 200.0f;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 100.0f) {
            f14 = 100.0f;
        }
        fArr[0] = f14;
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        float f17 = 128.0f;
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        fArr[1] = f15;
        if (f16 < -128.0f) {
            f16 = -128.0f;
        }
        if (f16 <= 128.0f) {
            f17 = f16;
        }
        fArr[2] = f17;
        return fArr;
    }

    public float e(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    public float f(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    public long j(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        float f14 = (f11 * 0.002f) + f13;
        float f15 = f14 > 0.20689656f ? f14 * f14 * f14 : (f14 - 0.13793103f) * 0.12841855f;
        float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
        C5784k kVar = C5784k.f27699a;
        return (((long) Float.floatToRawIntBits(f16 * kVar.c()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f15 * kVar.c()[0])) << 32);
    }

    public float[] l(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        float f12 = -128.0f;
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        float f13 = 128.0f;
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        fArr[1] = f11;
        float f14 = fArr[2];
        if (f14 >= -128.0f) {
            f12 = f14;
        }
        if (f12 <= 128.0f) {
            f13 = f12;
        }
        fArr[2] = f13;
        float f15 = (f10 + 16.0f) / 116.0f;
        float f16 = (f11 * 0.002f) + f15;
        float f17 = f15 - (f13 * 0.005f);
        float f18 = f16 > 0.20689656f ? f16 * f16 * f16 : (f16 - 0.13793103f) * 0.12841855f;
        float f19 = f15 > 0.20689656f ? f15 * f15 * f15 : (f15 - 0.13793103f) * 0.12841855f;
        float f20 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
        C5784k kVar = C5784k.f27699a;
        fArr[0] = f18 * kVar.c()[0];
        fArr[1] = f19 * kVar.c()[1];
        fArr[2] = f20 * kVar.c()[2];
        return fArr;
    }

    public float m(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f13 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
        return (f13 > 0.20689656f ? f13 * f13 * f13 : 0.12841855f * (f13 - 0.13793103f)) * C5784k.f27699a.c()[2];
    }

    public long n(float f10, float f11, float f12, float f13, C5776c cVar) {
        C5784k kVar = C5784k.f27699a;
        float f14 = f10 / kVar.c()[0];
        float f15 = f11 / kVar.c()[1];
        float f16 = f12 / kVar.c()[2];
        float cbrt = f14 > 0.008856452f ? (float) Math.cbrt((double) f14) : (f14 * 7.787037f) + 0.13793103f;
        float cbrt2 = f15 > 0.008856452f ? (float) Math.cbrt((double) f15) : (f15 * 7.787037f) + 0.13793103f;
        float f17 = (116.0f * cbrt2) - 16.0f;
        float f18 = (cbrt - cbrt2) * 500.0f;
        float cbrt3 = (cbrt2 - (f16 > 0.008856452f ? (float) Math.cbrt((double) f16) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 100.0f) {
            f17 = 100.0f;
        }
        if (f18 < -128.0f) {
            f18 = -128.0f;
        }
        float f19 = 128.0f;
        if (f18 > 128.0f) {
            f18 = 128.0f;
        }
        if (cbrt3 < -128.0f) {
            cbrt3 = -128.0f;
        }
        if (cbrt3 <= 128.0f) {
            f19 = cbrt3;
        }
        return C5751x0.a(f17, f18, f19, f13, cVar);
    }
}
