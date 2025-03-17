package p1;

import HJ.C15854t;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;
import o1.C5665e;
import o1.C5667g;
import o1.C5668h;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b@\u0018\u0000 \u00042\u00020\u0001:\u0001*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ+\u0010 \u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010!J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0001\u0003\u0001\u00020\u0002\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lp1/O0;", "", "", "values", "b", "([F)[F", "Lo1/g;", "point", "f", "([FJ)J", "Lo1/e;", "rect", "LXH/N;", "g", "([FLo1/e;)V", "m", "n", "([F[F)V", "", "o", "([F)Ljava/lang/String;", "h", "([F)V", "", "degrees", "i", "([FF)V", "j", "k", "x", "y", "z", "l", "([FFFF)V", "p", "", "e", "([F)I", "other", "", "d", "([FLjava/lang/Object;)Z", "a", "[F", "getValues", "()[F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class O0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f27230b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float[] f27231a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lp1/O0$a;", "", "<init>", "()V", "", "Perspective0", "I", "Perspective1", "Perspective2", "ScaleX", "ScaleY", "ScaleZ", "SkewX", "SkewY", "TranslateX", "TranslateY", "TranslateZ", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ O0(float[] fArr) {
        this.f27231a = fArr;
    }

    public static final /* synthetic */ O0 a(float[] fArr) {
        return new O0(fArr);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof O0) && C17542s.e(fArr, ((O0) obj).r());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j10) {
        float m10 = C5667g.m(j10);
        float n10 = C5667g.n(j10);
        float f10 = ((float) 1) / (((fArr[3] * m10) + (fArr[7] * n10)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        return C5668h.a(((fArr[0] * m10) + (fArr[4] * n10) + fArr[12]) * f10, f10 * ((fArr[1] * m10) + (fArr[5] * n10) + fArr[13]));
    }

    public static final void g(float[] fArr, C5665e eVar) {
        long f10 = f(fArr, C5668h.a(eVar.b(), eVar.d()));
        long f11 = f(fArr, C5668h.a(eVar.b(), eVar.a()));
        long f12 = f(fArr, C5668h.a(eVar.c(), eVar.d()));
        long f13 = f(fArr, C5668h.a(eVar.c(), eVar.a()));
        eVar.i(Math.min(Math.min(C5667g.m(f10), C5667g.m(f11)), Math.min(C5667g.m(f12), C5667g.m(f13))));
        eVar.k(Math.min(Math.min(C5667g.n(f10), C5667g.n(f11)), Math.min(C5667g.n(f12), C5667g.n(f13))));
        eVar.j(Math.max(Math.max(C5667g.m(f10), C5667g.m(f11)), Math.max(C5667g.m(f12), C5667g.m(f13))));
        eVar.h(Math.max(Math.max(C5667g.n(f10), C5667g.n(f11)), Math.max(C5667g.n(f12), C5667g.n(f13))));
    }

    public static final void h(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    public static final void i(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[13];
        float f18 = fArr[14];
        fArr[1] = (f11 * cos) - (f12 * sin);
        fArr[2] = (f11 * sin) + (f12 * cos);
        fArr[5] = (f13 * cos) - (f14 * sin);
        fArr[6] = (f13 * sin) + (f14 * cos);
        fArr[9] = (f15 * cos) - (f16 * sin);
        fArr[10] = (f15 * sin) + (f16 * cos);
        fArr[13] = (f17 * cos) - (f18 * sin);
        fArr[14] = (f17 * sin) + (f18 * cos);
    }

    public static final void j(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[2];
        float f13 = fArr[4];
        float f14 = fArr[6];
        float f15 = fArr[8];
        float f16 = fArr[10];
        float f17 = fArr[12];
        float f18 = fArr[14];
        fArr[0] = (f11 * cos) + (f12 * sin);
        fArr[2] = ((-f11) * sin) + (f12 * cos);
        fArr[4] = (f13 * cos) + (f14 * sin);
        fArr[6] = ((-f13) * sin) + (f14 * cos);
        fArr[8] = (f15 * cos) + (f16 * sin);
        fArr[10] = ((-f15) * sin) + (f16 * cos);
        fArr[12] = (f17 * cos) + (f18 * sin);
        fArr[14] = ((-f17) * sin) + (f18 * cos);
    }

    public static final void k(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = -sin;
        float f14 = fArr[1];
        float f15 = fArr[5];
        float f16 = fArr[2];
        float f17 = fArr[6];
        float f18 = fArr[3];
        float f19 = fArr[7];
        fArr[0] = (cos * f11) + (sin * f12);
        fArr[1] = (cos * f14) + (sin * f15);
        fArr[2] = (cos * f16) + (sin * f17);
        fArr[3] = (cos * f18) + (sin * f19);
        fArr[4] = (f11 * f13) + (f12 * cos);
        fArr[5] = (f14 * f13) + (f15 * cos);
        fArr[6] = (f16 * f13) + (f17 * cos);
        fArr[7] = (f13 * f18) + (cos * f19);
    }

    public static final void l(float[] fArr, float f10, float f11, float f12) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    public static /* synthetic */ void m(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 1.0f;
        }
        l(fArr, f10, f11, f12);
    }

    public static final void n(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float a10 = P0.b(fArr3, 0, fArr4, 0);
        float a11 = P0.b(fArr3, 0, fArr4, 1);
        float a12 = P0.b(fArr3, 0, fArr4, 2);
        float a13 = P0.b(fArr3, 0, fArr4, 3);
        float a14 = P0.b(fArr3, 1, fArr4, 0);
        float a15 = P0.b(fArr3, 1, fArr4, 1);
        float a16 = P0.b(fArr3, 1, fArr4, 2);
        float a17 = P0.b(fArr3, 1, fArr4, 3);
        float a18 = P0.b(fArr3, 2, fArr4, 0);
        float a19 = P0.b(fArr3, 2, fArr4, 1);
        float a20 = P0.b(fArr3, 2, fArr4, 2);
        float a21 = P0.b(fArr3, 2, fArr4, 3);
        float a22 = P0.b(fArr3, 3, fArr4, 0);
        float a23 = P0.b(fArr3, 3, fArr4, 1);
        float a24 = P0.b(fArr3, 3, fArr4, 2);
        float a25 = P0.b(fArr3, 3, fArr4, 3);
        fArr3[0] = a10;
        fArr3[1] = a11;
        fArr3[2] = a12;
        fArr3[3] = a13;
        fArr3[4] = a14;
        fArr3[5] = a15;
        fArr3[6] = a16;
        fArr3[7] = a17;
        fArr3[8] = a18;
        fArr3[9] = a19;
        fArr3[10] = a20;
        fArr3[11] = a21;
        fArr3[12] = a22;
        fArr3[13] = a23;
        fArr3[14] = a24;
        fArr3[15] = a25;
    }

    public static String o(float[] fArr) {
        return C15854t.m("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void p(float[] fArr, float f10, float f11, float f12) {
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
    }

    public static /* synthetic */ void q(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        p(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return d(this.f27231a, obj);
    }

    public int hashCode() {
        return e(this.f27231a);
    }

    public final /* synthetic */ float[] r() {
        return this.f27231a;
    }

    public String toString() {
        return o(this.f27231a);
    }
}
