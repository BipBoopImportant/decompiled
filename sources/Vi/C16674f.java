package VI;

import VI.C16659A;
import XI.n;
import ZI.c;
import ZI.e;
import ZI.g;
import aJ.C17030a;
import bJ.C17045d;
import bJ.C17050i;
import eJ.C17198i;
import kotlin.jvm.internal.C17542s;

/* renamed from: VI.f  reason: case insensitive filesystem */
public final class C16674f {
    public static final C16659A a(n nVar, c cVar, g gVar, boolean z10, boolean z11, boolean z12) {
        C17542s.j(nVar, "proto");
        C17542s.j(cVar, "nameResolver");
        C17542s.j(gVar, "typeTable");
        C17198i.f<n, C17030a.d> fVar = C17030a.f140990d;
        C17542s.i(fVar, "propertySignature");
        C17030a.d dVar = (C17030a.d) e.a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        if (z10) {
            C17045d.a c10 = C17050i.f141191a.c(nVar, cVar, gVar, z12);
            if (c10 == null) {
                return null;
            }
            return C16659A.f139314b.b(c10);
        } else if (!z11 || !dVar.D()) {
            return null;
        } else {
            C16659A.a aVar = C16659A.f139314b;
            C17030a.c y10 = dVar.y();
            C17542s.i(y10, "getSyntheticMethod(...)");
            return aVar.c(cVar, y10);
        }
    }

    public static /* synthetic */ C16659A b(n nVar, c cVar, g gVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        boolean z13 = (i10 & 8) != 0 ? false : z10;
        boolean z14 = (i10 & 16) != 0 ? false : z11;
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return a(nVar, cVar, gVar, z13, z14, z12);
    }
}
