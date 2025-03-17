package Cj;

import E1.I;
import G1.C4504g;
import J1.j;
import KJ.C15985a;
import KJ.C15987c;
import Oo.b;
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
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.C5116k1;
import com.ingka.ikea.core.model.product.CustomerMaterial;
import com.ingka.ikea.core.model.product.MaterialInformation;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LKJ/c;", "Lcom/ingka/ikea/core/model/product/CustomerMaterial;", "customerMaterials", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(LKJ/c;Landroidx/compose/ui/d;LU0/m;II)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final void b(C15987c<CustomerMaterial> cVar, androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(cVar, "customerMaterials");
        C4889m k10 = mVar.k(571604621);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = 2 & i11;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(571604621, i12, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.sections.ProductCustomerMaterial (ProductCustomerMaterial.kt:26)");
            }
            androidx.compose.ui.d h10 = J.h(dVar, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = c.e(k10, h10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar.a();
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
            F1.c(a13, a10, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            i.g(j.b(b.f84362E4, k10, 0), C5116k1.a(androidx.compose.ui.d.f18749a, "ProductCustomerMaterial.TestTag.Header"), k10, 48, 0);
            k10.W(-449866548);
            for (CustomerMaterial customerMaterial : cVar) {
                String c10 = customerMaterial.c();
                if (c10 == null || c10.length() == 0) {
                    c10 = null;
                }
                k10.W(-449863538);
                if (c10 != null) {
                    i.k(c10, C5116k1.a(androidx.compose.ui.d.f18749a, "ProductCustomerMaterial.TestTag.Title"), k10, 48, 0);
                }
                k10.P();
                k10.W(-449852174);
                for (MaterialInformation materialInformation : C15985a.h(customerMaterial.b())) {
                    String b11 = materialInformation.b();
                    if (b11 == null || b11.length() == 0) {
                        b11 = null;
                    }
                    k10.W(-449848852);
                    if (b11 != null) {
                        i.i(b11, C5116k1.a(androidx.compose.ui.d.f18749a, "ProductCustomerMaterial.TestTag.SubHeader." + b11), k10, 0, 0);
                    }
                    k10.P();
                    i.e(materialInformation.a(), C5116k1.a(androidx.compose.ui.d.f18749a, "ProductCustomerMaterial.TestTag.Body." + materialInformation.a()), k10, 0, 0);
                }
                k10.P();
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
            n10.a(new c(cVar, dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C15987c cVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
