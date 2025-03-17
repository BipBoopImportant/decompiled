package UI;

import MI.C16048I;
import YH.C16877v;
import YH.g0;
import cJ.C17066c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import uJ.K0;
import yJ.C18740i;

public final class t0 {
    public static final C16587h a(C16587h hVar, Collection<C16587h> collection, boolean z10, boolean z11, boolean z12) {
        C16590k kVar;
        boolean z13;
        C17542s.j(hVar, "<this>");
        C17542s.j(collection, "superQualifiers");
        Iterable<C16587h> iterable = collection;
        ArrayList arrayList = new ArrayList();
        for (C16587h b10 : iterable) {
            C16590k b11 = b(b10);
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        C16590k d10 = d(C16877v.y1(arrayList), b(hVar), z10);
        if (d10 == null) {
            ArrayList arrayList2 = new ArrayList();
            for (C16587h f10 : iterable) {
                C16590k f11 = f10.f();
                if (f11 != null) {
                    arrayList2.add(f11);
                }
            }
            kVar = d(C16877v.y1(arrayList2), hVar.f(), z10);
        } else {
            kVar = d10;
        }
        ArrayList arrayList3 = new ArrayList();
        for (C16587h e10 : iterable) {
            C16588i e11 = e10.e();
            if (e11 != null) {
                arrayList3.add(e11);
            }
        }
        C16588i iVar = (C16588i) e(C16877v.y1(arrayList3), C16588i.MUTABLE, C16588i.READ_ONLY, hVar.e(), z10);
        C16590k kVar2 = null;
        if (kVar != null && !z12 && (!z11 || kVar != C16590k.NULLABLE)) {
            kVar2 = kVar;
        }
        boolean z14 = false;
        if (kVar2 == C16590k.NOT_NULL) {
            if (hVar.d()) {
                z13 = true;
            } else if (!((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C16587h) it.next()).d()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z13 = true;
            if (!(kVar2 == null || d10 == kVar)) {
                z14 = true;
            }
            return new C16587h(kVar2, iVar, z13, z14);
        }
        z13 = false;
        z14 = true;
        return new C16587h(kVar2, iVar, z13, z14);
    }

    private static final C16590k b(C16587h hVar) {
        if (hVar.g()) {
            return null;
        }
        return hVar.f();
    }

    public static final boolean c(K0 k02, C18740i iVar) {
        C17542s.j(k02, "<this>");
        C17542s.j(iVar, "type");
        C17066c cVar = C16048I.f136310v;
        C17542s.i(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return k02.J(iVar, cVar);
    }

    private static final C16590k d(Set<? extends C16590k> set, C16590k kVar, boolean z10) {
        C16590k kVar2 = C16590k.FORCE_FLEXIBILITY;
        return kVar == kVar2 ? kVar2 : (C16590k) e(set, C16590k.NOT_NULL, C16590k.NULLABLE, kVar, z10);
    }

    private static final <T> T e(Set<? extends T> set, T t10, T t11, T t12, boolean z10) {
        Set<? extends T> y12;
        if (z10) {
            T t13 = set.contains(t10) ? t10 : set.contains(t11) ? t11 : null;
            if (!C17542s.e(t13, t10) || !C17542s.e(t12, t11)) {
                return t12 == null ? t13 : t12;
            }
            return null;
        }
        if (!(t12 == null || (y12 = C16877v.y1(g0.l(set, t12))) == null)) {
            set = y12;
        }
        return C16877v.c1(set);
    }
}
