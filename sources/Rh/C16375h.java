package RH;

import SH.C16416a;
import TH.C16492f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a$\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\u0007\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LSH/a;", "LTH/f;", "pool", "LXH/N;", "d", "(LSH/a;LTH/f;)V", "a", "(LSH/a;)LSH/a;", "head", "prev", "b", "(LSH/a;LSH/a;LSH/a;)LSH/a;", "c", "", "e", "(LSH/a;)J", "n", "f", "(LSH/a;J)J", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: RH.h  reason: case insensitive filesystem */
public final class C16375h {
    public static final C16416a a(C16416a aVar) {
        C17542s.j(aVar, "<this>");
        C16416a z10 = aVar.z();
        C16416a A10 = aVar.A();
        return A10 == null ? z10 : b(A10, z10, z10);
    }

    private static final C16416a b(C16416a aVar, C16416a aVar2, C16416a aVar3) {
        while (true) {
            C16416a z10 = aVar.z();
            aVar3.F(z10);
            aVar = aVar.A();
            if (aVar == null) {
                return aVar2;
            }
            aVar3 = z10;
        }
    }

    public static final C16416a c(C16416a aVar) {
        C17542s.j(aVar, "<this>");
        while (true) {
            C16416a A10 = aVar.A();
            if (A10 == null) {
                return aVar;
            }
            aVar = A10;
        }
    }

    public static final void d(C16416a aVar, C16492f<C16416a> fVar) {
        C17542s.j(fVar, "pool");
        while (aVar != null) {
            C16416a y10 = aVar.y();
            aVar.D(fVar);
            aVar = y10;
        }
    }

    public static final long e(C16416a aVar) {
        C17542s.j(aVar, "<this>");
        return f(aVar, 0);
    }

    private static final long f(C16416a aVar, long j10) {
        do {
            j10 += (long) (aVar.k() - aVar.i());
            aVar = aVar.A();
        } while (aVar != null);
        return j10;
    }
}
