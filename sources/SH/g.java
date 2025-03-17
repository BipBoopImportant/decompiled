package SH;

import RH.j;
import RH.k;
import RH.n;
import RH.s;
import RH.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\b*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0013\u001a\u00020\b*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00158\u0000X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"LRH/k;", "LRH/j;", "builder", "", "e", "(LRH/k;LRH/j;)I", "LRH/n;", "minSize", "LSH/a;", "b", "(LRH/n;I)LSH/a;", "current", "LXH/N;", "a", "(LRH/n;LSH/a;)V", "c", "(LRH/n;LSH/a;)LSH/a;", "LRH/s;", "capacity", "d", "(LRH/s;ILSH/a;)LSH/a;", "", "[B", "EmptyByteArray", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f138269a = new byte[0];

    public static final void a(n nVar, C16416a aVar) {
        C17542s.j(nVar, "<this>");
        C17542s.j(aVar, "current");
        if (aVar != nVar) {
            if (aVar.k() <= aVar.i()) {
                nVar.t(aVar);
            } else if (aVar.f() - aVar.g() < 8) {
                nVar.z(aVar);
            } else {
                nVar.Q0(aVar.i());
            }
        }
    }

    public static final C16416a b(n nVar, int i10) {
        C17542s.j(nVar, "<this>");
        return nVar.A0(i10);
    }

    public static final C16416a c(n nVar, C16416a aVar) {
        C17542s.j(nVar, "<this>");
        C17542s.j(aVar, "current");
        if (aVar != nVar) {
            return nVar.v(aVar);
        }
        if (nVar.g()) {
            return (C16416a) nVar;
        }
        return null;
    }

    public static final C16416a d(s sVar, int i10, C16416a aVar) {
        C17542s.j(sVar, "<this>");
        if (aVar != null) {
            sVar.d();
        }
        return sVar.F(i10);
    }

    public static final int e(k kVar, j jVar) {
        C17542s.j(kVar, "<this>");
        C17542s.j(jVar, "builder");
        int A02 = jVar.A0();
        C16416a U10 = jVar.U();
        if (U10 == null) {
            return 0;
        }
        if (A02 > v.a() || U10.A() != null || !kVar.X0(U10)) {
            kVar.d(U10);
            return A02;
        }
        jVar.c();
        return A02;
    }
}
