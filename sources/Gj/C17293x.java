package gJ;

import DI.C15555b;
import DI.C15573t;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;

/* renamed from: gJ.x  reason: case insensitive filesystem */
public final class C17293x {
    public static final C15555b a(Collection<? extends C15555b> collection) {
        Integer d10;
        C17542s.j(collection, "descriptors");
        collection.isEmpty();
        C15555b bVar = null;
        for (C15555b bVar2 : collection) {
            if (bVar == null || ((d10 = C15573t.d(bVar.getVisibility(), bVar2.getVisibility())) != null && d10.intValue() < 0)) {
                bVar = bVar2;
            }
        }
        C17542s.g(bVar);
        return bVar;
    }
}
