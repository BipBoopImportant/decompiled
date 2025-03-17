package nts;

import java.util.Iterator;

/* renamed from: nts.य  reason: contains not printable characters */
public class C3678 {

    /* renamed from: ગ  reason: contains not printable characters */
    public Object f808 = null;

    /* renamed from: ഇ  reason: contains not printable characters */
    public Iterator f809;

    public C3678(Iterator it) {
        this.f809 = it;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m802() {
        if (!this.f809.hasNext()) {
            return false;
        }
        this.f808 = this.f809.next();
        return true;
    }
}
