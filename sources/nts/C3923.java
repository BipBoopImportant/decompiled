package nts;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* renamed from: nts.ᗒ  reason: contains not printable characters */
public final class C3923 extends C4004<C4068, C3971> implements Cloneable {
    public C3923(List list, boolean z10) {
        super(list, z10);
    }

    public boolean addAll(int i10, Collection<? extends C4068> collection) {
        boolean z10 = false;
        if (!this.f3339) {
            Iterator<? extends C4068> it = collection.iterator();
            if (it.hasNext()) {
                z10 = true;
            }
            while (it.hasNext()) {
                int i11 = i10 + 1;
                try {
                    add(i10, (C4068) ((C4068) it.next()).clone());
                    i10 = i11;
                } catch (CloneNotSupportedException unused) {
                    i10 += 2;
                    add(i11, it.next());
                }
            }
            return z10;
        }
        throw new UnsupportedOperationException(C3727.m1052("Xfpfrfxq>mntrpznr``9\"mi|z-ex*{mVR\u0018[]^H\u001e", 0, 40, 63));
    }

    public Object clone() {
        Vector vector = new Vector();
        for (int i10 = 0; i10 < this.f3340.size(); i10++) {
            vector.add(((C4068) get(i10)).f3342.clone());
        }
        return new C3923(vector, this.f3339);
    }

    public int size() {
        return this.f3340.size();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public Object m2050(Object obj) {
        return ((C4068) obj).f3342;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public Object m2051(Object obj) {
        return new C4068((C3971) obj);
    }

    public boolean addAll(Collection<? extends C4068> collection) {
        return addAll(this.f3340.size(), collection);
    }
}
