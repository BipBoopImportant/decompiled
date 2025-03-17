package B1;

import A1.B;
import A1.C4339f;
import A1.C4350q;
import D1.a;
import YH.C16870n;
import java.util.List;
import kotlin.Metadata;
import o1.C5667g;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\u001a3\u0010\t\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000f\u001a9\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!\"0\u0010*\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b8G@GX\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\"0\u0010/\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b8G@GX\u000e¢\u0006\u0018\n\u0004\b+\u0010#\u0012\u0004\b.\u0010)\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'*\u0018\b\u0002\u00100\"\b\u0012\u0004\u0012\u00020\u00120\u00002\b\u0012\u0004\u0012\u00020\u00120\u0000*\f\b\u0002\u00101\"\u00020\u00122\u00020\u0012¨\u00062"}, d2 = {"", "LB1/a;", "", "index", "", "time", "", "dataPoint", "LXH/N;", "j", "([LB1/a;IJF)V", "LB1/d;", "LA1/B;", "event", "c", "(LB1/d;LA1/B;)V", "d", "e", "", "x", "y", "sampleCount", "degree", "coefficients", "i", "([F[FII[F)[F", "dataPoints", "", "isDataDifferential", "f", "([F[FIZ)F", "a", "g", "([F[F)F", "<set-?>", "Z", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "getVelocityTrackerAddPointsFix$annotations", "()V", "VelocityTrackerAddPointsFix", "b", "h", "setVelocityTrackerStrategyUseImpulse", "getVelocityTrackerStrategyUseImpulse$annotations", "VelocityTrackerStrategyUseImpulse", "Matrix", "Vector", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5176a = true;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f5177b;

    public static final void c(d dVar, B b10) {
        if (f5176a) {
            e(dVar, b10);
        } else {
            d(dVar, b10);
        }
    }

    private static final void d(d dVar, B b10) {
        if (C4350q.b(b10)) {
            dVar.g(b10.h());
            dVar.f();
        }
        long k10 = b10.k();
        List<C4339f> e10 = b10.e();
        int size = e10.size();
        int i10 = 0;
        while (i10 < size) {
            C4339f fVar = e10.get(i10);
            long q10 = C5667g.q(fVar.b(), k10);
            long b11 = fVar.b();
            dVar.g(C5667g.r(dVar.d(), q10));
            dVar.a(fVar.c(), dVar.d());
            i10++;
            k10 = b11;
        }
        dVar.g(C5667g.r(dVar.d(), C5667g.q(b10.h(), k10)));
        dVar.a(b10.o(), dVar.d());
    }

    private static final void e(d dVar, B b10) {
        if (C4350q.b(b10)) {
            dVar.f();
        }
        if (!C4350q.d(b10)) {
            List<C4339f> e10 = b10.e();
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                C4339f fVar = e10.get(i10);
                dVar.a(fVar.c(), fVar.a());
            }
            dVar.a(b10.o(), b10.g());
        }
        if (C4350q.d(b10) && b10.o() - dVar.e() > 40) {
            dVar.f();
        }
        dVar.h(b10.o());
    }

    /* access modifiers changed from: private */
    public static final float f(float[] fArr, float[] fArr2, int i10, boolean z10) {
        int i11 = i10 - 1;
        float f10 = fArr2[i11];
        float f11 = 0.0f;
        int i12 = i11;
        while (i12 > 0) {
            int i13 = i12 - 1;
            float f12 = fArr2[i13];
            if (f10 != f12) {
                float f13 = (z10 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (f10 - f12);
                f11 += (f13 - (Math.signum(f11) * ((float) Math.sqrt((double) (((float) 2) * Math.abs(f11)))))) * Math.abs(f13);
                if (i12 == i11) {
                    f11 *= 0.5f;
                }
            }
            i12--;
            f10 = f12;
        }
        return Math.signum(f11) * ((float) Math.sqrt((double) (((float) 2) * Math.abs(f11))));
    }

    private static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static final boolean h() {
        return f5177b;
    }

    public static final float[] i(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3) {
        int i12 = i10;
        int i13 = i11;
        if (i13 < 1) {
            a.a("The degree must be at positive integer");
        }
        if (i12 == 0) {
            a.a("At least one point must be provided");
        }
        if (i13 >= i12) {
            i13 = i12 - 1;
        }
        int i14 = i13 + 1;
        float[][] fArr4 = new float[i14][];
        for (int i15 = 0; i15 < i14; i15++) {
            fArr4[i15] = new float[i12];
        }
        for (int i16 = 0; i16 < i12; i16++) {
            fArr4[0][i16] = 1.0f;
            for (int i17 = 1; i17 < i14; i17++) {
                fArr4[i17][i16] = fArr4[i17 - 1][i16] * fArr[i16];
            }
        }
        float[][] fArr5 = new float[i14][];
        for (int i18 = 0; i18 < i14; i18++) {
            fArr5[i18] = new float[i12];
        }
        float[][] fArr6 = new float[i14][];
        for (int i19 = 0; i19 < i14; i19++) {
            fArr6[i19] = new float[i14];
        }
        int i20 = 0;
        while (i20 < i14) {
            float[] fArr7 = fArr5[i20];
            C16870n.k(fArr4[i20], fArr7, 0, 0, i12);
            for (int i21 = 0; i21 < i20; i21++) {
                float[] fArr8 = fArr5[i21];
                float g10 = g(fArr7, fArr8);
                for (int i22 = 0; i22 < i12; i22++) {
                    fArr7[i22] = fArr7[i22] - (fArr8[i22] * g10);
                }
            }
            float sqrt = (float) Math.sqrt((double) g(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f10 = 1.0f / sqrt;
            for (int i23 = 0; i23 < i12; i23++) {
                fArr7[i23] = fArr7[i23] * f10;
            }
            float[] fArr9 = fArr6[i20];
            int i24 = 0;
            while (i24 < i14) {
                fArr9[i24] = i24 < i20 ? 0.0f : g(fArr7, fArr4[i24]);
                i24++;
            }
            i20++;
        }
        for (int i25 = i13; -1 < i25; i25--) {
            float g11 = g(fArr5[i25], fArr2);
            float[] fArr10 = fArr6[i25];
            int i26 = i25 + 1;
            if (i26 <= i13) {
                int i27 = i13;
                while (true) {
                    g11 -= fArr10[i27] * fArr3[i27];
                    if (i27 == i26) {
                        break;
                    }
                    i27--;
                }
            }
            fArr3[i25] = g11 / fArr10[i25];
        }
        return fArr3;
    }

    /* access modifiers changed from: private */
    public static final void j(a[] aVarArr, int i10, long j10, float f10) {
        a aVar = aVarArr[i10];
        if (aVar == null) {
            aVarArr[i10] = new a(j10, f10);
            return;
        }
        aVar.d(j10);
        aVar.c(f10);
    }
}
