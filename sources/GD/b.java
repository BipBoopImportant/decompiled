package Gd;

import Dd.n;
import E1.I;
import G1.C4504g;
import HJ.C15854t;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import com.ikea.kompassmap.model.product.Price;
import com.ikea.kompassmap.model.product.ProductData;
import i1.C5437c;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import s0.C5843N;
import s0.C5844O;
import tK.C18029u;
import wK.C18277b7;
import wK.C18301d7;
import wK.C18313e7;
import wK.C18325f7;
import wK.C18437p;
import wK.C18464r2;
import wK.C18476s2;
import wK.C18488t2;
import wK.C18518v8;
import wK.W6;
import wK.Y5;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ikea/kompassmap/model/product/ProductData;", "productData", "LXH/N;", "b", "(Lcom/ikea/kompassmap/model/product/ProductData;LU0/m;I)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final void b(ProductData productData, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        ProductData productData2 = productData;
        int i12 = i10;
        C17542s.j(productData2, "productData");
        C4889m k10 = mVar.k(1932322345);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(productData2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1932322345, i11, -1, "com.ikea.kompassmap.ui.components.bottomSheet.product.ProductPrimaryTile (ProductPrimaryTile.kt:22)");
            }
            Price price = productData.getSalesPrices().getPrices().get(0);
            List Y02 = C15854t.Y0(String.valueOf(price.getPriceInclTax()), new String[]{"."}, false, 0, 6, (Object) null);
            String str = (String) Y02.get(0);
            String str2 = (String) Y02.get(1);
            d.a aVar = d.f18749a;
            d j10 = D.j(aVar, h.B((float) 20), h.B((float) 10));
            I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), k10, 0);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, j10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            n.b(productData.getCommunications().getImages().get(2).getHref(), k10, 0);
            C5844O.a(J.y(aVar, C18029u.f147649a.j()), k10, 0);
            String name = productData.getCommunications().getName();
            String description = productData.getCommunications().getDescription();
            String symbol = Currency.getInstance(price.getCurrencyCode()).getSymbol();
            C17542s.i(symbol, "getSymbol(...)");
            mVar2 = k10;
            W6.s(name, description, new C18325f7(str, str2, symbol, C18488t2.Comma, C18464r2.Trailing, (String) null, (C18437p) null, (C18437p) null, (String) null, (String) null, C18476s2.None, 992, (DefaultConstructorMarker) null), (d) null, new C18301d7.b(C18277b7.XSmall, false, (String) null, 6, (DefaultConstructorMarker) null), (p<? super C4889m, ? super Integer, C16807N>) null, (C18313e7) null, (List<String>) null, (C18518v8) null, (Y5) null, false, k10, (C18325f7.f150846l << 6) | (C18301d7.b.f150730e << 12), 0, 2024);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new a(productData2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(ProductData productData, int i10, C4889m mVar, int i11) {
        b(productData, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
