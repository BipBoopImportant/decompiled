package nts;

/* renamed from: nts.Ԇ  reason: contains not printable characters */
public class C3622 extends C3861 {
    /* renamed from: ഇ  reason: contains not printable characters */
    public int m577(int i10, int i11, char c10) {
        m578("" + i10, i11, c10);
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m578(String str, int i10, char c10) {
        int length = str.length();
        if (length > i10) {
            length = i10;
        }
        while (i10 > length) {
            this.f1673.m1918((byte) c10);
            i10--;
        }
        if (length > 0) {
            this.f1673.m1920(C3823.m1620(str.substring(0, length)));
        }
        return 0;
    }
}
