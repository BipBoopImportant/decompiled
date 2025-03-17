package uJ;

import com.sugarcube.core.logger.DslKt;
import kotlin.jvm.internal.C17542s;
import yJ.C18738g;
import yJ.C18740i;
import yJ.C18741j;
import yJ.m;
import yJ.p;

/* renamed from: uJ.d  reason: case insensitive filesystem */
public final class C18108d {

    /* renamed from: a  reason: collision with root package name */
    public static final C18108d f147871a = new C18108d();

    private C18108d() {
    }

    private final boolean a(p pVar, C18741j jVar, C18741j jVar2) {
        if (pVar.U(jVar) != pVar.U(jVar2) || pVar.d0(jVar) != pVar.d0(jVar2) || pVar.Z(jVar) != pVar.Z(jVar2) || !pVar.y(pVar.a(jVar), pVar.a(jVar2))) {
            return false;
        }
        if (pVar.N(jVar, jVar2)) {
            return true;
        }
        int U10 = pVar.U(jVar);
        for (int i10 = 0; i10 < U10; i10++) {
            m l10 = pVar.l(jVar, i10);
            m l11 = pVar.l(jVar2, i10);
            if (pVar.f(l10) != pVar.f(l11)) {
                return false;
            }
            if (!pVar.f(l10)) {
                if (pVar.a0(l10) != pVar.a0(l11)) {
                    return false;
                }
                C18740i Y10 = pVar.Y(l10);
                C17542s.g(Y10);
                C18740i Y11 = pVar.Y(l11);
                C17542s.g(Y11);
                if (!c(pVar, Y10, Y11)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean c(p pVar, C18740i iVar, C18740i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        C18741j d10 = pVar.d(iVar);
        C18741j d11 = pVar.d(iVar2);
        if (d10 != null && d11 != null) {
            return a(pVar, d10, d11);
        }
        C18738g I02 = pVar.I0(iVar);
        C18738g I03 = pVar.I0(iVar2);
        if (I02 == null || I03 == null) {
            return false;
        }
        return a(pVar, pVar.h(I02), pVar.h(I03)) && a(pVar, pVar.e(I02), pVar.e(I03));
    }

    public final boolean b(p pVar, C18740i iVar, C18740i iVar2) {
        C17542s.j(pVar, "context");
        C17542s.j(iVar, "a");
        C17542s.j(iVar2, DslKt.INDICATOR_BACKGROUND);
        return c(pVar, iVar, iVar2);
    }
}
