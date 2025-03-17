package gJ;

import DI.C15554a;
import EJ.C15671l;
import XH.C16807N;
import YH.C16877v;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: gJ.r  reason: case insensitive filesystem */
public final class C17287r {
    public static final <H> Collection<H> b(Collection<? extends H> collection, C17642l<? super H, ? extends C15554a> lVar) {
        C17542s.j(collection, "<this>");
        C17542s.j(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C15671l a10 = C15671l.f134268c.a();
        while (!linkedList.isEmpty()) {
            Object w02 = C16877v.w0(linkedList);
            C15671l a11 = C15671l.f134268c.a();
            Collection<H> q10 = C17284o.q(w02, linkedList, lVar, new C17286q(a11));
            C17542s.i(q10, "extractMembersOverridableInBothWays(...)");
            if (q10.size() != 1 || !a11.isEmpty()) {
                Object L10 = C17284o.L(q10, lVar);
                C15554a aVar = (C15554a) lVar.invoke(L10);
                for (Object next : q10) {
                    C17542s.g(next);
                    if (!C17284o.B(aVar, (C15554a) lVar.invoke(next))) {
                        a11.add(next);
                    }
                }
                if (!a11.isEmpty()) {
                    a10.addAll(a11);
                }
                a10.add(L10);
            } else {
                Object a12 = C16877v.a1(q10);
                C17542s.i(a12, "single(...)");
                a10.add(a12);
            }
        }
        return a10;
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C15671l lVar, Object obj) {
        C17542s.g(obj);
        lVar.add(obj);
        return C16807N.f139792a;
    }
}
