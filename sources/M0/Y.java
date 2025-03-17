package m0;

import j0.C5457m;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a/\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj0/m;", "", "element", "fromIndex", "toIndex", "a", "(Lj0/m;III)I", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Y {
    public static final int a(C5457m mVar, int i10, int i11, int i12) {
        if (!(i11 <= i12)) {
            C5545h0.a("fromIndex(" + i11 + ") > toIndex(" + i12 + ')');
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Index out of range: " + i11);
        } else if (i12 <= mVar.b()) {
            int i13 = i12 - 1;
            while (i11 <= i13) {
                int i14 = (i11 + i13) >>> 1;
                int a10 = mVar.a(i14);
                if (a10 < i10) {
                    i11 = i14 + 1;
                } else if (a10 <= i10) {
                    return i14;
                } else {
                    i13 = i14 - 1;
                }
            }
            return -(i11 + 1);
        } else {
            throw new IndexOutOfBoundsException("Index out of range: " + i12);
        }
    }

    public static /* synthetic */ int b(C5457m mVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = mVar.b();
        }
        return a(mVar, i10, i11, i12);
    }
}
