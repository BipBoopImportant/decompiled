package nts;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* renamed from: nts.ṓ  reason: contains not printable characters */
public final class C4077 extends C4004<C4074, C3703> implements Cloneable {
    public C4077(List list, boolean z10) {
        super(list, z10);
    }

    public boolean addAll(int i10, Collection<? extends C4074> collection) {
        boolean z10 = false;
        if (!this.f3339) {
            Iterator<? extends C4074> it = collection.iterator();
            if (it.hasNext()) {
                z10 = true;
            }
            while (it.hasNext()) {
                int i11 = i10 + 1;
                try {
                    add(i10, (C4074) ((C4074) it.next()).clone());
                    i10 = i11;
                } catch (CloneNotSupportedException unused) {
                    i10 += 2;
                    add(i11, it.next());
                }
            }
            return z10;
        }
        throw new UnsupportedOperationException(C3727.m1052("/\u0011\u0007\u0011\u0005\u0011\u000f\b\u0006I\u001a\u0019\u0003\u0005\u0007\r\u0019\u0005\u0017\u0017NU\u001a\u001e\u000b\rZ\u0012\u000f]\f\u001a!%o,*)?i", 0, 40, 72));
    }

    public Object clone() {
        Vector vector = new Vector();
        for (int i10 = 0; i10 < this.f3340.size(); i10++) {
            vector.add(((C4074) get(i10)).f3357.clone());
        }
        return new C4077(vector, this.f3339);
    }

    public int size() {
        return this.f3340.size();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public Object m3202(Object obj) {
        return ((C4074) obj).f3357;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public Object m3203(Object obj) {
        return new C4074((C3703) obj);
    }

    public boolean addAll(Collection<? extends C4074> collection) {
        return addAll(this.f3340.size(), collection);
    }
}
