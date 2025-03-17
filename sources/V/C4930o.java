package V;

import C.C4391e0;
import C.C4417z;
import H2.i;
import V.C4925j;
import X.g;
import android.util.Size;
import androidx.camera.core.impl.C5031k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: V.o  reason: case insensitive filesystem */
public final class C4930o {

    /* renamed from: a  reason: collision with root package name */
    private final List<C4927l> f14472a;

    /* renamed from: b  reason: collision with root package name */
    private final C4925j f14473b;

    C4930o(List<C4927l> list, C4925j jVar) {
        i.b(!list.isEmpty() || jVar != C4925j.f14458a, "No preferred quality and fallback strategy.");
        this.f14472a = Collections.unmodifiableList(new ArrayList(list));
        this.f14473b = jVar;
    }

    private void a(List<C4927l> list, Set<C4927l> set) {
        if (!list.isEmpty() && !set.containsAll(list)) {
            C4391e0.a("QualitySelector", "Select quality by fallbackStrategy = " + this.f14473b);
            C4925j jVar = this.f14473b;
            if (jVar != C4925j.f14458a) {
                i.j(jVar instanceof C4925j.b, "Currently only support type RuleStrategy");
                C4925j.b bVar = (C4925j.b) this.f14473b;
                List<C4927l> b10 = C4927l.b();
                boolean z10 = false;
                C4927l b11 = bVar.b() == C4927l.f14464f ? b10.get(0) : bVar.b() == C4927l.f14463e ? b10.get(b10.size() - 1) : bVar.b();
                int indexOf = b10.indexOf(b11);
                if (indexOf != -1) {
                    z10 = true;
                }
                i.i(z10);
                ArrayList arrayList = new ArrayList();
                for (int i10 = indexOf - 1; i10 >= 0; i10--) {
                    C4927l lVar = b10.get(i10);
                    if (list.contains(lVar)) {
                        arrayList.add(lVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = indexOf + 1; i11 < b10.size(); i11++) {
                    C4927l lVar2 = b10.get(i11);
                    if (list.contains(lVar2)) {
                        arrayList2.add(lVar2);
                    }
                }
                C4391e0.a("QualitySelector", "sizeSortedQualities = " + b10 + ", fallback quality = " + b11 + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
                int c10 = bVar.c();
                if (c10 == 0) {
                    return;
                }
                if (c10 == 1) {
                    set.addAll(arrayList);
                    set.addAll(arrayList2);
                } else if (c10 == 2) {
                    set.addAll(arrayList);
                } else if (c10 == 3) {
                    set.addAll(arrayList2);
                    set.addAll(arrayList);
                } else if (c10 == 4) {
                    set.addAll(arrayList2);
                } else {
                    throw new AssertionError("Unhandled fallback strategy: " + this.f14473b);
                }
            }
        }
    }

    private static void b(List<C4927l> list) {
        for (C4927l next : list) {
            boolean a10 = C4927l.a(next);
            i.b(a10, "qualities contain invalid quality: " + next);
        }
    }

    public static C4930o c(List<C4927l> list, C4925j jVar) {
        i.h(list, "qualities cannot be null");
        i.h(jVar, "fallbackStrategy cannot be null");
        i.b(!list.isEmpty(), "qualities cannot be empty");
        b(list);
        return new C4930o(list, jVar);
    }

    private static Size e(g gVar) {
        C5031k0.c k10 = gVar.k();
        return new Size(k10.k(), k10.h());
    }

    public static Map<C4927l, Size> f(I i10, C4417z zVar) {
        HashMap hashMap = new HashMap();
        for (C4927l next : i10.b(zVar)) {
            g a10 = i10.a(next, zVar);
            Objects.requireNonNull(a10);
            hashMap.put(next, e(a10));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public List<C4927l> d(List<C4927l> list) {
        if (list.isEmpty()) {
            C4391e0.l("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        C4391e0.a("QualitySelector", "supportedQualities = " + list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C4927l> it = this.f14472a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4927l next = it.next();
            if (next == C4927l.f14464f) {
                linkedHashSet.addAll(list);
                break;
            } else if (next == C4927l.f14463e) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            } else if (list.contains(next)) {
                linkedHashSet.add(next);
            } else {
                C4391e0.l("QualitySelector", "quality is not supported and will be ignored: " + next);
            }
        }
        a(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f14472a + ", fallbackStrategy=" + this.f14473b + "}";
    }
}
