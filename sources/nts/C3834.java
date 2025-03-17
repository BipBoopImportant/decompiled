package nts;

import java.util.regex.Matcher;

/* renamed from: nts.ዉ  reason: contains not printable characters */
public class C3834 {

    /* renamed from: ગ  reason: contains not printable characters */
    public int f1590 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public Matcher f1591;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean f1592 = false;

    public C3834(String str, Matcher matcher) {
        this.f1591 = matcher;
        m1683();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1683() {
        Matcher matcher = this.f1591;
        if (matcher != null) {
            matcher.reset();
        }
        this.f1590 = 0;
        this.f1592 = m1684();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m1684() {
        Matcher matcher = this.f1591;
        if (matcher == null) {
            return false;
        }
        boolean find = matcher.find();
        if (!find) {
            return find;
        }
        this.f1591.start();
        this.f1590 = this.f1591.end();
        return find;
    }
}
