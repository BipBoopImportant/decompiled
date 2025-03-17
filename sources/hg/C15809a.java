package HG;

import YH.C16877v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import t0.C5934A;
import t0.k;
import u0.C5974I;
import u0.C5987k;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt0/A;", "", "buffer", "", "a", "(Lt0/A;I)Z", "Lu0/I;", "b", "(Lu0/I;I)Z", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: HG.a  reason: case insensitive filesystem */
public final class C15809a {
    public static final boolean a(C5934A a10, int i10) {
        C17542s.j(a10, "<this>");
        k kVar = (k) C16877v.K0(a10.x().i());
        return (kVar == null || kVar.getIndex() != 0) && kVar != null && kVar.getIndex() == a10.x().f() - i10;
    }

    public static final boolean b(C5974I i10, int i11) {
        C17542s.j(i10, "<this>");
        C5987k kVar = (C5987k) C16877v.K0(i10.v().i());
        return (kVar == null || kVar.getIndex() != 0) && kVar != null && kVar.getIndex() == i10.v().f() - i11;
    }

    public static /* synthetic */ boolean c(C5934A a10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return a(a10, i10);
    }

    public static /* synthetic */ boolean d(C5974I i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        return b(i10, i11);
    }
}
