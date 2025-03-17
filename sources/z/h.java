package z;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.impl.R0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import v.P1;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final CaptureSessionOnClosedNotCalledQuirk f32319a;

    @FunctionalInterface
    public interface a {
        void a(P1 p12);
    }

    public h(R0 r02) {
        this.f32319a = (CaptureSessionOnClosedNotCalledQuirk) r02.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    private void a(Set<P1> set) {
        for (P1 next : set) {
            next.c().q(next);
        }
    }

    private void b(Set<P1> set) {
        for (P1 next : set) {
            next.c().r(next);
        }
    }

    public void c(P1 p12, List<P1> list, List<P1> list2, a aVar) {
        P1 next;
        P1 next2;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<P1> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != p12) {
                linkedHashSet.add(next2);
            }
            b(linkedHashSet);
        }
        aVar.a(p12);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<P1> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != p12) {
                linkedHashSet2.add(next);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f32319a != null;
    }
}
