package nts;

import java.util.Vector;

/* renamed from: nts.ב  reason: contains not printable characters */
public class C3633 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public Vector f616 = new Vector();

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        if (this.f616.size() > 0) {
            sb2.append(this.f616.elementAt(0).toString());
            for (int i10 = 1; i10 < this.f616.size(); i10++) {
                sb2.append(",");
                sb2.append(this.f616.elementAt(i10).toString());
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m606(int i10) {
        this.f616.setSize(i10);
        return 0;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m608() {
        this.f616.setSize(0);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public String m612(int i10) {
        if (i10 < 0 || i10 >= this.f616.size() || this.f616.elementAt(i10) == null) {
            return "";
        }
        return this.f616.elementAt(i10).toString();
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int m613(int i10) {
        return m612(i10).length();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m607(int i10) {
        try {
            return Integer.parseInt(m612(i10));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m611(String str) {
        this.f616.addElement(str);
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m610(int i10, String str) {
        this.f616.setElementAt(str, i10);
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m609() {
        return this.f616.size();
    }
}
