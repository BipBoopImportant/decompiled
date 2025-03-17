package zw;

import A0.g;
import Bw.j;
import E1.C4488v;
import E1.I;
import G1.C4504g;
import KJ.C15987c;
import N1.P;
import Op.c1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import SC.C13607l;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import Y1.f;
import Y1.k;
import YH.C16877v;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5100f0;
import c2.h;
import com.adjust.sdk.Constants;
import com.ingka.ikea.analytics.Interaction$Component;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p1.i1;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5861g;
import s0.C5862h;
import t0.C5938c;
import t0.x;
import tK.C18025p;
import tK.C18030v;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a©\u0001\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u000f2$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0011\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0017\u001a\u00020\u0006*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00162\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u0019\u001a\u00020\u0006*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00162\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0003¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u001f\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aS\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00162\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b!\u0010\"\u001a;\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b%\u0010&\u001a\u000f\u0010(\u001a\u00020'H\u0003¢\u0006\u0004\b(\u0010)\u001a\u0013\u0010*\u001a\u00020\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b*\u0010+\"\u0014\u0010.\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010(¨\u0006/"}, d2 = {"Lt0/x;", "LBw/j$d;", "model", "Lkotlin/Function2;", "LOp/c1;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "LXH/N;", "onProductItemEvent", "Lkotlin/Function3;", "", "onShuffleClicked", "Lkotlin/Function0;", "onFilterButtonClicked", "", "shuffleSectionHeightInPx", "Lkotlin/Function1;", "onShuffleSectionHeightChanged", "", "onNewProductsViewed", "H", "(Lt0/x;LBw/j$d;LnI/p;LnI/q;LnI/a;ILnI/l;LnI/q;)V", "Ls0/g;", "LBw/j$d$a;", "v", "(Ls0/g;LBw/j$d$a;LnI/p;LU0/m;I)V", "s", "contentMinHeightInPx", "I", "(Lt0/x;Ljava/lang/Integer;)V", "Landroidx/compose/ui/d;", "modifier", "j", "(LBw/j$d$a;LnI/q;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "n", "(Landroidx/compose/ui/d;LU0/m;II)V", "LBw/j$d$a$d;", "productWithShape", "p", "(LBw/j$d$a$d;LnI/p;Landroidx/compose/ui/d;LU0/m;II)V", "", "F", "(LU0/m;I)Z", "G", "(Lt0/x;)V", "Lc2/h;", "a", "cornerRadius", "offerhub-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class J0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f132598a = h.B((float) 20);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j.d.a f132599a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<c1, Interaction$Component, C16807N> f132600b;

        a(j.d.a aVar, p<? super c1, ? super Interaction$Component, C16807N> pVar) {
            this.f132599a = aVar;
            this.f132600b = pVar;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            C17542s.j(cVar, "$this$items");
            if ((i11 & 48) == 0) {
                i11 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i11 & 145) != 144 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1182260763, i11, -1, "com.ingka.ikea.offerhub.impl.ui.ProductCarousel.<anonymous>.<anonymous>.<anonymous> (SurpriseDealsComposables.kt:241)");
                }
                j.d.a.C2583d dVar = (j.d.a.C2583d) C16877v.z0(this.f132599a.b(), i10);
                if (dVar != null) {
                    J0.p(dVar, this.f132600b, J.y(androidx.compose.ui.d.f18749a, h.B((float) 200)), mVar, 384, 0);
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j.d f132601a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q<Interaction$Component, String, String, C16807N> f132602b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f132603c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f132604a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j.d f132605b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ q<Interaction$Component, String, String, C16807N> f132606c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f132607d;

            a(androidx.compose.ui.d dVar, j.d dVar2, q<? super Interaction$Component, ? super String, ? super String, C16807N> qVar, C17631a<C16807N> aVar) {
                this.f132604a = dVar;
                this.f132605b = dVar2;
                this.f132606c = qVar;
                this.f132607d = aVar;
            }

            public final void a(C4889m mVar, int i10) {
                C4889m mVar2 = mVar;
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(703278041, i11, -1, "com.ingka.ikea.offerhub.impl.ui.surpriseDeals.<anonymous>.<anonymous> (SurpriseDealsComposables.kt:95)");
                    }
                    if (J0.F(mVar2, 0)) {
                        mVar2.W(1742751078);
                        androidx.compose.ui.d k10 = D.k(this.f132604a, 0.0f, h.B((float) 8), 1, (Object) null);
                        C5437c.C0386c i12 = C5437c.f24302a.i();
                        j.d dVar = this.f132605b;
                        q<Interaction$Component, String, String, C16807N> qVar = this.f132606c;
                        C17631a<C16807N> aVar = this.f132607d;
                        I b10 = G.b(C5073d.f18068a.f(), i12, mVar2, 48);
                        int a10 = C4883j.a(mVar2, 0);
                        C4912y s10 = mVar.s();
                        androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, k10);
                        C4504g.a aVar2 = C4504g.f6515W;
                        C17631a<C4504g> a11 = aVar2.a();
                        if (mVar.m() == null) {
                            C4883j.c();
                        }
                        mVar.I();
                        if (mVar.i()) {
                            mVar2.p(a11);
                        } else {
                            mVar.t();
                        }
                        C4889m a12 = F1.a(mVar);
                        F1.c(a12, b10, aVar2.c());
                        F1.c(a12, s10, aVar2.e());
                        p<C4504g, Integer, C16807N> b11 = aVar2.b();
                        if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                            a12.u(Integer.valueOf(a10));
                            a12.w(Integer.valueOf(a10), b11);
                        }
                        F1.c(a12, e10, aVar2.d());
                        C5843N n10 = C5843N.f28726a;
                        d.a aVar3 = androidx.compose.ui.d.f18749a;
                        J0.n(C5842M.e(n10, aVar3, 1.0f, false, 2, (Object) null), mVar2, 0, 0);
                        J0.j((j.d.a) dVar, qVar, aVar, D.k(C5842M.e(n10, aVar3, 1.0f, false, 2, (Object) null), h.B((float) 16), 0.0f, 2, (Object) null), mVar, 0, 0);
                        mVar.x();
                        mVar.P();
                    } else {
                        mVar2.W(1743570749);
                        androidx.compose.ui.d dVar2 = this.f132604a;
                        j.d dVar3 = this.f132605b;
                        q<Interaction$Component, String, String, C16807N> qVar2 = this.f132606c;
                        C17631a<C16807N> aVar4 = this.f132607d;
                        I a13 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                        int a14 = C4883j.a(mVar2, 0);
                        C4912y s11 = mVar.s();
                        androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar2, dVar2);
                        C4504g.a aVar5 = C4504g.f6515W;
                        C17631a<C4504g> a15 = aVar5.a();
                        if (mVar.m() == null) {
                            C4883j.c();
                        }
                        mVar.I();
                        if (mVar.i()) {
                            mVar2.p(a15);
                        } else {
                            mVar.t();
                        }
                        C4889m a16 = F1.a(mVar);
                        F1.c(a16, a13, aVar5.c());
                        F1.c(a16, s11, aVar5.e());
                        p<C4504g, Integer, C16807N> b12 = aVar5.b();
                        if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                            a16.u(Integer.valueOf(a14));
                            a16.w(Integer.valueOf(a14), b12);
                        }
                        F1.c(a16, e11, aVar5.d());
                        C5862h hVar = C5862h.f28810a;
                        d.a aVar6 = androidx.compose.ui.d.f18749a;
                        J0.n(D.m(aVar6, 0.0f, h.B((float) 40), 0.0f, h.B((float) 24), 5, (Object) null), mVar2, 6, 0);
                        float f10 = (float) 16;
                        d.a aVar7 = aVar6;
                        J0.j((j.d.a) dVar3, qVar2, aVar4, D.m(aVar7, h.B(f10), 0.0f, h.B(f10), h.B((float) 8), 2, (Object) null), mVar, 3072, 0);
                        mVar.x();
                        mVar.P();
                    }
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

        b(j.d dVar, q<? super Interaction$Component, ? super String, ? super String, C16807N> qVar, C17631a<C16807N> aVar) {
            this.f132601a = dVar;
            this.f132602b = qVar;
            this.f132603c = aVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$stickyHeader");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(584635741, i10, -1, "com.ingka.ikea.offerhub.impl.ui.surpriseDeals.<anonymous> (SurpriseDealsComposables.kt:83)");
                }
                androidx.compose.ui.d h10 = J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
                C18030v vVar = C18030v.f147664a;
                int i11 = C18030v.f147665b;
                C18025p.e(true, (C4820m) null, c1.c.e(703278041, true, new a(androidx.compose.foundation.b.d(e.a(androidx.compose.foundation.b.d(h10, vVar.a(mVar, i11).k0(), (i1) null, 2, (Object) null), g.g(J0.f132598a, J0.f132598a, 0.0f, 0.0f, 12, (Object) null)), vVar.a(mVar, i11).l(), (i1) null, 2, (Object) null), this.f132601a, this.f132602b, this.f132603c), mVar, 54), mVar, 390, 2);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, C16807N> f132608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q<String, List<String>, Interaction$Component, C16807N> f132609b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j.d f132610c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<c1, Interaction$Component, C16807N> f132611d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5861g f132612a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j.d f132613b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p<c1, Interaction$Component, C16807N> f132614c;

            a(C5861g gVar, j.d dVar, p<? super c1, ? super Interaction$Component, C16807N> pVar) {
                this.f132612a = gVar;
                this.f132613b = dVar;
                this.f132614c = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-76463098, i10, -1, "com.ingka.ikea.offerhub.impl.ui.surpriseDeals.<anonymous>.<anonymous>.<anonymous> (SurpriseDealsComposables.kt:161)");
                    }
                    if (J0.F(mVar, 0)) {
                        mVar.W(-540980868);
                        J0.s(this.f132612a, (j.d.a) this.f132613b, this.f132614c, mVar, 0);
                        mVar.P();
                    } else {
                        mVar.W(-540849056);
                        J0.v(this.f132612a, (j.d.a) this.f132613b, this.f132614c, mVar, 0);
                        mVar.P();
                    }
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

        c(C17642l<? super Integer, C16807N> lVar, q<? super String, ? super List<String>, ? super Interaction$Component, C16807N> qVar, j.d dVar, p<? super c1, ? super Interaction$Component, C16807N> pVar) {
            this.f132608a = lVar;
            this.f132609b = qVar;
            this.f132610c = dVar;
            this.f132611d = pVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar, C4488v vVar) {
            C17542s.j(vVar, "coordinates");
            lVar.invoke(Integer.valueOf(c2.r.g(vVar.a())));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(q qVar, j.d dVar) {
            String value = Interaction$Component.OFFER_HUB_SHUFFLE.getValue();
            C15987c<j.d.a.C2583d> b10 = ((j.d.a) dVar).b();
            ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
            for (j.d.a.C2583d a10 : b10) {
                arrayList.add(a10.a().p().f());
            }
            qVar.invoke(value, arrayList, Interaction$Component.OFFER_HUB_SHUFFLE);
            return C16807N.f139792a;
        }

        public final void c(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1593697600, i10, -1, "com.ingka.ikea.offerhub.impl.ui.surpriseDeals.<anonymous> (SurpriseDealsComposables.kt:138)");
                }
                androidx.compose.ui.d d10 = androidx.compose.foundation.b.d(e.a(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), g.g(0.0f, 0.0f, J0.f132598a, J0.f132598a, 3, (Object) null)), C18030v.f147664a.a(mVar, C18030v.f147665b).l(), (i1) null, 2, (Object) null);
                mVar.W(-1691017082);
                boolean V10 = mVar.V(this.f132608a);
                C17642l<Integer, C16807N> lVar = this.f132608a;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new K0(lVar);
                    mVar.u(D10);
                }
                mVar.P();
                androidx.compose.ui.d a10 = androidx.compose.ui.layout.c.a(d10, (C17642l) D10);
                q<String, List<String>, Interaction$Component, C16807N> qVar = this.f132609b;
                j.d dVar = this.f132610c;
                p<c1, Interaction$Component, C16807N> pVar = this.f132611d;
                I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
                int a12 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, a10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a13 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a13);
                } else {
                    mVar.t();
                }
                C4889m a14 = F1.a(mVar);
                F1.c(a14, a11, aVar.c());
                F1.c(a14, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.w(Integer.valueOf(a12), b10);
                }
                F1.c(a14, e10, aVar.d());
                C5862h hVar = C5862h.f28810a;
                mVar.W(-636439096);
                boolean V11 = mVar.V(qVar) | mVar.F(dVar);
                Object D11 = mVar.D();
                if (V11 || D11 == C4889m.f14007a.a()) {
                    D11 = new L0(qVar, dVar);
                    mVar.u(D11);
                }
                mVar.P();
                pl.d.d((androidx.lifecycle.r) null, (C17631a) D11, mVar, 0, 1);
                C18025p.e(true, (C4820m) null, c1.c.e(-76463098, true, new a(hVar, dVar, pVar), mVar, 54), mVar, 390, 2);
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
            c((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Integer f132615a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5861g f132616a;

            a(C5861g gVar) {
                this.f132616a = gVar;
            }

            public final void a(C4889m mVar, int i10) {
                C4889m mVar2 = mVar;
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1222089818, i11, -1, "com.ingka.ikea.offerhub.impl.ui.surpriseDealsLoading.<anonymous>.<anonymous>.<anonymous> (SurpriseDealsComposables.kt:304)");
                    }
                    C5861g gVar = this.f132616a;
                    d.a aVar = androidx.compose.ui.d.f18749a;
                    C5844O.a(C5861g.c(gVar, aVar, 1.0f, false, 2, (Object) null), mVar2, 0);
                    C13605k1.b(this.f132616a.b(aVar, C5437c.f24302a.g()), C13597i1.Primary, C13593h1.Large, mVar, 432, 0);
                    C13607l.j(J1.j.b(Oo.b.f84594b5, mVar2, 0), C13679b.a.C2856b.f116680a, D.k(J.h(aVar, 0.0f, 1, (Object) null), h.B((float) 56), 0.0f, 2, (Object) null), C18030v.f147664a.a(mVar2, C18030v.f147665b).F0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, Y1.j.h(Y1.j.f14783b.a()), (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 432, 0, 261104);
                    C5844O.a(C5861g.c(this.f132616a, aVar, 1.0f, false, 2, (Object) null), mVar, 0);
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

        d(Integer num) {
            this.f132615a = num;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-293336556, i10, -1, "com.ingka.ikea.offerhub.impl.ui.surpriseDealsLoading.<anonymous> (SurpriseDealsComposables.kt:282)");
                }
                mVar.W(-1947032799);
                Object Q10 = mVar.Q(C5100f0.e());
                Integer num = this.f132615a;
                c2.d dVar = (c2.d) Q10;
                float B10 = h.B((float) (J0.F(mVar, 0) ? Constants.MINIMAL_ERROR_STATUS_CODE : 608));
                float H10 = num != null ? dVar.H(num.intValue()) : B10;
                float f10 = h.v(H10, B10) > 0 ? H10 : B10;
                mVar.P();
                androidx.compose.ui.d d10 = androidx.compose.foundation.b.d(e.a(J.x(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), 0.0f, f10, 0.0f, 0.0f, 13, (Object) null), g.g(0.0f, 0.0f, J0.f132598a, J0.f132598a, 3, (Object) null)), C18030v.f147664a.a(mVar, C18030v.f147665b).l(), (i1) null, 2, (Object) null);
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, d10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar.a();
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
                F1.c(a13, a10, aVar.c());
                F1.c(a13, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar.d());
                C18025p.e(true, (C4820m) null, c1.c.e(1222089818, true, new a(C5862h.f28810a), mVar, 54), mVar, 390, 2);
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
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean F(C4889m mVar, int i10) {
        mVar.W(-677830049);
        if (C4895p.J()) {
            C4895p.S(-677830049, i10, -1, "com.ingka.ikea.offerhub.impl.ui.isLandscape (SurpriseDealsComposables.kt:399)");
        }
        boolean z10 = ((Configuration) mVar.Q(AndroidCompositionLocals_androidKt.f())).orientation == 2;
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return z10;
    }

    /* access modifiers changed from: private */
    public static final void G(x xVar) {
        x.i(xVar, (Object) null, (Object) null, C15343A.f132559a.c(), 3, (Object) null);
    }

    public static final void H(x xVar, j.d dVar, p<? super c1, ? super Interaction$Component, C16807N> pVar, q<? super Interaction$Component, ? super String, ? super String, C16807N> qVar, C17631a<C16807N> aVar, int i10, C17642l<? super Integer, C16807N> lVar, q<? super String, ? super List<String>, ? super Interaction$Component, C16807N> qVar2) {
        C17542s.j(xVar, "<this>");
        C17542s.j(dVar, "model");
        C17542s.j(pVar, "onProductItemEvent");
        C17542s.j(qVar, "onShuffleClicked");
        C17542s.j(aVar, "onFilterButtonClicked");
        C17542s.j(lVar, "onShuffleSectionHeightChanged");
        C17542s.j(qVar2, "onNewProductsViewed");
        if (dVar instanceof j.d.a) {
            xVar.k("SurpriseDealsHeader", "SurpriseDealsHeader", c1.c.c(584635741, true, new b(dVar, qVar, aVar)));
            xVar.b("SurpriseDealsContent", "SurpriseDealsContent", c1.c.c(-1593697600, true, new c(lVar, qVar2, dVar, pVar)));
        } else if (C17542s.e(dVar, j.d.b.f108189a)) {
            I(xVar, Integer.valueOf(i10));
        } else {
            throw new t();
        }
    }

    public static final void I(x xVar, Integer num) {
        C17542s.j(xVar, "<this>");
        xVar.k("SurpriseDealsHeader", "SurpriseDealsHeader", C15343A.f132559a.b());
        xVar.b("SurpriseDealsContent", "SurpriseDealsLoading", c1.c.c(-293336556, true, new d(num)));
    }

    public static /* synthetic */ void J(x xVar, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        I(xVar, num);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(Bw.j.d.a r28, nI.q<? super com.ingka.ikea.analytics.Interaction$Component, ? super java.lang.String, ? super java.lang.String, XH.C16807N> r29, nI.C17631a<XH.C16807N> r30, androidx.compose.ui.d r31, U0.C4889m r32, int r33, int r34) {
        /*
            r1 = r28
            r2 = r29
            r3 = r30
            r5 = r33
            r0 = 90397690(0x5635bfa, float:1.0690382E-35)
            r4 = r32
            U0.m r4 = r4.k(r0)
            r6 = r34 & 1
            r15 = 4
            if (r6 == 0) goto L_0x0019
            r6 = r5 | 6
            goto L_0x0029
        L_0x0019:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0028
            boolean r6 = r4.V(r1)
            if (r6 == 0) goto L_0x0025
            r6 = r15
            goto L_0x0026
        L_0x0025:
            r6 = 2
        L_0x0026:
            r6 = r6 | r5
            goto L_0x0029
        L_0x0028:
            r6 = r5
        L_0x0029:
            r7 = r34 & 2
            r14 = 32
            if (r7 == 0) goto L_0x0032
            r6 = r6 | 48
            goto L_0x0041
        L_0x0032:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0041
            boolean r7 = r4.F(r2)
            if (r7 == 0) goto L_0x003e
            r7 = r14
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r6 = r6 | r7
        L_0x0041:
            r7 = r34 & 4
            r8 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x004a
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x004a:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0059
            boolean r7 = r4.F(r3)
            if (r7 == 0) goto L_0x0056
            r7 = r8
            goto L_0x0058
        L_0x0056:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r6 = r6 | r7
        L_0x0059:
            r7 = r34 & 8
            if (r7 == 0) goto L_0x0063
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x005f:
            r9 = r31
        L_0x0061:
            r13 = r6
            goto L_0x0076
        L_0x0063:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x005f
            r9 = r31
            boolean r10 = r4.V(r9)
            if (r10 == 0) goto L_0x0072
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r6 = r6 | r10
            goto L_0x0061
        L_0x0076:
            r6 = r13 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r6 != r10) goto L_0x0088
            boolean r6 = r4.l()
            if (r6 != 0) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            r4.L()
            goto L_0x0233
        L_0x0088:
            if (r7 == 0) goto L_0x008e
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r12 = r6
            goto L_0x008f
        L_0x008e:
            r12 = r9
        L_0x008f:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x009b
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.offerhub.impl.ui.Buttons (SurpriseDealsComposables.kt:331)"
            U0.C4895p.S(r0, r13, r6, r7)
        L_0x009b:
            r0 = 0
            r11 = 1
            r6 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r12, r0, r11, r6)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            r9 = 8
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.foundation.layout.d$f r7 = r7.n(r9)
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$c r9 = r9.l()
            r10 = 6
            E1.I r7 = androidx.compose.foundation.layout.G.b(r7, r9, r4, r10)
            r10 = 0
            int r9 = U0.C4883j.a(r4, r10)
            U0.y r6 = r4.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r4, r0)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r10 = r16.a()
            U0.f r17 = r4.m()
            if (r17 != 0) goto L_0x00d6
            U0.C4883j.c()
        L_0x00d6:
            r4.I()
            boolean r17 = r4.i()
            if (r17 == 0) goto L_0x00e3
            r4.p(r10)
            goto L_0x00e6
        L_0x00e3:
            r4.t()
        L_0x00e6:
            U0.m r10 = U0.F1.a(r4)
            nI.p r11 = r16.c()
            U0.F1.c(r10, r7, r11)
            nI.p r7 = r16.e()
            U0.F1.c(r10, r6, r7)
            nI.p r6 = r16.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x0110
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x011e
        L_0x0110:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.w(r7, r6)
        L_0x011e:
            nI.p r6 = r16.d()
            U0.F1.c(r10, r0, r6)
            s0.N r0 = s0.C5843N.f28726a
            Bw.j$d$a$a r6 = r28.a()
            KJ.c r6 = r6.c()
            java.util.Iterator r6 = r6.iterator()
        L_0x0133:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0148
            java.lang.Object r7 = r6.next()
            r9 = r7
            Bw.j$d$a$b r9 = (Bw.j.d.a.b) r9
            boolean r9 = r9.c()
            if (r9 == 0) goto L_0x0133
            r6 = r7
            goto L_0x0149
        L_0x0148:
            r6 = 0
        L_0x0149:
            Bw.j$d$a$b r6 = (Bw.j.d.a.b) r6
            if (r6 == 0) goto L_0x0153
            java.lang.String r6 = r6.b()
            if (r6 != 0) goto L_0x015b
        L_0x0153:
            Bw.j$d$a$a r6 = r28.a()
            java.lang.String r6 = r6.b()
        L_0x015b:
            androidx.compose.ui.d$a r24 = androidx.compose.ui.d.f18749a
            r22 = 2
            r23 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r18 = r0
            r19 = r24
            androidx.compose.ui.d r7 = s0.C5842M.e(r18, r19, r20, r21, r22, r23)
            SC.N r9 = SC.N.Secondary
            int r10 = uK.C18146a.f148021E1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            SC.K0 r18 = SC.K0.TRAILING
            r10 = -53869789(0xfffffffffcca0323, float:-8.391261E36)
            r4.W(r10)
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != r8) goto L_0x0183
            r8 = 1
            goto L_0x0184
        L_0x0183:
            r8 = 0
        L_0x0184:
            java.lang.Object r10 = r4.D()
            if (r8 != 0) goto L_0x0192
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x019a
        L_0x0192:
            zw.B0 r10 = new zw.B0
            r10.<init>(r3)
            r4.u(r10)
        L_0x019a:
            r19 = r10
            nI.a r19 = (nI.C17631a) r19
            r4.P()
            r20 = 12585984(0xc00c00, float:1.763672E-38)
            r21 = 308(0x134, float:4.32E-43)
            r8 = 0
            r10 = 0
            r11 = 0
            r22 = 0
            r25 = 1
            r26 = r12
            r12 = r16
            r27 = r13
            r13 = r18
            r14 = r22
            r15 = r19
            r16 = r4
            r17 = r20
            r18 = r21
            SC.L.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            int r6 = Oo.b.f84583a5
            r7 = 0
            java.lang.String r6 = J1.j.b(r6, r4, r7)
            r22 = 2
            r23 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r18 = r0
            r19 = r24
            androidx.compose.ui.d r0 = s0.C5842M.e(r18, r19, r20, r21, r22, r23)
            int r8 = uK.C18146a.f148377bb
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r8 = -53860311(0xfffffffffcca2829, float:-8.397268E36)
            r4.W(r8)
            r8 = r27 & 14
            r9 = 4
            if (r8 != r9) goto L_0x01ed
            r11 = r25
            goto L_0x01ee
        L_0x01ed:
            r11 = r7
        L_0x01ee:
            r8 = r27 & 112(0x70, float:1.57E-43)
            r9 = 32
            if (r8 != r9) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r25 = r7
        L_0x01f7:
            r7 = r11 | r25
            java.lang.Object r8 = r4.D()
            if (r7 != 0) goto L_0x0207
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x020f
        L_0x0207:
            zw.C0 r8 = new zw.C0
            r8.<init>(r1, r2)
            r4.u(r8)
        L_0x020f:
            r15 = r8
            nI.a r15 = (nI.C17631a) r15
            r4.P()
            r17 = 0
            r18 = 444(0x1bc, float:6.22E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r7 = r0
            r16 = r4
            SC.L.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0231
            U0.C4895p.R()
        L_0x0231:
            r9 = r26
        L_0x0233:
            U0.Y0 r7 = r4.n()
            if (r7 == 0) goto L_0x024d
            zw.D0 r8 = new zw.D0
            r0 = r8
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r9
            r5 = r33
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x024d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.J0.j(Bw.j$d$a, nI.q, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(j.d.a aVar, q qVar) {
        String str;
        T t10;
        Iterator<T> it = aVar.a().c().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (((j.d.a.b) t10).c()) {
                break;
            }
        }
        j.d.a.b bVar = (j.d.a.b) t10;
        Interaction$Component interaction$Component = Interaction$Component.OFFER_HUB_SHUFFLE_BUTTON;
        String a10 = aVar.a().a();
        if (bVar != null) {
            str = bVar.a();
        }
        qVar.invoke(interaction$Component, a10, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(j.d.a aVar, q qVar, C17631a aVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        j(aVar, qVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void n(androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        C4889m mVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(2063859290);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            d.a aVar = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(2063859290, i12, -1, "com.ingka.ikea.offerhub.impl.ui.Header (SurpriseDealsComposables.kt:368)");
            }
            mVar2 = k10;
            C13607l.j(J1.j.b(Oo.b.f84605c5, k10, 0), C13679b.C2857b.e.f116687a, TC.e.i(aVar), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262136);
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = aVar;
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new A0(dVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        n(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(Bw.j.d.a.C2583d r23, nI.p<? super Op.c1, ? super com.ingka.ikea.analytics.Interaction$Component, XH.C16807N> r24, androidx.compose.ui.d r25, U0.C4889m r26, int r27, int r28) {
        /*
            r2 = r24
            r4 = r27
            r0 = -1235983528(0xffffffffb6546358, float:-3.1648287E-6)
            r1 = r26
            U0.m r1 = r1.k(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0017
            r3 = r4 | 6
            r5 = r3
            r3 = r23
            goto L_0x002b
        L_0x0017:
            r3 = r4 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r23
            boolean r5 = r1.V(r3)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r4
            goto L_0x002b
        L_0x0028:
            r3 = r23
            r5 = r4
        L_0x002b:
            r6 = r28 & 2
            r7 = 16
            r8 = 32
            if (r6 == 0) goto L_0x0036
            r5 = r5 | 48
            goto L_0x0044
        L_0x0036:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x0044
            boolean r6 = r1.F(r2)
            if (r6 == 0) goto L_0x0042
            r6 = r8
            goto L_0x0043
        L_0x0042:
            r6 = r7
        L_0x0043:
            r5 = r5 | r6
        L_0x0044:
            r6 = r28 & 4
            if (r6 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r9 = r25
            goto L_0x005f
        L_0x004d:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004a
            r9 = r25
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r10
        L_0x005f:
            r10 = r5 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0073
            boolean r10 = r1.l()
            if (r10 != 0) goto L_0x006c
            goto L_0x0073
        L_0x006c:
            r1.L()
            r22 = r9
            goto L_0x00ee
        L_0x0073:
            if (r6 == 0) goto L_0x007a
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r22 = r6
            goto L_0x007c
        L_0x007a:
            r22 = r9
        L_0x007c:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0088
            r6 = -1
            java.lang.String r9 = "com.ingka.ikea.offerhub.impl.ui.Product (SurpriseDealsComposables.kt:382)"
            U0.C4895p.S(r0, r5, r6, r9)
        L_0x0088:
            Op.d1 r0 = r23.a()
            r6 = 1721708621(0x669f304d, float:3.7587363E23)
            r1.W(r6)
            r6 = r5 & 112(0x70, float:1.57E-43)
            if (r6 != r8) goto L_0x0098
            r6 = 1
            goto L_0x0099
        L_0x0098:
            r6 = 0
        L_0x0099:
            java.lang.Object r8 = r1.D()
            if (r6 != 0) goto L_0x00a7
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x00af
        L_0x00a7:
            zw.H0 r8 = new zw.H0
            r8.<init>(r2)
            r1.u(r8)
        L_0x00af:
            r6 = r8
            nI.l r6 = (nI.C17642l) r6
            r1.P()
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            s0.E r11 = androidx.compose.foundation.layout.D.a(r7)
            Bw.j$d$a$c r7 = r23.b()
            A0.f r14 = r7.j()
            int r5 = r5 << 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r7 = 1573248(0x180180, float:2.20459E-39)
            r19 = r5 | r7
            r20 = 0
            r21 = 7600(0x1db0, float:1.065E-41)
            r7 = 1
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r5 = r0
            r8 = r22
            r18 = r1
            Op.C10872z0.y0(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ee
            U0.C4895p.R()
        L_0x00ee:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x0107
            zw.I0 r7 = new zw.I0
            r0 = r7
            r1 = r23
            r2 = r24
            r3 = r22
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.J0.p(Bw.j$d$a$d, nI.p, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(p pVar, c1 c1Var) {
        C17542s.j(c1Var, "event");
        pVar.invoke(c1Var, Interaction$Component.OFFER_HUB_SHUFFLE);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(j.d.a.C2583d dVar, p pVar, androidx.compose.ui.d dVar2, int i10, int i11, C4889m mVar, int i12) {
        p(dVar, pVar, dVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: nI.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void s(s0.C5861g r17, Bw.j.d.a r18, nI.p<? super Op.c1, ? super com.ingka.ikea.analytics.Interaction$Component, XH.C16807N> r19, U0.C4889m r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = -1357417626(0xffffffffaf177366, float:-1.3774368E-10)
            r4 = r20
            U0.m r15 = r4.k(r3)
            r4 = r2 & 48
            r5 = 16
            r6 = 32
            if (r4 != 0) goto L_0x0022
            boolean r4 = r15.V(r0)
            if (r4 == 0) goto L_0x001f
            r4 = r6
            goto L_0x0020
        L_0x001f:
            r4 = r5
        L_0x0020:
            r4 = r4 | r2
            goto L_0x0023
        L_0x0022:
            r4 = r2
        L_0x0023:
            r7 = r2 & 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0034
            boolean r7 = r15.F(r1)
            if (r7 == 0) goto L_0x0031
            r7 = r8
            goto L_0x0033
        L_0x0031:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0033:
            r4 = r4 | r7
        L_0x0034:
            r7 = r4 & 145(0x91, float:2.03E-43)
            r9 = 144(0x90, float:2.02E-43)
            if (r7 != r9) goto L_0x0047
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            r15.L()
            r3 = r15
            goto L_0x00bc
        L_0x0047:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0053
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.offerhub.impl.ui.ProductCarousel (SurpriseDealsComposables.kt:233)"
            U0.C4895p.S(r3, r4, r7, r9)
        L_0x0053:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r7 = 0
            r9 = 1
            r10 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r3, r7, r9, r10)
            androidx.compose.foundation.layout.d r11 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r11 = r11.b()
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            r12 = 2
            s0.E r7 = androidx.compose.foundation.layout.D.c(r5, r7, r12, r10)
            r5 = -1758630873(0xffffffff972d6c27, float:-5.603582E-25)
            r15.W(r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r10 = 0
            if (r5 != r6) goto L_0x0079
            r5 = r9
            goto L_0x007a
        L_0x0079:
            r5 = r10
        L_0x007a:
            r4 = r4 & 896(0x380, float:1.256E-42)
            if (r4 != r8) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r9 = r10
        L_0x0080:
            r4 = r5 | r9
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x0090
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x0098
        L_0x0090:
            zw.E0 r5 = new zw.E0
            r5.<init>(r0, r1)
            r15.u(r5)
        L_0x0098:
            r12 = r5
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            r14 = 24966(0x6186, float:3.4985E-41)
            r16 = 234(0xea, float:3.28E-43)
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r4 = r3
            r6 = r7
            r7 = r8
            r8 = r11
            r11 = r13
            r13 = r15
            r3 = r15
            r15 = r16
            t0.C5937b.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00bc
            U0.C4895p.R()
        L_0x00bc:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x00cc
            zw.F0 r4 = new zw.F0
            r5 = r17
            r4.<init>(r5, r0, r1, r2)
            r3.a(r4)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.J0.s(s0.g, Bw.j$d$a, nI.p, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N t(j.d.a aVar, p pVar, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        x.a(xVar, aVar.b().size(), (C17642l) null, (C17642l) null, c1.c.c(1182260763, true, new a(aVar, pVar)), 6, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C5861g gVar, j.d.a aVar, p pVar, int i10, C4889m mVar, int i11) {
        s(gVar, aVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void v(C5861g gVar, j.d.a aVar, p<? super c1, ? super Interaction$Component, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        d.a aVar2;
        int i12;
        C16807N n10;
        int i13;
        int i14;
        C16807N n11;
        int i15;
        int i16;
        j.d.a aVar3 = aVar;
        p<? super c1, ? super Interaction$Component, C16807N> pVar2 = pVar;
        int i17 = i10;
        C4889m k10 = mVar.k(-1068648244);
        if ((i17 & 48) == 0) {
            i11 = (k10.V(aVar3) ? 32 : 16) | i17;
        } else {
            i11 = i17;
        }
        if ((i17 & 384) == 0) {
            i11 |= k10.F(pVar2) ? 256 : 128;
        }
        int i18 = i11;
        if ((i18 & 145) != 144 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1068648244, i18, -1, "com.ingka.ikea.offerhub.impl.ui.ProductGrid (SurpriseDealsComposables.kt:182)");
            }
            d.a aVar4 = androidx.compose.ui.d.f18749a;
            C5073d dVar = C5073d.f18068a;
            C5073d.e f10 = dVar.f();
            C5437c.a aVar5 = C5437c.f24302a;
            I b10 = G.b(f10, aVar5.l(), k10, 0);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar4);
            C4504g.a aVar6 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar6.a();
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
            F1.c(a12, b10, aVar6.c());
            F1.c(a12, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b11 = aVar6.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar6.d());
            C5843N n12 = C5843N.f28726a;
            j.d.a.C2583d dVar2 = (j.d.a.C2583d) C16877v.z0(aVar.b(), 0);
            k10.W(-984687356);
            if (dVar2 == null) {
                i12 = 0;
                aVar2 = aVar4;
            } else {
                i12 = 0;
                aVar2 = aVar4;
                p(dVar2, pVar, C5842M.e(n12, aVar4, 1.0f, false, 2, (Object) null), k10, (i18 >> 3) & 112, 0);
            }
            k10.P();
            j.d.a.C2583d dVar3 = (j.d.a.C2583d) C16877v.z0(aVar.b(), 1);
            k10.W(-984678812);
            C16807N n13 = null;
            if (dVar3 == null) {
                n10 = null;
            } else {
                i12 = i12;
                p(dVar3, pVar, C5842M.e(n12, aVar2, 1.0f, false, 2, (Object) null), k10, (i18 >> 3) & 112, 0);
                n10 = C16807N.f139792a;
            }
            k10.P();
            k10.W(-984679649);
            if (n10 == null) {
                i13 = i12;
                C5077h.a(C5842M.e(n12, aVar2, 1.0f, false, 2, (Object) null), k10, i13);
            } else {
                i13 = i12;
            }
            k10.P();
            k10.x();
            androidx.compose.ui.d m10 = D.m(aVar2, 0.0f, 0.0f, 0.0f, h.B((float) 24), 7, (Object) null);
            I b12 = G.b(dVar.f(), aVar5.l(), k10, i13);
            int a13 = C4883j.a(k10, i13);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, m10);
            C17631a<C4504g> a14 = aVar6.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a14);
            } else {
                k10.t();
            }
            C4889m a15 = F1.a(k10);
            F1.c(a15, b12, aVar6.c());
            F1.c(a15, s11, aVar6.e());
            p<C4504g, Integer, C16807N> b13 = aVar6.b();
            if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.w(Integer.valueOf(a13), b13);
            }
            F1.c(a15, e11, aVar6.d());
            j.d.a.C2583d dVar4 = (j.d.a.C2583d) C16877v.z0(aVar.b(), 2);
            k10.W(-984665852);
            if (dVar4 == null) {
                i14 = i13;
                n11 = null;
            } else {
                i14 = i13;
                p(dVar4, pVar, C5842M.e(n12, aVar2, 1.0f, false, 2, (Object) null), k10, (i18 >> 3) & 112, 0);
                n11 = C16807N.f139792a;
            }
            k10.P();
            k10.W(-984666689);
            if (n11 == null) {
                i15 = i14;
                C5077h.a(C5842M.e(n12, aVar2, 1.0f, false, 2, (Object) null), k10, i15);
            } else {
                i15 = i14;
            }
            k10.P();
            j.d.a.C2583d dVar5 = (j.d.a.C2583d) C16877v.z0(aVar.b(), 3);
            k10.W(-984655324);
            if (dVar5 == null) {
                i16 = i15;
            } else {
                i16 = i15;
                p(dVar5, pVar, C5842M.e(n12, aVar2, 1.0f, false, 2, (Object) null), k10, (i18 >> 3) & 112, 0);
                n13 = C16807N.f139792a;
            }
            k10.P();
            k10.W(-984656161);
            if (n13 == null) {
                C5077h.a(C5842M.e(n12, aVar2, 1.0f, false, 2, (Object) null), k10, i16);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n14 = k10.n();
        if (n14 != null) {
            n14.a(new G0(gVar, aVar3, pVar2, i17));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C5861g gVar, j.d.a aVar, p pVar, int i10, C4889m mVar, int i11) {
        v(gVar, aVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
