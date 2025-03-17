package nts;

import java.util.regex.Pattern;

/* renamed from: nts.ỽ  reason: contains not printable characters */
public class C4094 {

    /* renamed from: ગ  reason: contains not printable characters */
    public Pattern f3479 = null;

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f3480 = 0;

    public C4094(String str, int i10) {
        if ((i10 & 1) == 1) {
            this.f3480 = 32;
        } else if ((i10 & 2) == 2) {
            this.f3480 = 8;
        }
        if ((i10 & 4) == 4) {
            this.f3480 |= 2;
        }
        this.f3479 = Pattern.compile(str, this.f3480);
    }
}
