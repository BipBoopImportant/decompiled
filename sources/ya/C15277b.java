package yA;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vA.C15125b;
import vA.C15127d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/d;", "LvA/b;", "a", "(LvA/d;)LvA/b;", "settings-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yA.b  reason: case insensitive filesystem */
public final class C15277b {
    public static final C15125b a(C15127d dVar) {
        C17542s.j(dVar, "<this>");
        for (C15125b bVar : C15125b.j()) {
            if (bVar.v() == dVar) {
                return bVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
