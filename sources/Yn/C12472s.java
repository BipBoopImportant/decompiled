package yn;

import E1.I;
import G1.C4504g;
import J1.e;
import J1.j;
import L1.i;
import L1.o;
import L1.v;
import L1.x;
import N1.P;
import O0.V;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13611m;
import SC.N2;
import SC.O2;
import SC.R0;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import Y1.f;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.ingka.ikea.browseandsearch.plp.impl.ui.a;
import dI.C17168i;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import r0.m;
import s0.C5842M;
import s0.C5843N;
import s0.C5862h;
import tK.C18029u;
import uI.C18059h;
import uK.C18146a;
import wn.C12289d;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a[\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0015\u0010\u0013\u001a+\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\r2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\fH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\r2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\fH\u0003¢\u0006\u0004\b \u0010\u0019\u001a%\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\"\u0010\u001e¨\u0006#"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "zipSelectorListener", "addressSelectorListener", "p", "(Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a;LnI/a;LnI/a;LU0/m;I)V", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a$b;", "uiModel", "onZipSelectorClicked", "onStoreSelectorClicked", "Lkotlin/Function1;", "", "updateHomeDeliveryAvailability", "updateInStoreAvailability", "n", "(Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a$b;LnI/a;LnI/a;LnI/l;LnI/l;LU0/m;I)V", "v", "(LU0/m;I)V", "r", "t", "homeDeliveryAvailability", "updateState", "x", "(ZLnI/l;LU0/m;I)V", "", "zipCode", "onClick", "H", "(Ljava/lang/String;LnI/a;LU0/m;I)V", "inStoreAvailability", "B", "storeId", "F", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yn.s  reason: case insensitive filesystem */
public final class C12472s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.s$a */
    /* synthetic */ class a extends C17540p implements C17642l<Boolean, C16807N> {
        a(Object obj) {
            super(1, obj, com.ingka.ikea.browseandsearch.plp.impl.ui.a.class, "enableHomeDeliveryAvailability", "enableHomeDeliveryAvailability(Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t(((Boolean) obj).booleanValue());
            return C16807N.f139792a;
        }

        public final void t(boolean z10) {
            ((com.ingka.ikea.browseandsearch.plp.impl.ui.a) this.receiver).k(z10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.s$b */
    /* synthetic */ class b extends C17540p implements C17642l<Boolean, C16807N> {
        b(Object obj) {
            super(1, obj, com.ingka.ikea.browseandsearch.plp.impl.ui.a.class, "enableInStoreAvailability", "enableInStoreAvailability(Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t(((Boolean) obj).booleanValue());
            return C16807N.f139792a;
        }

        public final void t(boolean z10) {
            ((com.ingka.ikea.browseandsearch.plp.impl.ui.a) this.receiver).C(z10);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(boolean z10, C17642l lVar, int i10, C4889m mVar, int i11) {
        x(z10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void B(boolean z10, C17642l<? super Boolean, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        boolean z11 = z10;
        C17642l<? super Boolean, C16807N> lVar2 = lVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1120246478);
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1120246478, i13, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.ShowInStoreStock (AvailabilityBottomSheetContent.kt:196)");
            }
            String b10 = j.b(C12289d.f105889i, k10, 0);
            String b11 = j.b(C12289d.f105895o, k10, 0);
            String b12 = j.b(C12289d.f105894n, k10, 0);
            d.a aVar = d.f18749a;
            d k11 = D.k(aVar, 0.0f, C18029u.f147649a.a(), 1, (Object) null);
            k10.W(43279181);
            boolean V10 = k10.V(b10);
            Object D10 = k10.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new C12457n(b10);
                k10.u(D10);
            }
            k10.P();
            d d10 = o.d(k11, false, (C17642l) D10, 1, (Object) null);
            I b13 = G.b(C5073d.f18068a.f(), C5437c.f24302a.i(), k10, 48);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d10);
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
            F1.c(a12, b13, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b14 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b14);
            }
            F1.c(a12, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            d.a aVar3 = aVar;
            String str = b12;
            String str2 = b11;
            V.a(e.c(C18146a.f148378bc, k10, 0), (String) null, D.m(aVar, 0.0f, 0.0f, h.B((float) 16), 0.0f, 11, (Object) null), 0, k10, 432, 8);
            int i14 = i13;
            C4889m mVar2 = k10;
            C13607l.j(b10, C13679b.C2857b.f.f116688a, C5842M.e(n10, aVar3, 1.0f, false, 2, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262136);
            d a13 = C5116k1.a(aVar3, "IN_STORE_SWITCH_TAG");
            mVar2.W(-369259243);
            String str3 = str;
            boolean V11 = mVar2.V(str2) | ((i14 & 14) == 4) | mVar2.V(str3);
            Object D11 = mVar2.D();
            if (V11 || D11 == C4889m.f14007a.a()) {
                D11 = new C12460o(z11, str2, str3);
                mVar2.u(D11);
            }
            mVar2.P();
            k10 = mVar2;
            N2.b(z10, lVar, o.d(a13, false, (C17642l) D11, 1, (Object) null), false, (O2) null, (m) null, mVar2, i14 & 126, 56);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C12463p(z11, lVar, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N C(String str, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.q0(xVar, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(boolean z10, String str, String str2, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        if (!z10) {
            str = str2;
        }
        v.q0(xVar, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(boolean z10, C17642l lVar, int i10, C4889m mVar, int i11) {
        B(z10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void F(String str, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        C17631a<C16807N> aVar2 = aVar;
        C4889m k10 = mVar.k(-1806552461);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1806552461, i12, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.StoreSelector (AvailabilityBottomSheetContent.kt:232)");
            }
            d.a aVar3 = d.f18749a;
            d a10 = C5116k1.a(D.k(androidx.compose.foundation.d.d(J.h(aVar3, 0.0f, 1, (Object) null), false, (String) null, (i) null, aVar, 7, (Object) null), 0.0f, C18029u.f147649a.a(), 1, (Object) null), "STORE_SELECTOR_TAG");
            C5437c.a aVar4 = C5437c.f24302a;
            I b10 = G.b(C5073d.f18068a.f(), aVar4.i(), k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, a10);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar5.a();
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
            F1.c(a13, b10, aVar5.c());
            F1.c(a13, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b11 = aVar5.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b11);
            }
            F1.c(a13, e10, aVar5.d());
            C5843N n10 = C5843N.f28726a;
            C13607l.j(j.b(Oo.b.f84396H8, k10, 0), C13679b.C2857b.f.f116688a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 48, 0, 262140);
            C4889m mVar3 = k10;
            C13607l.j(str, C13679b.a.C2856b.f116680a, C5842M.e(n10, J.G(C5116k1.a(D.k(aVar3, h.B((float) 16), 0.0f, 2, (Object) null), "STORE_NAME_TAG"), aVar4.j(), false, 2, (Object) null), 1.0f, false, 2, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, (i12 & 14) | 48, 0, 262136);
            mVar2 = mVar3;
            V.a(e.c(C18146a.f148111K1, mVar2, 0), (String) null, (d) null, 0, mVar2, 48, 12);
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
            n11.a(new C12442i(str, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N G(String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        F(str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void H(String str, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        C17631a<C16807N> aVar2 = aVar;
        C4889m k10 = mVar.k(64512229);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(64512229, i12, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.ZipCode (AvailabilityBottomSheetContent.kt:165)");
            }
            d.a aVar3 = d.f18749a;
            d a10 = C5116k1.a(D.k(androidx.compose.foundation.d.d(J.h(aVar3, 0.0f, 1, (Object) null), false, (String) null, (i) null, aVar, 7, (Object) null), 0.0f, C18029u.f147649a.a(), 1, (Object) null), "ZIP_CODE_SELECTOR_TAG");
            C5437c.a aVar4 = C5437c.f24302a;
            I b10 = G.b(C5073d.f18068a.f(), aVar4.i(), k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, a10);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar5.a();
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
            F1.c(a13, b10, aVar5.c());
            F1.c(a13, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b11 = aVar5.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b11);
            }
            F1.c(a13, e10, aVar5.d());
            C5843N n10 = C5843N.f28726a;
            C13607l.j(j.b(C12289d.f105890j, k10, 0), C13679b.C2857b.f.f116688a, C5842M.e(n10, aVar3, 1.0f, false, 2, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 48, 0, 262136);
            C4889m mVar3 = k10;
            C13607l.j(str, C13679b.a.C2856b.f116680a, C5116k1.a(D.k(aVar3, h.B((float) 16), 0.0f, 2, (Object) null), "ZIP_CODE_TEXT_TAG"), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, (i12 & 14) | 432, 0, 262136);
            mVar2 = mVar3;
            V.a(e.c(C18146a.f148111K1, mVar2, 0), (String) null, n10.c(aVar3, aVar4.i()), 0, mVar2, 48, 8);
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
            n11.a(new C12454m(str, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N I(String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        H(str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void n(a.b bVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17642l<? super Boolean, C16807N> lVar, C17642l<? super Boolean, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C17542s.j(bVar, "uiModel");
        C17542s.j(aVar, "onZipSelectorClicked");
        C17542s.j(aVar2, "onStoreSelectorClicked");
        C17542s.j(lVar, "updateHomeDeliveryAvailability");
        C17542s.j(lVar2, "updateInStoreAvailability");
        C4889m k10 = mVar.k(-19461626);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.F(lVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= k10.F(lVar2) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-19461626, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.AvailabilityBottomSheet (AvailabilityBottomSheetContent.kt:67)");
            }
            d.a aVar3 = d.f18749a;
            C18029u uVar = C18029u.f147649a;
            d l10 = D.l(aVar3, uVar.d(), uVar.e(), uVar.d(), uVar.a());
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, l10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar4.a();
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
            F1.c(a13, a10, aVar4.c());
            F1.c(a13, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            v(k10, 0);
            r(k10, 0);
            t(k10, 0);
            x(bVar.e(), lVar, k10, (i11 >> 6) & 112);
            k10.W(1001346607);
            String str = "";
            if (bVar.e()) {
                String c10 = bVar.c();
                if (c10 == null) {
                    c10 = str;
                }
                H(c10, aVar, k10, i11 & 112);
            }
            k10.P();
            B(bVar.f(), lVar2, k10, (i11 >> 9) & 112);
            k10.W(1001355057);
            if (bVar.f()) {
                String d10 = bVar.d();
                if (d10 != null) {
                    str = d10;
                }
                F(str, aVar2, k10, (i11 >> 3) & 112);
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
            n10.a(new C12445j(bVar, aVar, aVar2, lVar, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(a.b bVar, C17631a aVar, C17631a aVar2, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        n(bVar, aVar, aVar2, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void p(com.ingka.ikea.browseandsearch.plp.impl.ui.a aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "viewModel");
        C17542s.j(aVar2, "zipSelectorListener");
        C17542s.j(aVar3, "addressSelectorListener");
        C4889m k10 = mVar.k(60816519);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar3) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(60816519, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.AvailabilityBottomSheetContent (AvailabilityBottomSheetContent.kt:48)");
            }
            a.b value = p1.b(aVar.m(), (C17168i) null, k10, 0, 1).getValue();
            k10.W(1470246783);
            boolean F10 = k10.F(aVar);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(aVar);
                k10.u(D10);
            }
            k10.P();
            C17642l lVar = (C17642l) ((C18059h) D10);
            k10.W(1470249306);
            boolean F11 = k10.F(aVar);
            Object D11 = k10.D();
            if (F11 || D11 == C4889m.f14007a.a()) {
                D11 = new b(aVar);
                k10.u(D11);
            }
            k10.P();
            n(value, aVar2, aVar3, lVar, (C17642l) ((C18059h) D11), k10, i11 & 1008);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12433f(aVar, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N q(com.ingka.ikea.browseandsearch.plp.impl.ui.a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        p(aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void r(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(-1478172459);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1478172459, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.AvailabilityDescription (AvailabilityBottomSheetContent.kt:106)");
            }
            mVar2 = k10;
            C13607l.j(j.b(C12289d.f105887g, k10, 0), C13679b.a.C2856b.f116680a, D.k(d.f18749a, 0.0f, C18029u.f147649a.j(), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262136);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C12448k(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(int i10, C4889m mVar, int i11) {
        r(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void t(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(300248485);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(300248485, i10, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.AvailabilityInformation (AvailabilityBottomSheetContent.kt:113)");
            }
            d m10 = D.m(d.f18749a, 0.0f, 0.0f, 0.0f, C18029u.f147649a.j(), 7, (Object) null);
            I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.i(), k10, 48);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, m10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
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
            F1.c(a12, b10, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b11 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar.d());
            C5843N n10 = C5843N.f28726a;
            R0.e(j.b(Oo.b.f84743p0, k10, 0), C13611m.INFORMATIVE, false, (d) null, (String) null, true, k10, 197040, 24);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C12466q(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(int i10, C4889m mVar, int i11) {
        t(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void v(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(-1345487175);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1345487175, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.AvailabilityTitle (AvailabilityBottomSheetContent.kt:99)");
            }
            mVar2 = k10;
            C13607l.j(j.b(C12289d.f105886f, k10, 0), C13679b.C2857b.c.f116685a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262140);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C12451l(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(int i10, C4889m mVar, int i11) {
        v(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void x(boolean z10, C17642l<? super Boolean, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        boolean z11 = z10;
        C17642l<? super Boolean, C16807N> lVar2 = lVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1310372693);
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1310372693, i13, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.ShowHomeDelivery (AvailabilityBottomSheetContent.kt:129)");
            }
            String b10 = j.b(C12289d.f105888h, k10, 0);
            String b11 = j.b(C12289d.f105893m, k10, 0);
            String b12 = j.b(C12289d.f105892l, k10, 0);
            d.a aVar = d.f18749a;
            d k11 = D.k(aVar, 0.0f, C18029u.f147649a.a(), 1, (Object) null);
            k10.W(-203270074);
            boolean V10 = k10.V(b10);
            Object D10 = k10.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new C12469r(b10);
                k10.u(D10);
            }
            k10.P();
            d d10 = o.d(k11, false, (C17642l) D10, 1, (Object) null);
            I b13 = G.b(C5073d.f18068a.f(), C5437c.f24302a.i(), k10, 48);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d10);
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
            F1.c(a12, b13, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b14 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b14);
            }
            F1.c(a12, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            d.a aVar3 = aVar;
            String str = b12;
            String str2 = b11;
            V.a(e.c(C18146a.f148385c3, k10, 0), (String) null, D.m(aVar, 0.0f, 0.0f, h.B((float) 16), 0.0f, 11, (Object) null), 0, k10, 432, 8);
            int i14 = i13;
            C4889m mVar2 = k10;
            C13607l.j(b10, C13679b.C2857b.f.f116688a, C5842M.e(n10, aVar3, 1.0f, false, 2, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262136);
            d a13 = C5116k1.a(aVar3, "HOME_DELIVERY_SWITCH_TAG");
            mVar2.W(-176728333);
            String str3 = str;
            boolean V11 = mVar2.V(str2) | ((i14 & 14) == 4) | mVar2.V(str3);
            Object D11 = mVar2.D();
            if (V11 || D11 == C4889m.f14007a.a()) {
                D11 = new C12436g(z11, str2, str3);
                mVar2.u(D11);
            }
            mVar2.P();
            k10 = mVar2;
            N2.b(z10, lVar, o.d(a13, false, (C17642l) D11, 1, (Object) null), false, (O2) null, (m) null, mVar2, i14 & 126, 56);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C12439h(z11, lVar, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N y(String str, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.q0(xVar, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(boolean z10, String str, String str2, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        if (!z10) {
            str = str2;
        }
        v.q0(xVar, str);
        return C16807N.f139792a;
    }
}
