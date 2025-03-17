package vJ;

import XH.t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import uJ.C18083G;
import uJ.C18087K;
import uJ.C18090N;
import uJ.C18099X;
import uJ.C18100Y;
import uJ.C18113f0;
import uJ.P0;
import wJ.C18229k;
import wJ.C18230l;

/* renamed from: vJ.d  reason: case insensitive filesystem */
public final class C18200d {
    public static final P0 a(Collection<? extends P0> collection) {
        C18113f0 f0Var;
        C17542s.j(collection, "types");
        int size = collection.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        } else if (size == 1) {
            return (P0) C16877v.a1(collection);
        } else {
            Iterable<P0> iterable = collection;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            boolean z10 = false;
            boolean z11 = false;
            for (P0 p02 : iterable) {
                z10 = z10 || C18100Y.a(p02);
                if (p02 instanceof C18113f0) {
                    f0Var = (C18113f0) p02;
                } else if (!(p02 instanceof C18087K)) {
                    throw new t();
                } else if (C18083G.a(p02)) {
                    return p02;
                } else {
                    f0Var = ((C18087K) p02).V0();
                    z11 = true;
                }
                arrayList.add(f0Var);
            }
            if (z10) {
                return C18230l.d(C18229k.INTERSECTION_OF_ERROR_TYPES, collection.toString());
            }
            if (!z11) {
                return C18196B.f149043a.d(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
            for (P0 d10 : iterable) {
                arrayList2.add(C18090N.d(d10));
            }
            C18196B b10 = C18196B.f149043a;
            return C18099X.e(b10.d(arrayList), b10.d(arrayList2));
        }
    }
}
