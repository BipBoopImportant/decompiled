package nts;

import java.util.Vector;

/* renamed from: nts.ք  reason: contains not printable characters */
public class C3632 {

    /* renamed from: ગ  reason: contains not printable characters */
    public C4141 f613 = null;

    /* renamed from: ഇ  reason: contains not printable characters */
    public Vector f614 = new Vector();

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f615 = 0;

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m600() {
        C4141 r02;
        if (this.f614.size() > 0) {
            Vector vector = this.f614;
            vector.removeElementAt(vector.size() - 1);
            if (this.f614.size() > 0) {
                Vector vector2 = this.f614;
                r02 = (C4141) vector2.get(vector2.size() - 1);
            } else {
                r02 = null;
            }
            this.f613 = r02;
            if (r02 == null) {
                this.f615 = 4;
            }
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m601() {
        C4141 r02 = this.f613;
        if (r02 == null) {
            return this.f615;
        }
        return r02.f3729;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m604(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f614.add(new C4141(i10));
            Vector vector = this.f614;
            this.f613 = (C4141) vector.get(vector.size() - 1);
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean m605() {
        return this.f613 != null;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m602(int i10) {
        C4141 r02 = this.f613;
        if (r02 != null) {
            r02.f3729 = i10;
        } else {
            this.f615 = i10;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m603() {
        this.f613.f3730++;
    }
}
