package XK;

import WK.K;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "value", "fromIndex", "toIndex", "a", "([IIII)I", "LWK/K;", "pos", "b", "(LWK/K;I)I", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: XK.e  reason: case insensitive filesystem */
public final class C16838e {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        C17542s.j(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else if (i15 <= i10) {
                return i14;
            } else {
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(K k10, int i10) {
        C17542s.j(k10, "<this>");
        int a10 = a(k10.e0(), i10 + 1, 0, k10.f0().length);
        return a10 >= 0 ? a10 : ~a10;
    }
}
