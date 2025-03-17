package v0;

import E1.K;
import E1.a0;
import c2.h;
import c2.k;
import c2.v;
import c2.w;
import java.util.List;
import kotlin.Metadata;
import o1.C5673m;
import o1.C5674n;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\u000b*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b*\u00020\u0002H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\n*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0001\u0001\u0017ø\u0001\u0002\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lv0/x;", "LE1/K;", "", "index", "Lc2/b;", "constraints", "", "LE1/a0;", "q0", "(IJ)Ljava/util/List;", "Lc2/v;", "Lc2/h;", "q", "(J)F", "H", "(I)F", "", "t", "(F)J", "Lc2/k;", "Lo1/m;", "O", "(J)J", "Lv0/y;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface x extends K {
    float H(int i10) {
        return h.B(((float) i10) / getDensity());
    }

    long O(long j10) {
        return j10 != 9205357640488583168L ? C5674n.a(H1(k.h(j10)), H1(k.g(j10))) : C5673m.f26722b.a();
    }

    float q(long j10) {
        if (c2.x.g(v.g(j10), c2.x.f23061b.b())) {
            return h.B(v.h(j10) * D1());
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    List<a0> q0(int i10, long j10);

    long t(float f10) {
        return w.h(f10 / (D1() * getDensity()));
    }
}
