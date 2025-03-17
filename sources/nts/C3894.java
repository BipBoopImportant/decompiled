package nts;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* renamed from: nts.ᓡ  reason: contains not printable characters */
public final class C3894 extends C4004<C3818, C3890> implements Cloneable {
    public C3894(List list, boolean z10) {
        super(list, z10);
    }

    public boolean addAll(int i10, Collection<? extends C3818> collection) {
        boolean z10 = false;
        if (!this.f3339) {
            Iterator<? extends C3818> it = collection.iterator();
            if (it.hasNext()) {
                z10 = true;
            }
            while (it.hasNext()) {
                int i11 = i10 + 1;
                try {
                    add(i10, (C3818) ((C3818) it.next()).clone());
                    i10 = i11;
                } catch (CloneNotSupportedException unused) {
                    i10 += 2;
                    add(i11, it.next());
                }
            }
            return z10;
        }
        throw new UnsupportedOperationException(C3727.m1052("Npfpdpnig({xbdflxdvv/4{jl;sn<m{@D\u000eMKH^\b", 0, 40, 41));
    }

    public Object clone() {
        Vector vector = new Vector();
        for (int i10 = 0; i10 < this.f3340.size(); i10++) {
            vector.add(((C3818) get(i10)).f1530.clone());
        }
        return new C3894(vector, this.f3339);
    }

    public int size() {
        return this.f3340.size();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public Object m1980(Object obj) {
        return ((C3818) obj).f1530;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public Object m1981(Object obj) {
        return new C3818((C3890) obj);
    }

    public boolean addAll(Collection<? extends C3818> collection) {
        return addAll(this.f3340.size(), collection);
    }
}
