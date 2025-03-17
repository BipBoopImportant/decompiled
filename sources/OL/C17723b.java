package oL;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kL.C17521b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mL.C17619c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LmL/c;", "factory", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "LXH/N;", "c", "(LmL/c;Ljava/lang/String;)V", "", "LoL/a;", "modules", "", "a", "(Ljava/util/List;)Ljava/util/Set;", "koin-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: oL.b  reason: case insensitive filesystem */
public final class C17723b {
    public static final Set<C17722a> a(List<C17722a> list) {
        C17542s.j(list, "modules");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b(list, linkedHashSet);
        return linkedHashSet;
    }

    private static final void b(List<C17722a> list, Set<C17722a> set) {
        for (C17722a aVar : list) {
            set.add(aVar);
            b(aVar.b(), set);
        }
    }

    public static final void c(C17619c<?> cVar, String str) {
        C17542s.j(cVar, "factory");
        C17542s.j(str, "mapping");
        throw new C17521b("Already existing definition for " + cVar.c() + " at " + str);
    }
}
