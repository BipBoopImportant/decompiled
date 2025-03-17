package bJ;

import aJ.C17030a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: bJ.h  reason: case insensitive filesystem */
public final class C17049h {
    public static final List<C17030a.e.c> a(List<C17030a.e.c> list) {
        C17542s.j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (C17030a.e.c next : list) {
            int A10 = next.A();
            for (int i10 = 0; i10 < A10; i10++) {
                arrayList.add(next);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
