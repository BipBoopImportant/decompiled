package di;

import A0.g;
import B0.C4373q;
import E1.I;
import G1.C4504g;
import IC.C13021c;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15988d;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.U1;
import SC.V1;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.C5571a;
import m1.e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.i1;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5861g;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u00020\u0005*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LKJ/c;", "Ldi/u;", "locations", "", "isInStock", "LXH/N;", "h", "(LKJ/c;ZLU0/m;I)V", "", "heading", "childItems", "d", "(Ljava/lang/String;ZLKJ/c;LU0/m;I)V", "Ls0/g;", "location", "f", "(Ls0/g;Ldi/u;ZLU0/m;I)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y {
    private static final void d(String str, boolean z10, C15987c<u> cVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        boolean z11 = z10;
        C15987c<u> cVar2 = cVar;
        int i12 = i10;
        C4889m k10 = mVar.k(1797685781);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(cVar2) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1797685781, i13, -1, "com.ingka.ikea.app.productinformationpage.v2.compose.availability.ArticleLocationCard (StoreLocationsCards.kt:55)");
            }
            d.a aVar = d.f18749a;
            float f10 = (float) 8;
            float f11 = (float) 16;
            d k11 = D.k(b.d(e.a(J.h(D.m(aVar, 0.0f, h.B(f10), 0.0f, h.B(f11), 5, (Object) null), 0.0f, 1, (Object) null), g.e(h.B((float) 10))), C18030v.f147664a.a(k10, C18030v.f147665b).l0(), (i1) null, 2, (Object) null), h.B(f11), 0.0f, 2, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, k11);
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
            d a14 = C5571a.a(D.k(aVar, 0.0f, h.B(f10), 1, (Object) null), z11 ? 1.0f : 0.4f);
            C5862h hVar2 = hVar;
            int i14 = i13;
            mVar2 = k10;
            C13607l.h(C13021c.b(str2, k10, i13 & 14), C13679b.a.C2856b.f116680a, a14, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 524280);
            mVar2.W(-1169992505);
            for (u f12 : cVar) {
                f(hVar2, f12, z11, mVar2, ((i14 << 3) & 896) | 6);
            }
            mVar2.P();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new w(str2, z11, cVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, boolean z10, C15987c cVar, int i10, C4889m mVar, int i11) {
        d(str, z10, cVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void f(C5861g gVar, u uVar, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C4889m mVar3;
        C5861g gVar2 = gVar;
        u uVar2 = uVar;
        boolean z11 = z10;
        int i12 = i10;
        C17542s.j(gVar2, "<this>");
        C17542s.j(uVar2, "location");
        C4889m k10 = mVar.k(-1958355023);
        if ((i12 & 48) == 0) {
            i11 = (k10.V(uVar2) ? 32 : 16) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z11) ? 256 : 128;
        }
        if ((i11 & 145) != 144 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1958355023, i11, -1, "com.ingka.ikea.app.productinformationpage.v2.compose.availability.ProductLocationItem (StoreLocationsCards.kt:87)");
            }
            d.a aVar = d.f18749a;
            d a10 = C5571a.a(aVar, z11 ? 1.0f : 0.4f);
            String f10 = uVar.f();
            C13679b.a.C2856b bVar = C13679b.a.C2856b.f116680a;
            C4889m mVar4 = k10;
            C13607l.j(f10, bVar, a10, 0, 0, (C4830x) null, C.f13316b.a(), (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar4, 1572912, 0, 262072);
            String c10 = uVar.c();
            C4889m mVar5 = mVar4;
            mVar5.W(-1032312681);
            if (c10 == null) {
                mVar3 = mVar5;
            } else {
                mVar3 = mVar5;
                C13607l.j(c10, bVar, C5571a.a(aVar, z11 ? 1.0f : 0.4f), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262136);
                C16807N n10 = C16807N.f139792a;
            }
            mVar3.P();
            float f11 = (float) 8;
            d a11 = C5571a.a(J.h(D.m(aVar, 0.0f, h.B(f11), 0.0f, h.B((float) 16), 5, (Object) null), 0.0f, 1, (Object) null), z11 ? 1.0f : 0.4f);
            C4889m mVar6 = mVar3;
            I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), mVar6, 0);
            int a12 = C4883j.a(mVar6, 0);
            C4912y s10 = mVar6.s();
            d e10 = c.e(mVar6, a11);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar2.a();
            if (mVar6.m() == null) {
                C4883j.c();
            }
            mVar6.I();
            if (mVar6.i()) {
                mVar6.p(a13);
            } else {
                mVar6.t();
            }
            C4889m a14 = F1.a(mVar6);
            F1.c(a14, b10, aVar2.c());
            F1.c(a14, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b11);
            }
            F1.c(a14, e10, aVar2.d());
            C5843N n11 = C5843N.f28726a;
            U1.b(uVar.e(), J.E(aVar, (C5437c) null, false, 3, (Object) null), J1.j.b(Oo.b.f84567Z, mVar6, 0), (V1) null, mVar6, 48, 8);
            C4889m mVar7 = mVar6;
            C5844O.a(C5842M.e(n11, aVar, 1.0f, false, 2, (Object) null), mVar7, 0);
            String a15 = uVar.a();
            mVar7.W(-967386361);
            if (a15 == null) {
                mVar2 = mVar7;
            } else {
                mVar2 = mVar7;
                U1.b(a15, (d) null, J1.j.b(Oo.b.f84537W, mVar7, 0), (V1) null, mVar2, 0, 10);
            }
            mVar2.P();
            String b12 = uVar.b();
            mVar2.W(-967380486);
            if (b12 != null) {
                U1.b(b12, D.m(aVar, h.B(f11), 0.0f, 0.0f, 0.0f, 14, (Object) null), J1.j.b(Oo.b.f84780s4, mVar2, 0), (V1) null, mVar2, 48, 8);
            }
            mVar2.P();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n12 = mVar2.n();
        if (n12 != null) {
            n12.a(new x(gVar2, uVar2, z11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C5861g gVar, u uVar, boolean z10, int i10, C4889m mVar, int i11) {
        f(gVar, uVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void h(C15987c<u> cVar, boolean z10, C4889m mVar, int i10) {
        int i11;
        C17542s.j(cVar, "locations");
        C4889m k10 = mVar.k(-586649403);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.b(z10) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-586649403, i11, -1, "com.ingka.ikea.app.productinformationpage.v2.compose.availability.StoreLocationsCards (StoreLocationsCards.kt:38)");
            }
            d.a aVar = d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, aVar);
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
            k10.W(-1206772200);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T next : cVar) {
                String d10 = ((u) next).d();
                Object obj = linkedHashMap.get(d10);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(d10, obj);
                }
                ((List) obj).add(next);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                d((String) entry.getKey(), z10, C15985a.h((List) entry.getValue()), k10, i11 & 112);
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
            n10.a(new v(cVar, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C15987c cVar, boolean z10, int i10, C4889m mVar, int i11) {
        h(cVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
