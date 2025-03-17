package w0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "gridSize", "slotCount", "spacing", "", "b", "(III)[I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: w0.e  reason: case insensitive filesystem */
public final class C6198e {
    /* access modifiers changed from: private */
    public static final int[] b(int i10, int i11, int i12) {
        int i13;
        int i14 = i10 - (i12 * (i11 - 1));
        int i15 = i14 / i11;
        int i16 = i14 % i11;
        int[] iArr = new int[i11];
        int i17 = 0;
        while (i17 < i11) {
            if (i15 < 0) {
                i13 = 0;
            } else {
                i13 = (i17 < i16 ? 1 : 0) + i15;
            }
            iArr[i17] = i13;
            i17++;
        }
        return iArr;
    }
}
