package Cj;

import E1.I;
import Ez.f;
import G1.C4504g;
import J1.j;
import KJ.C15987c;
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
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import com.ingka.ikea.core.model.product.SafetyAndCompliance;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import s0.C5844O;
import s0.C5862h;
import tK.C18029u;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "header", "LKJ/c;", "Lcom/ingka/ikea/core/model/product/SafetyAndCompliance;", "safetyAndCompliance", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Ljava/lang/String;LKJ/c;Landroidx/compose/ui/d;LU0/m;II)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    public static final void b(String str, C15987c<SafetyAndCompliance> cVar, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(str, "header");
        C17542s.j(cVar, "safetyAndCompliance");
        C4889m k10 = mVar.k(460258928);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((2 & i11) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(cVar) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(dVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(460258928, i12, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.sections.ProductWoodDeclarationSection (ProductWoodDeclarationSection.kt:29)");
            }
            d h10 = J.h(dVar, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
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
            d.a aVar2 = d.f18749a;
            i.g(str, C5116k1.a(aVar2, "ProductWoodDeclarationSection.TestTag.Header"), k10, (i12 & 14) | 48, 0);
            i.e(j.b(f.f109716o0, k10, 0), C5116k1.a(aVar2, "ProductWoodDeclarationSection.TestTag.Description"), k10, 48, 0);
            C5844O.a(J.t(aVar2, C18029u.f147649a.e()), k10, 0);
            k10.W(668303667);
            for (SafetyAndCompliance safetyAndCompliance : cVar) {
                d.a aVar3 = d.f18749a;
                i.i(safetyAndCompliance.a(), C5116k1.a(aVar3, "ProductWoodDeclarationSection.TestTag.SubTitle"), k10, 48, 0);
                i.e(safetyAndCompliance.b(), C5116k1.a(aVar3, "ProductWoodDeclarationSection.TestTag.Body"), k10, 48, 0);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new y(str, cVar, dVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, C15987c cVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(str, cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
