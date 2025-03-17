package c2;

import kotlin.Metadata;
import o1.C5673m;
import o1.C5674n;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\u0003*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u0006*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u0002*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\t*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0005J\u0019\u0010\u0013\u001a\u00020\t*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0002\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lc2/d;", "Lc2/l;", "Lc2/h;", "", "H1", "(F)F", "", "K0", "(F)I", "Lc2/v;", "O0", "(J)F", "K1", "(J)I", "H", "(I)F", "l0", "(I)J", "x1", "t", "(F)J", "Lc2/k;", "Lo1/m;", "O", "(J)J", "X", "getDensity", "()F", "getDensity$annotations", "()V", "density", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d extends l {
    float H(int i10) {
        return h.B(((float) i10) / getDensity());
    }

    float H1(float f10) {
        return f10 * getDensity();
    }

    int K0(float f10) {
        float H12 = H1(f10);
        if (Float.isInfinite(H12)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(H12);
    }

    int K1(long j10) {
        return Math.round(O0(j10));
    }

    long O(long j10) {
        return j10 != 9205357640488583168L ? C5674n.a(H1(k.h(j10)), H1(k.g(j10))) : C5673m.f26722b.a();
    }

    float O0(long j10) {
        if (x.g(v.g(j10), x.f23061b.b())) {
            return H1(q(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    long X(long j10) {
        return j10 != 9205357640488583168L ? i.b(x1(C5673m.l(j10)), x1(C5673m.i(j10))) : k.f23040b.a();
    }

    float getDensity();

    long l0(int i10) {
        return W(H(i10));
    }

    long t(float f10) {
        return W(x1(f10));
    }

    float x1(float f10) {
        return h.B(f10 / getDensity());
    }
}
