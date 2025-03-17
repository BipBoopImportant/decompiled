package PI;

import DI.C15560g;
import DI.C15566m;
import EI.C15649h;
import MI.C16044E;
import TI.z;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import kotlin.jvm.internal.C17542s;

/* renamed from: PI.c  reason: case insensitive filesystem */
public final class C16193c {
    private static final C16201k c(C16201k kVar, C15566m mVar, z zVar, int i10, C16824o<C16044E> oVar) {
        return new C16201k(kVar.a(), zVar != null ? new C16203m(kVar, mVar, zVar, i10) : kVar.f(), oVar);
    }

    public static final C16201k d(C16201k kVar, C16206p pVar) {
        C17542s.j(kVar, "<this>");
        C17542s.j(pVar, "typeParameterResolver");
        return new C16201k(kVar.a(), pVar, kVar.c());
    }

    public static final C16201k e(C16201k kVar, C15560g gVar, z zVar, int i10) {
        C17542s.j(kVar, "<this>");
        C17542s.j(gVar, "containingDeclaration");
        return c(kVar, gVar, zVar, i10, C16825p.a(s.NONE, new C16191a(kVar, gVar)));
    }

    public static /* synthetic */ C16201k f(C16201k kVar, C15560g gVar, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            zVar = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(kVar, gVar, zVar, i10);
    }

    /* access modifiers changed from: private */
    public static final C16044E g(C16201k kVar, C15560g gVar) {
        return j(kVar, gVar.getAnnotations());
    }

    public static final C16201k h(C16201k kVar, C15566m mVar, z zVar, int i10) {
        C17542s.j(kVar, "<this>");
        C17542s.j(mVar, "containingDeclaration");
        C17542s.j(zVar, "typeParameterOwner");
        return c(kVar, mVar, zVar, i10, kVar.c());
    }

    public static /* synthetic */ C16201k i(C16201k kVar, C15566m mVar, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return h(kVar, mVar, zVar, i10);
    }

    public static final C16044E j(C16201k kVar, C15649h hVar) {
        C17542s.j(kVar, "<this>");
        C17542s.j(hVar, "additionalAnnotations");
        return kVar.a().a().d(kVar.b(), hVar);
    }

    public static final C16201k k(C16201k kVar, C15649h hVar) {
        C17542s.j(kVar, "<this>");
        C17542s.j(hVar, "additionalAnnotations");
        return hVar.isEmpty() ? kVar : new C16201k(kVar.a(), kVar.f(), C16825p.a(s.NONE, new C16192b(kVar, hVar)));
    }

    /* access modifiers changed from: private */
    public static final C16044E l(C16201k kVar, C15649h hVar) {
        return j(kVar, hVar);
    }

    public static final C16201k m(C16201k kVar, C16194d dVar) {
        C17542s.j(kVar, "<this>");
        C17542s.j(dVar, "components");
        return new C16201k(dVar, kVar.f(), kVar.c());
    }
}
