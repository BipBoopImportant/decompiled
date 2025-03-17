package androidx.appcompat.app;

import D2.j;
import java.util.LinkedHashSet;
import java.util.Locale;

final class t {
    private static j a(j jVar, j jVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < jVar.f() + jVar2.f()) {
            Locale c10 = i10 < jVar.f() ? jVar.c(i10) : jVar2.c(i10 - jVar.f());
            if (c10 != null) {
                linkedHashSet.add(c10);
            }
            i10++;
        }
        return j.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static j b(j jVar, j jVar2) {
        return (jVar == null || jVar.e()) ? j.d() : a(jVar, jVar2);
    }
}
