package oH;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u001aI\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "left", "top", "right", "bottom", "horizontal", "vertical", "", "a", "(ZZZZZZ)I", "insetter"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class k {
    public static final int a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        int i10 = 0;
        int i11 = ((z10 || z14) ? 1 : 0) | ((z11 || z15) ? 2 : 0) | ((z12 || z14) ? 4 : 0);
        if (z13 || z15) {
            i10 = 8;
        }
        return i11 | i10;
    }
}
