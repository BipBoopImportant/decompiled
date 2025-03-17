package ga;

import java.util.Iterator;
import java.util.Set;

/* renamed from: ga.z  reason: case insensitive filesystem */
public final class C7923z {
    static int a(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }
}
