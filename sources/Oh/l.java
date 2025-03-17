package oH;

import I2.C0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\u001a]\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "ime", "navigationBars", "statusBars", "systemGestures", "mandatorySystemGestures", "displayCutout", "captionBar", "tappableElement", "", "a", "(ZZZZZZZZ)I", "insetter"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class l {
    public static final int a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        int c10 = z10 ? C0.l.c() : 0;
        if (z11) {
            c10 |= C0.l.f();
        }
        if (z12) {
            c10 |= C0.l.g();
        }
        if (z13) {
            c10 |= C0.l.i();
        }
        if (z15) {
            c10 |= C0.l.b();
        }
        if (z16) {
            c10 |= C0.l.a();
        }
        if (z17) {
            c10 |= C0.l.j();
        }
        return z14 ? c10 | C0.l.e() : c10;
    }
}
