package nts;

import java.util.ArrayList;
import java.util.List;

/* renamed from: nts.ɰ  reason: contains not printable characters */
public class C3555 {

    /* renamed from: ગ  reason: contains not printable characters */
    public List<C3609> f84;

    /* renamed from: ഇ  reason: contains not printable characters */
    public List<List<C3609>> f85 = new ArrayList();

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f86 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m142(C3609 r52) {
        if (this.f84 == null) {
            if (this.f86 > 0) {
                for (int i10 = 0; i10 < this.f86 - 1; i10++) {
                    this.f85.add((Object) null);
                }
                this.f86 = 0;
            }
            ArrayList arrayList = new ArrayList();
            this.f84 = arrayList;
            this.f85.add(arrayList);
        }
        this.f84.add(r52);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3609 m141(String str) {
        if (str == null) {
            str = "";
        }
        for (int size = this.f85.size() - 1; size >= 0; size--) {
            List list = this.f85.get(size);
            if (list != null) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    C3609 r32 = (C3609) list.get(i10);
                    if (str.equals(r32.f491)) {
                        return r32;
                    }
                }
                continue;
            }
        }
        return null;
    }
}
