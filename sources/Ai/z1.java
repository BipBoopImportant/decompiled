package Ai;

import E1.I;
import Ei.C10696q;
import G1.C4504g;
import HJ.C15854t;
import IC.C13023e;
import KJ.C15987c;
import L1.o;
import L1.x;
import N1.P;
import O0.V;
import RC.l;
import RC.m;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13643u0;
import TC.C13679b;
import TC.e;
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
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import com.sugarcube.core.logger.DslKt;
import i1.C5437c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import s0.C5842M;
import s0.C5843N;
import s0.C5861g;
import s0.C5862h;
import wi.C12272a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LRC/m;", "orderSummaryUiState", "LKJ/c;", "LEi/q$b;", "payments", "LXH/N;", "i", "(LRC/m;LKJ/c;LU0/m;I)V", "", "index", "payment", "f", "(ILEi/q$b;LU0/m;I)V", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z1 {
    private static final void f(int i10, C10696q.b bVar, C4889m mVar, int i11) {
        int i12;
        C4889m mVar2;
        int i13 = i10;
        C10696q.b bVar2 = bVar;
        int i14 = i11;
        C4889m k10 = mVar.k(441798871);
        if ((i14 & 6) == 0) {
            i12 = (k10.d(i13) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= (i14 & 64) == 0 ? k10.V(bVar2) : k10.F(bVar2) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(441798871, i12, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchasePaymentRow (PurchasePaymentSection.kt:89)");
            }
            d.a aVar = d.f18749a;
            d i15 = e.i(J.h(aVar, 0.0f, 1, (Object) null));
            k10.W(67125199);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new x1();
                k10.u(D10);
            }
            k10.P();
            float f10 = (float) 24;
            d a10 = C5116k1.a(D.k(o.c(i15, true, (C17642l) D10), 0.0f, h.B(f10), 1, (Object) null), A1.f78428a.a(i13));
            C5073d dVar = C5073d.f18068a;
            C5073d.e f11 = dVar.f();
            C5437c.a aVar2 = C5437c.f24302a;
            I b10 = G.b(f11, aVar2.l(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, a10);
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
            F1.c(a13, b10, aVar3.c());
            F1.c(a13, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b11);
            }
            F1.c(a13, e10, aVar3.d());
            C5843N n10 = C5843N.f28726a;
            d y10 = J.y(aVar, h.B(f10));
            I h10 = C5077h.h(aVar2.o(), false);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, y10);
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
            F1.c(a16, h10, aVar3.c());
            F1.c(a16, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar3.d());
            C5079j jVar = C5079j.f18125a;
            V.a(J1.e.c(bVar.b(), k10, 0), (String) null, (d) null, 0, k10, 48, 12);
            k10.x();
            d k11 = D.k(C5842M.e(n10, aVar, 1.0f, false, 2, (Object) null), h.B(f10), 0.0f, 2, (Object) null);
            I a17 = C5080k.a(dVar.g(), aVar2.k(), k10, 0);
            int a18 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            d e12 = c.e(k10, k11);
            C17631a<C4504g> a19 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a19);
            } else {
                k10.t();
            }
            C4889m a20 = F1.a(k10);
            F1.c(a20, a17, aVar3.c());
            F1.c(a20, s12, aVar3.e());
            p<C4504g, Integer, C16807N> b13 = aVar3.b();
            if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                a20.u(Integer.valueOf(a18));
                a20.w(Integer.valueOf(a18), b13);
            }
            F1.c(a20, e12, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            mVar2 = k10;
            C13607l.j(bVar.d().a(k10, C13023e.f110931a), C13679b.C2857b.f.f116688a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262140);
            String c10 = bVar.c();
            mVar2.W(-1517434057);
            if (c10 != null) {
                C13607l.j(c10, C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262140);
                C16807N n11 = C16807N.f139792a;
            }
            mVar2.P();
            mVar2.x();
            String a21 = bVar.a();
            mVar2.W(-744437500);
            if (a21 != null) {
                C13607l.j(bVar.a(), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, j.h(j.f14783b.b()), (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 261116);
                C16807N n12 = C16807N.f139792a;
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
        Y0 n13 = mVar2.n();
        if (n13 != null) {
            n13.a(new y1(i13, bVar2, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(int i10, C10696q.b bVar, int i11, C4889m mVar, int i12) {
        f(i10, bVar, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    public static final void i(m mVar, C15987c<C10696q.b> cVar, C4889m mVar2, int i10) {
        int i11;
        C17542s.j(cVar, "payments");
        C4889m k10 = mVar2.k(34570460);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(mVar) : k10.F(mVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? k10.V(cVar) : k10.F(cVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(34570460, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchasePaymentSection (PurchasePaymentSection.kt:44)");
            }
            if (!cVar.isEmpty() || mVar != null) {
                d a10 = C5116k1.a(d.f18749a, "PURCHASE_PAYMENT_CONTAINER_TEST_TAG");
                int i12 = 0;
                I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
                int a12 = C4883j.a(k10, 0);
                C4912y s10 = k10.s();
                d e10 = c.e(k10, a10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a13 = aVar.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a13);
                } else {
                    k10.t();
                }
                C4889m a14 = F1.a(k10);
                F1.c(a14, a11, aVar.c());
                F1.c(a14, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.w(Integer.valueOf(a12), b10);
                }
                F1.c(a14, e10, aVar.d());
                C5862h hVar = C5862h.f28810a;
                C10573g1.P(J1.j.b(C12272a.f105858z0, k10, 0), k10, 0);
                k10.W(-1744012478);
                for (T next : cVar) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C16877v.x();
                    }
                    f(i12, (C10696q.b) next, k10, C13023e.f110931a << 3);
                    i12 = i13;
                }
                k10.P();
                k10.W(-1744004667);
                if (mVar != null) {
                    d.a aVar2 = d.f18749a;
                    C13643u0.c(e.i(aVar2), 0.0f, 0, k10, 0, 6);
                    d k11 = D.k(e.i(C5116k1.a(aVar2, "PurchasePaymentTestTags_ORDER_SUMMARY")), 0.0f, h.B((float) 24), 1, (Object) null);
                    k10.W(567674528);
                    Object D10 = k10.D();
                    if (D10 == C4889m.f14007a.a()) {
                        D10 = new v1(hVar);
                        k10.u(D10);
                    }
                    k10.P();
                    l.r(mVar, k11, (C17642l) D10, k10, m.f115340m, 0);
                }
                k10.P();
                k10.x();
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                if (C4895p.J()) {
                    C4895p.R();
                }
                Y0 n10 = k10.n();
                if (n10 != null) {
                    n10.a(new u1(mVar, cVar, i10));
                    return;
                }
                return;
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new w1(mVar, cVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(m mVar, C15987c cVar, int i10, C4889m mVar2, int i11) {
        i(mVar, cVar, mVar2, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C5861g gVar, String str) {
        C17542s.j(str, "it");
        IllegalStateException illegalStateException = new IllegalStateException("Delete transaction not supported");
        qv.e eVar = qv.e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = gVar.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, illegalStateException, str4);
            str2 = str4;
            str3 = str5;
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(m mVar, C15987c cVar, int i10, C4889m mVar2, int i11) {
        i(mVar, cVar, mVar2, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
