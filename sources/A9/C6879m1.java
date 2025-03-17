package a9;

import YH.C16877v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: a9.m1  reason: case insensitive filesystem */
public final class C6879m1 {
    public static final void a(LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, ArrayList arrayList, String str) {
        if (!linkedHashSet.contains(str)) {
            linkedHashSet.add(str);
            List<String> list = (List) linkedHashMap.get(str);
            if (list == null) {
                list = C16877v.n();
            }
            for (String a10 : list) {
                a(linkedHashSet, linkedHashMap, arrayList, a10);
            }
            arrayList.add(str);
            return;
        }
        throw new IllegalArgumentException("Circular dependency detected for " + str);
    }
}
