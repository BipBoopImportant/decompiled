package ia;

import java.util.Iterator;
import java.util.Set;

/* renamed from: ia.b  reason: case insensitive filesystem */
public final class C8227b {
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
