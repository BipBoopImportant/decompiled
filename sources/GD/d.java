package Gd;

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
import YH.C16877v;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.h;
import com.ikea.kompassmap.model.product.Department;
import com.ikea.kompassmap.model.product.DisplayLocation;
import com.ikea.kompassmap.model.product.ProductData;
import com.ikea.kompassmap.model.product.SalesLocation;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5843N;
import s0.C5862h;
import tK.C18029u;
import wK.C18433o7;
import wK.C18469r7;
import yd.C10443N;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ikea/kompassmap/model/product/ProductData;", "productData", "LXH/N;", "b", "(Lcom/ikea/kompassmap/model/product/ProductData;LU0/m;I)V", "", "e", "(Ljava/lang/String;)Ljava/lang/String;", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    public static final void b(ProductData productData, C4889m mVar, int i10) {
        int i11;
        ProductData productData2 = productData;
        int i12 = i10;
        C17542s.j(productData2, "productData");
        C4889m k10 = mVar.k(1505241769);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(productData2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1505241769, i11, -1, "com.ikea.kompassmap.ui.components.bottomSheet.product.ProductSecondaryTile (ProductSecondaryTile.kt:18)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            SalesLocation salesLocation = (SalesLocation) C16877v.y0(productData.getLocations().getSalesLocations());
            DisplayLocation displayLocation = (DisplayLocation) C16877v.y0(productData.getLocations().getDisplayLocations());
            d.a aVar = androidx.compose.ui.d.f18749a;
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = c.e(k10, aVar);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar3.a();
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
            F1.c(a13, a10, aVar3.c());
            F1.c(a13, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            androidx.compose.ui.d j10 = D.j(J.h(aVar, 0.0f, 1, (Object) null), h.B((float) 20), C18029u.f147649a.j());
            I b11 = G.b(dVar.d(), aVar2.l(), k10, 6);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = c.e(k10, j10);
            C17631a<C4504g> a15 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, b11, aVar3.c());
            F1.c(a16, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar3.d());
            C5843N n10 = C5843N.f28726a;
            String string = context.getString(C10443N.f77911e);
            String c10 = c(salesLocation, displayLocation, context);
            String str = string;
            C18469r7 r7Var = C18469r7.Subtle;
            C4889m mVar2 = k10;
            C18433o7.d(c10, n10.a(aVar, 1.0f, false), str, r7Var, mVar2, 3072, 0);
            C18433o7.d(e(productData.getItemKey().getItemNo()), n10.a(aVar, 1.0f, false), context.getString(C10443N.f77907a), C18469r7.Emphasised, mVar2, 3072, 0);
            k10.x();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new c(productData2, i12));
        }
    }

    private static final String c(SalesLocation salesLocation, DisplayLocation displayLocation, Context context) {
        Department department = null;
        if ((salesLocation != null ? salesLocation.getDepartment() : null) != null) {
            return salesLocation.getDepartment().getName() + ", " + salesLocation.getFloor().getName();
        }
        if (displayLocation != null) {
            department = displayLocation.getDepartment();
        }
        if (department != null) {
            return displayLocation.getDepartment().getName() + ", " + displayLocation.getFloor().getName();
        }
        String string = context.getString(C10443N.f77914h);
        C17542s.g(string);
        return string;
    }

    /* access modifiers changed from: private */
    public static final C16807N d(ProductData productData, int i10, C4889m mVar, int i11) {
        b(productData, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final String e(String str) {
        C17542s.j(str, "<this>");
        return C16877v.G0(C15854t.D1(str, 3), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }
}
