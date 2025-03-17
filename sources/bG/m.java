package BG;

import E1.I;
import G1.C4504g;
import OE.n;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.A1;
import U0.B;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import kF.C14689J;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import m0.C5525D;
import m0.C5548j;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5747v0;
import p1.i1;
import rF.C15002a;
import s0.C5861g;
import s0.C5862h;
import sF.C15049e;
import zG.C18747a;
import zG.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aG\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LzG/a;", "viewModel", "", "itemId", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "LXH/N;", "onItemSelected", "Lkotlin/Function0;", "onExpandClicked", "g", "(LzG/a;ILnI/l;LnI/a;LU0/m;I)V", "LzG/e$c;", "state", "onLoadMore", "j", "(LzG/e$c;LnI/l;LnI/a;LnI/a;LU0/m;I)V", "e", "(LnI/a;LU0/m;I)V", "Lc2/h;", "a", "F", "l", "()F", "COLUMN_WIDTH", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final float f133211a = h.B((float) 120);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.MiniCatalogStripeKt$MiniCatalogStripe$1$1", f = "MiniCatalogStripe.kt", l = {57}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f133212c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18747a f133213d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f133214e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C18747a aVar, int i10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f133213d = aVar;
            this.f133214e = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f133213d, this.f133214e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f133212c;
            if (i10 == 0) {
                y.b(obj);
                C18747a aVar = this.f133213d;
                int i11 = this.f133214e;
                this.f133212c = 1;
                if (aVar.h(i11, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.MiniCatalogStripeKt$MiniCatalogStripe$2$1$1$1", f = "MiniCatalogStripe.kt", l = {95}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f133215c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18747a f133216d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f133217e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C18747a aVar, int i10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f133216d = aVar;
            this.f133217e = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f133216d, this.f133217e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f133215c;
            if (i10 == 0) {
                y.b(obj);
                C18747a aVar = this.f133216d;
                int i11 = this.f133217e;
                this.f133215c = 1;
                if (aVar.i(i11, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public static final void e(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "onExpandClicked");
        C4889m k10 = mVar.k(-1699083700);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1699083700, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.ExpandButton (MiniCatalogStripe.kt:148)");
            }
            d.a aVar2 = d.f18749a;
            d a10 = C5116k1.a(J.i(J.y(D.m(aVar2, 0.0f, h.B((float) 12), 0.0f, 0.0f, 13, (Object) null), f133211a), h.B((float) 46)), "MINI_CATALOG_STRIPE_EXPAND_BUTTON");
            I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.g(), k10, 48);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, a10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar3.a();
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
            F1.c(a14, a11, aVar3.c());
            F1.c(a14, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            C15453d.b(J.y(aVar2, h.B((float) 100)), aVar, k10, ((i11 << 3) & 112) | 6, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new l(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17631a aVar, int i10, C4889m mVar, int i11) {
        e(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void g(C18747a aVar, int i10, C17642l<? super CachedCatalogItem, C16807N> lVar, C17631a<C16807N> aVar2, C4889m mVar, int i11) {
        int i12;
        C18747a aVar3 = aVar;
        int i13 = i10;
        C17642l<? super CachedCatalogItem, C16807N> lVar2 = lVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i14 = i11;
        C17542s.j(aVar3, "viewModel");
        C17542s.j(lVar2, "onItemSelected");
        C17542s.j(aVar4, "onExpandClicked");
        C4889m k10 = mVar.k(644168545);
        if ((i14 & 6) == 0) {
            i12 = (k10.F(aVar3) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= k10.d(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i12 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i12 |= k10.F(aVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(644168545, i12, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.MiniCatalogStripe (MiniCatalogStripe.kt:51)");
            }
            A1<e> b10 = p1.b(aVar.m(), (C17168i) null, k10, 0, 1);
            Object D10 = k10.D();
            C4889m.a aVar5 = C4889m.f14007a;
            if (D10 == aVar5.a()) {
                B b11 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b11);
                D10 = b11;
            }
            Q a10 = ((B) D10).a();
            Integer valueOf = Integer.valueOf(i10);
            k10.W(1168217579);
            int i15 = i12 & 112;
            boolean F10 = k10.F(aVar3) | (i15 == 32);
            Object D11 = k10.D();
            if (F10 || D11 == aVar5.a()) {
                D11 = new a(aVar3, i13, (C17164e<? super a>) null);
                k10.u(D11);
            }
            k10.P();
            int i16 = i12 >> 3;
            P.g(valueOf, (p) D11, k10, i16 & 14);
            d d10 = J.d(J.y(d.f18749a, f133211a), 0.0f, 1, (Object) null);
            I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d10);
            C4504g.a aVar6 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar6.a();
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
            F1.c(a14, a11, aVar6.c());
            F1.c(a14, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b12 = aVar6.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b12);
            }
            F1.c(a14, e10, aVar6.d());
            C5862h hVar = C5862h.f28810a;
            e value = b10.getValue();
            if (value instanceof e.b) {
                k10.W(-329443511);
                zG.l.b(C5747v0.o(C15002a.a(k10, 0).e(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), k10, 0);
                k10.P();
            } else if (value instanceof e.a) {
                k10.W(-329205803);
                e value2 = b10.getValue();
                C17542s.h(value2, "null cannot be cast to non-null type com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.CatalogUiState.Error");
                zG.h.c(((e.a) value2).a(), C5747v0.o(C15002a.a(k10, 0).e(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), k10, 0, 0);
                k10.P();
            } else if (value instanceof e.c) {
                k10.W(-328865857);
                e value3 = b10.getValue();
                C17542s.h(value3, "null cannot be cast to non-null type com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.CatalogUiState.Success");
                e.c cVar = (e.c) value3;
                if (cVar.b().isEmpty()) {
                    k10.W(-328769199);
                    zG.h.c(n.f113193E1, C5747v0.o(C15002a.a(k10, 0).e(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), k10, 0, 0);
                    k10.P();
                } else {
                    k10.W(-328445373);
                    k10.W(-980418938);
                    boolean F11 = k10.F(a10) | k10.F(aVar3) | (i15 == 32);
                    Object D12 = k10.D();
                    if (F11 || D12 == aVar5.a()) {
                        D12 = new i(a10, aVar3, i13);
                        k10.u(D12);
                    }
                    k10.P();
                    j(cVar, lVar, (C17631a) D12, aVar2, k10, (i16 & 112) | (i12 & 7168));
                    k10.P();
                }
                k10.P();
            } else {
                k10.W(-980459235);
                k10.P();
                throw new t();
            }
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new j(aVar, i10, lVar, aVar2, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(Q q10, C18747a aVar, int i10) {
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new b(aVar, i10, (C17164e<? super b>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C18747a aVar, int i10, C17642l lVar, C17631a aVar2, int i11, C4889m mVar, int i12) {
        g(aVar, i10, lVar, aVar2, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    public static final void j(e.c cVar, C17642l<? super CachedCatalogItem, C16807N> lVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        e.c cVar2 = cVar;
        C17642l<? super CachedCatalogItem, C16807N> lVar2 = lVar;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C17542s.j(cVar2, "state");
        C17542s.j(lVar2, "onItemSelected");
        C17542s.j(aVar3, "onLoadMore");
        C17542s.j(aVar4, "onExpandClicked");
        C4889m k10 = mVar.k(205509690);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar3) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i13 = i11;
        if ((i13 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(205509690, i13, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.MiniCatalogStripeContent (MiniCatalogStripe.kt:111)");
            }
            List<CachedCatalogItem> b10 = cVar.b();
            d.a aVar5 = d.f18749a;
            C5437c.a aVar6 = C5437c.f24302a;
            I h10 = C5077h.h(aVar6.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, aVar5);
            C4504g.a aVar7 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar7.a();
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
            F1.c(a12, h10, aVar7.c());
            F1.c(a12, s10, aVar7.e());
            p<C4504g, Integer, C16807N> b11 = aVar7.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar7.d());
            C5079j jVar = C5079j.f18125a;
            d d10 = androidx.compose.foundation.b.d(C15049e.l(J.d(aVar5, 0.0f, 1, (Object) null), C15002a.a(k10, 0).e(), true, h.B((float) 100), h.B((float) 55), C5548j.j(500, 0, (C5525D) null, 6, (Object) null)), C5747v0.o(C15002a.a(k10, 0).e(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (i1) null, 2, (Object) null);
            I a13 = C5080k.a(C5073d.f18068a.g(), aVar6.k(), k10, 0);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, d10);
            C17631a<C4504g> a15 = aVar7.a();
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
            F1.c(a16, a13, aVar7.c());
            F1.c(a16, s11, aVar7.e());
            p<C4504g, Integer, C16807N> b12 = aVar7.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar7.d());
            d c10 = C5861g.c(C5862h.f28810a, aVar5, 1.0f, false, 2, (Object) null);
            if (!(b10 instanceof List)) {
                b10 = null;
            }
            if (b10 == null) {
                b10 = C16877v.n();
            }
            d.a aVar8 = aVar5;
            int i14 = i13;
            h.d(c10, b10, cVar.a(), cVar.c(), lVar, aVar, k10, (i13 << 9) & 516096, 0);
            k10.W(1818194831);
            if (cVar.d()) {
                C14689J.b(J.y(aVar8, f133211a), k10, 6, 0);
            }
            k10.P();
            k10.x();
            e(aVar4, k10, (i14 >> 9) & 14);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new k(cVar, lVar, aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(e.c cVar, C17642l lVar, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        j(cVar, lVar, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final float l() {
        return f133211a;
    }
}
