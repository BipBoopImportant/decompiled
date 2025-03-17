package p0;

import A1.B;
import A1.C4349p;
import java.util.List;
import kotlin.Metadata;
import o1.C5667g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"LA1/p;", "", "e", "(LA1/p;)F", "Lo1/g;", "a", "(J)F", "f", "d", "(LA1/p;)J", "", "useCurrent", "c", "(LA1/p;Z)F", "b", "(LA1/p;Z)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class K {
    private static final float a(long j10) {
        if (C5667g.m(j10) == 0.0f && C5667g.n(j10) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2((double) C5667g.m(j10), (double) C5667g.n(j10)))) * 180.0f) / 3.1415927f;
    }

    public static final long b(C4349p pVar, boolean z10) {
        long c10 = C5667g.f26701b.c();
        List<B> c11 = pVar.c();
        int size = c11.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            B b10 = c11.get(i11);
            if (b10.i() && b10.l()) {
                c10 = C5667g.r(c10, z10 ? b10.h() : b10.k());
                i10++;
            }
        }
        return i10 == 0 ? C5667g.f26701b.b() : C5667g.h(c10, (float) i10);
    }

    public static final float c(C4349p pVar, boolean z10) {
        long b10 = b(pVar, z10);
        float f10 = 0.0f;
        if (C5667g.j(b10, C5667g.f26701b.b())) {
            return 0.0f;
        }
        List<B> c10 = pVar.c();
        int size = c10.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            B b11 = c10.get(i11);
            if (b11.i() && b11.l()) {
                f10 += C5667g.k(C5667g.q(z10 ? b11.h() : b11.k(), b10));
                i10++;
            }
        }
        return f10 / ((float) i10);
    }

    public static final long d(C4349p pVar) {
        long b10 = b(pVar, true);
        C5667g.a aVar = C5667g.f26701b;
        return C5667g.j(b10, aVar.b()) ? aVar.c() : C5667g.q(b10, b(pVar, false));
    }

    public static final float e(C4349p pVar) {
        List<B> c10 = pVar.c();
        int size = c10.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= size) {
                break;
            }
            B b10 = c10.get(i10);
            if (!b10.l() || !b10.i()) {
                i12 = 0;
            }
            i11 += i12;
            i10++;
        }
        if (i11 < 2) {
            return 0.0f;
        }
        long b11 = b(pVar, true);
        long b12 = b(pVar, false);
        List<B> c11 = pVar.c();
        int size2 = c11.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i13 = 0; i13 < size2; i13++) {
            B b13 = c11.get(i13);
            if (b13.i() && b13.l()) {
                long h10 = b13.h();
                long q10 = C5667g.q(b13.k(), b12);
                long q11 = C5667g.q(h10, b11);
                float a10 = a(q11) - a(q10);
                float k10 = C5667g.k(C5667g.r(q11, q10)) / 2.0f;
                if (a10 > 180.0f) {
                    a10 -= 360.0f;
                } else if (a10 < -180.0f) {
                    a10 += 360.0f;
                }
                f11 += a10 * k10;
                f10 += k10;
            }
        }
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f11 / f10;
    }

    public static final float f(C4349p pVar) {
        float c10 = c(pVar, true);
        float c11 = c(pVar, false);
        if (c10 == 0.0f || c11 == 0.0f) {
            return 1.0f;
        }
        return c10 / c11;
    }
}
