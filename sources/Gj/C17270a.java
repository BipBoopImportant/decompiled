package gJ;

import DI.C15535F;
import DI.C15544O;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import DI.m0;
import LI.d;
import YH.C16877v;
import bI.C17035a;
import cJ.C17069f;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nJ.C17649d;
import nJ.C17656k;
import nJ.C17659n;

/* renamed from: gJ.a  reason: case insensitive filesystem */
public final class C17270a extends C17290u {

    /* renamed from: a  reason: collision with root package name */
    public static final C17270a f143296a = new C17270a();

    /* renamed from: gJ.a$a  reason: collision with other inner class name */
    public static final class C3496a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(C17506e.o((C15558e) t10).a(), C17506e.o((C15558e) t11).a());
        }
    }

    private C17270a() {
    }

    private static final void b(C15558e eVar, LinkedHashSet<C15558e> linkedHashSet, C17656k kVar, boolean z10) {
        for (C15566m mVar : C17659n.a.a(kVar, C17649d.f144840t, (C17642l) null, 2, (Object) null)) {
            if (mVar instanceof C15558e) {
                C15558e eVar2 = (C15558e) mVar;
                if (eVar2.m0()) {
                    C17069f name = eVar2.getName();
                    C17542s.i(name, "getName(...)");
                    C15561h e10 = kVar.e(name, d.WHEN_GET_ALL_DESCRIPTORS);
                    eVar2 = e10 instanceof C15558e ? (C15558e) e10 : e10 instanceof m0 ? ((m0) e10).w() : null;
                }
                if (eVar2 != null) {
                    if (C17278i.z(eVar2, eVar)) {
                        linkedHashSet.add(eVar2);
                    }
                    if (z10) {
                        C17656k U10 = eVar2.U();
                        C17542s.i(U10, "getUnsubstitutedInnerClassesScope(...)");
                        b(eVar, linkedHashSet, U10, z10);
                    }
                }
            }
        }
    }

    public Collection<C15558e> a(C15558e eVar, boolean z10) {
        C15566m mVar;
        C15566m mVar2;
        C17542s.j(eVar, "sealedClass");
        if (eVar.u() != C15535F.SEALED) {
            return C16877v.n();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z10) {
            mVar = eVar.b();
        } else {
            Iterator<C15566m> it = C17506e.u(eVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    mVar2 = null;
                    break;
                }
                mVar2 = it.next();
                if (mVar2 instanceof C15544O) {
                    break;
                }
            }
            mVar = mVar2;
        }
        if (mVar instanceof C15544O) {
            b(eVar, linkedHashSet, ((C15544O) mVar).q(), z10);
        }
        C17656k U10 = eVar.U();
        C17542s.i(U10, "getUnsubstitutedInnerClassesScope(...)");
        b(eVar, linkedHashSet, U10, true);
        return C16877v.g1(linkedHashSet, new C3496a());
    }
}
