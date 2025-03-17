package IJ;

import IJ.C15906b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\n\u001a'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"", "value", "LIJ/b;", "a", "(J)J", "valueNs", "origin", "LIJ/e;", "unit", "b", "(JJLIJ/e;)J", "origin1", "origin2", "d", "value1", "value2", "c", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: IJ.h  reason: case insensitive filesystem */
public final class C15912h {
    private static final long a(long j10) {
        return j10 < 0 ? C15906b.f135496b.b() : C15906b.f135496b.a();
    }

    public static final long b(long j10, long j11, C15909e eVar) {
        C17542s.j(eVar, "unit");
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? C15906b.e0(a(j11)) : c(j10, j11, eVar);
    }

    private static final long c(long j10, long j11, C15909e eVar) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return C15908d.t(j12, eVar);
        }
        C15909e eVar2 = C15909e.MILLISECONDS;
        if (eVar.compareTo(eVar2) >= 0) {
            return C15906b.e0(a(j12));
        }
        long b10 = C15910f.b(1, eVar2, eVar);
        long j13 = (j10 % b10) - (j11 % b10);
        C15906b.a aVar = C15906b.f135496b;
        return C15906b.a0(C15908d.t((j10 / b10) - (j11 / b10), eVar2), C15908d.t(j13, eVar));
    }

    public static final long d(long j10, long j11, C15909e eVar) {
        C17542s.j(eVar, "unit");
        return ((j11 - 1) | 1) == Long.MAX_VALUE ? j10 == j11 ? C15906b.f135496b.c() : C15906b.e0(a(j11)) : (1 | (j10 - 1)) == Long.MAX_VALUE ? a(j10) : c(j10, j11, eVar);
    }
}
