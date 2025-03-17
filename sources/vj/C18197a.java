package vJ;

import kotlin.jvm.internal.C17542s;
import uJ.x0;
import vJ.f;
import vJ.g;

/* renamed from: vJ.a  reason: case insensitive filesystem */
public final class C18197a {
    public static final x0 a(boolean z10, boolean z11, C18198b bVar, f fVar, g gVar) {
        C17542s.j(bVar, "typeSystemContext");
        C17542s.j(fVar, "kotlinTypePreparator");
        C17542s.j(gVar, "kotlinTypeRefiner");
        return new x0(z10, z11, true, bVar, fVar, gVar);
    }

    public static /* synthetic */ x0 b(boolean z10, boolean z11, C18198b bVar, f fVar, g gVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            bVar = u.f149076a;
        }
        if ((i10 & 8) != 0) {
            fVar = f.a.f149049a;
        }
        if ((i10 & 16) != 0) {
            gVar = g.a.f149050a;
        }
        return a(z10, z11, bVar, fVar, gVar);
    }
}
