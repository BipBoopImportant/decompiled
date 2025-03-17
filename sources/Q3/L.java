package q3;

import java.util.Collections;
import java.util.List;
import kb.C9967v;
import t3.N;

public final class L {

    /* renamed from: c  reason: collision with root package name */
    private static final String f27948c = N.A0(0);

    /* renamed from: d  reason: collision with root package name */
    private static final String f27949d = N.A0(1);

    /* renamed from: a  reason: collision with root package name */
    public final K f27950a;

    /* renamed from: b  reason: collision with root package name */
    public final C9967v<Integer> f27951b;

    public L(K k10, List<Integer> list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < k10.f27943a)) {
            this.f27950a = k10;
            this.f27951b = C9967v.A(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        return this.f27950a.f27945c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l10 = (L) obj;
        return this.f27950a.equals(l10.f27950a) && this.f27951b.equals(l10.f27951b);
    }

    public int hashCode() {
        return this.f27950a.hashCode() + (this.f27951b.hashCode() * 31);
    }
}
