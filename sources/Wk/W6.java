package wK;

import E1.I;
import G1.C4504g;
import L1.o;
import L1.v;
import L1.x;
import N1.E;
import N1.P;
import N1.Y;
import O0.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.j;
import Y1.k;
import Y1.s;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.u;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.h;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.g1;
import r1.g;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import s0.C5872r;
import tK.C18029u;
import tK.C18030v;
import wK.C18301d7;
import wK.C18313e7;

@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0001\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001ai\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u001a2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001ai\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u001a2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001as\u0010 \u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b \u0010!\u001as\u0010\"\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010%\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eH\u0001¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"", "productName", "productDescription", "LwK/f7;", "currentPriceParams", "Landroidx/compose/ui/d;", "modifier", "LwK/d7;", "variant", "Lkotlin/Function0;", "LXH/N;", "energy", "LwK/e7;", "priceOfferType", "", "priceAddons", "LwK/v8;", "secondCurrencyPriceParams", "LwK/Y5;", "offerMessage", "", "mergeAllDescendants", "s", "(Ljava/lang/String;Ljava/lang/String;LwK/f7;Landroidx/compose/ui/d;LwK/d7;LnI/p;LwK/e7;Ljava/util/List;LwK/v8;LwK/Y5;ZLU0/m;III)V", "ikeaFamilyPriceParams", "LwK/d7$b;", "LwK/e7$c;", "I", "(Ljava/lang/String;Ljava/lang/String;LwK/f7;LwK/d7$b;LwK/e7$c;LnI/p;Ljava/util/List;LwK/Y5;ZLU0/m;I)V", "LwK/d7$a;", "z", "(Ljava/lang/String;Ljava/lang/String;LwK/f7;LwK/d7$a;LwK/e7$c;LnI/p;Ljava/util/List;LwK/Y5;ZLU0/m;I)V", "E", "(Ljava/lang/String;Ljava/lang/String;LwK/f7;LnI/p;LwK/d7$b;LwK/e7;LnI/p;LwK/v8;LwK/Y5;ZLU0/m;I)V", "v", "(Ljava/lang/String;Ljava/lang/String;LwK/f7;LnI/p;LwK/d7$a;LwK/e7;LnI/p;LwK/v8;LwK/Y5;ZLU0/m;I)V", "labels", "q", "(Ljava/util/List;LU0/m;I)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class W6 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<String> f150323a;

        a(List<String> list) {
            this.f150323a = list;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1469272631, i10, -1, "net.ikea.skapa.ui.components.PriceModule.<anonymous> (PriceModule.kt:76)");
                }
                W6.q(this.f150323a, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5872r, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f150324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f150325b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f150326c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f150327d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C18289c7 f150328e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f150329f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C18325f7 f150330g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C18313e7 f150331h;

        b(boolean z10, String str, p<? super C4889m, ? super Integer, C16807N> pVar, String str2, C18289c7 c7Var, String str3, C18325f7 f7Var, C18313e7 e7Var, C18518v8 v8Var) {
            this.f150324a = z10;
            this.f150325b = str;
            this.f150326c = pVar;
            this.f150327d = str2;
            this.f150328e = c7Var;
            this.f150329f = str3;
            this.f150330g = f7Var;
            this.f150331h = e7Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(String str, x xVar) {
            C17542s.j(xVar, "$this$clearAndSetSemantics");
            v.d0(xVar, str);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(x xVar) {
            C17542s.j(xVar, "$this$semantics");
            return C16807N.f139792a;
        }

        public final void c(C5872r rVar, C4889m mVar, int i10) {
            int i11;
            C5872r rVar2 = rVar;
            C4889m mVar2 = mVar;
            C17542s.j(rVar2, "$this$FlowRow");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(rVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1531346456, i11, -1, "net.ikea.skapa.ui.components.PriceModuleList.<anonymous>.<anonymous> (PriceModule.kt:414)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d m10 = D.m(C5842M.e(rVar, aVar, 1.0f, false, 2, (Object) null), 0.0f, 0.0f, C18029u.f147649a.a(), 0.0f, 11, (Object) null);
                String str = this.f150325b;
                p<C4889m, Integer, C16807N> pVar = this.f150326c;
                String str2 = this.f150327d;
                C18289c7 c7Var = this.f150328e;
                String str3 = this.f150329f;
                C5073d dVar = C5073d.f18068a;
                C5073d.m g10 = dVar.g();
                C5437c.a aVar2 = C5437c.f24302a;
                I a10 = C5080k.a(g10, aVar2.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, m10);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar3.c());
                F1.c(a13, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar3.d());
                C5862h hVar = C5862h.f28810a;
                mVar2.W(-1936639057);
                boolean V10 = mVar2.V(str);
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new X6(str);
                    mVar2.u(D10);
                }
                mVar.P();
                androidx.compose.ui.d a14 = o.a(aVar, (C17642l) D10);
                I a15 = C5080k.a(dVar.g(), aVar2.k(), mVar2, 0);
                int a16 = C4883j.a(mVar2, 0);
                C4912y s11 = mVar.s();
                androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar2, a14);
                C17631a<C4504g> a17 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a17);
                } else {
                    mVar.t();
                }
                C4889m a18 = F1.a(mVar);
                F1.c(a18, a15, aVar3.c());
                F1.c(a18, s11, aVar3.e());
                p<C4504g, Integer, C16807N> b11 = aVar3.b();
                if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.w(Integer.valueOf(a16), b11);
                }
                F1.c(a18, e11, aVar3.d());
                C4889m mVar3 = mVar;
                F6.r(str2, c7Var.e(), (androidx.compose.ui.d) null, mVar3, 0, 4);
                F6.p(str3, c7Var.e(), (androidx.compose.ui.d) null, mVar3, 0, 4);
                mVar.x();
                mVar2.W(-1936631159);
                if (pVar != null) {
                    C5844O.a(J.i(aVar, c7Var.c()), mVar2, 0);
                    pVar.invoke(mVar2, 0);
                    C16807N n10 = C16807N.f139792a;
                }
                mVar.P();
                mVar.x();
                boolean z10 = this.f150324a;
                mVar2.W(-1610868286);
                Object D11 = mVar.D();
                if (D11 == C4889m.f14007a.a()) {
                    D11 = new Y6();
                    mVar2.u(D11);
                }
                mVar.P();
                androidx.compose.ui.d c10 = o.c(aVar, z10, (C17642l) D11);
                C5437c.b j10 = aVar2.j();
                C18289c7 c7Var2 = this.f150328e;
                C18325f7 f7Var = this.f150330g;
                C18313e7 e7Var = this.f150331h;
                I a19 = C5080k.a(dVar.g(), j10, mVar2, 48);
                int a20 = C4883j.a(mVar2, 0);
                C4912y s12 = mVar.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(mVar2, c10);
                C17631a<C4504g> a21 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a21);
                } else {
                    mVar.t();
                }
                C4889m a22 = F1.a(mVar);
                F1.c(a22, a19, aVar3.c());
                F1.c(a22, s12, aVar3.e());
                p<C4504g, Integer, C16807N> b12 = aVar3.b();
                if (a22.i() || !C17542s.e(a22.D(), Integer.valueOf(a20))) {
                    a22.u(Integer.valueOf(a20));
                    a22.w(Integer.valueOf(a20), b12);
                }
                F1.c(a22, e12, aVar3.d());
                F6.n(C18313e7.h.f150793e, c7Var2.d(), f7Var, (androidx.compose.ui.d) null, C18361i7.SingleSize, mVar, 24582, 8);
                C18325f7 c11 = e7Var.c();
                mVar2.W(-1936612822);
                if (c11 != null) {
                    F6.j(c11, c7Var2.d(), (androidx.compose.ui.d) null, true, true, mVar, 27648, 4);
                    C16807N n11 = C16807N.f139792a;
                }
                mVar.P();
                mVar2.W(-1936605099);
                mVar.P();
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5872r) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<String> f150332a;

        c(List<String> list) {
            this.f150332a = list;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1769975464, i10, -1, "net.ikea.skapa.ui.components.PriceModuleListIkeaFamilyRomania.<anonymous> (PriceModule.kt:238)");
                }
                W6.q(this.f150332a, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements q<C5872r, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C18313e7 f150333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C18289c7 f150334b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C18325f7 f150335c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f150336d;

        d(C18313e7 e7Var, C18289c7 c7Var, C18325f7 f7Var, p<? super C4889m, ? super Integer, C16807N> pVar) {
            this.f150333a = e7Var;
            this.f150334b = c7Var;
            this.f150335c = f7Var;
            this.f150336d = pVar;
        }

        public final void a(C5872r rVar, C4889m mVar, int i10) {
            C17542s.j(rVar, "$this$FlowRow");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(rVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(344345837, i10, -1, "net.ikea.skapa.ui.components.PriceModuleRegular.<anonymous>.<anonymous> (PriceModule.kt:356)");
                }
                F6.n(this.f150333a, this.f150334b.d(), this.f150335c, (androidx.compose.ui.d) null, (C18361i7) null, mVar, 0, 24);
                p<C4889m, Integer, C16807N> pVar = this.f150336d;
                if (pVar != null) {
                    d.a aVar = androidx.compose.ui.d.f18749a;
                    C5437c.a aVar2 = C5437c.f24302a;
                    androidx.compose.ui.d c10 = rVar.c(aVar, aVar2.i());
                    I a10 = C5080k.a(C5073d.f18068a.g(), aVar2.k(), mVar, 0);
                    int a11 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, c10);
                    C4504g.a aVar3 = C4504g.f6515W;
                    C17631a<C4504g> a12 = aVar3.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar.p(a12);
                    } else {
                        mVar.t();
                    }
                    C4889m a13 = F1.a(mVar);
                    F1.c(a13, a10, aVar3.c());
                    F1.c(a13, s10, aVar3.e());
                    p<C4504g, Integer, C16807N> b10 = aVar3.b();
                    if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                        a13.u(Integer.valueOf(a11));
                        a13.w(Integer.valueOf(a11), b10);
                    }
                    F1.c(a13, e10, aVar3.d());
                    C5862h hVar = C5862h.f28810a;
                    pVar.invoke(mVar, 0);
                    mVar.x();
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5872r) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements q<C5872r, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C18313e7.c f150337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C18289c7 f150338b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f150339c;

        e(C18313e7.c cVar, C18289c7 c7Var, p<? super C4889m, ? super Integer, C16807N> pVar) {
            this.f150337a = cVar;
            this.f150338b = c7Var;
            this.f150339c = pVar;
        }

        public final void a(C5872r rVar, C4889m mVar, int i10) {
            C17542s.j(rVar, "$this$FlowRow");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(rVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(351159794, i10, -1, "net.ikea.skapa.ui.components.PriceModuleRegularIkeaFamilyRomania.<anonymous>.<anonymous> (PriceModule.kt:205)");
                }
                F6.n(this.f150337a, this.f150338b.d(), this.f150337a.f(), (androidx.compose.ui.d) null, (C18361i7) null, mVar, 0, 24);
                p<C4889m, Integer, C16807N> pVar = this.f150339c;
                if (pVar != null) {
                    d.a aVar = androidx.compose.ui.d.f18749a;
                    C5437c.a aVar2 = C5437c.f24302a;
                    androidx.compose.ui.d c10 = rVar.c(aVar, aVar2.i());
                    I a10 = C5080k.a(C5073d.f18068a.g(), aVar2.k(), mVar, 0);
                    int a11 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, c10);
                    C4504g.a aVar3 = C4504g.f6515W;
                    C17631a<C4504g> a12 = aVar3.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar.p(a12);
                    } else {
                        mVar.t();
                    }
                    C4889m a13 = F1.a(mVar);
                    F1.c(a13, a10, aVar3.c());
                    F1.c(a13, s10, aVar3.e());
                    p<C4504g, Integer, C16807N> b10 = aVar3.b();
                    if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                        a13.u(Integer.valueOf(a11));
                        a13.w(Integer.valueOf(a11), b10);
                    }
                    F1.c(a13, e10, aVar3.d());
                    C5862h hVar = C5862h.f28810a;
                    pVar.invoke(mVar, 0);
                    mVar.x();
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5872r) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<String> f150340a;

        f(List<String> list) {
            this.f150340a = list;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1917501576, i10, -1, "net.ikea.skapa.ui.components.PriceModuleRegularIkeaFamilyRomania.<anonymous> (PriceModule.kt:159)");
                }
                W6.q(this.f150340a, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(String str, String str2, x xVar) {
        C17542s.j(xVar, "$this$clearAndSetSemantics");
        v.d0(xVar, str + ", " + str2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(String str, String str2, C18325f7 f7Var, C18301d7.a aVar, C18313e7.c cVar, p pVar, List list, Y5 y52, boolean z10, int i10, C4889m mVar, int i11) {
        z(str, str2, f7Var, aVar, cVar, pVar, list, y52, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void E(String str, String str2, C18325f7 f7Var, p<? super C4889m, ? super Integer, C16807N> pVar, C18301d7.b bVar, C18313e7 e7Var, p<? super C4889m, ? super Integer, C16807N> pVar2, C18518v8 v8Var, Y5 y52, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        boolean z11;
        C5073d dVar;
        C18289c7 c7Var;
        boolean z12;
        int i12;
        String str3 = str;
        String str4 = str2;
        C18325f7 f7Var2 = f7Var;
        p<? super C4889m, ? super Integer, C16807N> pVar3 = pVar;
        C18301d7.b bVar2 = bVar;
        C18313e7 e7Var2 = e7Var;
        p<? super C4889m, ? super Integer, C16807N> pVar4 = pVar2;
        boolean z13 = z10;
        int i13 = i10;
        C17542s.j(str3, "productName");
        C17542s.j(str4, "productDescription");
        C17542s.j(f7Var2, "currentPriceParams");
        C17542s.j(bVar2, "variant");
        C17542s.j(e7Var2, "priceOfferType");
        C4889m k10 = mVar.k(-1902833921);
        if ((i13 & 6) == 0) {
            i11 = (k10.V(str3) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.V(str4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.V(f7Var2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.F(pVar3) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i13 & 24576) == 0) {
            i11 |= k10.V(bVar2) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i11 |= k10.V(e7Var2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i13) == 0) {
            i11 |= k10.F(pVar4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        C18518v8 v8Var2 = v8Var;
        if ((12582912 & i13) == 0) {
            i11 |= k10.V(v8Var2) ? 8388608 : 4194304;
        }
        Y5 y53 = y52;
        if ((100663296 & i13) == 0) {
            i11 |= k10.V(y53) ? 67108864 : 33554432;
        }
        if ((805306368 & i13) == 0) {
            i11 |= k10.b(z13) ? 536870912 : 268435456;
        }
        int i14 = i11;
        if ((306783379 & i14) != 306783378 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1902833921, i14, -1, "net.ikea.skapa.ui.components.PriceModuleRegular (PriceModule.kt:324)");
            }
            boolean z14 = !z13;
            Z6 z62 = Z6.f150498a;
            C18289c7 c10 = z62.c(bVar2, k10, ((i14 >> 12) & 14) | 48);
            d.a aVar = androidx.compose.ui.d.f18749a;
            k10.W(-1491457829);
            Object D10 = k10.D();
            C4889m.a aVar2 = C4889m.f14007a;
            if (D10 == aVar2.a()) {
                D10 = new P6();
                k10.u(D10);
            }
            k10.P();
            androidx.compose.ui.d c11 = o.c(aVar, z14, (C17642l) D10);
            C5073d dVar2 = C5073d.f18068a;
            boolean z15 = z14;
            C5073d.m g10 = dVar2.g();
            C5437c.a aVar3 = C5437c.f24302a;
            C5073d dVar3 = dVar2;
            d.a aVar4 = aVar;
            I a10 = C5080k.a(g10, aVar3.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, c11);
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
            F1.c(a13, a10, aVar5.c());
            F1.c(a13, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b10 = aVar5.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar5.d());
            C5862h hVar = C5862h.f28810a;
            Z6 z63 = z62;
            int i15 = i14;
            C4889m mVar3 = k10;
            F6.h(e7Var, bVar.b(), c10.a(), (androidx.compose.ui.d) null, k10, (i14 >> 15) & 14, 8);
            boolean z16 = z15;
            C18289c7 c7Var2 = c10;
            C5073d dVar4 = dVar3;
            C4889m mVar4 = mVar3;
            d.a aVar6 = aVar4;
            F6.r(str, c10.e(), (androidx.compose.ui.d) null, mVar3, i15 & 14, 4);
            F6.p(str2, c7Var2.e(), (androidx.compose.ui.d) null, mVar4, (i15 >> 3) & 14, 4);
            mVar4.x();
            String a14 = bVar.a();
            mVar2 = mVar4;
            mVar2.W(-1491446127);
            if (a14 == null) {
                dVar = dVar4;
                z12 = true;
                c7Var = c7Var2;
                z11 = z16;
            } else {
                dVar = dVar4;
                z12 = true;
                c7Var = c7Var2;
                z11 = z16;
                F6.l(a14, c7Var2.e(), D.m(aVar6, 0.0f, c7Var2.c(), 0.0f, 0.0f, 13, (Object) null), mVar2, 0, 0);
                C16807N n10 = C16807N.f139792a;
            }
            mVar2.P();
            C18313e7 e7Var3 = e7Var;
            androidx.compose.ui.d m10 = D.m(aVar6, 0.0f, z63.b(e7Var3), 0.0f, 0.0f, 13, (Object) null);
            mVar2.W(-1491435909);
            Object D11 = mVar2.D();
            if (D11 == aVar2.a()) {
                D11 = new Q6();
                mVar2.u(D11);
            }
            mVar2.P();
            androidx.compose.ui.d c12 = o.c(m10, z11, (C17642l) D11);
            I a15 = C5080k.a(dVar.g(), aVar3.k(), mVar2, 0);
            int a16 = C4883j.a(mVar2, 0);
            C4912y s11 = mVar2.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar2, c12);
            C17631a<C4504g> a17 = aVar5.a();
            if (mVar2.m() == null) {
                C4883j.c();
            }
            mVar2.I();
            if (mVar2.i()) {
                mVar2.p(a17);
            } else {
                mVar2.t();
            }
            C4889m a18 = F1.a(mVar2);
            F1.c(a18, a15, aVar5.c());
            F1.c(a18, s11, aVar5.e());
            p<C4504g, Integer, C16807N> b11 = aVar5.b();
            if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.w(Integer.valueOf(a16), b11);
            }
            F1.c(a18, e11, aVar5.d());
            C18325f7 c13 = e7Var.c();
            mVar2.W(-975218916);
            if (c13 == null) {
                i12 = 0;
            } else {
                i12 = 0;
                F6.j(c13, C18349h7.Size75, (androidx.compose.ui.d) null, false, false, mVar2, 48, 28);
                C16807N n11 = C16807N.f139792a;
            }
            mVar2.P();
            androidx.compose.foundation.layout.p.a(D.m(aVar6, 0.0f, 0.0f, 0.0f, ((e7Var3 instanceof C18313e7.a) || (e7Var3 instanceof C18313e7.e)) ? c7Var.c() : h.B((float) i12), 7, (Object) null), dVar.n(c7Var.b()), dVar.p(c7Var.c(), aVar3.i()), 0, 0, (u) null, c1.c.e(344345837, z12, new d(e7Var3, c7Var, f7Var2, pVar3), mVar2, 54), mVar2, 1572864, 56);
            mVar2.W(-975190636);
            mVar2.P();
            mVar2.x();
            mVar2.W(-1491384209);
            mVar2.P();
            p<? super C4889m, ? super Integer, C16807N> pVar5 = pVar2;
            if (pVar5 != null) {
                C5844O.a(J.i(aVar6, c7Var.c()), mVar2, i12);
                pVar5.invoke(mVar2, Integer.valueOf((i15 >> 18) & 14));
                C16807N n12 = C16807N.f139792a;
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar4;
            C18313e7 e7Var4 = e7Var2;
            mVar2 = k10;
        }
        Y0 n13 = mVar2.n();
        if (n13 != null) {
            n13.a(new R6(str, str2, f7Var, pVar, bVar, e7Var, pVar2, v8Var, y52, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N F(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(String str, String str2, C18325f7 f7Var, p pVar, C18301d7.b bVar, C18313e7 e7Var, p pVar2, C18518v8 v8Var, Y5 y52, boolean z10, int i10, C4889m mVar, int i11) {
        E(str, str2, f7Var, pVar, bVar, e7Var, pVar2, v8Var, y52, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void I(String str, String str2, C18325f7 f7Var, C18301d7.b bVar, C18313e7.c cVar, p<? super C4889m, ? super Integer, C16807N> pVar, List<String> list, Y5 y52, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str3 = str;
        String str4 = str2;
        C18325f7 f7Var2 = f7Var;
        C18301d7.b bVar2 = bVar;
        C18313e7.c cVar2 = cVar;
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        List<String> list2 = list;
        boolean z11 = z10;
        int i12 = i10;
        C17542s.j(str3, "productName");
        C17542s.j(str4, "productDescription");
        C17542s.j(f7Var2, "ikeaFamilyPriceParams");
        C17542s.j(bVar2, "variant");
        C17542s.j(cVar2, "priceOfferType");
        C4889m k10 = mVar.k(504851460);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(f7Var2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(bVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(cVar2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(pVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(list2) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        Y5 y53 = y52;
        if ((12582912 & i12) == 0) {
            i11 |= k10.V(y53) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i11 |= k10.b(z11) ? 67108864 : 33554432;
        }
        int i13 = i11;
        if ((38347923 & i13) != 38347922 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(504851460, i13, -1, "net.ikea.skapa.ui.components.PriceModuleRegularIkeaFamilyRomania (PriceModule.kt:156)");
            }
            boolean z12 = !z11;
            k10.W(863357715);
            Collection collection = list2;
            C5264a e10 = (collection == null || collection.isEmpty()) ? null : c1.c.e(-1917501576, true, new f(list2), k10, 54);
            k10.P();
            Z6 z62 = Z6.f150498a;
            C18289c7 c10 = z62.c(bVar2, k10, ((i13 >> 9) & 14) | 48);
            d.a aVar = androidx.compose.ui.d.f18749a;
            k10.W(863365662);
            Object D10 = k10.D();
            C4889m.a aVar2 = C4889m.f14007a;
            Z6 z63 = z62;
            if (D10 == aVar2.a()) {
                D10 = new I6();
                k10.u(D10);
            }
            k10.P();
            androidx.compose.ui.d c11 = o.c(aVar, z12, (C17642l) D10);
            C5073d dVar = C5073d.f18068a;
            boolean z13 = z12;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar3 = C5437c.f24302a;
            C5264a aVar4 = e10;
            I a10 = C5080k.a(g10, aVar3.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, c11);
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
            F1.c(a13, a10, aVar5.c());
            F1.c(a13, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b10 = aVar5.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e11, aVar5.d());
            C5862h hVar = C5862h.f28810a;
            F6.h(C18313e7.h.f150793e, bVar.b(), c10.a(), (androidx.compose.ui.d) null, k10, 6, 8);
            C18289c7 c7Var = c10;
            boolean z14 = z13;
            int i14 = i13;
            C5264a aVar6 = aVar4;
            C4889m mVar3 = k10;
            F6.r(str, c10.e(), (androidx.compose.ui.d) null, k10, i13 & 14, 4);
            F6.p(str2, c7Var.e(), (androidx.compose.ui.d) null, mVar3, (i14 >> 3) & 14, 4);
            mVar3.x();
            androidx.compose.ui.d m10 = D.m(aVar, 0.0f, z63.a(), 0.0f, 0.0f, 13, (Object) null);
            mVar2 = mVar3;
            mVar2.W(863382398);
            Object D11 = mVar2.D();
            if (D11 == aVar2.a()) {
                D11 = new J6();
                mVar2.u(D11);
            }
            mVar2.P();
            androidx.compose.ui.d c12 = o.c(m10, z14, (C17642l) D11);
            I a14 = C5080k.a(dVar.g(), aVar3.k(), mVar2, 0);
            int a15 = C4883j.a(mVar2, 0);
            C4912y s11 = mVar2.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(mVar2, c12);
            C17631a<C4504g> a16 = aVar5.a();
            if (mVar2.m() == null) {
                C4883j.c();
            }
            mVar2.I();
            if (mVar2.i()) {
                mVar2.p(a16);
            } else {
                mVar2.t();
            }
            C4889m a17 = F1.a(mVar2);
            F1.c(a17, a14, aVar5.c());
            F1.c(a17, s11, aVar5.e());
            p<C4504g, Integer, C16807N> b11 = aVar5.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b11);
            }
            F1.c(a17, e12, aVar5.d());
            int i15 = (i14 >> 12) & 14;
            F6.h(cVar, false, c7Var.a(), (androidx.compose.ui.d) null, mVar2, i15 | 48, 8);
            C5073d dVar2 = dVar;
            C18313e7.c cVar3 = cVar2;
            C4889m mVar4 = mVar2;
            int i16 = i15 | (i14 & 896);
            d.a aVar7 = aVar;
            F6.n(cVar, c7Var.d(), f7Var, (androidx.compose.ui.d) null, (C18361i7) null, mVar4, i16, 24);
            C5844O.a(J.i(aVar7, c7Var.c()), mVar2, 0);
            M1 a18 = K1.f149712a.a(O1.Subtle, N1.IkeaFamilyPrice, c7Var.a(), mVar4, 3126);
            String e13 = cVar.e();
            Y c13 = a18.c();
            C18030v vVar = C18030v.f147664a;
            int i17 = C18030v.f147665b;
            d1.b(e13, D.m(aVar7, 0.0f, 0.0f, 0.0f, C18029u.f147649a.f(), 7, (Object) null), vVar.a(mVar2, i17).G0(), 0, (C4830x) null, C.f13316b.i(), vVar.b(mVar2, i17).b(), 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, c13, mVar2, ImageMetadata.EDGE_MODE, 0, 65432);
            androidx.compose.ui.d m11 = D.m(aVar7, 0.0f, 0.0f, 0.0f, c7Var.c(), 7, (Object) null);
            C5073d.f n10 = dVar2.n(c7Var.b());
            C5073d.m p10 = dVar2.p(c7Var.c(), aVar3.i());
            C18289c7 c7Var2 = c7Var;
            androidx.compose.foundation.layout.p.a(m11, n10, p10, 0, 0, (u) null, c1.c.e(351159794, true, new e(cVar3, c7Var2, pVar), mVar2, 54), mVar2, 1572864, 56);
            mVar2.x();
            mVar2.W(863431474);
            mVar2.P();
            C5264a aVar8 = aVar6;
            if (aVar8 != null) {
                C5844O.a(J.i(aVar7, c7Var2.c()), mVar2, 0);
                aVar8.invoke(mVar2, 0);
                C16807N n11 = C16807N.f139792a;
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
            p<? super C4889m, ? super Integer, C16807N> pVar3 = pVar2;
            C18313e7.c cVar4 = cVar2;
        }
        Y0 n12 = mVar2.n();
        if (n12 != null) {
            n12.a(new K6(str, str2, f7Var, bVar, cVar, pVar, list, y52, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N J(String str, String str2, C18325f7 f7Var, C18301d7.b bVar, C18313e7.c cVar, p pVar, List list, Y5 y52, boolean z10, int i10, C4889m mVar, int i11) {
        I(str, str2, f7Var, bVar, cVar, pVar, list, y52, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    public static final void q(List<String> list, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        List<String> list2 = list;
        int i12 = i10;
        C17542s.j(list2, "labels");
        C4889m k10 = mVar.k(-1750893023);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(list2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1750893023, i11, -1, "net.ikea.skapa.ui.components.AddonsToComposable (PriceModule.kt:475)");
            }
            String G02 = C16877v.G0(list2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
            C18030v vVar = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            mVar2 = k10;
            d1.b(G02, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, Y.c(vVar.b(k10, i13).a().c(), vVar.a(k10, i13).H0(), 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (Y1.o) null, (U1.e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (Y1.q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777214, (Object) null), mVar2, 0, 0, 65534);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new H6(list2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r(List list, int i10, C4889m mVar, int i11) {
        q(list, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: wK.d7$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v8, resolved type: wK.d7$b} */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void s(java.lang.String r32, java.lang.String r33, wK.C18325f7 r34, androidx.compose.ui.d r35, wK.C18301d7 r36, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r37, wK.C18313e7 r38, java.util.List<java.lang.String> r39, wK.C18518v8 r40, wK.Y5 r41, boolean r42, U0.C4889m r43, int r44, int r45, int r46) {
        /*
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r44
            r11 = r46
            r6 = 128(0x80, float:1.794E-43)
            r7 = 256(0x100, float:3.59E-43)
            r8 = 32
            r9 = 16
            java.lang.String r10 = "productName"
            kotlin.jvm.internal.C17542s.j(r12, r10)
            java.lang.String r10 = "productDescription"
            kotlin.jvm.internal.C17542s.j(r13, r10)
            java.lang.String r10 = "currentPriceParams"
            kotlin.jvm.internal.C17542s.j(r14, r10)
            r10 = -1081084587(0xffffffffbf8ff555, float:-1.1246744)
            r0 = r43
            U0.m r0 = r0.k(r10)
            r1 = 1
            r18 = r11 & 1
            r19 = 4
            r2 = 2
            if (r18 == 0) goto L_0x0035
            r18 = r15 | 6
            goto L_0x0049
        L_0x0035:
            r18 = r15 & 6
            if (r18 != 0) goto L_0x0047
            boolean r18 = r0.V(r12)
            if (r18 == 0) goto L_0x0042
            r18 = r19
            goto L_0x0044
        L_0x0042:
            r18 = r2
        L_0x0044:
            r18 = r15 | r18
            goto L_0x0049
        L_0x0047:
            r18 = r15
        L_0x0049:
            r20 = r11 & 2
            if (r20 == 0) goto L_0x0052
            r18 = r18 | 48
        L_0x004f:
            r10 = r18
            goto L_0x0064
        L_0x0052:
            r20 = r15 & 48
            if (r20 != 0) goto L_0x004f
            boolean r20 = r0.V(r13)
            if (r20 == 0) goto L_0x005f
            r20 = r8
            goto L_0x0061
        L_0x005f:
            r20 = r9
        L_0x0061:
            r18 = r18 | r20
            goto L_0x004f
        L_0x0064:
            r18 = r11 & 4
            if (r18 == 0) goto L_0x006b
            r10 = r10 | 384(0x180, float:5.38E-43)
            goto L_0x0079
        L_0x006b:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0079
            boolean r3 = r0.V(r14)
            if (r3 == 0) goto L_0x0077
            r3 = r7
            goto L_0x0078
        L_0x0077:
            r3 = r6
        L_0x0078:
            r10 = r10 | r3
        L_0x0079:
            r3 = r11 & 8
            if (r3 == 0) goto L_0x0082
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x007f:
            r1 = r35
            goto L_0x0095
        L_0x0082:
            r1 = r15 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x007f
            r1 = r35
            boolean r21 = r0.V(r1)
            if (r21 == 0) goto L_0x0091
            r21 = 2048(0x800, float:2.87E-42)
            goto L_0x0093
        L_0x0091:
            r21 = 1024(0x400, float:1.435E-42)
        L_0x0093:
            r10 = r10 | r21
        L_0x0095:
            r2 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00af
            r2 = r11 & 16
            if (r2 != 0) goto L_0x00a8
            r2 = r36
            boolean r22 = r0.V(r2)
            if (r22 == 0) goto L_0x00aa
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ac
        L_0x00a8:
            r2 = r36
        L_0x00aa:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x00ac:
            r10 = r10 | r22
            goto L_0x00b1
        L_0x00af:
            r2 = r36
        L_0x00b1:
            r8 = r8 & r11
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x00bb
            r10 = r10 | r22
            r9 = r37
            goto L_0x00ce
        L_0x00bb:
            r22 = r15 & r22
            r9 = r37
            if (r22 != 0) goto L_0x00ce
            boolean r23 = r0.F(r9)
            if (r23 == 0) goto L_0x00ca
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cc
        L_0x00ca:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00cc:
            r10 = r10 | r23
        L_0x00ce:
            r23 = r11 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r23 == 0) goto L_0x00d9
            r10 = r10 | r24
            r5 = r38
            goto L_0x00ec
        L_0x00d9:
            r24 = r15 & r24
            r5 = r38
            if (r24 != 0) goto L_0x00ec
            boolean r25 = r0.V(r5)
            if (r25 == 0) goto L_0x00e8
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r10 = r10 | r25
        L_0x00ec:
            r6 = r6 & r11
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00f6
            r10 = r10 | r25
            r4 = r39
            goto L_0x0109
        L_0x00f6:
            r25 = r15 & r25
            r4 = r39
            if (r25 != 0) goto L_0x0109
            boolean r26 = r0.F(r4)
            if (r26 == 0) goto L_0x0105
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0107
        L_0x0105:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x0107:
            r10 = r10 | r26
        L_0x0109:
            r7 = r7 & r11
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            if (r7 == 0) goto L_0x0113
            r10 = r10 | r26
            r1 = r40
            goto L_0x0126
        L_0x0113:
            r26 = r15 & r26
            r1 = r40
            if (r26 != 0) goto L_0x0126
            boolean r26 = r0.V(r1)
            if (r26 == 0) goto L_0x0122
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0124
        L_0x0122:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0124:
            r10 = r10 | r26
        L_0x0126:
            r1 = r11 & 512(0x200, float:7.175E-43)
            r25 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == 0) goto L_0x0131
        L_0x012c:
            r10 = r10 | r25
        L_0x012e:
            r2 = 1024(0x400, float:1.435E-42)
            goto L_0x0143
        L_0x0131:
            r25 = r15 & r25
            r2 = r41
            if (r25 != 0) goto L_0x012e
            boolean r25 = r0.V(r2)
            if (r25 == 0) goto L_0x0140
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012c
        L_0x0140:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012c
        L_0x0143:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x014b
            r19 = r45 | 6
        L_0x0148:
            r4 = r19
            goto L_0x015f
        L_0x014b:
            r24 = r45 & 6
            r4 = r42
            if (r24 != 0) goto L_0x015d
            boolean r24 = r0.b(r4)
            if (r24 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r19 = 2
        L_0x015a:
            r19 = r45 | r19
            goto L_0x0148
        L_0x015d:
            r4 = r45
        L_0x015f:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r10 & r19
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r9) goto L_0x018c
            r5 = r4 & 3
            r9 = 2
            if (r5 != r9) goto L_0x018c
            boolean r5 = r0.l()
            if (r5 != 0) goto L_0x0175
            goto L_0x018c
        L_0x0175:
            r0.L()
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = r41
            r11 = r42
            r36 = r0
            goto L_0x0451
        L_0x018c:
            r0.G()
            r5 = 1
            r9 = r15 & 1
            r19 = 0
            if (r9 == 0) goto L_0x019c
            boolean r9 = r0.O()
            if (r9 == 0) goto L_0x019f
        L_0x019c:
            r9 = 16
            goto L_0x01bf
        L_0x019f:
            r0.L()
            r9 = 16
            r1 = r11 & 16
            if (r1 == 0) goto L_0x01ac
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r10 = r10 & r1
        L_0x01ac:
            r9 = r36
            r18 = r37
            r8 = r38
            r7 = r39
            r21 = r40
            r22 = r41
            r6 = r42
            r1 = r10
            r10 = r35
            goto L_0x0219
        L_0x01bf:
            if (r3 == 0) goto L_0x01c4
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x01c6
        L_0x01c4:
            r3 = r35
        L_0x01c6:
            r9 = r9 & r11
            if (r9 == 0) goto L_0x01e0
            wK.d7$b r9 = new wK.d7$b
            wK.b7 r25 = wK.C18277b7.Medium
            r28 = 4
            r29 = 0
            r26 = 0
            r27 = 0
            r24 = r9
            r24.<init>(r25, r26, r27, r28, r29)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r10 = r10 & r18
            goto L_0x01e2
        L_0x01e0:
            r9 = r36
        L_0x01e2:
            if (r8 == 0) goto L_0x01e7
            r8 = r19
            goto L_0x01e9
        L_0x01e7:
            r8 = r37
        L_0x01e9:
            if (r23 == 0) goto L_0x01ee
            wK.e7$h r18 = wK.C18313e7.h.f150793e
            goto L_0x01f0
        L_0x01ee:
            r18 = r38
        L_0x01f0:
            if (r6 == 0) goto L_0x01f5
            r6 = r19
            goto L_0x01f7
        L_0x01f5:
            r6 = r39
        L_0x01f7:
            if (r7 == 0) goto L_0x01fc
            r7 = r19
            goto L_0x01fe
        L_0x01fc:
            r7 = r40
        L_0x01fe:
            if (r1 == 0) goto L_0x0203
            r1 = r19
            goto L_0x0205
        L_0x0203:
            r1 = r41
        L_0x0205:
            r22 = r1
            r21 = r7
            r1 = r10
            r10 = r3
            r7 = r6
            if (r2 == 0) goto L_0x0216
            r6 = 0
        L_0x020f:
            r31 = r18
            r18 = r8
            r8 = r31
            goto L_0x0219
        L_0x0216:
            r6 = r42
            goto L_0x020f
        L_0x0219:
            r0.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x022a
            java.lang.String r2 = "net.ikea.skapa.ui.components.PriceModule (PriceModule.kt:74)"
            r3 = -1081084587(0xffffffffbf8ff555, float:-1.1246744)
            U0.C4895p.S(r3, r1, r4, r2)
        L_0x022a:
            r2 = -129890372(0xfffffffff84207bc, float:-1.5741601E34)
            r0.W(r2)
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x024d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x023c
            goto L_0x024d
        L_0x023c:
            wK.W6$a r2 = new wK.W6$a
            r2.<init>(r7)
            r3 = 54
            r5 = -1469272631(0xffffffffa86cadc9, float:-1.3138315E-14)
            r11 = 1
            c1.a r2 = c1.c.e(r5, r11, r2, r0, r3)
            r19 = r2
        L_0x024d:
            r0.P()
            r2 = -129884577(0xfffffffff8421e5f, float:-1.5748775E34)
            r0.W(r2)
            java.lang.Object r2 = r0.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x026a
            wK.L6 r2 = new wK.L6
            r2.<init>()
            r0.u(r2)
        L_0x026a:
            nI.l r2 = (nI.C17642l) r2
            r0.P()
            androidx.compose.ui.d r2 = L1.o.c(r10, r6, r2)
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.k()
            r11 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r5, r0, r11)
            int r5 = U0.C4883j.a(r0, r11)
            U0.y r11 = r0.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r0, r2)
            G1.g$a r20 = G1.C4504g.f6515W
            r23 = r6
            nI.a r6 = r20.a()
            U0.f r24 = r0.m()
            if (r24 != 0) goto L_0x02a1
            U0.C4883j.c()
        L_0x02a1:
            r0.I()
            boolean r24 = r0.i()
            if (r24 == 0) goto L_0x02ae
            r0.p(r6)
            goto L_0x02b1
        L_0x02ae:
            r0.t()
        L_0x02b1:
            U0.m r6 = U0.F1.a(r0)
            r24 = r10
            nI.p r10 = r20.c()
            U0.F1.c(r6, r3, r10)
            nI.p r3 = r20.e()
            U0.F1.c(r6, r11, r3)
            nI.p r3 = r20.b()
            boolean r10 = r6.i()
            if (r10 != 0) goto L_0x02dd
            java.lang.Object r10 = r6.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r11)
            if (r10 != 0) goto L_0x02eb
        L_0x02dd:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r6.u(r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.w(r5, r3)
        L_0x02eb:
            nI.p r3 = r20.d()
            U0.F1.c(r6, r2, r3)
            s0.h r2 = s0.C5862h.f28810a
            boolean r2 = r9 instanceof wK.C18301d7.b
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            if (r2 == 0) goto L_0x0399
            r2 = 1884797301(0x7057b975, float:2.6705392E29)
            r0.W(r2)
            boolean r2 = r8 instanceof wK.C18313e7.c
            if (r2 == 0) goto L_0x0349
            r2 = 1884852078(0x70588f6e, float:2.6808863E29)
            r0.W(r2)
            r6 = r9
            wK.d7$b r6 = (wK.C18301d7.b) r6
            r10 = r8
            wK.e7$c r10 = (wK.C18313e7.c) r10
            r2 = 459774(0x703fe, float:6.4428E-40)
            r2 = r2 & r1
            int r11 = r1 >> 3
            r16 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r16
            r2 = r2 | r11
            int r1 = r1 >> 6
            r1 = r1 & r5
            r1 = r1 | r2
            int r2 = r4 << 24
            r2 = r2 & r3
            r11 = r1 | r2
            r5 = r0
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r6
            r4 = r10
            r10 = r5
            r5 = r18
            r20 = r23
            r6 = r7
            r23 = r7
            r7 = r22
            r35 = r8
            r8 = r20
            r12 = r9
            r9 = r10
            r36 = r10
            r10 = r11
            I(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r36.P()
            goto L_0x0392
        L_0x0349:
            r36 = r0
            r35 = r8
            r12 = r9
            r20 = r23
            r23 = r7
            r0 = 1885448425(0x7061a8e9, float:2.793533E29)
            r11 = r36
            r11.W(r0)
            r6 = r12
            wK.d7$b r6 = (wK.C18301d7.b) r6
            r0 = r1 & 1022(0x3fe, float:1.432E-42)
            int r2 = r1 >> 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r1 = r1 >> 3
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = r1 & r5
            r0 = r0 | r2
            r1 = r1 & r3
            r0 = r0 | r1
            int r1 = r4 << 27
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r16 = r0 | r1
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r18
            r4 = r6
            r5 = r35
            r6 = r19
            r7 = r21
            r8 = r22
            r9 = r20
            r10 = r11
            r11 = r16
            E(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r36.P()
        L_0x0392:
            r36.P()
            r17 = r35
            goto L_0x0436
        L_0x0399:
            r36 = r0
            r35 = r8
            r12 = r9
            r20 = r23
            r23 = r7
            boolean r0 = r12 instanceof wK.C18301d7.a
            if (r0 == 0) goto L_0x0474
            r0 = 1886183931(0x706ce1fb, float:2.9324662E29)
            r11 = r36
            r11.W(r0)
            r10 = r35
            boolean r0 = r10 instanceof wK.C18313e7.c
            if (r0 == 0) goto L_0x03f1
            r0 = 1886238801(0x706db851, float:2.9428309E29)
            r11.W(r0)
            r6 = r12
            wK.d7$a r6 = (wK.C18301d7.a) r6
            r7 = r10
            wK.e7$c r7 = (wK.C18313e7.c) r7
            r0 = 459774(0x703fe, float:6.4428E-40)
            r0 = r0 & r1
            int r2 = r1 >> 3
            r8 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r8
            r0 = r0 | r2
            int r1 = r1 >> 6
            r1 = r1 & r5
            r0 = r0 | r1
            int r1 = r4 << 24
            r1 = r1 & r3
            r16 = r0 | r1
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r6
            r4 = r7
            r5 = r18
            r6 = r23
            r7 = r22
            r8 = r20
            r9 = r11
            r17 = r10
            r10 = r16
            z(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.P()
            r36 = r11
            goto L_0x0433
        L_0x03f1:
            r17 = r10
            r0 = 1886832172(0x7076c62c, float:3.0549155E29)
            r11.W(r0)
            r6 = r12
            wK.d7$a r6 = (wK.C18301d7.a) r6
            r0 = r1 & 1022(0x3fe, float:1.432E-42)
            int r2 = r1 >> 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r1 = r1 >> 3
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = r1 & r5
            r0 = r0 | r2
            r1 = r1 & r3
            r0 = r0 | r1
            int r1 = r4 << 27
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r16 = r0 | r1
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r18
            r4 = r6
            r5 = r17
            r6 = r19
            r7 = r21
            r8 = r22
            r9 = r20
            r10 = r11
            r36 = r11
            r11 = r16
            v(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r36.P()
        L_0x0433:
            r36.P()
        L_0x0436:
            r36.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0442
            U0.C4895p.R()
        L_0x0442:
            r5 = r12
            r7 = r17
            r6 = r18
            r11 = r20
            r9 = r21
            r10 = r22
            r8 = r23
            r4 = r24
        L_0x0451:
            U0.Y0 r12 = r36.n()
            if (r12 == 0) goto L_0x0473
            wK.M6 r3 = new wK.M6
            r0 = r3
            r1 = r32
            r2 = r33
            r13 = r3
            r3 = r34
            r14 = r12
            r12 = r44
            r15 = r13
            r13 = r45
            r30 = r14
            r14 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r30
            r0.a(r15)
        L_0x0473:
            return
        L_0x0474:
            r0 = 199346725(0xbe1ca25, float:8.6971E-32)
            r1 = r36
            r1.W(r0)
            r1.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.W6.s(java.lang.String, java.lang.String, wK.f7, androidx.compose.ui.d, wK.d7, nI.p, wK.e7, java.util.List, wK.v8, wK.Y5, boolean, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N t(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.A0(xVar, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(String str, String str2, C18325f7 f7Var, androidx.compose.ui.d dVar, C18301d7 d7Var, p pVar, C18313e7 e7Var, List list, C18518v8 v8Var, Y5 y52, boolean z10, int i10, int i11, int i12, C4889m mVar, int i13) {
        s(str, str2, f7Var, dVar, d7Var, pVar, e7Var, list, v8Var, y52, z10, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    public static final void v(String str, String str2, C18325f7 f7Var, p<? super C4889m, ? super Integer, C16807N> pVar, C18301d7.a aVar, C18313e7 e7Var, p<? super C4889m, ? super Integer, C16807N> pVar2, C18518v8 v8Var, Y5 y52, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str3;
        String str4 = str;
        String str5 = str2;
        C18325f7 f7Var2 = f7Var;
        C18301d7.a aVar2 = aVar;
        C18313e7 e7Var2 = e7Var;
        p<? super C4889m, ? super Integer, C16807N> pVar3 = pVar2;
        boolean z11 = z10;
        int i12 = i10;
        C17542s.j(str4, "productName");
        C17542s.j(str5, "productDescription");
        C17542s.j(f7Var2, "currentPriceParams");
        C17542s.j(aVar2, "variant");
        C17542s.j(e7Var2, "priceOfferType");
        C4889m k10 = mVar.k(269843219);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str5) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(f7Var2) ? 256 : 128;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar4 = pVar;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.V(e7Var2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((i12 & 1572864) == 0) {
            i11 |= k10.F(pVar3) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        C18518v8 v8Var2 = v8Var;
        if ((12582912 & i12) == 0) {
            i11 |= k10.V(v8Var2) ? 8388608 : 4194304;
        }
        Y5 y53 = y52;
        if ((100663296 & i12) == 0) {
            i11 |= k10.V(y53) ? 67108864 : 33554432;
        }
        if ((805306368 & i12) == 0) {
            i11 |= k10.b(z11) ? 536870912 : 268435456;
        }
        if ((306783379 & i11) != 306783378 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(269843219, i11, -1, "net.ikea.skapa.ui.components.PriceModuleList (PriceModule.kt:401)");
            }
            C18289c7 c10 = Z6.f150498a.c(aVar2, k10, ((i11 >> 12) & 14) | 48);
            L1 a10 = c10.a();
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            boolean z12 = !z11;
            k10.W(-1144541115);
            Object D10 = k10.D();
            C4889m.a aVar4 = C4889m.f14007a;
            if (D10 == aVar4.a()) {
                D10 = new G6();
                k10.u(D10);
            }
            k10.P();
            d.a aVar5 = aVar3;
            boolean z13 = z12;
            C4889m mVar3 = k10;
            F6.h(e7Var, false, a10, o.a(aVar3, (C17642l) D10), k10, ((i11 >> 15) & 14) | 48, 0);
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar6 = C5437c.f24302a;
            I a11 = C5080k.a(g10, aVar6.k(), mVar3, 0);
            int a12 = C4883j.a(mVar3, 0);
            C4912y s10 = mVar3.s();
            d.a aVar7 = aVar5;
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar3, aVar7);
            C4504g.a aVar8 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar8.a();
            if (mVar3.m() == null) {
                C4883j.c();
            }
            mVar3.I();
            if (mVar3.i()) {
                mVar3.p(a13);
            } else {
                mVar3.t();
            }
            C4889m a14 = F1.a(mVar3);
            F1.c(a14, a11, aVar8.c());
            F1.c(a14, s10, aVar8.e());
            p<C4504g, Integer, C16807N> b10 = aVar8.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar8.d());
            C5862h hVar = C5862h.f28810a;
            if (e7Var.a() != null) {
                String a15 = e7Var.a();
                String lowerCase = str4.toLowerCase(Locale.ROOT);
                C17542s.i(lowerCase, "toLowerCase(...)");
                str3 = a15 + ", " + lowerCase + ", " + str5;
            } else {
                String lowerCase2 = str4.toLowerCase(Locale.ROOT);
                C17542s.i(lowerCase2, "toLowerCase(...)");
                str3 = lowerCase2 + ", " + str5;
            }
            String str6 = str3;
            u b11 = u.f18234f.b();
            d.a aVar9 = aVar7;
            b bVar = r0;
            mVar2 = mVar3;
            b bVar2 = new b(z13, str6, pVar, str, c10, str2, f7Var, e7Var, v8Var);
            androidx.compose.foundation.layout.p.a((androidx.compose.ui.d) null, (C5073d.e) null, (C5073d.m) null, 0, 0, b11, c1.c.e(1531346456, true, bVar, mVar2, 54), mVar2, (u.f18235g << 15) | 1572864, 31);
            mVar2.W(-303319231);
            mVar2.P();
            mVar2.W(-303310844);
            Object D11 = mVar2.D();
            if (D11 == aVar4.a()) {
                D11 = new N6();
                mVar2.u(D11);
            }
            mVar2.P();
            androidx.compose.ui.d c11 = o.c(aVar9, z13, (C17642l) D11);
            I a16 = C5080k.a(dVar.g(), aVar6.k(), mVar2, 0);
            int a17 = C4883j.a(mVar2, 0);
            C4912y s11 = mVar2.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar2, c11);
            C17631a<C4504g> a18 = aVar8.a();
            if (mVar2.m() == null) {
                C4883j.c();
            }
            mVar2.I();
            if (mVar2.i()) {
                mVar2.p(a18);
            } else {
                mVar2.t();
            }
            C4889m a19 = F1.a(mVar2);
            F1.c(a19, a16, aVar8.c());
            F1.c(a19, s11, aVar8.e());
            p<C4504g, Integer, C16807N> b12 = aVar8.b();
            if (a19.i() || !C17542s.e(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.w(Integer.valueOf(a17), b12);
            }
            F1.c(a19, e11, aVar8.d());
            mVar2.W(-1610808066);
            if (pVar3 != null) {
                C5844O.a(J.i(aVar9, c10.c()), mVar2, 0);
                pVar3.invoke(mVar2, 0);
                C16807N n10 = C16807N.f139792a;
            }
            mVar2.P();
            mVar2.x();
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
            n11.a(new O6(str, str2, f7Var, pVar, aVar, e7Var, pVar2, v8Var, y52, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(x xVar) {
        C17542s.j(xVar, "$this$clearAndSetSemantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(String str, String str2, C18325f7 f7Var, p pVar, C18301d7.a aVar, C18313e7 e7Var, p pVar2, C18518v8 v8Var, Y5 y52, boolean z10, int i10, C4889m mVar, int i11) {
        v(str, str2, f7Var, pVar, aVar, e7Var, pVar2, v8Var, y52, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void z(String str, String str2, C18325f7 f7Var, C18301d7.a aVar, C18313e7.c cVar, p<? super C4889m, ? super Integer, C16807N> pVar, List<String> list, Y5 y52, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str3 = str;
        String str4 = str2;
        C18325f7 f7Var2 = f7Var;
        C18301d7.a aVar2 = aVar;
        C18313e7.c cVar2 = cVar;
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        List<String> list2 = list;
        boolean z11 = z10;
        int i12 = i10;
        C17542s.j(str3, "productName");
        C17542s.j(str4, "productDescription");
        C17542s.j(f7Var2, "ikeaFamilyPriceParams");
        C17542s.j(aVar2, "variant");
        C17542s.j(cVar2, "priceOfferType");
        C4889m k10 = mVar.k(-185477404);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(f7Var2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(aVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(cVar2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(pVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(list2) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i12) == 0) {
            i11 |= k10.V(y52) ? 8388608 : 4194304;
        } else {
            Y5 y53 = y52;
        }
        if ((i12 & 100663296) == 0) {
            i11 |= k10.b(z11) ? 67108864 : 33554432;
        }
        if ((i11 & 38347923) != 38347922 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-185477404, i11, -1, "net.ikea.skapa.ui.components.PriceModuleListIkeaFamilyRomania (PriceModule.kt:235)");
            }
            boolean z12 = !z11;
            k10.W(-120831031);
            Collection collection = list2;
            C5264a e10 = (collection == null || collection.isEmpty()) ? null : c1.c.e(-1769975464, true, new c(list2), k10, 54);
            k10.P();
            C18289c7 c10 = Z6.f150498a.c(aVar2, k10, ((i11 >> 9) & 14) | 48);
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            C18029u uVar = C18029u.f147649a;
            androidx.compose.ui.d m10 = D.m(aVar3, 0.0f, 0.0f, 0.0f, uVar.j(), 7, (Object) null);
            k10.W(-120821646);
            int i13 = i11 & 14;
            int i14 = i13;
            int i15 = i11;
            boolean z13 = ((i11 & 112) == 32) | (i13 == 4);
            Object D10 = k10.D();
            if (z13 || D10 == C4889m.f14007a.a()) {
                D10 = new S6(str3, str4);
                k10.u(D10);
            }
            k10.P();
            androidx.compose.ui.d a10 = o.a(m10, (C17642l) D10);
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar4 = C5437c.f24302a;
            I a11 = C5080k.a(g10, aVar4.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar5 = C4504g.f6515W;
            d.a aVar6 = aVar3;
            C17631a<C4504g> a13 = aVar5.a();
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
            C5264a aVar7 = e10;
            F1.c(a14, a11, aVar5.c());
            F1.c(a14, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b10 = aVar5.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e11, aVar5.d());
            C5862h hVar = C5862h.f28810a;
            d.a aVar8 = aVar6;
            C4889m mVar3 = k10;
            C5264a aVar9 = aVar7;
            boolean z14 = z12;
            F6.r(str, c10.e(), (androidx.compose.ui.d) null, mVar3, i14, 4);
            int i16 = i15;
            F6.p(str2, c10.e(), (androidx.compose.ui.d) null, mVar3, (i16 >> 3) & 14, 4);
            k10.x();
            k10.W(-120812844);
            Object D11 = k10.D();
            C4889m.a aVar10 = C4889m.f14007a;
            if (D11 == aVar10.a()) {
                D11 = new T6();
                k10.u(D11);
            }
            k10.P();
            d.a aVar11 = aVar8;
            androidx.compose.ui.d c11 = o.c(aVar11, z14, (C17642l) D11);
            I a15 = C5080k.a(dVar.g(), aVar4.k(), k10, 0);
            int a16 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, c11);
            C17631a<C4504g> a17 = aVar5.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a17);
            } else {
                k10.t();
            }
            C4889m a18 = F1.a(k10);
            F1.c(a18, a15, aVar5.c());
            F1.c(a18, s11, aVar5.e());
            p<C4504g, Integer, C16807N> b11 = aVar5.b();
            if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.w(Integer.valueOf(a16), b11);
            }
            F1.c(a18, e12, aVar5.d());
            I b12 = G.b(dVar.f(), aVar4.l(), k10, 0);
            int a19 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e13 = androidx.compose.ui.c.e(k10, aVar11);
            C17631a<C4504g> a20 = aVar5.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a20);
            } else {
                k10.t();
            }
            C4889m a21 = F1.a(k10);
            F1.c(a21, b12, aVar5.c());
            F1.c(a21, s12, aVar5.e());
            p<C4504g, Integer, C16807N> b13 = aVar5.b();
            if (a21.i() || !C17542s.e(a21.D(), Integer.valueOf(a19))) {
                a21.u(Integer.valueOf(a19));
                a21.w(Integer.valueOf(a19), b13);
            }
            F1.c(a21, e13, aVar5.d());
            C5843N n10 = C5843N.f28726a;
            String d10 = cVar.d();
            Y e14 = c10.e();
            long b14 = c10.d().b();
            C18030v vVar = C18030v.f147664a;
            int i17 = C18030v.f147665b;
            long f10 = vVar.a(k10, i17).f();
            C.a aVar12 = C.f13316b;
            d1.b(d10, C5842M.e(n10, D.m(aVar11, 0.0f, 0.0f, 0.0f, uVar.f(), 7, (Object) null), 1.0f, false, 2, (Object) null), f10, b14, (C4830x) null, aVar12.i(), vVar.b(k10, i17).b(), 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, e14, k10, ImageMetadata.EDGE_MODE, 0, 65424);
            C18313e7.h hVar2 = C18313e7.h.f150793e;
            C18349h7 d11 = c10.d();
            androidx.compose.ui.d m11 = D.m(aVar11, uVar.a(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            C18361i7 i7Var = C18361i7.SingleSize;
            C4889m mVar4 = k10;
            boolean z15 = z14;
            p<? super C4889m, ? super Integer, C16807N> pVar3 = pVar2;
            C4889m.a aVar13 = aVar10;
            F6.n(hVar2, d11, f7Var, m11, i7Var, mVar4, (i16 & 896) | 24582, 0);
            mVar4.x();
            C4889m mVar5 = mVar4;
            I b15 = G.b(dVar.f(), aVar4.l(), mVar5, 0);
            int a22 = C4883j.a(mVar5, 0);
            C4912y s13 = mVar5.s();
            androidx.compose.ui.d e15 = androidx.compose.ui.c.e(mVar5, aVar11);
            C17631a<C4504g> a23 = aVar5.a();
            if (mVar5.m() == null) {
                C4883j.c();
            }
            mVar5.I();
            if (mVar5.i()) {
                mVar5.p(a23);
            } else {
                mVar5.t();
            }
            C4889m a24 = F1.a(mVar5);
            F1.c(a24, b15, aVar5.c());
            F1.c(a24, s13, aVar5.e());
            p<C4504g, Integer, C16807N> b16 = aVar5.b();
            if (a24.i() || !C17542s.e(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.w(Integer.valueOf(a22), b16);
            }
            F1.c(a24, e15, aVar5.d());
            mVar2 = mVar5;
            d1.b(cVar.e(), C5842M.e(n10, D.m(aVar11, 0.0f, 0.0f, 0.0f, uVar.f(), 7, (Object) null), 1.0f, false, 2, (Object) null), vVar.a(mVar5, i17).G0(), c10.d().b(), (C4830x) null, aVar12.i(), vVar.b(mVar5, i17).b(), 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, c10.e(), mVar2, ImageMetadata.EDGE_MODE, 0, 65424);
            F6.n(hVar2, c10.d(), cVar.f(), D.m(aVar11, uVar.a(), 0.0f, 0.0f, 0.0f, 14, (Object) null), i7Var, mVar2, 24582, 0);
            mVar2.x();
            mVar2.x();
            mVar2.W(-120757129);
            if (pVar3 != null) {
                C5844O.a(J.i(aVar11, c10.c()), mVar2, 0);
                pVar3.invoke(mVar2, 0);
                C16807N n11 = C16807N.f139792a;
            }
            mVar2.P();
            mVar2.W(-120753179);
            mVar2.P();
            mVar2.W(-120745292);
            Object D12 = mVar2.D();
            if (D12 == aVar13.a()) {
                D12 = new U6();
                mVar2.u(D12);
            }
            mVar2.P();
            androidx.compose.ui.d c12 = o.c(aVar11, z15, (C17642l) D12);
            I a25 = C5080k.a(dVar.g(), aVar4.k(), mVar2, 0);
            int a26 = C4883j.a(mVar2, 0);
            C4912y s14 = mVar2.s();
            androidx.compose.ui.d e16 = androidx.compose.ui.c.e(mVar2, c12);
            C17631a<C4504g> a27 = aVar5.a();
            if (mVar2.m() == null) {
                C4883j.c();
            }
            mVar2.I();
            if (mVar2.i()) {
                mVar2.p(a27);
            } else {
                mVar2.t();
            }
            C4889m a28 = F1.a(mVar2);
            F1.c(a28, a25, aVar5.c());
            F1.c(a28, s14, aVar5.e());
            p<C4504g, Integer, C16807N> b17 = aVar5.b();
            if (a28.i() || !C17542s.e(a28.D(), Integer.valueOf(a26))) {
                a28.u(Integer.valueOf(a26));
                a28.w(Integer.valueOf(a26), b17);
            }
            F1.c(a28, e16, aVar5.d());
            mVar2.W(14755938);
            C5264a aVar14 = aVar9;
            if (aVar14 != null) {
                C5844O.a(J.i(aVar11, c10.c()), mVar2, 0);
                aVar14.invoke(mVar2, 0);
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
            p<? super C4889m, ? super Integer, C16807N> pVar4 = pVar2;
        }
        Y0 n13 = mVar2.n();
        if (n13 != null) {
            n13.a(new V6(str, str2, f7Var, aVar, cVar, pVar, list, y52, z10, i10));
        }
    }
}
