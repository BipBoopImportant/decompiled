package t1;

import c2.n;
import c2.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.E0;
import p1.J0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Lp1/J0;", "image", "Lc2/n;", "srcOffset", "Lc2/r;", "srcSize", "Lp1/E0;", "filterQuality", "Lt1/a;", "a", "(Lp1/J0;JJI)Lt1/a;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t1.b  reason: case insensitive filesystem */
public final class C5941b {
    public static final C5940a a(J0 j02, long j10, long j11, int i10) {
        C5940a aVar = new C5940a(j02, j10, j11, (DefaultConstructorMarker) null);
        aVar.k(i10);
        return aVar;
    }

    public static /* synthetic */ C5940a b(J0 j02, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = n.f23044b.a();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = s.a(j02.getWidth(), j02.getHeight());
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = E0.f27183a.a();
        }
        return a(j02, j12, j13, i10);
    }
}
