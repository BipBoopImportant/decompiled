package Op;

import J1.j;
import Oo.b;
import Op.C10828d;
import SC.L1;
import SC.R1;
import U0.C4889m;
import U0.C4895p;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import qx.c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LOp/d$l;", "LOp/d$i;", "highlight", "Lkp/d;", "currencyConfig", "", "familyAndRegularPriceSameSize", "LSC/R1;", "a", "(LOp/d$l;LOp/d$i;Lkp/d;ZLU0/m;I)LSC/R1;", "product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e1 {
    public static final R1 a(C10828d.l lVar, C10828d.i iVar, C11522d dVar, boolean z10, C4889m mVar, int i10) {
        R1 r12;
        R1 cVar;
        C17542s.j(lVar, "<this>");
        C17542s.j(dVar, "currencyConfig");
        mVar.W(1973869240);
        if (C4895p.J()) {
            C4895p.S(1973869240, i10, -1, "com.ingka.ikea.design.ui.product.toSkapaPriceOffer (ProductItemUiModel.kt:409)");
        }
        if (lVar instanceof C10828d.l.f) {
            mVar.W(872967703);
            C10828d.k a10 = iVar != null ? iVar.a() : null;
            if (a10 == C10828d.k.NEW_PRODUCT) {
                r12 = new R1.d(j.b(b.f84384G6, mVar, 0));
            } else if (a10 == C10828d.k.FAMILY_PRICE || a10 == C10828d.k.NEW_LOWER_PRICE || a10 == C10828d.k.TIME_RESTRICTED_OFFER || a10 == null) {
                r12 = R1.h.f115917b;
            } else {
                throw new t();
            }
            mVar.P();
        } else if (lVar instanceof C10828d.l.a) {
            mVar.W(-1495840589);
            mVar.P();
            r12 = R1.a.f115903b;
        } else if (lVar instanceof C10828d.l.b) {
            mVar.W(873870392);
            String b10 = j.b(b.f84491R3, mVar, 0);
            if (z10) {
                c d10 = ((C10828d.l.b) lVar).a().d();
                cVar = d10 == null ? R1.h.f115917b : new R1.b(b10, j.b(b.f84471P3, mVar, 0), d10, L1.b(dVar));
            } else {
                cVar = new R1.c(b10);
            }
            mVar.P();
        } else if (lVar instanceof C10828d.l.c) {
            mVar.W(874646663);
            r12 = new R1.f(j.b(b.f84374F6, mVar, 0));
            mVar.P();
        } else if (lVar instanceof C10828d.l.g) {
            mVar.W(874867166);
            mVar.P();
            c d11 = ((C10828d.l.g) lVar).a().d();
            r12 = d11 == null ? R1.h.f115917b : new R1.i(d11, L1.b(dVar));
        } else if (lVar instanceof C10828d.l.C1721d) {
            mVar.W(875286968);
            c d12 = ((C10828d.l.C1721d) lVar).a().d();
            r12 = d12 == null ? R1.h.f115917b : new R1.g(j.b(b.f84384G6, mVar, 0), d12, L1.b(dVar));
            mVar.P();
        } else {
            mVar.W(-1495860112);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return r12;
    }
}
