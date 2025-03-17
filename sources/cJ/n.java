package Cj;

import E1.I;
import G1.C4504g;
import J1.j;
import KJ.C15985a;
import KJ.C15987c;
import Oo.b;
import SC.C13643u0;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import com.ingka.ikea.core.model.product.CustomerCare;
import com.ingka.ikea.core.model.product.CustomerMaterial;
import com.ingka.ikea.core.model.product.SafetyAndCompliance;
import i1.C5437c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import s0.C5862h;
import tK.C18029u;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKJ/c;", "Lcom/ingka/ikea/core/model/product/CustomerMaterial;", "customerMaterial", "Lcom/ingka/ikea/core/model/product/CustomerCare;", "customerCare", "Lcom/ingka/ikea/core/model/product/SafetyAndCompliance;", "safetyAndCompliance", "LXH/N;", "b", "(LKJ/c;LKJ/c;LKJ/c;LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {
    public static final void b(C15987c<CustomerMaterial> cVar, C15987c<CustomerCare> cVar2, C15987c<SafetyAndCompliance> cVar3, C4889m mVar, int i10) {
        int i11;
        int i12;
        C15987c cVar4;
        C15987c<CustomerMaterial> cVar5 = cVar;
        C15987c<CustomerCare> cVar6 = cVar2;
        C15987c<SafetyAndCompliance> cVar7 = cVar3;
        int i13 = i10;
        C4889m k10 = mVar.k(-875391314);
        if ((i13 & 6) == 0) {
            i11 = (k10.F(cVar5) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(cVar6) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(cVar7) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-875391314, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.sections.ProductMaterialAndCareSection (ProductMaterialAndCareSection.kt:36)");
            }
            d.a aVar = d.f18749a;
            d f10 = J.f(J.h(e.i(C5116k1.a(aVar, "ProductMaterialAndCareSection.TestTag.Component")), 0.0f, 1, (Object) null), 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, f10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            C15987c<CustomerMaterial> cVar8 = !(cVar5 == null || cVar.isEmpty()) ? cVar5 : null;
            k10.W(1957400562);
            if (cVar8 != null) {
                d.b(cVar8, C5116k1.a(aVar, "ProductMaterialAndCareSection.TestTag.CustomerMaterial"), k10, 48, 0);
            }
            k10.P();
            C15987c<CustomerCare> cVar9 = !(cVar6 == null || cVar2.isEmpty()) ? cVar6 : null;
            k10.W(1957409971);
            if (cVar9 != null) {
                i12 = 0;
                C13643u0.c(D.k(aVar, 0.0f, C18029u.f147649a.e(), 1, (Object) null), 0.0f, 0, k10, 0, 6);
                b.b(cVar9, C5116k1.a(aVar, "ProductMaterialAndCareSection.TestTag.CustomerCare"), k10, 48, 0);
            } else {
                i12 = 0;
            }
            k10.P();
            if (cVar7 != null) {
                ArrayList arrayList = new ArrayList();
                for (T next : cVar3) {
                    if (C17542s.e(((SafetyAndCompliance) next).getType(), "SOLID_WOOD_DECLARATION")) {
                        arrayList.add(next);
                    }
                }
                cVar4 = C15985a.h(arrayList);
            } else {
                cVar4 = null;
            }
            C15987c cVar10 = ((cVar4 == null || cVar4.isEmpty()) ? 1 : i12) == 0 ? cVar4 : null;
            k10.W(1957427793);
            if (cVar10 != null) {
                d.a aVar3 = d.f18749a;
                C13643u0.c(D.k(aVar3, 0.0f, C18029u.f147649a.e(), 1, (Object) null), 0.0f, 0, k10, 0, 6);
                z.b(j.b(b.f84818v9, k10, i12), cVar10, C5116k1.a(aVar3, "ProductMaterialAndCareSection.TestTag.SafetyAndCompliance"), k10, 384, 0);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new m(cVar5, cVar6, cVar7, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C15987c cVar, C15987c cVar2, C15987c cVar3, int i10, C4889m mVar, int i11) {
        b(cVar, cVar2, cVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
