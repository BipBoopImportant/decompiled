package q1;

import YH.C16870n;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import p1.C5751x0;
import tI.C17978n;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 c2\u00020\u0001:\u0001.B]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0016BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0019B!\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b)\u0010*J=\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\"J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010D\u001a\u0004\bG\u0010FR\u001a\u0010J\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010FR\u001a\u0010N\u001a\u00020\t8\u0000X\u0004¢\u0006\f\n\u0004\b!\u0010K\u001a\u0004\bL\u0010MR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170O8\u0006¢\u0006\f\n\u0004\b)\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020\t8\u0000X\u0004¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\bS\u0010MR\u001a\u0010W\u001a\u00020\t8\u0000X\u0004¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010MR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170O8\u0006¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010RR\u001a\u0010\\\u001a\u00020\t8\u0000X\u0004¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\b[\u0010MR\u001a\u0010_\u001a\u0002058\u0016X\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010b\u001a\u0002058\u0016X\u0004¢\u0006\f\n\u0004\ba\u0010^\u001a\u0004\bC\u0010`\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006d"}, d2 = {"Lq1/x;", "Lq1/c;", "", "name", "", "primaries", "Lq1/z;", "whitePoint", "transform", "Lq1/j;", "oetf", "eotf", "", "min", "max", "Lq1/y;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLq1/z;[FLq1/j;Lq1/j;FFLq1/y;I)V", "function", "(Ljava/lang/String;[FLq1/z;Lq1/y;I)V", "", "gamma", "(Ljava/lang/String;[FLq1/z;DFFI)V", "colorSpace", "(Lq1/x;[FLq1/z;)V", "component", "f", "(I)F", "e", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "Lp1/v0;", "n", "(FFFFLq1/c;)J", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lq1/z;", "R", "()Lq1/z;", "F", "g", "h", "Lq1/y;", "P", "()Lq1/y;", "i", "[F", "O", "()[F", "Q", "k", "K", "inverseTransform", "Lq1/j;", "N", "()Lq1/j;", "oetfOrig", "Lkotlin/Function1;", "LnI/l;", "L", "()LnI/l;", "M", "oetfFunc", "o", "J", "eotfOrig", "p", "H", "q", "I", "eotfFunc", "r", "Z", "isWideGamut", "()Z", "s", "isSrgb", "t", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x extends C5776c {

    /* renamed from: t  reason: collision with root package name */
    public static final a f27729t = new a((DefaultConstructorMarker) null);

    /* renamed from: u  reason: collision with root package name */
    private static final C5783j f27730u = new q();

    /* renamed from: e  reason: collision with root package name */
    private final z f27731e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final float f27732f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final float f27733g;

    /* renamed from: h  reason: collision with root package name */
    private final y f27734h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f27735i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f27736j;

    /* renamed from: k  reason: collision with root package name */
    private final float[] f27737k;

    /* renamed from: l  reason: collision with root package name */
    private final C5783j f27738l;

    /* renamed from: m  reason: collision with root package name */
    private final C17642l<Double, Double> f27739m;

    /* renamed from: n  reason: collision with root package name */
    private final C5783j f27740n;

    /* renamed from: o  reason: collision with root package name */
    private final C5783j f27741o;

    /* renamed from: p  reason: collision with root package name */
    private final C17642l<Double, Double> f27742p;

    /* renamed from: q  reason: collision with root package name */
    private final C5783j f27743q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f27744r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f27745s;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001a\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lq1/x$a;", "", "<init>", "()V", "", "primaries", "Lq1/z;", "whitePoint", "Lq1/j;", "OETF", "EOTF", "", "min", "max", "", "id", "", "j", "([FLq1/z;Lq1/j;Lq1/j;FFI)Z", "", "point", "a", "b", "f", "(DLq1/j;Lq1/j;)Z", "k", "([FFF)Z", "e", "([F)F", "ax", "ay", "bx", "by", "i", "(FFFF)F", "p1", "p2", "h", "([F[F)Z", "l", "([F)[F", "g", "([FLq1/z;)[F", "DoubleIdentity", "Lq1/j;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float e(float[] fArr) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        private final boolean f(double d10, C5783j jVar, C5783j jVar2) {
            return Math.abs(jVar.a(d10) - jVar2.a(d10)) <= 0.001d;
        }

        /* access modifiers changed from: private */
        public final float[] g(float[] fArr, z zVar) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float a10 = zVar.a();
            float b10 = zVar.b();
            float f16 = (float) 1;
            float f17 = (f16 - f10) / f11;
            float f18 = f10 / f11;
            float f19 = (f12 / f13) - f18;
            float f20 = (a10 / b10) - f18;
            float f21 = ((f16 - f12) / f13) - f17;
            float f22 = (f14 / f15) - f18;
            float f23 = (((((f16 - a10) / b10) - f17) * f19) - (f20 * f21)) / (((((f16 - f14) / f15) - f17) * f19) - (f21 * f22));
            float f24 = (f20 - (f22 * f23)) / f19;
            float f25 = (1.0f - f24) - f23;
            float f26 = f25 / f11;
            float f27 = f24 / f13;
            float f28 = f23 / f15;
            return new float[]{f26 * f10, f25, f26 * ((1.0f - f10) - f11), f27 * f12, f24, f27 * ((1.0f - f12) - f13), f28 * f14, f23, f28 * ((1.0f - f14) - f15)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[1];
            float f14 = fArr[4];
            float f15 = fArr2[4];
            float f16 = fArr[5];
            float f17 = fArr2[5];
            float[] fArr3 = {f10 - f11, f12 - f13, fArr[2] - fArr2[2], fArr[3] - fArr2[3], f14 - f15, f16 - f17};
            return i(fArr3[0], fArr3[1], f11 - f15, f13 - f17) >= 0.0f && i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        private final float i(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* access modifiers changed from: private */
        public final boolean j(float[] fArr, z zVar, C5783j jVar, C5783j jVar2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            C5780g gVar = C5780g.f27664a;
            if (!C5777d.g(fArr, gVar.x()) || !C5777d.f(zVar, C5784k.f27699a.e()) || f10 != 0.0f || f11 != 1.0f) {
                return false;
            }
            x w10 = gVar.w();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!f(d10, jVar, w10.N()) || !f(d10, jVar2, w10.J())) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final boolean k(float[] fArr, float f10, float f11) {
            float e10 = e(fArr);
            C5780g gVar = C5780g.f27664a;
            return (e10 / e(gVar.s()) > 0.9f && h(fArr, gVar.x())) || (f10 < 0.0f && f11 > 1.0f);
        }

        /* access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f10 = fArr[0];
                float f11 = fArr[1];
                float f12 = f10 + f11 + fArr[2];
                fArr2[0] = f10 / f12;
                fArr2[1] = f11 / f12;
                float f13 = fArr[3];
                float f14 = fArr[4];
                float f15 = f13 + f14 + fArr[5];
                fArr2[2] = f13 / f15;
                fArr2[3] = f14 / f15;
                float f16 = fArr[6];
                float f17 = fArr[7];
                float f18 = f16 + f17 + fArr[8];
                fArr2[4] = f16 / f18;
                fArr2[5] = f17 / f18;
            } else {
                C16870n.p(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Double, Double> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x f27746c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(x xVar) {
            super(1);
            this.f27746c = xVar;
        }

        public final Double a(double d10) {
            return Double.valueOf(this.f27746c.J().a(C17978n.k(d10, (double) this.f27746c.f27732f, (double) this.f27746c.f27733g)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<Double, Double> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x f27747c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(x xVar) {
            super(1);
            this.f27747c = xVar;
        }

        public final Double a(double d10) {
            return Double.valueOf(C17978n.k(this.f27747c.N().a(d10), (double) this.f27747c.f27732f, (double) this.f27747c.f27733g));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(String str, float[] fArr, z zVar, float[] fArr2, C5783j jVar, C5783j jVar2, float f10, float f11, y yVar, int i10) {
        super(str, C5775b.f27655a.b(), i10, (DefaultConstructorMarker) null);
        float[] fArr3 = fArr;
        z zVar2 = zVar;
        float[] fArr4 = fArr2;
        float f12 = f10;
        float f13 = f11;
        this.f27731e = zVar2;
        this.f27732f = f12;
        this.f27733g = f13;
        this.f27734h = yVar;
        this.f27738l = jVar;
        this.f27739m = new c(this);
        this.f27740n = new C5788o(this);
        this.f27741o = jVar2;
        this.f27742p = new b(this);
        this.f27743q = new p(this);
        if (fArr3.length != 6 && fArr3.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        } else if (f12 < f13) {
            a aVar = f27729t;
            float[] d10 = aVar.l(fArr3);
            this.f27735i = d10;
            if (fArr4 == null) {
                this.f27736j = aVar.g(d10, zVar2);
            } else if (fArr4.length == 9) {
                this.f27736j = fArr4;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr4.length);
            }
            this.f27737k = C5777d.k(this.f27736j);
            this.f27744r = aVar.k(d10, f12, f13);
            this.f27745s = aVar.j(d10, zVar, jVar, jVar2, f10, f11, i10);
        } else {
            throw new IllegalArgumentException("Invalid range: min=" + f12 + ", max=" + f13 + "; min must be strictly < max");
        }
    }

    /* access modifiers changed from: private */
    public static final double A(y yVar, double d10) {
        return C5777d.o(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.g());
    }

    /* access modifiers changed from: private */
    public static final double B(y yVar, double d10) {
        return C5777d.p(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.e(), yVar.f(), yVar.g());
    }

    /* access modifiers changed from: private */
    public static final double C(y yVar, double d10) {
        return C5777d.q(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.g());
    }

    /* access modifiers changed from: private */
    public static final double D(y yVar, double d10) {
        return C5777d.r(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.e(), yVar.f(), yVar.g());
    }

    /* access modifiers changed from: private */
    public static final double G(x xVar, double d10) {
        return xVar.f27741o.a(C17978n.k(d10, (double) xVar.f27732f, (double) xVar.f27733g));
    }

    /* access modifiers changed from: private */
    public static final double S(x xVar, double d10) {
        return C17978n.k(xVar.f27738l.a(d10), (double) xVar.f27732f, (double) xVar.f27733g);
    }

    /* access modifiers changed from: private */
    public static final double x(double d10) {
        return d10;
    }

    /* access modifiers changed from: private */
    public static final double y(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* access modifiers changed from: private */
    public static final double z(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    public final C17642l<Double, Double> H() {
        return this.f27742p;
    }

    public final C5783j I() {
        return this.f27743q;
    }

    public final C5783j J() {
        return this.f27741o;
    }

    public final float[] K() {
        return this.f27737k;
    }

    public final C17642l<Double, Double> L() {
        return this.f27739m;
    }

    public final C5783j M() {
        return this.f27740n;
    }

    public final C5783j N() {
        return this.f27738l;
    }

    public final float[] O() {
        return this.f27735i;
    }

    public final y P() {
        return this.f27734h;
    }

    public final float[] Q() {
        return this.f27736j;
    }

    public final z R() {
        return this.f27731e;
    }

    public float[] b(float[] fArr) {
        C5777d.n(this.f27737k, fArr);
        fArr[0] = (float) this.f27740n.a((double) fArr[0]);
        fArr[1] = (float) this.f27740n.a((double) fArr[1]);
        fArr[2] = (float) this.f27740n.a((double) fArr[2]);
        return fArr;
    }

    public float e(int i10) {
        return this.f27733g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        x xVar = (x) obj;
        if (Float.compare(xVar.f27732f, this.f27732f) != 0 || Float.compare(xVar.f27733g, this.f27733g) != 0 || !C17542s.e(this.f27731e, xVar.f27731e) || !Arrays.equals(this.f27735i, xVar.f27735i)) {
            return false;
        }
        y yVar = this.f27734h;
        if (yVar != null) {
            return C17542s.e(yVar, xVar.f27734h);
        }
        if (xVar.f27734h == null) {
            return true;
        }
        if (!C17542s.e(this.f27738l, xVar.f27738l)) {
            return false;
        }
        return C17542s.e(this.f27741o, xVar.f27741o);
    }

    public float f(int i10) {
        return this.f27732f;
    }

    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.f27731e.hashCode()) * 31) + Arrays.hashCode(this.f27735i)) * 31;
        float f10 = this.f27732f;
        int i10 = 0;
        int floatToIntBits = (hashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f27733g;
        int floatToIntBits2 = (floatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        y yVar = this.f27734h;
        if (yVar != null) {
            i10 = yVar.hashCode();
        }
        int i11 = floatToIntBits2 + i10;
        return this.f27734h == null ? (((i11 * 31) + this.f27738l.hashCode()) * 31) + this.f27741o.hashCode() : i11;
    }

    public boolean i() {
        return this.f27745s;
    }

    public long j(float f10, float f11, float f12) {
        float a10 = (float) this.f27743q.a((double) f10);
        float a11 = (float) this.f27743q.a((double) f11);
        float a12 = (float) this.f27743q.a((double) f12);
        float[] fArr = this.f27736j;
        return (((long) Float.floatToRawIntBits(((fArr[0] * a10) + (fArr[3] * a11)) + (fArr[6] * a12))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * a10) + (fArr[4] * a11) + (fArr[7] * a12))) & 4294967295L);
    }

    public float[] l(float[] fArr) {
        fArr[0] = (float) this.f27743q.a((double) fArr[0]);
        fArr[1] = (float) this.f27743q.a((double) fArr[1]);
        fArr[2] = (float) this.f27743q.a((double) fArr[2]);
        return C5777d.n(this.f27736j, fArr);
    }

    public float m(float f10, float f11, float f12) {
        float a10 = (float) this.f27743q.a((double) f10);
        float a11 = (float) this.f27743q.a((double) f11);
        float a12 = (float) this.f27743q.a((double) f12);
        float[] fArr = this.f27736j;
        return (fArr[2] * a10) + (fArr[5] * a11) + (fArr[8] * a12);
    }

    public long n(float f10, float f11, float f12, float f13, C5776c cVar) {
        float[] fArr = this.f27737k;
        return C5751x0.a((float) this.f27740n.a((double) ((fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12))), (float) this.f27740n.a((double) ((fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12))), (float) this.f27740n.a((double) ((fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12))), f13, cVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x(java.lang.String r12, float[] r13, q1.z r14, q1.y r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            double r0 = r15.e()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
            double r0 = r15.f()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
            q1.t r0 = new q1.t
            r0.<init>(r15)
        L_0x0018:
            r5 = r0
            goto L_0x0020
        L_0x001a:
            q1.u r0 = new q1.u
            r0.<init>(r15)
            goto L_0x0018
        L_0x0020:
            double r0 = r15.e()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            double r0 = r15.f()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            q1.v r0 = new q1.v
            r0.<init>(r15)
        L_0x0035:
            r6 = r0
            goto L_0x003d
        L_0x0037:
            q1.w r0 = new q1.w
            r0.<init>(r15)
            goto L_0x0035
        L_0x003d:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.x.<init>(java.lang.String, float[], q1.z, q1.y, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x(java.lang.String r21, float[] r22, q1.z r23, double r24, float r26, float r27, int r28) {
        /*
            r20 = this;
            r1 = r24
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x000d
            q1.j r3 = f27730u
        L_0x000a:
            r17 = r3
            goto L_0x0013
        L_0x000d:
            q1.r r3 = new q1.r
            r3.<init>(r1)
            goto L_0x000a
        L_0x0013:
            if (r0 != 0) goto L_0x001a
            q1.j r0 = f27730u
        L_0x0017:
            r18 = r0
            goto L_0x0020
        L_0x001a:
            q1.s r0 = new q1.s
            r0.<init>(r1)
            goto L_0x0017
        L_0x0020:
            q1.y r19 = new q1.y
            r0 = r19
            r15 = 96
            r16 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r1 = r24
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r8 = 0
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r9 = r17
            r10 = r18
            r11 = r26
            r12 = r27
            r13 = r19
            r14 = r28
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.x.<init>(java.lang.String, float[], q1.z, double, float, float, int):void");
    }

    public x(x xVar, float[] fArr, z zVar) {
        this(xVar.h(), xVar.f27735i, zVar, fArr, xVar.f27738l, xVar.f27741o, xVar.f27732f, xVar.f27733g, xVar.f27734h, -1);
    }
}
